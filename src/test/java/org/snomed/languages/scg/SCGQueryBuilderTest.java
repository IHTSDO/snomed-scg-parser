package org.snomed.languages.scg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.snomed.languages.scg.domain.model.Attribute;
import org.snomed.languages.scg.domain.model.AttributeGroup;
import org.snomed.languages.scg.domain.model.DefinitionStatus;
import org.snomed.languages.scg.domain.model.Expression;

public class SCGQueryBuilderTest {
	
	private SCGObjectFactory scgObjectFactory;
	
	@Before
	public void setUp() {
		scgObjectFactory = new SCGObjectFactory();
	}
	
	@Test
	public void testPrecoordinatedExpression() {
		String scg = "83152002 |oophorectomy|";
		SCGQueryBuilder builder = new SCGQueryBuilder(scgObjectFactory);
		Expression expression = builder.createQuery(scg);
		assertNotNull(expression.getDefinitionStatus());
		assertEquals(expression.getDefinitionStatus(), DefinitionStatus.EQUIVALENT_TO);
		assertEquals(1, expression.getFocusConcepts().size());
		assertEquals("83152002", expression.getFocusConcepts().get(0));
	}
	
	@Test
	public void testExpressionWithMultipleFocusConcepts() {
		String scg = "421720008 |Spray dose form|  +  7946007 |Drug suspension|";
		SCGQueryBuilder builder = new SCGQueryBuilder(scgObjectFactory);
		Expression expression = builder.createQuery(scg);
		assertNotNull(expression.getDefinitionStatus());
		assertEquals(expression.getDefinitionStatus(), DefinitionStatus.EQUIVALENT_TO);
		assertEquals(2, expression.getFocusConcepts().size());
		assertTrue(expression.getFocusConcepts().contains("421720008"));
		assertTrue(expression.getFocusConcepts().contains("7946007"));
	}
	
	@Test
	public void testExpressionWithDefinitionStatus() {
		String scg = "<<<  73211009 |Diabetes mellitus| :  363698007 |Finding site|  =  113331007 |Endocrine system|";
		SCGQueryBuilder builder = new SCGQueryBuilder(scgObjectFactory);
		Expression expression = builder.createQuery(scg);
		assertEquals(DefinitionStatus.SUBTYPE_OF, expression.getDefinitionStatus());
		assertNotNull(expression.getFocusConcepts());
		assertEquals(1, expression.getFocusConcepts().size());
		assertTrue(expression.getFocusConcepts().contains("73211009"));
	}
	
	@Test
	public void testExpressionWithAttribute() {
		String scg = "83152002 |oophorectomy|: 405815000|procedure device| = 122456005 |laser device|";
		SCGQueryBuilder builder = new SCGQueryBuilder(scgObjectFactory);
		Expression expression = builder.createQuery(scg);
		assertEquals(DefinitionStatus.EQUIVALENT_TO, expression.getDefinitionStatus());
		assertNotNull(expression.getFocusConcepts());
		assertEquals(1, expression.getFocusConcepts().size());
		assertTrue(expression.getFocusConcepts().contains("83152002"));
		assertNotNull(expression.getAttributes());
		assertEquals(1, expression.getAttributes().size());
		Attribute attribute = expression.getAttributes().get(0);
		assertEquals("405815000", attribute.getAttributeId());
		assertEquals("122456005", attribute.getAttributeValueId());
	}

	@Test
	public void testExpressionWithAttributeGroups() {
		String example = "71388002 |Procedure| :" + 
				"{  260686004 |Method| = 129304002 |Excision - action| ," + 
				"   405813007 |Procedure site - direct| = 15497006 |Ovarian structure| }," + 
				"{  260686004 |Method| = 129304002 |Excision - action| ," + 
				"   405813007 |Procedure site - direct| = 31435000 |Fallopian tube structure| }";
		
		SCGQueryBuilder builder = new SCGQueryBuilder(scgObjectFactory);
		Expression expression = builder.createQuery(example);
		assertEquals(DefinitionStatus.EQUIVALENT_TO, expression.getDefinitionStatus());
		assertNotNull(expression.getFocusConcepts());
		assertEquals(1, expression.getFocusConcepts().size());
		assertTrue(expression.getFocusConcepts().contains("71388002"));
		assertNotNull(expression.getAttributeGroups());
		assertEquals(2, expression.getAttributeGroups().size());
		
		for (AttributeGroup group: expression.getAttributeGroups()) {
			assertEquals(2, group.getAttributes().size());
			Attribute attribute1 = group.getAttributes().get(0);
			Attribute attribute2 = group.getAttributes().get(1);
			
			assertEquals("260686004",attribute1.getAttributeId());
			assertEquals("129304002", attribute1.getAttributeValueId());
			
			if (!"405813007".equals(attribute2.getAttributeId()) 
					&& "15497006".equals(attribute2.getAttributeValueId())) {
				assertEquals("260686004",attribute1.getAttributeId());
				assertEquals("129304002", attribute1.getAttributeValueId());
				assertEquals("405813007", attribute2.getAttributeId());
				assertEquals("31435000", attribute2.getAttributeValueId());
			}
		}
	}
	
	
	@Test
	public void testExpressionWithSimpleNestedRefinements() {
		String scg = "373873005 |Pharmaceutical / biologic product| :" + 
				"411116001 |Has dose form|  = ( 421720008 |Spray dose form|  +  7946007 |Drug suspension| )";
		SCGQueryBuilder builder = new SCGQueryBuilder(scgObjectFactory);
		Expression expression = builder.createQuery(scg);
		System.out.println(expression);
		assertEquals(DefinitionStatus.EQUIVALENT_TO, expression.getDefinitionStatus());
		assertNotNull(expression.getFocusConcepts());
		assertEquals(1, expression.getFocusConcepts().size());
		assertTrue(expression.getFocusConcepts().contains("373873005"));
		assertNull(expression.getAttributeGroups());
		assertNotNull(expression.getAttributes());
		assertEquals(1, expression.getAttributes().size());
		Attribute attribute = expression.getAttributes().get(0);
		assertEquals("411116001", attribute.getAttributeId());
		assertNotNull(attribute.getAttributeValue());
		assertTrue(attribute.getAttributeValue().isNested());
		assertNull(attribute.getAttributeValue().getConceptId());
		Expression nestedExpression = attribute.getAttributeValue().getNestedExpression();
		assertNotNull(nestedExpression);
		assertEquals(DefinitionStatus.EQUIVALENT_TO, nestedExpression.getDefinitionStatus());
		assertTrue(nestedExpression.getFocusConcepts().contains("421720008"));
		assertTrue(nestedExpression.getFocusConcepts().contains("7946007"));
	}
	
	@Test
	public void testExpressionWithNestedRefinements() {
		String scg = "397956004 |prosthetic arthroplasty of the hip|:" + 
				"363704007 |procedure site| = (24136001 |hip joint structure|: " + 
				"272741003 |laterality| = 7771000 |left|)," + 
				"{ 363699004 |direct device| = 304120007 |total hip replacement prosthesis|," + 
				"260686004 |method| = 257867005 |insertion - action|}";
		
		SCGQueryBuilder builder = new SCGQueryBuilder(scgObjectFactory);
		Expression expression = builder.createQuery(scg);
		assertEquals(DefinitionStatus.EQUIVALENT_TO, expression.getDefinitionStatus());
		assertNotNull(expression.getFocusConcepts());
		assertEquals(1, expression.getFocusConcepts().size());
		assertTrue(expression.getFocusConcepts().contains("397956004"));
		assertNotNull(expression.getAttributes());
		assertEquals(1, expression.getAttributes().size());
		Attribute attribute = expression.getAttributes().get(0);
		assertEquals("363704007", attribute.getAttributeId());
		assertNotNull(attribute.getAttributeValue());
		assertTrue(attribute.getAttributeValue().isNested());
		assertNull(attribute.getAttributeValue().getConceptId());
		
		
		Expression nestedExpression = attribute.getAttributeValue().getNestedExpression();
		assertNotNull(nestedExpression);
		assertEquals(DefinitionStatus.EQUIVALENT_TO, nestedExpression.getDefinitionStatus());
		assertTrue(nestedExpression.getFocusConcepts().contains("24136001"));
		assertEquals(1, nestedExpression.getAttributes().size());
		Attribute nestedAttribute = nestedExpression.getAttributes().get(0);
		assertNotNull(nestedAttribute);
		assertEquals("272741003", nestedAttribute.getAttributeId());
		
		Set<AttributeGroup> attributeGroups = expression.getAttributeGroups();
		assertNotNull(attributeGroups);
		assertEquals(1, attributeGroups.size());
		assertEquals(2, attributeGroups.iterator().next().getAttributes().size());
	}
}

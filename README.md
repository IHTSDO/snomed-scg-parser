# SNOMED Compositional Grammar Parser

An open source Java library for parsing SNOMED Post-Coordinated expressions written in SNOMED Compositional Grammar.

For more information about [SNOMED Compositional Grammar](https://github.com/IHTSDO/SNOMEDCT-Languages/tree/master/SnomedCTCompositionalGrammar)

## ANTLR4 Grammar
The official SNOMED International ABNF syntax definition for ECL has been converted to ANTLR4 in order to generate tooling support.
- [SCG ANTLR4 grammar file](parser-generation/SCG.txt)
- [How to generate ANTLR4 grammar from ABNF](generate_antlr4_grammar.md)

## Capabilities
- Validate the syntax of post-coordinated expressions
- Convert valid expressions into Java objects for further processing
  - The object factory can be extended in order to have the expression Java objects instantiated using your own classes.

## Example
For code examples see [unit tests](https://github.com/IHTSDO/snomed-scg-parser/blob/develop/src/test/java/org/snomed/languages/scg/SCGQueryBuilderTest.java#L18)


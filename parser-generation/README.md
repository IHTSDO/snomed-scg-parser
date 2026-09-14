## How The Parser was Generated
The syntax of SNOMED CT Compositional Grammar(SCG) is defined in ABNF grammar.
There is far better Java support for ANTLR grammar so first we convert the ABNF file to ANTLR.
 
# Convert ABNF to ANTLR
Paste the contents of the ABNF file into the following webpage and hit Translate
http://www.robertpinchbeck.com/abnf_to_antlr/ 

The resulting ANTLR grammar should be saved as a file named 'SCG.txt'
Add the following as the first line of the SCG.txt file:
```
grammar SCG;
```

# Generate the ANTLR Parser
Download the ANTLR java program from https://www.antlr.org/download/antlr-4.13.2-complete.jar

The ANTLR runtime version must match the version managed by `snomed-parent-bom`
(currently `antlr4-runtime` 4.13.2).

Use the program to generate the Expression Template parser:
```
java -jar antlr-4.13.2-complete.jar SCG.txt -o parser-files -package org.snomed.languages.scg.generated.parser
```

The parser java source files will be generated in a directory named parser-files.
Copy `SCGLexer.java`, `SCGParser.java`, `SCGListener.java`, and `SCGBaseListener.java`
into `src/main/java/org/snomed/languages/scg/generated/parser/`.

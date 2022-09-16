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
Download the ANTLR java program from https://github.com/antlr/website-antlr4/blob/gh-pages/download/antlr-4.5.3-complete.jar

Use the program to generate the Expression Template parser:
```
java -jar antlr-4.5.3-complete.jar SCG.txt -o parser-files
```

The parser java source files will be generated in a directory named parser-files.

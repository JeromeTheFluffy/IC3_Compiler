/**this program is covered by the GNU GPL 
 * @author R3xTh33nc0d3r
 * date created: 04/21/2015
 * this program is designed to, very basically, parse through code, look for keywords, and convert it to C.
 * TODO from there, you must assemble it (will change)
**/
package com.icecoldcode

import java.utils.Scanner;
import java.lang.system.*;
import java.io.IOException;
import java.io.File;
import java.lang.String;
import java.lang.Object;

public class Parser extends Scanner throws IOException{
        /*main class of the Parser. */
        /* DOCsTRING:
        a parser has:
                a start position
                a array af keywords
                a array of the keywords equivilents
        a Parser can:
            parse by:
              looking for keywords
              looking for logical expressions
              looking for mathematical expressions
        generate assembly by
                taking keywords and writing thier equivilents as well as the main format
        */
        
        //variable declarations
        public File sourceFile = new File(filePath, "r");
        public File intermediateFile = new File(filePath, "w");
        public Scanner source = new Scanner(sourceFile);
        /* generate fhe form. for use with GAS from GCC */
        // gets length of a string
        public int getLength(String stringToUse){
                int sizeOfString;
                while(stringToUse != null){
                        sizeOfString += 1;
                }
                return sizeOfString;
        }

        //generate form for intermediate file
        public void generateIntermediateFor(String theString;){
                        //generate an intermediate language for the compiler
                        public String variableName[i];
                        private int i = 0;
                        if(theString.equals("str"){
                               String varName = theString.next();
                               String declaration = 
                               intermediateFile.write()
                        }
                }
        /*now generate the parser*/
        public String getNextTokenInSource(){
                return Parser.source.next();
        }
        public static int main(String args[1]){
        }
        return 0;
}

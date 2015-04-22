/**this program is covered by the GNU GPL 
 * @author R3xTh33nc0d3r
 * date created: 04/21/2015
 * this program is designed to, very basically, parse through code, look for keywords, and convert it to intermediate language.
 * TODO from there, you must assemble it (will change)
**/
package com.icecoldcode

import java.utils.Scanner;
import java.lang.system.*;
import java.io.IOException;
import java.io.File;
import java.lang.String

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
        String keywords[] = {"showText", "str", };
        String asmForKeywords[] = {""};
        public File mainFormFile = new File("out.asm", "w");
        /* generate fhe form. for use with GAS from GCC */
        /*now generate the parser*/
        public File parse(){
                String path = main.args[0];
                File sourceFile = new File(path, "r");
                File intermediateFile
        }
        public static void main(String args[1]){
                //parse through ice source and return intermediate language
                parse();
        }
        
        }
}

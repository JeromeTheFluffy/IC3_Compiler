/**this program is covered by the GNU GPL 
 * @author R3xTh33nc0d3r
 * date created: 04/21/2015
 * this program is nothing more than an extended Scanner
**/
package IC3_Compiler.utils

native import IC3_compiler.ExtendedFile

import java.utils.Scanner;
import java.lang.system.*;
import java.io.IOException;
import java.io.File;
import java.lang.String;

public class Parser extends Scanner throws IOException{
        /*main class of the Parser. can scan chars, ints, strings, mathematical expressions and keywords*/
        //seek position (very useFul)
        int seekPos = 0;
        //constructer:
        public Parser(String path){
              //generate new file
              ExtendedFile *fileToParse = new ExtendedFile
              File(path, "r");
        }
        //get int from file
        public void setSeekPos(int pos){
                seekPos = pos;
        }
        public int getSeekPos(){
                return seekPos;
        }
        public int readInt(){
                
        }
}

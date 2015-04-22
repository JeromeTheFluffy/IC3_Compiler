package com.icecoldcode

import java.io.File;
import java.io.IOExeption;
import java.lang.String;
import java.utils.Scanner

public class Compiler extends Scanner throws IOException{
  protected File generateMainForm(File file;){
    file.write(".text\n\n\n\t");
    file.write(".global _start\n\n\n");
    file.write("_start:\n\n\n\t\t");
    file.write("movl    $0,%ebx\n\t\t");
    file.write("movl    $1,%eax\n\t\t");
    file.write("int    $0x80\n");
    file.write(".data\n\n");
  }
  public static void main(String args[1]){
    generateMainForm(args[0]);
  }
  
}

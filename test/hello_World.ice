# classic helloWorld program. purpose: test basic syntax of ICE 
# by the way, this is a comment 
# following statement has no real purpose except to tell the compiler to generate a comment in the  
# helloWorld.c file (created by the compiler as well) telling you something about the program. all
# comments are transfered
title helloWorld.

# define the main() method like in C and C++
define main(int numOfArgs, str Array [numOfArgs]){
  # syntax: you cannot pass literals to functions(experiment; might change)
  str hello.
  hello = "hello world!".
  print(hello).
}

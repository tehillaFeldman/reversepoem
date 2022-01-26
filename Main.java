import java.io.*;
import java.util.ArrayDeque;

class Main{
public static void main(String[] args)
  {
    Reverser run = new Reverser();

    try
    {
      run.FileToStack("poem.txt");
      run.StackToFile("poemreverse.txt");
    } catch (IOException e) {
      System.out.println("Error occured in operations: " + e.getMessage());
    }
  }
}


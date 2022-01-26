import java.io.*;
import java.util.ArrayDeque;

public class Reverser {
    ArrayDeque<String> stack;

    public Reverser()
    {
        stack = new ArrayDeque<>();
    }

    public void FileToStack(String poem) throws IOException {
        File text = new File(poem);
        FileReader read = new FileReader(text);
        BufferedReader bread = new BufferedReader(read);
        String line;
        // push all lines to stack
        while ((line = bread.readLine()) != null)
            stack.push(line);
        read.close();
    }

    public void StackToFile(String poemreverse) throws IOException {
        FileWriter write = new FileWriter(poemreverse);
        while (!stack.isEmpty()) {
            // get lines in reverse order
            String line = stack.pop();
            write.write(line + "\n");
        }
        write.close();
    }

}
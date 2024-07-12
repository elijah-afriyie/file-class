## Readme Documentation

# Poem Writer

This Java program writes a short poem to a file named `poem.txt` using the `FileWriter` class. It demonstrates how to handle potential `IOException` during file operations.

## Features

- Writes a predefined poem to `poem.txt`
- Handles `IOException` during the file writing process

## Code Structure

### Main Class

```java
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red\nViolets are blue\nYou're incredibly beautiful, and I love you so much.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### How to Run

1. Ensure you have the necessary write permissions for the directory where you plan to run the program.
2. Compile the Java program using `javac Main.java`.
3. Run the compiled program using `java Main`.
4. Check the directory for the newly created `poem.txt` file, which will contain the poem.

### Explanation

- The program uses the `FileWriter` class from the `java.io` package to create a `FileWriter` object for `poem.txt`.
- The `write()` method of `FileWriter` writes the poem to the file.
- The `close()` method is called to close the `FileWriter` and release system resources.
- The `try-catch` block handles any `IOException` that might occur during the file writing process, and `e.printStackTrace()` prints the stack trace for debugging purposes.

### Error Handling

- An `IOException` is caught and handled using a `try-catch` block.
- If an `IOException` occurs, the stack trace is printed to help with debugging.
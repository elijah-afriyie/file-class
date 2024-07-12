## Readme Documentation

# File Existence Checker

This Java program checks whether a file named `secret_message.txt` exists and prints various details about the file if it does.

## Features

- Checks if the file `secret_message.txt` exists
- Prints the relative path of the file
- Prints the absolute path of the file
- Confirms whether the path refers to a file
- Handles the scenario where the file does not exist by printing an appropriate message
- Includes a commented-out line to delete the file

## Code Structure

### Main Class

```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("secret_message.txt");

        if (file.exists()) {
            System.out.println("File exists! :O!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete();
        } else {
            System.out.println("File does not exist! :(");
        }
    }
}
```

### How to Run

1. Ensure you have a file named `secret_message.txt` in the same directory as the Java program, or adjust the file path accordingly.
2. Compile the Java program using `javac Main.java`.
3. Run the compiled program using `java Main`.

### Explanation

- The program uses the `File` class from the `java.io` package to create a `File` object representing `secret_message.txt`.
- The `exists()` method checks if the file exists.
- If the file exists:
  - `getPath()` prints the relative path of the file.
  - `getAbsolutePath()` prints the absolute path of the file.
  - `isFile()` checks if the path refers to a file and prints the result.
- If the file does not exist, it prints a message indicating the file is not found.
- The `delete()` method is included as a comment to demonstrate how to delete the file if needed. Uncomment this line to enable file deletion.

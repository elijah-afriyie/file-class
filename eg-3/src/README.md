# ASCII Art File Reader

This Java program demonstrates how to create and read an ASCII art file named `ascii.txt`. The program uses `FileReader` to read the contents of the file and print them to the console.

## Features

- **File Creation**: The program initially creates `ascii.txt` with predefined ASCII art content.
- **File Reading**: It reads characters from the file and outputs them to the console.
- **Error Handling**: The program includes exception handling to manage potential `IOException` during file operations.

## Usage

1. **Creating the File**: The program writes the following ASCII art to `ascii.txt`:

    ```
                                ,'\
    _.----.        ____         ,'  _\   ___    ___     ____
_,-'       `.     |    |  /`.   \,-'    |   \  /   |   |    \  |`.
\      __    \    '-.  | /   `.  ___    |    \/    |   '-.   \ |  |
 \.    \ \   |  __  |  |/    ,','_  `.  |          | __  |    \|  |
   \    \/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |
    \     ,-'/  /   \    ,'   | \/ / ,`.|         /  /   \  |     |
     \    \ |   \_/  |   `-.  \    `'  /|  |    ||   \_/  | |\    |
      \    \ \      /       `-.`.___,-' |  |\  /| \      /  | |   |
       \    \ `.__,'|  |`-._    `|      |__| \/ |  `.__,'|  | |   |
        \_.-'       |__|    `-._ |              '-.|     '-.| |   |
                                `'                            '-._|


                                `;-.          ___,
  `.`\_...._/`.-"`
    \        /      ,
    /()   () \    .' `-._
   |)  .    ()\  /   _.'
   \  -'-     ,; '. <
    ;.__     ,;|   > \
   / ,    / ,  |.-'.-'
  (_/    (_/ ,;|.<`
    \    ,     ;-`
     >   \    /
    (_,-'`> .'
         (_,'

```

2. **Reading the File**: The program reads from `ascii.txt` and prints the ASCII art to the console.

## Code Example

Here's a snippet of the file creation code:

```java
try {
    FileWriter writer = new FileWriter("ascii.txt");
    writer.write("..."); // ASCII art goes here
    writer.close();
} catch (IOException e) {
    e.printStackTrace();
}
```

And for reading the file:

```java
try {
    FileReader reader = new FileReader("ascii.txt");
    int data = reader.read();
    while (data != -1) {
        System.out.print((char) data);
        data = reader.read();
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

## Conclusion

This program illustrates basic file handling in Java, including writing to and reading from files while demonstrating how to manage exceptions. You can extend this code by adding more features, such as user input for the ASCII art or more complex error handling.
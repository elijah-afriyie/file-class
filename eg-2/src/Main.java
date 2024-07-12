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

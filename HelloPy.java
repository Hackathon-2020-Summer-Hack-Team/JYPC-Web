import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloPy {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("python main.py");
    }
}
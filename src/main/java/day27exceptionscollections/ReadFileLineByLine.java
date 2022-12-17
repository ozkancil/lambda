package day27exceptionscollections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) throws IOException{
readFileLineByLine();
    }
    public static void readFileLineByLine() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/day26exceptions/File01.txt"));//uses filereader as a constructor
           String line= reader.readLine(); //readLine reads line by line , not char by char.
            while(line!=null){
                System.out.println(line);
                line=reader.readLine();
            }
        }catch (IOException e){//or filenotfoundException
            e.printStackTrace();
            System.out.println("there is an issue about the path or about the file "+e.getMessage());
        }
    }
}

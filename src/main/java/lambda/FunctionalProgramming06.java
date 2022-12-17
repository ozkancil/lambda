package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FunctionalProgramming06 {
    public static void main(String[] args) throws IOException {
        /*
        we throws IOException because it is accessing and reading the file.
         */
        Files.lines(Paths.get("/Users/ozkan/IdeaProjects/Batch108/src/main/java/lambda/LambdaTextFile.txt")).forEach(System.out::println);
        System.out.println("==========================");
        //how to convert all characters in the file to upper case.
        Files.lines(Paths.get("/Users/ozkan/IdeaProjects/Batch108/src/main/java/lambda/LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);
        //how to check if a specific word exists in the text.
       boolean result= Files.lines(Paths.get("/Users/ozkan/IdeaProjects/Batch108/src/main/java/lambda/LambdaTextFile.txt")).anyMatch(t->t.contains("Lambda"));
        System.out.println(result);


        //print distinct words on the console in the file
        Files.lines(Paths.get("/Users/ozkan/IdeaProjects/Batch108/src/main/java/lambda/LambdaTextFile.txt")).map(t->t.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);


        //Get teh words which end with e and print them on the console       split gives are words
        Files.lines(Paths.get("/Users/ozkan/IdeaProjects/Batch108/src/main/java/lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("e")).
                forEach(System.out::println);

    }

}

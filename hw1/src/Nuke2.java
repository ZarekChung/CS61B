import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Scanner;

/**
 * Created by zarekchung on 2017/5/4.
 */
public class Nuke2 {
    //psvm +TAB = main()
    public static void main(String[] args) throws IOException{
    //BufferedReader
       // String inputLine;
        String outputLine;
/*
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the string:");
        String inputLine = keyboard.readLine();
        System.out.println("input = "+ inputLine);

        outputLine = inputLine.replace(inputLine.substring(1,2),"");
        System.out.print("result = "+outputLine);
      */
    //scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the string angain : ");
        String input = scanner.nextLine();

        outputLine = input.replace(input.substring(1,2),"");
        System.out.print("result = "+ outputLine);
        System.out.flush();

    }



}

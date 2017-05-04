/**
 * Created by zarekchung on 2017/5/4.
 */
import java.net.*;
import java.io.*;
public class OpenCommercial {
    /** Prompts the user for the name X of a company (a single string), opens
     *  the Web site corresponding to www.X.com, and prints the first five lines
     *  of the Web page in reverse order.
     *  @param arg is not used.
     *  @exception Exception thrown if there are any problems parsing the
     *             user's input or opening the connection.
     */
    public static void main(String[] arg) throws Exception {

        BufferedReader keyboard;
        String inputLine;

        keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter the name of a company (without spaces): ");
        System.out.flush();        /* Make sure the line is printed immediately. */
        inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
        URL strUrl = new URL("http://www."+ inputLine +".com/");
        BufferedReader in = new BufferedReader(new InputStreamReader( strUrl.openStream()));

        String[] UrlArray =new String[5];
        int i = 0;
        while ((inputLine = in.readLine()) != null && i < UrlArray.length) {

            UrlArray[i]=inputLine;
            i++;
        }
        for(int j = i-1; j >= 0 ;j--)
        {
            System.out.println(UrlArray[j]);
        }
        keyboard.close();


    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String period = s.substring(8); // AM or PM
    String hourStr = s.substring(0, 2);
    int hour = Integer.parseInt(hourStr);

    if (period.equals("AM")) {

        // 12AM -> 00
        if (hour == 12) {
            hourStr = "00";
        }

    } else { // PM

        // add 12 except for 12PM
        if (hour != 12) {
            hour += 12;
            hourStr = String.valueOf(hour);
        }
    }

    return hourStr + s.substring(2, 8);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

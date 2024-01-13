package Java;

import java.io.*;

public class JavaDateAndTime {

    public static String findDay(int month, int day, int year) {

        if (month == 1 ) {
            month = 13;
        } else  if (month == 2) {
            month = 14;
        }

        year = year % 100;

        int h = (8 + (13*(month + 1)/5) + year + (year/4) + (year/4) - 2*year) ;

        switch (h) {
            case 1:
                return "Monday";
            case 2: return "Tuesday";
            case 3: return "wendsday";
            case 4: return "thursday";
            case 5: return "friday";
            case 6: return "saturday";
            case 7: return "sunday";
            default:
                return "some";
        }

    }
}

class Solution  {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = JavaDateAndTime.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}

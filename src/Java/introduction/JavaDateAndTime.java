package Java.introduction;

import java.io.*;
import java.util.Calendar;

public class JavaDateAndTime {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        String weekday = calendar.getTime().toString().split(" ")[0];
        String result;

        switch (weekday) {
            case "Mon": {
                result = "MONDAY";
                break;
            }
            case "Tue":{
                result = "TUESDAY";
                break;
            }
            case "Wed": {
                result = "WEDNESDAY";
                break;
            }
            case "Thu": {
                result = "THURSDAY";
                break;
            }
            case "Fri": {
                result = "FRIDAY";
                break;
            }
            case "Sat":{
                result = "SATURDAY";
                break;
            }
            case "Sun": {
                result = "SUNDAY";
                break;
            }
            default: {
                result = "sasa";
                break;
            }

        }
        return result;
    }
}


 class Solution {
    public static void main(String[] args) throws IOException {
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

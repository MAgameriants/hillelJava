/**
 * Created by x230 on 21.09.2015.
 */
public class DataType {
    public static void main(String[] args) {
        int age = 28;
        int days = age * 365;
        int hours = days * 24;
        int seconds = hours * 3600;
        long miliseconds = seconds * 1000L;
        seconds = (int) (miliseconds/1000);
        long longSeconds = miliseconds/1000;

        System.out.println(miliseconds);
        System.out.println(seconds);
        System.out.println(longSeconds);

        double d = 3.54;
        double d2 = 3.54f;
        int i = 10;
        long l = 100;
        long l2 = 5000000000000L;
        float f = 2.5f;
    }
}

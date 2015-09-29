import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by x230 on 24.09.2015.
 */
public class WorkflowControl {
    public static void main(String[] args) {

        byte b =120;
        short s = b;
        long l = s;

        double c = l; /*потеря точности может произойти */

        l = 15;
        int z = (int) l; /*отрежет самые старшие и самые значащие биты */

        int maxValue = Integer.MAX_VALUE;
        System.out.println("Int Max value:" + maxValue);
        long intMaxValue = maxValue;
        long intOverflow = intMaxValue + 1;
        int i = (int) intOverflow;

        double d = Math.PI;
        i =  (int) d;

        System.out.println("PI: " + i);

        System.out.println("Overflowed ubt: " +i);


        switchCase2();


        /*int number = 5;

        int isEven = isEven(number);

        isEven = (number % 2 == 0) ? "yes" : "no";  /*тернарный оператор

    }

    public static boolean isEven(int someNumber){
        if(someNumber % 2 == 0) {
            return true;
        } else {{
            return false;
        }}
    */
    }

    private static void switchCase2() {
        int month = 2;
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("winter");
                break;
            case 3:
            case 4:
                System.out.println("spring");
                break;
        }
    }

    private static void switchCaseExample(){
            String month = "Aug";
            switch (month) {
                case "Jan":
                    System.out.println("01");
                    break;
                case "May":
                    System.out.println("05");
                    break;
                default:
                    System.out.println("Testing default");
                    break;
            };

        int age = 25;

        if (age < 10) {
            System.out.println("kid");
        } else if (age < 20) {
            System.out.println("teen");
        } else if (age < 50) {
            System.out.println("adult");
        } else {
            System.out.println("old");
        }
    }

public static void ifExplanation(){
        boolean condition = false;
        if(condition){
            System.out.println("in IF");
            System.out.println("still in IF block");
        } else {
            System.out.println("in else");
        }
        System.out.println("out of IF block");
    }

}
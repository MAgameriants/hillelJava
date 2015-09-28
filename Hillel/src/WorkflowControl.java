import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by x230 on 24.09.2015.
 */
public class WorkflowControl {
    public static void main(String[] args) {
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



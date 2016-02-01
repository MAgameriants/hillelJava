import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by x230 on 25.01.2016.
 */

public class ExceptionClass {

    public static void main(String[] args) {

        ExceptionClass test = new ExceptionClass();

//        String[] array = new String[5];
//        test.getElement(array,4);


    }

    public void readFile(){
        File file = new File ("d:\\34.text");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e)
            {
                System.out.println(e.getCause());
            }

//    public void getElement(String[] array, int index) {
//        String value = array[index];

    }
}

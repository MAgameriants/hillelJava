package Collections;

import java.util.ArrayList;

/**
 * Created by x230 on 22.10.2015.
 */
public class Main {

        public static void main(){
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("word");

        for(Object o: list){
            System.out.println(o);
        }
Integer i = (Integer) list.get(0);
    }
}

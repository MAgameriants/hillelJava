package List;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by x230 on 11.01.2016.
 */
public class ListExample {

    public static void main(String[] args) {
        List<String> lst = new LinkedList<>();
        lst.add("asasa");
        lst.add("asdasda");


        System.out.println(lst);

        List<String> arrayList = new ArrayList<>(lst);
    }
}

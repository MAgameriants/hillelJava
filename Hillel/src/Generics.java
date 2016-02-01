import java.util.ArrayList;
import java.util.List;

/**
 * Created by x230 on 28.01.2016.
 */
public class Generics {

    public void main(String[] args) {
        List<String> dogs = new ArrayList<>();
        dogs.add("Sam");
        dogs.add("Tim");

        String dog1 = dogs.get(2);

        for (String dog : dogs) {
            System.out.println(dog);
        }

        Wrapper wrapper = new Wrapper(new String());
    }

    public class Wrapper<T> {
        private Object obj;
        public Wrapper(T obj) {
            this.obj = obj;
        }
    }
}

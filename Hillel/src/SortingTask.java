/**
 * Created by x230 on 01.02.2016.
 */

    import java.util.*;
    public class SortingTask {
        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(5);
            list.add(12);
            list.add(15);
            list.add(17);
            list.add(98);

            System.out.println(list);

            for (int i = 0; i < list.size(); i++)
            {
                if(list.get(i) % 2 == 0)
                {
                    System.out.println("This number is divided by 2 w/o remainder: " + list.get(i));
                }
            }

            }

        }
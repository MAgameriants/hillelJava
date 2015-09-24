/**
 * Created by NewClass8 on 17.09.2015.
 */
public class MyFirstClass {
        public static void main(String[] args) {
                sayHello();

                int age = 28;
                someMethod(age);

                test();

        }

        private static void someMethod(int age) {
                System.out.println(age);
                        age = 50;
        }

        private static void test() {
                int mashaAge = calculateAge(1986);
                System.out.println("My age: " + mashaAge);
        }

        public static void sayHello() {
                String helloMessage = "Hello World";
                System.out.println(helloMessage);
        }

     //   public static int calculateAge(){
     //           int birthYear = 1986;
    //            int year = 2015;
     //           int myAge= year - birthYear;
        //        return myAge;
    //    }
        public static int calculateAge(int birthYear) {
                int year = 2015;
                int age = year - birthYear;
                return age;
        }

}
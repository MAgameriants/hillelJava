/**
 * Created by x230 on 20.09.2015.
 */
public class AboutMyself {
    public static void main (String [] agrs) {
        final String firstName = "Maria";
        final String lastName = "Agameriants";

        System.out.println("Version one: " + firstName + " " + lastName);

        String fullName = firstName + " " + lastName;
        System.out.println("Version two: " + fullName);

        final int dateOfBirth = 1986;
        int currentDate = 2015;
        int age = currentDate - dateOfBirth;

        System.out.println("My age by the end of the year: " + age);
    }
}




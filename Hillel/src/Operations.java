/**
 * Created by x230 on 24.09.2015.
 */
public class Operations {
    public static void main(String[] args) {
        int res = 5+89;

        res = res + 1;
        res += 1; //is the same
        res++; //is the same постфиксная операция
        ++res; //not the same, but for this example result will be the same. it will be different we will pass this somewhere
        print (res++);
        print (++res);

        int mod = 5 % 4;
        print(mod);

        boolean paid = true;
        boolean addvert = false;

        boolean canAttend = paid() | advert(); //это операция ИЛИ
        boolean canAttend2 = paid() || advert(); //операция краткой логики, реагирует коротко на true

        System.out.println("Can attend classes: " + canAttend);
        System.out.println("Can attend classes: " + canAttend2);

        boolean hasEnoughKnowledge = false;
        canAttend = paid() & hasEnoughKnowledge();
        canAttend2 = paid() && hasEnoughKnowledge(); //реагирует коротко на false

        int message = 100;
        int key = 31;
        int crypted = message ^ key;

        boolean priorities = paid() | advert() & hasEnoughKnowledge(); //priorities will be in another order, same as in Math. put paranthesis to define the priority


        System.out.println("message is " + message);

        System.out.println("crypted message is: " + crypted);

        int uncrypted = crypted ^ key;

        System.out.println("uncrypted message is " + uncrypted );

    }

    public static boolean paid(){
        System.out.println("in paid method");
        return true;
    }

    public static boolean advert(){
        System.out.println("in advert method");
        return true;
    }

    public static boolean hasEnoughKnowledge(){
        System.out.println("has enough knowledge");
        return true;
    }

    public static void print(int i) {
        System.out.println(i);
    }
}

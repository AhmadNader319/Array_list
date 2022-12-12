import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";
        if (s1 == s2){
            System.out.println("1");
        }

        if ( s1 == s3){
            System.out.println("2");
        }

        if (s1 == s4){
            System.out.println("3");
        }

        if (s1.equals(s3)){
            System.out.println("4");
        }

        if (s1.equals(s4)){
            System.out.println("5");
        }
        if (s1.equals(s3)){
            System.out.println("6");
        }
        if (s1.matches(s3)){
            System.out.println("7");
        }







    }
}

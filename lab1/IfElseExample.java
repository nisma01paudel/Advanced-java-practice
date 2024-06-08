import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter age number");
        Scanner s = new Scanner ( System.in);
        age = s.nextInt();
        if(age>18){
            System.out.println("Age is greater than 18");
        }else{
            System.out.println("too young");
        }

    }
}

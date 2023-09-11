import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        double halfage= (double) age/2.0;
        double dateableAge = (double) halfage+7.0;
        System.out.println(age +" year old's should date somebody who is at least " + dateableAge + " years old");
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Increment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Increment increment = new Increment();
        try {
            System.out.println("Enter an integer: ");
            int a = scanner.nextInt();
            int b = a + 1;

            increment.display(a, b);
            }catch (Exception e){

            System.out.println("Invalid Exception");

        } finally {


            scanner.close();
        }

    }

    public void display(int a, int b){
        System.out.println("The initial value is: " + a);

        System.out.println("Incremented value is: " + b);

    }

}

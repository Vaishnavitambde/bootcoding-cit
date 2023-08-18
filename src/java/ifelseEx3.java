import java.util.Scanner;
public class ifelseEx3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x = sc.nextInt();
        if(x>=0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is Negative");
        }
    }
}

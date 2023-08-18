import java.util.Scanner;
public class ifelseEx2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}

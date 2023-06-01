import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give the value of a: ");
        float inputuser1 = input.nextFloat();
        System.out.print("Give the value of b: ");
        float inputuser2 = input.nextFloat();
        if (inputuser1 == 0 && inputuser2 == 0) {
            System.out.println("it is undeterminate");
            return ;
        }
        else if(inputuser1 == 0){
            System.out.println("it is undefined");
            return ;
        }
        System.out.print("x = " + (-inputuser2) / inputuser1);
    }
}
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        float inputuser3 = 0;
        float inputuser4 = 0;
        String value;
        Scanner input = new Scanner(System.in);
        while (c == 0) {
            System.out.print("What do you want to convert? ");
            String inputuser1 = input.nextLine();
            if (!(inputuser1.equals("tl2usd") || inputuser1.equals("usd2tl") || inputuser1.equals("tl2euro")
                    || inputuser1.equals("euro2tl") || inputuser1.equals("euro2usd") || inputuser1.equals("usd2euro")
                    || inputuser1.equals("gbt2tl") || inputuser1.equals("tl2gbp") || inputuser1.equals("euro2gbp")
                    || inputuser1.equals("gbp2euro") || inputuser1.equals("gbp2usd") || inputuser1.equals("usd2gbp")
                    || inputuser1.equals("q"))) {
                System.out.print("That is a wrong choice. What do you want to convert? ");
                inputuser1 = input.nextLine();
            }
            if (inputuser1.equals("tl2usd") || inputuser1.equals("usd2tl") || inputuser1.equals("tl2euro")
                    || inputuser1.equals("euro2tl") || inputuser1.equals("euro2usd") || inputuser1.equals("usd2euro")
                    || inputuser1.equals("gbt2tl") || inputuser1.equals("tl2gbp") || inputuser1.equals("euro2gbp")
                    || inputuser1.equals("gbp2euro") || inputuser1.equals("gbp2usd") || inputuser1.equals("usd2gbp")) {
                if (inputuser1.charAt(2) == '2') {
                    a = 2;
                    b = 3;
                } else if (inputuser1.charAt(3) == '2') {
                    a = 3;
                    b = 4;
                } else if (inputuser1.charAt(4) == '2') {
                    a = 4;
                    b = 5;
                }
                System.out.print("Enter the value for 1 " + inputuser1.substring(0, a) + " in "
                        + inputuser1.substring(b, inputuser1.length()) + ": ");
                if (!input.hasNextFloat()) {
                    value = input.nextLine();
                    System.out.print("If it is a float, try write the number with comma: ");
                }
                if (input.hasNextFloat()) {
                    inputuser3 = input.nextFloat();
                    if (inputuser3 <= 0) {
                        System.out.print("It should not be negative or 0: ");
                        if (input.hasNextFloat()) {
                            inputuser3 = input.nextFloat();
                        } else {
                            value = input.nextLine();
                        }
                    }
                }
                if (inputuser3 > 0) {
                    inputuser3 = inputuser3;
                } else if (input.hasNextLine()) {
                    System.out.print("Please be sure you enter numbers in a correct way. Try again.");
                    break;
                }
                System.out.print("Enter the amount in " + inputuser1.substring(0, a) + ": ");
                if (!input.hasNextFloat()) {
                    value = input.nextLine();
                    System.out.print("If it is a float, try write the number with comma: ");
                }
                if (input.hasNextFloat()) {
                    inputuser4 = input.nextFloat();
                    if (inputuser4 <= 0) {
                        System.out.print("It should not be negative or 0: ");
                        if (input.hasNextFloat()) {
                            inputuser4 = input.nextFloat();
                        } else {
                            value = input.nextLine();
                        }
                    }
                }
                if (inputuser4 > 0) {
                    inputuser4 = inputuser4;
                    System.out.println("The amount is " + inputuser3 * inputuser4 + " " + inputuser1.substring(0, a));
                    value =input.nextLine();
                } else {
                    System.out.print("Please be sure you enter numbers in a correct way. Try again.");
                    break;
                }
            }
            if (inputuser1.equals("q")) {
                c = 1;
                input.close();
            }
        }
    }
}
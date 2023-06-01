import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> w = new ArrayList<Integer>();
        ArrayList<String> s = new ArrayList<String>();
        int i = 0;
        String value;
        int a = 0;

        while (a != 1) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the weight: ");
            w.add(input.nextInt());
            if (w.get(i) == -1) {
                break;
            }
            value = input.nextLine();
            System.out.print("Enter the full name: ");
            s.add(input.nextLine());
            i++;
        }
        a = 0;
        i = s.size();
        if (s.size() == 0) {
            System.out.println("There is no person to name.");
            return ;
        }
        int[] weight = new int[i + 1];
        String[] name = new String[i + 1];
        int j = 0;
        while(j < i) {
            name[a] = s.get(j);
            weight[a] = w.get(j);
            a++;
            j++;
        }
        a = 0;
        i = 0;
        int b = 0;
        while(a < weight.length) {
            b = a + 1;
            while(b < weight.length - 1) {
                if (weight[a] > weight[b]) {
                    i = b;
                }
                b++;
            }
            a++;
        }
        b = 0;
        while(b < name[i].length()){
            if (name[i].charAt(b) == ' '){
                break ;
            }
            b++;
        }
        System.out.print("The weakest person is " + name[i].substring(0,b) + " with " + weight[i] + " kg");
    }
}
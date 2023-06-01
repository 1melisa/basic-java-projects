import java.util.*;


public class Q1 {
    public static void main(String[] args) {
        Object[] n;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the students:");
        int k = input.nextInt();
        n = new Object[k*8];
        int l = 0;
        int i = 0;
        while (k > l) {
            System.out.println("Enter id: ");
            int id = input.nextInt();
            String d = input.nextLine();
            if (id == -1)
                break;
            n[i++] = id;
            System.out.println("Enter name: ");
            String name = input.nextLine();
            char[] charArray = name.toCharArray();
            int c = 0;
            while(c <= charArray.length)
            {
                while (name.length() == 0)
                {
                    System.out.println("You need to enter a name: ");
                    name = input.nextLine();
                    charArray = name.toCharArray();
                }
                if (c != charArray.length)
                {
                    if (!Character.isLetterOrDigit(charArray[c])) {
                        System.out.println("It should contains only alpha characters. Reenter the data: ");
                        name = input.nextLine();
                        charArray = name.toCharArray();
                        c = -1;
                    }
                }
                c++;
            }
            n[i++] = name;
            System.out.println("Enter lastname: ");
            String lastname = input.nextLine();
            charArray = lastname.toCharArray();
            c = 0;
            while(c <= charArray.length)
            {
                while (lastname.length() == 0)
                {
                    System.out.println("You need to enter a lastname: ");
                    lastname = input.nextLine();
                    charArray = lastname.toCharArray();
                }
                if (c != charArray.length)
                {
                    if (!Character.isLetterOrDigit(charArray[c])) {
                        System.out.println("It should contains only alpha characters. Reenter the data: ");
                        lastname = input.nextLine();
                        charArray = lastname.toCharArray();
                        c = -1;
                    }
                }
                c++;
            }
            n[i++] = lastname;
            System.out.println("Enter score: ");
            int score = input.nextInt();
            if (score == -1)
                break;
            n[i++] = score;
            l++;
        }
        Object[][] sc = new Object[l][4];
        int b = 0;
        int c = 0;
        while (b < l) {
            int a = 0;
            while (a != 4) {
                sc[b][a] = n[c++];
                a++;
            }
            b++;
        }
        b = 0;
        int p = 0;
        int r = 0;
        Object[] tmp = new Object[l];
        while (b < l) {
            int j = b + 1;
            while(j < l) {
                if ((int) sc[j][0] > (int) sc[b][0]) {
                    tmp = sc[b];
                    sc[b] = sc[j];
                    sc[j] = tmp;
                }
                j++;
            }
            b++;
        }
        b = 0;
        int z = 0;
        Object[][] tmp3 = new Object[l][4];
        Object[][] tmp6 = new Object[l][4];
        while (b < l && b + 1 < l) {
            int j = b + 1;
            if (!(sc[b][0] == sc[j][0]))
                tmp3[p++] = sc[b];
            else {
                tmp6[z++] = sc[b];
                tmp6[z++] = sc[b + 1];
                b++;
            }
            b++;
        }
        if(!(sc[l - 2][0] == sc[l - 1][0]))
            tmp3[p++] = sc[l - 1];
        Object[][] tmp4 = new Object[p][4];
        while (r < p) {
            tmp4[r] = tmp3[r];
            r++;
        }
        b = 0;
        while (b < p) {
            int j = b + 1;
            while(j < p) {
                if ((int) tmp4[j][3] > (int) tmp4[b][3]) {
                    tmp = tmp4[b];
                    tmp4[b] = tmp4[j];
                    tmp4[j] = tmp;
                }
                else if ((int) tmp4[j][3] == (int) tmp4[b][3]){
                    int compare = ((String)tmp4[j][2]).compareTo((String)tmp4[b][2]);
                    if (compare < 0){
                        tmp = tmp4[b];
                        tmp4[b] = tmp4[j];
                        tmp4[j] = tmp;
                    }
                    else if (compare == 0){
                        int compare2 = ((String) tmp4[j][1]).compareTo((String) tmp4[b][1]);
                        if (compare2 < 0) {
                            tmp = tmp4[b];
                            tmp4[b] = tmp4[j];
                            tmp4[j] = tmp;
                        }
                        else if (compare2 == 0) {
                            if ((int) tmp4[j][0] > (int) tmp4[b][0]) {
                                tmp = tmp4[b];
                                tmp4[b] = tmp4[j];
                                tmp4[j] = tmp;
                            }
                        }
                    }
                }
                j++;
            }
            b++;
        }
        r = 0;
        double sum = 0, standard_deviation = 0;
        while(r < p)
            sum += (int)tmp4[r++][3];
        double mean = sum/p;
        while(r < p) {
            standard_deviation += Math.pow((int)tmp4[r++][3] - mean, 2);
        }
        double result = Math.sqrt(standard_deviation/p);
        System.out.println("the mean is " + mean);
        System.out.println("The Standard Deviation is:" + result);
        double median;
        if (p % 2 == 0)
            median = ((int)tmp4[p/2][3] + (int)tmp4[p/2 - 1][3])/2;
        else
            median = (int)tmp4[p/2][3];
        System.out.println("The median is:" + median);
        System.out.println("The sorted data is:" + Arrays.deepToString(tmp4));
        System.out.println("The duplicated data is:" + Arrays.deepToString(tmp6));
    }
}
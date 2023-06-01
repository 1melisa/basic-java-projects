public class MyInteger {
    int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int Get_v() { return value; }
    boolean isEven(){
        if (value % 2 == 0)
            return true;
        else
            return false;
    }
    boolean isOdd(){
        if (value % 2 == 1)
            return true;
        else
            return false;
    }
    boolean isPrime(){
        int a = 2;
        if (value == 2)
            return true;
        while (a < value)
        {   if (value % a == 0)
                return false;
            a++;
        }
        return true;
    }
    static boolean   isEven(int a){
        if (a % 2 == 0)
            return true;
        else
            return false;
    }
    static boolean isOdd(int a){
        if (a % 2 == 1)
            return true;
        else
            return false;
    }
    static boolean isPrime(int b){
        int a = 2;
        if (b == 2)
            return true;
        while (a < b)
        {   if (b % a == 0)
                return false;
            a++;
        }
        return true;
    }
    static boolean   isEven(MyInteger a){
        if (a.Get_v() % 2 == 0)
            return true;
        else
            return false;
    }
    static boolean isOdd(MyInteger a){
        if (a.Get_v() % 2 == 1)
            return true;
        else
            return false;
    }
    static boolean isPrime(MyInteger b){
        int a = 2;
        if (b.Get_v() == 2)
            return true;
        while (a < b.Get_v())
        {   if (b.Get_v() % a == 0)
                return false;
            a++;
        }
        return true;
    }
    boolean equals(int c){
        if (this.value == c)
            return true;
        else
            return false;
    }
    boolean equals(MyInteger c){
        if (this.value == c.Get_v())
            return true;
        else
            return false;
    }
    static int parseInt(char[] a)
    {
        int j = 0;
        int k = 0;
        while (a[j] >= '0' && a[j] <= '9')
        {
            k = k * 10 + a[j] - '0';
            if (j == a.length - 1)
                break;
            j++;
        }
        return(k);
    }
    static int parseInt(String a){
        int j = 0;
        int k = 0;
        while (a.charAt(j) >= '0' && a.charAt(j) <= '9')
        {
            k = k * 10 + a.charAt(j) - '0';
            if (j == a.length() - 1)
                break;
            j++;
        }
        return(k);
    }
}

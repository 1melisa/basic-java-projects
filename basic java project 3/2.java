public class Q2 {
    public static void main(String[] args) {
        MyInteger c1 = new MyInteger(5);
        System.out.println("is the value even?: " +c1.isEven());
        System.out.println("is the value odd?: " +c1.isOdd());
        System.out.println("is the value prime?: " +c1.isPrime());
        System.out.println("is the value 2 even?: " +c1.isEven(2));
        System.out.println("is the value 2 odd?: " +c1.isOdd(2));
        System.out.println("is the value 2 prime?: " +c1.isPrime(2));
        MyInteger c2 = new MyInteger(6);
        System.out.println("is the object with the value 6 even?: " +c1.isEven(c2));
        System.out.println("is the object with the value 6 odd?: " +c1.isOdd(c2));
        System.out.println("is the object with the value 6 prime?: " +c1.isPrime(c2));
        System.out.println("is the value equals to 4?: " +c1.equals(4));
        System.out.println("is the value equals to the value that is of other object?: " +c1.equals(c2));
        char[] a = {'1','6','5'};
        System.out.println("changing the array 165 to the integer: " +c1.parseInt(a));
        System.out.println("changing the string 165 to the integer: " +c1.parseInt("165"));
    }
}

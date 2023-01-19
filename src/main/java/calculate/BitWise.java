package calculate;

public class BitWise {

    public static void main(String[] args) {

        int num = 0b01000;
        int number = 10;

        System.out.printf("%d%n",num<<2);
        System.out.printf("%d%n",num>>2);
        System.out.printf("%d%n",~num+1);
        System.out.printf("%o%n",num);
        System.out.printf("%x%n",num);
    }
}

class Java02_SwapTwoNumber {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("Before swap :: a="+a+" b="+b);

        a = a+b;    // a = 3
        b = a-b;    // b = 3-2 = 1
        a = a-b;    // a = 3-1 = 2

        System.out.println("After swap :: a="+a+" b="+b);

    }
}

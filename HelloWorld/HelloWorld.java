public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int four = TimesTwo(2);
        System.out.println(four);
    }

    public static int TimesTwo(int num) {
        return num * 2;
    }
}
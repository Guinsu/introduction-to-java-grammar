package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&& : AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println("|| : OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산");
        System.out.println(!true); // 거짓
        System.out.println(!false); // 참

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println( a && b); // 거짓
        System.out.println(a || b); // 참
        System.out.println(!a);// 거짓
        System.out.println(!b); // 참
    }
}

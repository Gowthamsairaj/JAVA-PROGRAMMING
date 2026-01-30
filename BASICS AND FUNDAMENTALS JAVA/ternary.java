public class ternary{
    public static void main(String[] args) {
        int a = 72;

        String b = (a >= 80) ? "a is pass" :(a>=70)? "a is good grade" :(a>=50) ?"a is just pass":"fail";

        System.out.println(b);
    }
}

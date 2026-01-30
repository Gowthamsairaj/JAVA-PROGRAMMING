public class run_of_rectangle4 {

     public static void main(String[] args) {

         rectangle4  r1 = new  rectangle4 ();
        r1.display();
        System.out.println("Area: " + r1.calculateArea());

         rectangle4  r2 = new rectangle4 (5);
        r2.display();
        System.out.println("Area: " + r2.calculateArea());

         rectangle4  r3 = new  rectangle4 (4, 6);
        r3.display();
        System.out.println("Area: " + r3.calculateArea());
    }
}
    


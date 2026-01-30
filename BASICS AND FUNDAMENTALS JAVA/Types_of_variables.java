public class Types_of_variables {

    
    int instanceVar = 10;

    
    static int staticVar = 20;

    
    final int finalVar = 30;

    // Method
    void show() {

        
        int localVar = 40;
        Types_of_variables.staticVar=32;
        Types_of_variables.staticVar=64;

        

        System.out.println("Instance Variable = " + instanceVar);
        System.out.println("Static Variable = " + staticVar);
        System.out.println("Final Variable = " + finalVar);
        System.out.println("Local Variable = " + localVar);
    }

    public static void main(String[] args) {

        

        Types_of_variables obj = new Types_of_variables(); // object creation
        
        obj.show();

        System.out.println("Access static/global variable = " + staticVar);
    }
}
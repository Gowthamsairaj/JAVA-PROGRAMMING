
import java.util.Scanner;
class else_if{
    public static void main (String []args ){
        Scanner inp=new Scanner(System.in);
        int marks =inp.nextInt();
        if(marks >= 90)
        System.out.println("A Grade");
        else if(marks >= 75)
    System.out.println("B Grade");
    else if(marks >= 50)
    System.out.println("C Grade");
    else
      System.out.println("Fail");

        System.out.println(marks);
  }
}




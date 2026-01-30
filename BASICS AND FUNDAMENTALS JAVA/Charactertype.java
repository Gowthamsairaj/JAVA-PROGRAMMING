import java.util.Scanner;
class Charactertype{
    public static void main(String[] SAIRAJ){
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        
        if(ch >='A' && ch<='Z'){
            System.out.println("This is UPPERCASE LETTER");
        }

        else if (ch >='a' && ch<='z')
        {
            System.out.println("This is LOWERCASE LETTER");
        }

        else if(ch >='0' && ch<='9')
        {
            System.out.println("This is DIGIT");
        }

        else{
            System.out.println("This is SPECIAL CHARACTER");
        }
    }
}
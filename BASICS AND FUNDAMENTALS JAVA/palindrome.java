class palindrome{
    public static void main(String []args){
        int num=111;
        int temp=num;
        int rev=0;
        while(temp!=0)
        {
             int digit=temp%10;
             rev =rev*10+digit;
              temp=temp/10;
        }
        if(rev==num){
            System.out.println("The given numer is palindrome");
        }
        else
        {
            System.out.println("The given number is not a palindrome");
        }
        

    }
}
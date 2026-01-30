class ash{
    public static void main(String []sai){
       int n=12345;
       String r="";
       String e="";
       while(n>0)
       {
        int digit= n%10;
        if(digit%2==0)
            {
                r=digit+" "+r;
            }
            else{
                e=digit+" "+e;
            }
         n=n/10; 
        

       }
       System.out.print(e+""+r);
       
        
    }
}
// n=12345
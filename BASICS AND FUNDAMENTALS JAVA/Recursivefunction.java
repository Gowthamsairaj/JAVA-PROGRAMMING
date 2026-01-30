class Recursivefunction{

    int fact(int a){
            if(a==0){
                return 1;
            }
        

            return a*fact(a-1);

    }
    public static void main(String[] sairaj){
            Recursivefunction obj=new Recursivefunction();
            int res=obj.fact(7);  
            System.out.println(res);
    }
}
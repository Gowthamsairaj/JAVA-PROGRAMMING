class countnumbers{
    public static void main(String []args){
        int n1=223;
        int count=0;
        while(n1!=0){
            n1=n1/10;
            count++;
        }
        System.out.println(count);
    }
}
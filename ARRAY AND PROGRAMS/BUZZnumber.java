class BUZZnumber{
    public static void main(String[]args){
        for(int i =1;i<=50;i++){
            if(i%10==7||i/10==7){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);

        }
    }
}
import java.util.Random;

class whileloop{
    public static void main(String args[]){
      Random rnd=new Random();
      int num=0;

      while(num!=7){
        num=rnd.nextInt(17);
        System.out.println(num);

      }
    }
}
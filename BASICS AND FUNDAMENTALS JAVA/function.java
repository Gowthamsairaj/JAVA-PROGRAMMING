class function{
    int name=10;
    void games (){
    System.out.println(" ASSASSIN CREED ");
}

  void games (String name,int a){
    System.out.println(name+" game price is"+a);


}

   void games(int S)
 {
      System.out.println(S);
 }
    

    public static void main(String[]args){
         int S=38;
        function obj=new function();
        obj.games("RDR-2",4500);
        obj.games();
           

        obj.games(S);
        
         
    }
}
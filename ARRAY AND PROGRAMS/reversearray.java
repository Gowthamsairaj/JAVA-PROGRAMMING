class reversearray{
    
        int[] func(int [] a){
            int start=0;
        int end=a.length-1;
     
         for(int i=0;i<a.length;i++){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
         }
         return a;
        }
    public static void main(String []sairaj){
       int[] a={5,7,1,89,21,0};
        reversearray obj=new reversearray();
        int[] res=obj.func(a);
          for(int i=0;i<res.length;i++)
        {
        System.out.println(res[i]);
        }
    }
}
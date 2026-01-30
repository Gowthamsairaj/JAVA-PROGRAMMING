// class array{
//     public static void main(String [ ]sai){
//         int[] arr ={23,34,53,65,65};
//         int n=arr.length;
//         for(int i=0;i<=n;i++)
//         {

//            System.out.println(arr[i]);
//         }

//     }
// }
class array{
    public static void main(String []args){
        int sum=0;
        int[] arr={1,3,32};
        int n=arr.length;
        for(int i=0;i<=n;i++)
            {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
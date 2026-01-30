public class armstrongnumber {
    public static void main(String[] args) {
        int num = 9474;
        int original = num;

        int temp = num;
        int count = 0;

       
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        
        int sum = 0;
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int)Math.pow(digit, count);
            temp /= 10;
        }

     
        if (sum == original)
            System.out.println(original + " is an Armstrong Number");
        else
            System.out.println(original + " is NOT an Armstrong Number");
    }
}

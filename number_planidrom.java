import java.util.*;
public class number_planidrom 
{
    public boolean isPalindrome(int x) 
    {
       int r = reverse(x);
       return (r==x);
    }
    public static int reverse(int n)
    {
        int rev_n = 0;
        while(n>0)
        {
            rev_n = (rev_n*10) + (n%10);
            n = n/10; 
        }
        return rev_n;
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check for planidrom or not : ");
        int number = s.nextInt();
        number_planidrom np = new number_planidrom();
        System.out.println(np.isPalindrome(number));
        s.close();
    }   
}

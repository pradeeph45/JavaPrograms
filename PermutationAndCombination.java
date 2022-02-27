import java.util.Scanner;
public class PermutationAndCombination
{
    public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
   
    public static void main(String args[]){
        int n,n1, r;
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter Value of n : ");
        n = scanner.nextInt();
        System.out.print("Enter Value of n1 : ");
        n1 = scanner.nextInt();
        System.out.print("Enter Value of r : ");
        r = scanner.nextInt();
 
        System.out.print("NCR is " +(fact(n)/(fact(n-r)*fact(r))));
        System.out.print("\nNPR is " +(fact(n)/(fact(n-r))));
        System.out.print("\nNCR is " +(fact(n1)/(fact(n1-r)*fact(r))));
        System.out.print("\nNPR is " +(fact(n1)/(fact(n1-r))));
    }
}
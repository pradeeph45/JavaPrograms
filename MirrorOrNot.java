import java.util.Scanner;
public class MirrorOrNot {
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] != i)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {   
        int n;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number of elements you want to enter");
    	int a[]= {3,4,2,0,1};
        if (isMirrorInverse(a))
            System.out.println("Yes,it is a MirrorInverse");
        else
            System.out.println("No,it is not");
    }
}
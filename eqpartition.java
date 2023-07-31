package test;
import java.util.Scanner;
public class eqpartition {
	public static boolean equ(int arr[],int index,int sum) {
		if(index<0 || sum<0)
			return false;
		else if(sum==0)
			return true;
		else
			return equ(arr,index-1,sum-arr[index]) || equ(arr,index-1,sum);
				
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),sum=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		if(sum%2==1) {
			System.out.println("False");
		}else {
			boolean result = equ(arr,n-1,sum/2);
			if(result)
				System.out.println("True");
			else
				System.out.println("False");
		}
			
	}
}

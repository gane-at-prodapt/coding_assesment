package test;
import java.util.Scanner;
public class profitnloss {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max_profit = 0;
		int profit = 0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]<arr[i+1]) {
				profit+=(arr[i+1]-arr[i]);
				if(i==n-2) {
					if(max_profit<profit)
						max_profit = profit;
				}
			}
			else {
				if(max_profit<profit)
					max_profit = profit;
				profit = 0;
			}
		}
		System.out.println(max_profit);
	}
}

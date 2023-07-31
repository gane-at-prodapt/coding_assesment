package test;

import java.util.Scanner;
public class jumps {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int index = n-1,jump=0;
		while(index!=0){
			int temp = index;
			for(int i=0;i<n;i++) {
				if(index-i<=arr[i]) {
					temp = i;
					break;
				}
			}
			if(temp==index) {
				jump=-1;
				break;
			}
			else {
				index=temp;
				jump++;
			}
		}
		System.out.println(jump);
	}
}

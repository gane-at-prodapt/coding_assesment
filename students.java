package test;

import java.util.Scanner;

public class students {
	public static boolean strless(String a, String b) {
		int x = a.length();
		int y = b.length();
		int n;
		if(x<y)
			n=x;
		else
			n=y;
		for(int i=0;i<n;i++) {
			if(a.charAt(i)<b.charAt(i)) {
				return true;
			}
			else if(a.charAt(i)>b.charAt(i)) {
				return false;
			}
		}
		if(x<y)
			return true;
		return false;
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String students[] = new String[n+1]; 
		for(int i=0;i<n+1;i++) {
			students[i] = sc.nextLine();
		}
		for(int i=0;i<n+1;i++) {
			for(int j=i+1;j<n+1;j++) {
				if(strless(students[j],students[i])) {
					String temp = students[j];
					students[j]=students[i];
					students[i]=temp;
				}
			}
		}
		for(String i:students) {
			System.out.println(i);
		}
			
		
	}
}

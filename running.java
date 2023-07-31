package test;
import java.util.*;
public class running {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int distance;
		do {
			System.out.println("Enter a starting distance (Between 5km to 8km):");
			distance = sc.nextInt();
			if(distance>=5 && distance<=8) {
				for(int i=0;i<distance;i++) {
					System.out.println("Distance to run: " + Integer.toString(distance-i));
					if(i==1) {
						System.out.println("Good start, keep it up!");
					}else if(i>=distance-2) {
						System.out.println("Almost there!");
					}
				}
				System.out.println("Done for the day!");
			}else {
				System.out.println("Sorry, Choose between 5km to 8km");			
			}
		}while(distance<5 || distance>8);
	}
}

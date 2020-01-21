package thirtyDaysOfCode;

import java.util.Scanner;

public class Day6LetsReview {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String oddIndex="";
			String evenIndex="";
			for(int j=0;j<s.length();j++) {
				if(j%2==0)
					evenIndex=evenIndex+s.charAt(j);
				else
					oddIndex=oddIndex+s.charAt(j);
			}
			System.out.println(evenIndex+" "+oddIndex);
			//System.out.println(oddIndex);
		}
		sc.close();

	}

}

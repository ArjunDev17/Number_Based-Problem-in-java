package all.numbers;

import java.util.Scanner;

class P2{
	public static void check(int n) {
		if(n==2) {
			System.out.println(n);
		}else if(n%2!=0) {
			System.out.println(n);
		}
		
	}
}
public class Prime_num_in_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plzz enter Starting Number");
		int start = sc.nextInt();
		System.out.println("Plzz enter End Number");
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			P2.check(i);
		} 		
		
	}

}
//

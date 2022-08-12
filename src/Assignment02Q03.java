
public class Assignment02Q03 {

	public static void main(String[] args) {
		int numOfOdd = 0;
		int n = Integer.parseInt(args[0]);
		int a1 = 1;
		int a2 = 1;
		int temp ;
		System.out.println("The first "+ n +" Fibonacci numbers are:");
//		for (int i = 0 ; i < n-1  ;i++) {
//			if(a1%2 == 1) {
//				numOfOdd += 1;
//			}
//			temp = a2;
//			a2 = a1 + a2;
//			System.out.print(a1 + " ");
//			a1 = temp;
//			
//		}
//		if(a1%2 == 1) {
//			numOfOdd += 1;
//		}
		for (int i = 0 ; i < n  ;i++) {
			if(a1%2 == 1) {
				numOfOdd += 1;
			}
			temp = a2;
			a2 = a1 + a2;
			System.out.print(a1);
			if(i != n-1) {
				System.out.print(" ");	
			}
			
			
			a1 = temp;
			
		}
		System.out.println();
		System.out.println("The number of odd numbers is: "+numOfOdd);

	}

}

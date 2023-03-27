package forday6;

public class Oddeven { 
	public static void main (String [] args) {
		int oddCount = 0;
		int evenCount = 0;
		for(int i =10 ; i<=15 ; i++) {
			
			if(i%2!=0) {
				oddCount++;
			}
			else {
				evenCount++;
			}
		}
			System.out.println(oddCount);
			System.out.println(evenCount);
			
		}
	}



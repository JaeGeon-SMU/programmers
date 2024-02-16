import java.util.Scanner;
public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean isPrime = true;
		
		if(a == 1) 
			a += 1;
		else if (b == 0)
			b += 2;	
        
		for(int i = a; i <= b; i++) {
				for(int j = 2; j*j <= i; j++) {
					if( i%j == 0 ) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) 
					System.out.println(i);
				isPrime = true;
        }
	}
}
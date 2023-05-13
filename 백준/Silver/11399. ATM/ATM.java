import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		// 정렬 
		Arrays.sort(arr);
		int prev = 0;
		int sum = 0;
				
		for(int i = 0; i < N; i++) {	
			sum += prev + arr[i];
			prev += arr[i];
		}
		System.out.println(sum);
	}
}
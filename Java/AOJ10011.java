package AOJ;
import java.util.Scanner;
class AOJ10011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(i!=0){
				System.out.print(" ");
			}
				System.out.print(arr[n-i-1]);
				if(i+1 == n){
		System.out.println("");
				}
		}
		}
	}
}

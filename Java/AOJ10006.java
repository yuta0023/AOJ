package AOJ;

import java.util.Scanner;
class AOJ10006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		while(true){
			int x = sc.nextInt();
			if(x==0){
				break;
			}
			else{
				System.out.printf("Case %d: %d\n",cnt++,x);
			}
		}
	}
}
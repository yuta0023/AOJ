package AOJ;
import java.util.Scanner;
class AOJ10008 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 while(true){
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int d,r;
	 double f;
	 d=a/b;
	 r=a%b;
	 f=(double)a/(double)b;
	 System.out.printf("%d %d %.5f\n",d,r,f);
	}
	}
}

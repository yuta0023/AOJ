package AOJ;
import java.util.Scanner;
class AOJ10009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		double r = sc.nextDouble();
		double area,round,PI=3.141592653589;
		area = r*r*PI;
		round = 2*r*PI;
		System.out.printf("%f %f\n",area,round);
	}
	}
}

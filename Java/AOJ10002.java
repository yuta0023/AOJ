package AOJ;
import java.util.*;
class AOJ10002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int area,round;
		area = a*b;
		round = (a+b)*2;
		System.out.println(area+" "+round);
		}
	}

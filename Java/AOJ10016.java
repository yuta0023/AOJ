package AOJ;
import java.util.Scanner;
class AOJ10016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,f,r;
		while(true){
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			if(m==-1 && f==-1 && r==-1){
				break;
			}
			if(m==-1 || f==-1){
				System.out.println("F");
			}
			else if(m+f >= 80){
				System.out.println("A");
			}
			else if(m+f >= 65 && m+f < 80){
				System.out.println("B");
			}
			else if(m+f >= 50 && m+f < 65|| (m+f >=30 && r>= 50)){
				System.out.println("C");
			}
			else if(m+f >= 30 && m+f < 50){
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		}
	}

}

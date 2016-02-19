package AOJ;

import java.util.Scanner;
class AOJ10010 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a,b;
			int result=0;
			String op;
			while(true){
				a = sc.nextInt();
				op = sc.next();
				b = sc.nextInt();
				if("?".equals(op)){
					break;
				}
				else if("+".equals(op)){
					result = a+b;
				}
				else if("-".equals(op)){
					result = a-b;
				}
				else if("*".equals(op)){
					result = a*b;
				}
				else if("/".equals(op)){
					result = a/b;
				}
				System.out.println(result);
			}
	}
}


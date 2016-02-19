package AOJ;
import java.util.Scanner;
public class AOJ10015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//1 S
		//2 H
		//3 C
		//4 D
		boolean[][]card = new boolean[5][14];
		String mk;
		int nm;
		for(int i=0;i<n;i++){
			mk = sc.next();
			nm = sc.nextInt();
			if("S".equals(mk)){
				card[1][nm] = true;
			}
			else if("H".equals(mk)){
				card[2][nm] = true;
			}
			else if("C".equals(mk)){
				card[3][nm] = true;
			}
			else{
				card[4][nm] = true;
			}
		}
		
		for(int i=1;i<5;i++){
			for(int j=1;j<14;j++){
				if(card[i][j]==false){
					if(i==1){
						System.out.println("S "+j);
					}
					else if(i==2){
						System.out.println("H "+j);
					}
					else if(i==3){
						System.out.println("C "+j);
					}
					else{
						System.out.println("D "+j);
					}
				}
			}
		}	
	}
}

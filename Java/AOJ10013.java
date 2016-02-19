package AOJ;
import java.util.Scanner;
class AOJ10013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H == 0 && W == 0){
				break;
			}
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					if(i == 0 || i == H-1 || j == 0 || j == W-1){
					System.out.print("#");
				}
					else{
						System.out.print(".");
					}
				}
				System.out.println("");
			}
			System.out.println();
		}
	}
}

package AOJ;
import java.util.Scanner;
class AOJ10017 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,x;
		int way=0;
		
		while(true){
			n = sc.nextInt();
			x = sc.nextInt();
			if(n==0 && x==0){
				break;
			}
			int i,j,k;
			for(i=1;i<n+1;i++){
				for(j=1;j<n+1;j++){
					for(k=1;k<n+1;k++){
						if(i+j+k == x && i != j && i != k && j != k){
							way++;
						}
					}
				}
			}
			//d•¡‚ðœ‚­
			System.out.println(way/6);
			way=0;
		}
	}
}

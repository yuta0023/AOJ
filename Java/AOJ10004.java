package AOJ;
import java.util.Scanner;
class AOJ10004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		while(true){
		int[]arr = new int[3];
		for(i=0;i<3;i++){
			arr[i]=sc.nextInt();
		}
		for(i=arr.length-1;i>0;i--){
			for(j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					}
				}
			}
		for(i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.println(arr[i]);
			}
			else{
			System.out.print(arr[i]+" ");
			}
			}
		}
		}
}
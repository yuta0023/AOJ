package AOJ;

import java.util.Scanner;

class bubblesort {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		int[]arr = new int[3];
		for(i=0;i<3;i++){
			arr[i]=sc.nextInt();
		}
        System.out.print("ソート前：");
        arrayPrintln(arr);
        
        bubbleSort(arr);

        System.out.print("ソート後：");
        arrayPrintln(arr);
    }

    //基本交換法（バブルソート）*******************
    public static void bubbleSort(int[] arr){
        for(int i=arr.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int tmp  = arr[j];
                    arr[j]   = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    //配列の値を出力するメソッド*******************
    public static void arrayPrintln(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
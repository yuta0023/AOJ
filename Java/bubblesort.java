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
        System.out.print("�\�[�g�O�F");
        arrayPrintln(arr);
        
        bubbleSort(arr);

        System.out.print("�\�[�g��F");
        arrayPrintln(arr);
    }

    //��{�����@�i�o�u���\�[�g�j*******************
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

    //�z��̒l���o�͂��郁�\�b�h*******************
    public static void arrayPrintln(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
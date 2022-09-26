package test.zoho;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateInputs {

    public int[] sliceArray(int[] arr){
        int N = 0;

        // Finding the array size
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                N += 1;
            }
        }

        int[] res = new int[N];
        for(int i = 0; i < N; i++){
            res[i] = arr[i];
        }
        return res;
    }

    public int checkPresent(int[] arr, int data){
        int flag = 0;
        for(int i = 0; i < arr.length; i++){
            if(data == arr[i]){
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DuplicateInputs obj = new DuplicateInputs();
        int[] arr = new int[10];
        int temp;
        int inputs = scan.nextInt();

        int i = 0;
        while(inputs > 0){
            temp = inputs % 10;
            arr[i] = temp;
            inputs /= 10;
            i++;
        }

        arr = obj.sliceArray(arr);

        int[] res = new int[arr.length];
        int k = 0;
        for(i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j] && obj.checkPresent(res, arr[j]) == 0){
                    res[k] = arr[i];
                    k++;
                }
            }
        }

        res = obj.sliceArray(res);

        if(res.length > 0){
            System.out.println(Arrays.toString(res));
        }else{
            System.out.println("No Duplicates");
        }
    }
}

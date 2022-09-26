package test.zoho;

import java.util.Arrays;
import java.util.Scanner;

public class Students {

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

    public int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Students obj = new Students();
        int T;

        System.out.println("Enter the Test Case : ");
        T = scan.nextInt();

        while(T > 0){
            System.out.println("Array size : ");
            int N = scan.nextInt();

            if(N >= 3){
                System.out.println("Array values : ");
                int[] arr = new int[N];
                int[] fres = new int[N];
                int[] sres = new int[N];
                int[] tres = new int[N];

                for(int i = 0; i < N; i++){
                    arr[i] = scan.nextInt();
                }

                // find max number of problem solve stud.
                int max = obj.findMax(arr);
                int j = 0;
                for(int i = 0; i < N; i++){
                    if(max == arr[i]){
                        fres[j] = i+1;
                        arr[i] = -1;
                        j++;
                    }
                }
                int[] res = obj.sliceArray(fres);
                System.out.println("1st : "+Arrays.toString(res));

                max = obj.findMax(arr);
                j = 0;
                for(int i = 0; i < N; i++){
                    if(max == arr[i]){
                        sres[j] = i+1;
                        arr[i] = -1;
                        j++;
                    }
                }
                res = obj.sliceArray(sres);
                System.out.println("2st : "+Arrays.toString(res));

                max = obj.findMax(arr);
                j = 0;
                for (int i = 0; i < N; i++){
                    if(max == arr[i]){
                        tres[j] = i+1;
                        arr[i] = -1;
                        j++;
                    }
                }
                res = obj.sliceArray(tres);
                System.out.println("3st : "+Arrays.toString(res));
                T--;
            }
        }
    }
}

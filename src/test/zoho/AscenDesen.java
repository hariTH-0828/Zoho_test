package test.zoho;

import java.util.Arrays;
import java.util.Scanner;

public class AscenDesen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while(T > 0){

            System.out.println("Enter the size of Array : ");
            int N = scan.nextInt();


            int[] arr1 = new int[N];
            int[] arr2 = new int[N];
            int[] res = new int[N];

            System.out.println("Array 1 : ");
            for(int i = 0; i < N; i++){
                arr1[i] = scan.nextInt();
            }

            System.out.println("Array 2 : ");
            for(int i = 0; i < N; i++){
                arr2[i] = scan.nextInt();
            }

            int j = 0;
            int rpos = N;
            int lpos = N;
            for(int i = 0; i < N; i++){
                if(i % 2 == 0){
                    rpos = rpos - 2;
                    res[j] = arr1[rpos];
                }else{
                    lpos = rpos - 1;
                    res[j] = arr2[lpos];
                }
                j++;
            }

            System.out.println(Arrays.toString(res));
        }
    }
}

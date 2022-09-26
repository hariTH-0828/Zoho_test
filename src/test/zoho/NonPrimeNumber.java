package test.zoho;

import java.util.Scanner;

public class NonPrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flag = 0;

        System.out.println("Test case : ");
        int T = scan.nextInt();

        while(T > 0) {
            System.out.println("\nEnter the array size : ");
            int n = scan.nextInt();

            System.out.println("Enter the array values : ");
            // Get value Dynamically
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scan.nextInt();
            }

            for(int i = 0; i < n; i++){
                if(arr[i] == 1){
                    System.out.print(arr[i]+" ");
                }else{
                    for(int j = 2; j < arr[i]; j++) {
                        if(arr[i] % j == 0){
                            System.out.print(arr[i]+" ");
                            flag += 1;
                            break;
                        }
                    }
                }
            }

            if(flag == 0){
                System.out.println("All are prime numbers");
            }
            T--;
        }
    }
}

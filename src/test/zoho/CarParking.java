package test.zoho;

public class CarParking {

    public int rand(){
        double x = Math.random() * (10 - 1) + 0;
        int i = ((int)x * 10) / 10;

        return i;
    }

    public static void main(String args[]){
        // Create Object
        CarParking obj = new CarParking();

        // Variables Declaration
        int R = 10;
        int C = 10;
        int[][] arr = new int[R][C];

        // Value setting:
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                arr[i][j] = 0;
            }
        }

        // This part : Place a car on 0th column, while func is run when the two starting places are not in same
        int fc, sc;
        while(true){
            fc = obj.rand();
            sc = obj.rand();
            if(fc != sc){
                arr[fc][0] = 1;
                arr[sc][0] = 2;
                break;
            }
        }
        // End of the 1st Question

        // Q2 Start
        // Mark the location for car parking stand.
        int c3 = obj.rand();
        arr[c3][C-1] = 99;

        System.out.println("\nResult set : ");
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // End of the 2nd Question


        //Q3 Problem: This problem is to find the winning car, Time to reach the parking location, and print the path
        int car1 = c3 - fc;     // To find the nearing location of car parking
        int car2 = c3 - sc;

        if(car1 < 0) car1 *= -1;      // This two condition is to check the car1 and car2 distance are goes to negative value
        if(car2 < 0) car2 *= -1;      // then convert them to positive value

        if(car1 > car2){                // If car1 position is loose, then car2 can win and print the path
            System.out.println("Winner : Car 2");
            int time = 9 + car2;
            System.out.println("Time : "+ time);

            System.out.print("Path : ");
            for(int i = 0; i < C; i++){
                System.out.print("( "+ sc + "," + i + " )");
            }

            int j = c3 - sc;
            int k = 0;
            if(j < 0) {
                k = j * -1;
            }else{
                k = j;
            }

            for(int i = 0; i < k; i++){
                if(j < 0){
                    sc -= 1;
                    System.out.print("( "+ sc + "," + 9 + " )");
                }else{
                    sc += 1;
                    System.out.print("( "+ sc + "," + 9 + " )");
                }
            }

        }else{
            System.out.println("Winner : Car 1");
            int time = 9 + car1;
            System.out.println("Time : "+time);

            System.out.print("Path : ");
            for(int i = 0; i < C; i++){
                System.out.print("( "+ fc + "," + i + " )");
            }

            int j = c3 - fc;
            int k = 0;
            if(j < 0) {
                k = j * -1;
            }else{
                k = j;
            }

            for(int i = 0; i < k; i++){
                if(j < 0){
                    fc -= 1;
                    System.out.print("( "+ fc + "," + 9 + " )");
                }else{
                    fc += 1;
                    System.out.print("( "+ fc + "," + 9 + " )");
                }
            }
        }
    }
}

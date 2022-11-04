package arrays;

import java.util.Scanner;

public class arrayMethods {
    public static void main(String[] args) {
        coxsiraliMassiv();
    }
    public  static  void coxsiraliMassiv(){
        int[][] arr = new int[3][5];
        System.out.println("Daxil edilme");
        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                Scanner sc = new Scanner(System.in);
                System.out.println("i="+i +",j=" +j+".Ededi daxil edin");
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.println("i="+i+",j="+j+"."+arr[i][j]);
            }
        }
    }
}

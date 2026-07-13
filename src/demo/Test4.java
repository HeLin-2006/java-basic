package demo;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random r=new Random();
        for (int i=0;i< arr.length;i++){
            int num=r.nextInt(100)+1;
            int count=0;
            for(int j=0;j<arr.length;j++){
                if (num==arr[j]){
                    count++;
                    break;
                }
            }
            if (count==0){
                arr[i]=num;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}

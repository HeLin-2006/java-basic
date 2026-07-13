package demo;

import java.util.Random;

public class Test3  {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            int randomIndex= random.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

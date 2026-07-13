package demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] arr={33,5,22,44,55,33};
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number=scanner.nextInt();
        boolean flag=false;
        for (int i=0;i<arr.length;i++){
              if(number== arr[i]){
                  System.out.println(i);
                  break;
              }
         }
        if (flag){
            System.out.println("该数据不存在");
        }

    }
}

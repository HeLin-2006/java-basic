//二路归并找中位数
package array;

public class Test8 {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4};
        double number=findMedianSortedArrays(arr1,arr2);
        System.out.println( number);
    }
    public static double findMedianSortedArrays(int[] arr1,int[]arr2){
        //定义一个大数组，合并两个数组
        int []arr=new int[arr1.length+arr2.length];
        //把两个小数组的数据放在大数组中，而且要保证正序
        //在添加的过程中，保证顺序，前提：子数组本身就是正序
        int index1=0;
        int index2=0;
        //遍历
        for (int i = 0; i < arr.length; i++) {
            //如果arr1是短的
            if(index1==arr1.length){
                arr[i]=arr2[index2];
                index2++;
                continue;

            }
            //如果arr2是短的
            if (index2==arr2.length){

                arr[i]=arr1[index1];
                index1++;
                continue;
            }
            if (arr1[index1]<arr2[index2]){
                arr[i]=arr1[index1];
                index1++;
            }else {
                arr[i]=arr2[index2];
                index2++;
            }
        }
        //求中位数
        //大数组长度为奇数还是偶数
        if (arr.length%2==0){
            int num1=arr[arr.length/2];
            int num2=arr[arr.length]/2-1;
            return (num1+num2)/2.0;
        }else{
            int num=arr[arr.length/2];
            return num/1.0;

        }
    }
}

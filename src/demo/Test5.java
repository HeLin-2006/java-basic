//去除重复元素（快慢指针）
package demo;

public class Test5 {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3,3,3};
        int slow = 0;
        int fast = 1;
        while(fast<arr.length){
            if (arr[slow]==arr[fast]){
                fast++;
            }else{
                slow++;
                arr[slow]=arr[fast];
                fast ++;
            }
        }
        for (int i=0;i<=slow;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}

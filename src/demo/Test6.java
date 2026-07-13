//移除元素，慢指针：当前存入的位置，快指针：找数字2，是2->舍弃快指针位置的数据，不是2->快指针的数据存入慢指针位置
package demo;

public class Test6 {
    public static void main(String[] args) {
        int[] arr={0,1,2,2,3,0,4,2};//定义一个数组
        int val=2;//删除数字2
        int slow=0;
        int fast =0;
        while(fast<arr.length){
            if (arr[fast]==val){
                //相等，舍弃
                fast++;
            }
            else{
                //不想等，存入慢指针所在位置，快慢指针都要向后移动一个位置
                arr[slow]=arr[fast];
                slow++;
                fast++;
            }
        }

        //遍历数组
        for (int i = 0; i < slow; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();


    }
}

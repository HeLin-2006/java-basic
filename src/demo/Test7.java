//红包问题，给你两个整数M和N，M表示红包的总额，N表示红包的个数，现在有N个人来抽红包，每个人是随机的，打印每个人领的红包金额
package demo;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        //1.定义变量表示红包总额
        int money=4;//分
        int n = 5;//2.定义红包个数
        if(money<n){
            System.out.println("红包金额不够，请充值");
        }else {
            //3.利用循环抽红包
            Random r = new Random();
            for (int i = 1; i < n; i++) {
                //利用Random进行随机抽取 1 2 3 4表示当前是第几个人抽取
                //                    4 3 2 1表示的是最少预留的钱，单位分
                //                    money-(n-i)

                int mymMoney = r.nextInt(money - (n - i)) + 1;
                money = money - mymMoney;
                System.out.println("第" + i + "个人，抢到" + mymMoney + "分");
            }

            //输出最后一个人抢到的钱
            System.out.println("第" + n + "个人，抢到" + money + "分");
        }
    }
}

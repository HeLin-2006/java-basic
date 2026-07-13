package objectoriented.practice4;

public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    //value：表示将来要赋的值 小白
    public void setName(String value) {
        //给对象的属性进行赋值
        name=value;
    }

    public int getAge() {
        return age;
    }
    //num表示将来要赋的值 2岁
    public void setAge(int num) {
        if(num>=0&&num<=15){
            age = num;
        }else{
            System.out.println("当前的"+num+"不在合理范围内");
        }
    }

    public void eat(){
        System.out.println(age+"岁的"+name+"正在吃骨头");
    }

}

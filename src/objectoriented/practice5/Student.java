package objectoriented.practice5;

public class Student {
    // 姓名、年龄、身高、体重
    private String name;
    private int age;
    private int height;
    private int weight;

    // name
    public void setName(String value) {
        name = value;
    }

    public String getName() {
        return name;
    }

    // age
    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    // height
    public void setHeight(int num) {
        height = num;
    }

    public int getHeight() {
        return height;
    }

    // weight
    public void setWeight(int num) {
        weight = num ;
    }

    public int getWeight() {
        return weight;
    }

    //成员方法：学习
    public void study(){
        System.out.println(name+"正在学习");
    }

}
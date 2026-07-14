package objectoriented.practice5;

public class Test {
    public static void main(String[] args) {
        Student s =new Student();
        s.setName("张三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);
        //要求一
        System.out.println(s.getName()+","+s.getAge()+","+s.getHeight()+","+s.getWeight());
        s.study();
        //要求二，体重增加了十公斤
        int newWeight=s.getWeight()+10;
        s.setWeight(newWeight);
        System.out.println(s.getName()+","+s.getAge()+","+s.getHeight()+","+s.getWeight());

    }
}

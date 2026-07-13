package objectoriented.practice2;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="张三";
        s1.gender='男';
        s1.height=187;
        s1.age=20;
        System.out.println(s1.name);
        System.out.println(s1.gender);
        System.out.println(s1.height);
        System.out.println(s1.age);
    }
}

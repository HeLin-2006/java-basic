package objectoriented.practice6;

public class Test {
    public static void main(String[] args) {
        Student s=new Student("张三",18,"男",185.5);
        System.out.println(s.getName()+s.getAge()+s.getGender()+s.getHeight());
    }
}

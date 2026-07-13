package objectoriented.practice4;

public class Test {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.setName("小白");
        d.setAge(2);
        System.out.println(d.getName());
        System.out.println(d.getAge());
        d.eat();

    }
}

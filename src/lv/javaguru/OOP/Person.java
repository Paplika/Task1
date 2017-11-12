package lv.javaguru.OOP;

public class Person {
    private String name = "no name";
    private int age = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void descriptionOfPerson() {
        System.out.println(" ");
        System.out.println("My name is " + name);
        System.out.println("I'm " + age + " years old");
    }
}

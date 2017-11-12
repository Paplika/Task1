package lv.javaguru.OOP;

import lv.javaguru.OOP.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Jake");
        person1.setAge(27);

        person2.setName("Dan");
        person2.setAge(64);

        person1.descriptionOfPerson();
        person2.descriptionOfPerson();
    }
}

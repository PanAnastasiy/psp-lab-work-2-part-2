package lab.person;

import lab.interfaces.Nameable;

public class Person implements Nameable
{
    protected String name;
    protected int age;
    protected String gender;
    public Person()
    {
        this.name = "???";
        this.age = 0;
        this.gender = "???";
    }
    public Person(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {return age;}
}

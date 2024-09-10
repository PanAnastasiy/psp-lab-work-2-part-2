package person;

public class Person
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
    public void setFirstName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setGender(String gender)
    {
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

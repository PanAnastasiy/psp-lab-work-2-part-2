package person;

public class Worker extends Person
{
    protected int salary;
    public Worker()
    {
     super();
     this.salary = 0;
    }
    public Worker(String name, int age, String gender, int salary)
    {
        super(name, age, gender);
        this.salary = salary;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    public int getSalary()
    {
        return salary;
    }
}

package lab.person;

import lab.interfaces.Payable;
import lab.interfaces.Workable;

public class Worker extends Person implements Workable, Payable
{
    protected int hourPayment;
    protected  int hoursWorked;
    public Worker()
    {
     super();
        this.hourPayment = 0;
        this.hoursWorked = 0;
    }
    public Worker(String name, int age, String gender, int hourPayment, int hoursWorked)
    {
        super(name, age, gender);
        this.hourPayment = hourPayment;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public String performWork()
    {
        return "Сотрудник";
    }
    @Override
    public int calculateSalary() {
        return hoursWorked * hourPayment;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj instanceof Worker)
        {
            Worker temp=(Worker)obj;
            return this.hourPayment==temp.hourPayment
                    && this.hoursWorked == temp.hoursWorked &&
                    this.age==temp.age &&
                    this.gender.equals(temp.gender) &&
                    this.name.equals(temp.name);
        }
        else
            return false;
    }
    @Override
    public int hashCode()
    {
        return 83 * 3 + this.age * 83 + this.hoursWorked * 33 + this.hourPayment * 7;
    }
}

package lab.office;

import lab.person.Worker;

public abstract class OfficeWorker extends Worker
{
    protected String office;
    public OfficeWorker()
    {
        super();
        this.office = "???";
    }
    public OfficeWorker(String name, int age, String gender,  int hourPayment, int hoursWorked, String office)
    {
        super(name, age, gender, hourPayment, hoursWorked);
        this.office = office;
    }
    public String getOffice()
    {
        return this.office;
    }
    abstract public String calculateVacation();
    abstract public String isGoodWorker();
    abstract public String getVacation();
}

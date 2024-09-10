package person;

import java.beans.MethodDescriptor;

abstract public class MedicalWorker extends Worker
{
    protected String position;
    public MedicalWorker()
    {
        super();
        this.position = "???";
    }
    public MedicalWorker(String name, int age, String gender, int salary, String position)
    {
        super(name, age, gender, salary);
        this.position = position;
    }
    public void setPosition(String position)
    {
        this.position = position;
    }
    public String getPosition()
    {
        return position;
    }
    abstract public void printRowOfInfo();
}

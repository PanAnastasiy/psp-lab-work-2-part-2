package lab.medical;

import lab.interfaces.Qualified;
import lab.person.Worker;

abstract public class MedicalWorker extends Worker implements Qualified {
    protected String medicalPosition;
    public MedicalWorker()
    {
        super();
        this.medicalPosition = "???";
    }
    public MedicalWorker(String name, int age, String gender,  int hourPayment, int hoursWorked, String position)
    {
        super(name, age, gender, hourPayment, hoursWorked);
        this.medicalPosition = position;
    }
    public String getMedicalPosition()
    {
        return this.medicalPosition;
    }
    abstract public String getChange();
    abstract public int getPeople();
}

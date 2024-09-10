package person;

public class Nurse extends MedicalWorker {
    protected int countOfSicks;
    public Nurse() {
        super();
        this.countOfSicks = 0;
    }
    public Nurse(String name, int age, String gender, int salary,  int countOfSicks) {
        super(name, age, gender, salary, "Медсестра");
        this.countOfSicks = countOfSicks;
    }

    @Override
    public String toString() {
        return "";
    }
    @Override
    public void printRowOfInfo() {

    }
}

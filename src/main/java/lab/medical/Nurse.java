package lab.medical;

import lab.design.Design;

public class Nurse extends MedicalWorker {
    protected int countOfSicks;
    public Nurse()
    {
        super();
        this.countOfSicks = 0;
    }
    public Nurse(String name, int age, String gender,  int hourPayment, int hoursWorked, int countOfSicks)
    {
        super(name, age, gender, hourPayment, hoursWorked, "Медсестра");
        this.countOfSicks = countOfSicks;
    }
    @Override
    public String toString()
    {
        return Design.LIGHT_WHITE + Design.BOLD + "|" + Design.RED + Design.BOLD +
                " %-3d " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.PURPLE + Design.BOLD +
                " %-11s " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.YELLOW + Design.BOLD +
                " %-7d " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.CYAN + Design.BOLD +
                " %-7s " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.GREEN + Design.BOLD +
                " %-8d " + Design.LIGHT_WHITE + Design.BOLD +
                "|"+ Design.BLUE + Design.BOLD +
                " %-9s " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.CYAN + Design.BOLD +
                " %-7s " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.YELLOW + Design.BOLD +
                " %-5s " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.RED + Design.BOLD +
                " %-9s " + Design.LIGHT_WHITE + Design.BOLD +
                "|\n";
    }
    @Override
    public String getQualified() {
        if (this.countOfSicks > 50 )
        {
            return "Высшая";
        }
        if (this.countOfSicks > 20)
        {
            return "Первая";
        }
        else {
            return "Вторая";
        }
    }

    @Override
    public String getChange()
    {
        if (this.hoursWorked < 10)
        {
            return "1-АЯ";
        }
        if (this.hoursWorked > 10 && this.hoursWorked < 40)
        {
            return "2-АЯ";
        }
        return "3-Я";
    }
    @Override
    public int getPeople()
    {
        return this.countOfSicks;
    }
}

package lab.office;

import lab.design.Design;

public class Accountant extends OfficeWorker
{
    protected String daysOfYearWork;
    public Accountant()
    {
        super();
        this.daysOfYearWork = "???";
    }
    public Accountant(String name, int age, String gender,  int hourPayment, int hoursWorked, String days)
    {
        super(name, age, gender, hourPayment, hoursWorked, "Офис 1");
        this.daysOfYearWork = days;
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
                " %-8s " + Design.LIGHT_WHITE + Design.BOLD +
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
    public String calculateVacation() {
        if (this.hoursWorked < 20)
        {
            return "24.02-";
        }
        if (this.hoursWorked > 25)
        {
            return "04.03-";
        }
        return "19.06-";
    }

    @Override
    public String isGoodWorker()
    {
        if (this.hoursWorked < 10)
        {
            return "-";
        }
        return "+";
    }
    public String getVacation()
    {
        return this.daysOfYearWork;
    }
}

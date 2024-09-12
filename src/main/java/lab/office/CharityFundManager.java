package lab.office;

import lab.design.Design;

public class CharityFundManager extends OfficeWorker {
    protected String daysOfVacation;

    public CharityFundManager() {
        super();
        this.daysOfVacation = "???";
    }

    public CharityFundManager(String name, int age, String gender, int hourPayment, int hoursWorked, String days) {
        super(name, age, gender, hourPayment, hoursWorked, "Офис 2");
        this.daysOfVacation = days;
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
                "|" + Design.BLUE + Design.BOLD +
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
        if (this.hoursWorked < 10)
        {
            return "12.01-";
        }
        if (this.hoursWorked > 12)
        {
            return "04.02-";
        }
        return "09.05-";
    }
    @Override
    public String isGoodWorker() {
        if (this.hoursWorked < 10)
        {
            return "-";
        }
        return "+";
    }

    public String getVacation() {
        return this.daysOfVacation + " дней";
    }


}

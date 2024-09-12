package lab.console;

import lab.design.Design;
import lab.medical.MedicalWorker;
import lab.office.OfficeWorker;

import java.util.Iterator;
import java.util.List;

public class WriterInfo
{
    public static final String partOfHeader = Design.LIGHT_WHITE + Design.BOLD +
            "+-----+-------------+---------+---------+----------+-----------+---------+-------+-----------+\n|" +
            Design.RED + Design.BOLD + "  N  " +
            Design.LIGHT_WHITE + Design.BOLD +
            "|" +  Design.PURPLE + Design.BOLD +
            "   ФАМИЛИЯ   " + Design.LIGHT_WHITE + Design.BOLD +
            "|" + Design.YELLOW + Design.BOLD +
            " ВОЗРАСТ " + Design.LIGHT_WHITE + Design.BOLD +
            "|" + Design.CYAN + Design.BOLD +
            "   ПОЛ   " + Design.LIGHT_WHITE + Design.BOLD +
            "|" + Design.GREEN + Design.BOLD +
            " ЗАРПЛАТА " + Design.LIGHT_WHITE + Design.BOLD +
            "|" + Design.BLUE + Design.BOLD;
    public static void printMedical(List<MedicalWorker> workers)
    {
        printHeaderOfTableMedical();
        printRowsMedical(workers);
    }
    public static void printHeaderOfTableMedical()
    {
        System.out.println(WriterInfo.partOfHeader +
                " ДОЛЖНОСТЬ " + Design.LIGHT_WHITE + Design.BOLD +
                "|" +
                Design.CYAN + Design.BOLD +
                " БОЛЬНЫЕ " + Design.LIGHT_WHITE + Design.BOLD +
                "|" +
                Design.YELLOW + Design.BOLD +
                " СМЕНА " + Design.LIGHT_WHITE + Design.BOLD +
                "|" +
                Design.RED + Design.BOLD +
                " КАТЕГОРИЯ " + Design.LIGHT_WHITE + Design.BOLD +
                "|\n" +
                "+-----+-------------+---------+---------+----------+-----------+---------+-------+-----------+");
    }
    static void printRowsMedical(List<MedicalWorker> medicalWorkers)
    {
        int counter = 1;
        Iterator<MedicalWorker> iter = medicalWorkers.iterator();
        while (iter.hasNext())
        {
            MedicalWorker medical = iter.next();
            System.out.printf(medical.toString(),
                    counter, medical.getName(), medical.getAge(), medical.getGender(), medical.calculateSalary(), medical.getMedicalPosition(), medical.getPeople(), medical.getChange(), medical.getQualified());
            System.out.println(Design.LIGHT_WHITE + Design.BOLD + "+-----+-------------+---------+---------+----------+-----------+---------+-------+-----------+");
            counter++;
        }
    }
    public static void printOffice(List<OfficeWorker> workers)
    {
        printHeaderOfTableOffice();
        printRowsOffice(workers);
    }
    public static void printHeaderOfTableOffice()
    {
        System.out.println(
                WriterInfo.partOfHeader + Design.BLUE + Design.BOLD +
                "   ОФИСЫ   " + Design.LIGHT_WHITE + Design.BOLD +
                "|" +
                Design.CYAN + Design.BOLD +
                "  ОТПУСК " + Design.LIGHT_WHITE + Design.BOLD +
                "|" +
                Design.YELLOW + Design.BOLD +
                " ОТЗЫВ " + Design.LIGHT_WHITE + Design.BOLD +
                "|" +
                Design.RED + Design.BOLD +
                " ЗАЯВЛЕНИЕ " + Design.LIGHT_WHITE + Design.BOLD +
                "|\n" +
                "+-----+-------------+---------+---------+----------+-----------+---------+-------+-----------+");
    }
    static void printRowsOffice(List<OfficeWorker> officeWorkers)
    {
        int counter = 1;
        Iterator<OfficeWorker> iter = officeWorkers.iterator();
        while (iter.hasNext())
        {
            OfficeWorker office = iter.next();
            System.out.printf(office.toString(),
                    counter, office.getName(), office.getAge(), office.getGender(), office.calculateSalary(), office.getOffice(), office.calculateVacation(), office.isGoodWorker(), office.getVacation());
            System.out.println(Design.LIGHT_WHITE + Design.BOLD + "+-----+-------------+---------+---------+----------+-----------+---------+-------+-----------+");
            counter++;
        }
    }
}

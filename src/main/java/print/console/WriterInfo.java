package print.console;

import design.console.Design;
import person.MedicalWorker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WriterInfo
{
    public static void printAllTribes(List<MedicalWorker> workers)
    {
        printHeaderOfTable();
        printRows(workers);
    }
    public static void printHeaderOfTable()
    {
        System.out.println(Design.LIGHT_WHITE + Design.BOLD +
                "+-----+-------------+---------+---------+----------+-----------+\n|" +
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
                "|" + Design.BLUE + Design.BOLD +
                " ДОЛЖНОСТЬ " + Design.LIGHT_WHITE + Design.BOLD +
                "|\n" +
                "+-----+-------------+---------+---------+----------+-----------+");
    }
    static void printRows(List<MedicalWorker> workers)
    {
        int counter = 1;
        Iterator<MedicalWorker> iter = workers.iterator();
        while (iter.hasNext()) {
            MedicalWorker worker = iter.next();
            System.out.printf(Design.LIGHT_WHITE + Design.BOLD + "|" + Design.RED + Design.BOLD +
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
                            "|\n",
                    counter, worker.getName(), worker.getAge(), worker.getGender(), worker.getSalary(), worker.getPosition());
            System.out.println(Design.LIGHT_WHITE + Design.BOLD + "+-----+-------------+---------+---------+----------+-----------+");
            counter++;
        }
        /*
        TribeNode current = list.getTribeNodeHead();

        while (current != null)
        {
            Tribe tribe = current.getTribe();

            current = current.next;
            counter++;
        }

         */
    }
}

package hospital;

import person.MedicalWorker;

import java.util.ArrayList;
import java.util.List;

public class Hospital
{
    private List<MedicalWorker> workers;
    private static int totalWorkers = 0;
    private static int totalCost = 0;
    public Hospital()
    {
        this.workers = new ArrayList<MedicalWorker>();
    }
    public void addMedicalWorker(MedicalWorker mw)
    {
        this.workers.add(mw);
        totalWorkers++;
        totalCost += mw.getSalary();
    }
    public List<MedicalWorker> getWorkers()
    {
        return this.workers;
    }
    public static void checkBudget()
    {
        // вывод итоговых расходов и доходов больницы с анализом данных
    }
}

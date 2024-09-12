package lab.main;

/*Задание: Построить иерархию объектов.
 Показать использование и понимание принципов инкапсуляции, наследования, полиморфизма.

 Больница (собрать персонал)
 */

import lab.design.Console;
import lab.design.Design;
import lab.design.Developer;
import lab.design.Message;
import lab.hospital.Hospital;
import lab.menu.MenuMain;
import lab.console.WriterInfo;

public class MainClass {

    public static void main(String[] args) {
        MenuMain menu = new MenuMain();
        Hospital hospital = new Hospital();
        hospital.loadMedicalWorkersFromFile("src/main/java/lab/data/medical.txt");
        hospital.loadOfficeWorkersFromFile("src/main/java/lab/data/office.txt");
        while (true)
        {
            menu.menuOfMain();
            switch(menu.getChoice())
            {
                case '1':
                    Console.clear();
                    WriterInfo.printMedical(hospital.getMedicalWorkers());
                    Message.waitForEnter();
                    break;
                case '2':
                    Console.clear();
                    WriterInfo.printOffice(hospital.getOfficeWorkers());
                    Message.waitForEnter();
                    break;
                case '3':
                    Console.clear();
                    Developer.printInfoOfDeveloper();
                    Message.waitForEnter();
                    break;
                case '4':
                    Console.clear();
                    Message.printMessage("Осуществляем выход из программы...", Design.PURPLE, Design.RED);
                    System.exit(0);
                default:
                    Console.clear();
                    Message.printMessage("Выбран некорректный номер задачи...", Design.PURPLE, Design.RED);
                    Message.waitForEnter();
            }
        }
    }
}

package main;

/*Задание: Построить иерархию объектов.
 Показать использование и понимание принципов инкапсуляции, наследования, полиморфизма.
  В классах должны быть поля, конструкторы, методы. Обязательным   является переопределение
   методов класса Object  toString(), equals(), hashCode().
 Использовать абстрактные классы и интерфейсы. Собрать коллекции объектов.

 Больница (собрать персонал)
 */

import design.console.Console;
import design.console.Design;
import design.console.Developer;
import design.console.Message;
import hospital.Hospital;
import menu.MenuMain;
import person.MedicalWorker;
import person.Nurse;
import print.console.WriterInfo;

public class MainClass {

    public static void main(String[] args) {

        objectCreation();
        MenuMain menu = new MenuMain();
        Hospital hospital = new Hospital();
        hospital.addMedicalWorker(new Nurse("Пушка", 19, "Женский", 950, 10));
        hospital.addMedicalWorker(new Nurse("Филатова", 39, "Женский", 250, 15));
        hospital.addMedicalWorker(new Nurse("Любимов", 44, "Мужской", 400, 25));
        hospital.addMedicalWorker(new Nurse("Атрозенко", 21, "Мужской", 1000, 45));
        WriterInfo.printAllTribes(hospital.getWorkers());
        while (true)
        {
            menu.menuOfMain();
            switch(menu.getChoice())
            {
                case '1':
                    Console.clear();
                    //WriterInfo.printWardsInTable(Wards.wards);
                    Message.waitForEnter();
                    break;
                case '2':
                    Console.clear();
                    //WriterInfo.printWards(Wards.wards);
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
    public static void objectCreation()
    {

    }
}

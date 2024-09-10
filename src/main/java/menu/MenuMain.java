package menu;

import design.console.Design;
import design.console.Message;

import java.util.Scanner;

public class MenuMain
{
    public void menuOfMain()
    {
        Message.printMessage("  Список функций, реализуемых в программе :  ", Design.LIGHT_WHITE, Design.BLUE);
        System.out.println(Design.LIGHT_WHITE + Design.BOLD + "| 1. Вывод информации о персонале больницы.     |" + Design.RESET);
        System.out.println(Design.LIGHT_WHITE + Design.BOLD + "| 2. Добавление сведений о персонале.           |" + Design.RESET);
        System.out.println(Design.LIGHT_WHITE + Design.BOLD + "| 3. Вывод информации о разработчике.           |" + Design.RESET);
        Message.printMessage("4. Выход из программы.                       ", Design.LIGHT_WHITE, Design.RED);
    }
    public char getChoice()
    {
        System.out.println("\n");
        char yourChoice;
        Message.printMessage("Что желаете реализовать ?", Design.YELLOW, Design.GREEN);
        Scanner scanner = new Scanner(System.in);
        yourChoice = scanner.next().charAt(0);
        return yourChoice;
    }
}

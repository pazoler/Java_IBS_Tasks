import java.util.*;
//        Ввести первое  число с клавиатуры и записать его в строковую переменную.
//        Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
//        Сравнить 2 числа и вывести большее на экран .
//        Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
public class Task11Data {
    public static void main(String[] args) {
        System.out.println("Введите число, которое запишется int");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        System.out.println("Введите число, которое запишется String");
        Scanner scan2 = new Scanner(System.in);
        String str=scan2.nextLine();
        int max=Math.max(num, Integer.parseInt(str));
        System.out.println("Максимальное значение: " + max);
        double min=Math.min(Double.parseDouble(str), (double) num);
        System.out.println("Минимальное значение: " + min);
    }
}
import java.util.*;

public class Task7Cycle {
    public static void main(String[] args){
         final String X="12";
         final String Y="Четыре";
         final String Z="и";
        System.out.println("Введите размер массива");
        Scanner scan= new Scanner(System.in);
        int size = scan.nextInt();
        String[] arr= new String[size];
        for (int i=0; i < arr.length; i++){
            System.out.println("Введите данные для элемента "+ i);
            Scanner scan2= new Scanner(System.in);
            arr[i]= scan2.nextLine();
        }
        if (Arrays.asList(arr).contains(X) || Arrays.asList(arr).contains(Y) || Arrays.asList(arr).contains(Z)) {
            System.out.println("Данное значение имеется в константах");
        }
    }
}

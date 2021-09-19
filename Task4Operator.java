import java.util.*;

public class Task4Operator {
    public static void main (String[] args){
        System.out.println("Введите три числа через пробел");
        Scanner numbers= new Scanner(System.in);
        String typed = numbers.nextLine();
        int [] intArray=typedToArray(typed);
//        System.out.println(Arrays.toString(intArray));
        int average = midAriphmethic(intArray);
        System.out.println(average);
        int rounded=rounderTwo(average);
 //       System.out.println(rounded);
        //Проверка, что число больше 3
        if (rounded > 3){
            System.out.println("Программа выполнена корректно");
        }
    }

    //функция приведения написанного к числовому массиву
    private static int[] typedToArray(String str) {
        String delimeter = " ";
        String[] strArray= str.split(delimeter);
        int[] intArray=new int[strArray.length];
        for (int i=0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }
    //Функция для среднего арифметического этих чисел.
    private static int midAriphmethic (int[] arr) {
        int average=0;
        for (int i=0; i< arr.length; i++){
            average +=arr[i];
        }
        return average/arr.length;
    }
    //Функция деления на 2 и округления в меньшую сторону
    private static int rounderTwo (int num) {

        return (int)num/2;
    }
}

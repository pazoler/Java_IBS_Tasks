import java.util.*;

/*Задайте массив из 5 любых целых чисел.
Поменяйте местами первый и последний элемент в массиве.
Вывести в консоль результат суммы первого и среднего элемента.*/
public class Task3Array {
    public static void main (String[] args){
        int[] arr1={1,2,3,4,5};
        int temp=arr1[arr1.length-1];
        arr1[arr1.length-1]=arr1[0];
        arr1[0]=temp;
        System.out.println(arr1[arr1.length-1]+arr1[0]);
        //       System.out.println(Arrays.toString(arr1));
    }
}

import java.util.*;

public class Task6Operator3 {
    public static void main (String[] args){
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner onetwo= new Scanner(System.in);
        int num1=onetwo.nextInt();
        if (num1 == 1) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - фунт");
            Scanner onefour= new Scanner(System.in);
            int num2=onefour.nextInt();
            double[] arr={1,1000,100000,453.592};
            String[] mes={"грамм","килограмм","центнер","фунтов"};
            System.out.println("Введите число: ");
            Scanner val= new Scanner(System.in);
            double num3=val.nextDouble();
            for (int i=0; i <= arr.length-1; i++ ){
                System.out.println((num3*arr[num2-1])/arr[i] +" "+ mes[i]);
            }

        } else if (num1==2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            Scanner onefour= new Scanner(System.in);
            int num2=onefour.nextInt();
            double[] arr={1,1609.34,0.9144,0.3048};
            String[] mes={"метр","миля","ярд","фут"};
            System.out.println("Введите число: ");
            Scanner val= new Scanner(System.in);
            double num3=val.nextDouble();
            for (int i=0; i <= arr.length-1; i++ ){
                System.out.println((num3*arr[num2-1])/arr[i] +" "+ mes[i]);
            }
        }

    }
}

import java.util.*;

public class Task5Operator2 {
    public static void main (String[] args){
        System.out.println("Введите три раза через ENTER: Число / Число и один из символов ‘+’, ‘-’, ‘*’ или ‘/’. ");
        Scanner number1= new Scanner(System.in);
        Scanner number2= new Scanner(System.in);
        Scanner symb= new Scanner(System.in);
        int numb1, numb2;
        String symb1;
        numb1=number1.nextInt();
        numb2=number2.nextInt();
        symb1=symb.nextLine();
        System.out.println(operation(numb1,numb2,symb1));

    }

    private static int operation(int num1, int num2, String char1){
        switch (char1){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                return (int)(num1/num2);
            default: System.out.println("Операция не определена");
                return 0;
        }
    }
}

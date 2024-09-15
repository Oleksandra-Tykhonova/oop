import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;

public class NumberOperations {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<>(Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9));

        System.out.print("Початковий список: ");
        for (Object element : lst) {
            System.out.print(element + " ");
        }

        //Додавання двох нових елементів до списку різних форматів і його виведення
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int num1 = scan.nextInt();
        System.out.print("Введіть дестякове число: ");
        float num2 = scan.nextFloat();

        lst.add(num1);
        lst.add(num2);


        System.out.print("Список після додавання елементів: ");
        for (Object element : lst) {
            System.out.print(element + " ");
        }


        //Форматування і виведення списку у формат цілих чисел за допомогою оператору instanceof - приналежності до класу Integer, Float,Double
        System.out.print("\nСписок у форматі цілих чисел: ");
        for (Object element : lst) {
            if (element instanceof Integer) {
                System.out.print((int) element + " ");
            } else if (element instanceof Float) {
                System.out.print(((Float) element).intValue() + " ");
            } else if (element instanceof Double) {
                System.out.print(((Double) element).intValue() + " ");
            }
        }

        /* Форматування і виведення списку у формат дробових чисел

        Створюємо об'єкт DecimalFormat класу DecimalFormat (його імпортували)
        Конструктор DecimalFormat(String pattern) приймає шаблон (формат) у вигляді рядка,
        який вказує, як форматувати числа.
        Шаблон ("#.00") визначає, як числа будуть виглядати у вигляді рядка.
         */
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("\nСписок у форматі дробних чисел з двома знаками піля коми: ");
        for (Object element : lst) {
            if (element instanceof Integer) {
                System.out.print(df.format((Integer) element) + "  ");
            } else if (element instanceof Float) {
                System.out.print(df.format((Float) element) + "  ");
            } else if (element instanceof Double) {
                System.out.print(df.format((Double) element) + "  ");
            }
        }


        //Зберігаємо різні числа в залежності від їх типу

        //цілі числа
        ArrayList<Object> lst_int = new ArrayList<>();
        for (Object element : lst) {
            if (element instanceof Integer) {
                lst_int.add(element);
            }
        }
        System.out.print("\nСписок з елементів лише типу int: ");
        for (Object element : lst_int) {
            System.out.print(element + " ");
        }

        //дробові числа float
        ArrayList<Object> lst_float = new ArrayList<>();
        for (Object element : lst) {
            if (element instanceof Float) {
                lst_float.add(element);
            }
        }
        System.out.print("\nСписок з елементів лише типу float: ");
        for (Object element : lst_float) {
            System.out.print(element + " ");
        }

        //дробові числа double
        ArrayList<Object> lst_double = new ArrayList<>();
        for (Object element : lst) {
            if (element instanceof Double) {
                lst_double.add(element);
            }
        }
        System.out.print("\nСписок з елементів лише типу double: ");
        for (Object element : lst_double) {
            System.out.print(element + " ");
        }

        task_V10();
        }


        
    public static void task_V10() {
        ArrayList<Object> lst = new ArrayList<>(Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9));

        System.out.print("\nСписок, де до кожного елемента ПОЧАТКОВОГО списку застосована формула (число + 10)/2: ");

        DecimalFormat df = new DecimalFormat("#.00");
        for (Object element : lst) {
            if (element instanceof Integer) {
                double result = (((Integer) element) + 10) / 2.0;
                System.out.print(df.format(result) + " ");
            } else if (element instanceof Double) {
                double result = (((Double) element) + 10) / 2.0;
                System.out.print(df.format(result) + " ");
            }
        }
    }
    }


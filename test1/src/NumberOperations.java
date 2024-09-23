import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberOperations {
    public static void main(String[] args) {
        // список ArrayList в Java, який містить різні типи чисел (цілі числа та числа з плаваючою комою).
        // Називається це "модифікований тип даних" або "змішаний тип даних" в контексті колекцій.
        // При використанні Arrays.asList з примітивними типами, такими як int і double, ці типи автоматично упаковуються
        // в відповідні обгорткові класи (Integer, Double).
        // Тому фактично список буде містити об'єкти типу Integer і Double.
        ArrayList<Object> lst = new ArrayList<>(Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9));

        System.out.print("Початковий список: ");
        for (Object element : lst) {
            System.out.print(element + " ");
        }


        int num1 = 3;
        float num2 = 4.5f;
        double num3 = 1000;
        byte num6 = 1;
        String num7 = "23";
        BigInteger num4 = new BigInteger("7");
        BigDecimal num5 = new BigDecimal("5.6666666666");


        lst.add(num1);
        lst.add(num2);
        lst.add(num3);
        lst.add(num4);
        lst.add(num5);
        lst.add(num6);
        lst.add(num7);


        System.out.print("\nДодані елементи: ");
        ArrayList<Object> lst_add = new ArrayList<>();
        lst_add.add(num1);
        lst_add.add(num2);
        lst_add.add(num3);
        lst_add.add(num4);
        lst_add.add(num5);
        lst_add.add(num6);
        lst_add.add(num7);

        for (Object el : lst_add) {
            System.out.print(el + " ");
        }


        BigDecimal sum1 = new BigDecimal("0");
        BigDecimal num_bd = new BigDecimal("0");
        for (Object i : lst_add) {
            if (i instanceof Integer) {
                num_bd = BigDecimal.valueOf((Integer) i);
            } else if (i instanceof Long) {
                num_bd = BigDecimal.valueOf((Long) i);
            } else if (i instanceof Double) {
                num_bd = BigDecimal.valueOf((Double) i);
            } else if (i instanceof String) {
                num_bd = new BigDecimal((String) i);
            } else if (i instanceof Float) {
                num_bd = new BigDecimal((Float) i);
            } else if (i instanceof BigDecimal) {
                num_bd = (BigDecimal) i;
            } else if (i instanceof BigInteger) {
                num_bd = new BigDecimal((BigInteger) i);
            } else if (i instanceof Byte){
                num_bd = new BigDecimal((Byte) i);
            }
            sum1 = sum1.add(num_bd);
        }
        System.out.println("Сума: " + sum1);



        System.out.print("\nСписок після додавання елементів: ");
        for (Object element : lst) {
            System.out.print(element + " ");
        }


        //Форматування і виведення списку у формат цілих чисел
        System.out.print("\nСписок у форматі цілих чисел: ");
        for (Object element : lst) {
            if (element instanceof Integer) {
                System.out.print((int) element + " ");
            } else if (element instanceof Float) {
                System.out.print(((Float) element).intValue() + " ");
            } else if (element instanceof Double) {
                System.out.print(((Double) element).intValue() + " ");
            } else if (element instanceof BigDecimal) {
                System.out.print(((BigDecimal) element).intValue() + " ");
            } else if (element instanceof BigInteger) {
                System.out.print(((BigInteger) element).intValue() + " ");
            }
        }



        //Форматування і виведення списку у формат дробових чисел
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("\nСписок у форматі дробних чисел з двома знаками піля коми: ");
        for (Object i : lst) {
            if (i instanceof Integer) {
                System.out.print(df.format((Integer) i) + "  ");
            } else if (i instanceof Float) {
                System.out.print(df.format((Float) i) + "  ");
            } else if (i instanceof Double) {
                System.out.print(df.format((Double) i) + "  ");
            } else if (i instanceof BigDecimal) {
                System.out.print(df.format((BigDecimal) i) + "  ");
            } else if (i instanceof BigInteger) {
                System.out.print(df.format((BigInteger) i) + "  ");
            } else if (i instanceof Byte){
                System.out.print(df.format((Byte) i) + "  ");
            }
        }


        //Зберігаємо різні числа в залежності від їх типу

        //цілі числа
        ArrayList<Object> lst_int = new ArrayList<>();
        for (Object el1 : lst) {
            if (el1 instanceof Integer) {
                lst_int.add(el1);
            }
        }
        System.out.print("\nСписок з елементів лише типу int: ");
        for (Object el1 : lst_int) {
            System.out.print(el1 + " ");
        }


        //дробові числа float
        ArrayList<Object> lst_float = new ArrayList<>();
        for (Object el2 : lst) {
            if (el2 instanceof Float) {
                lst_float.add(el2);
            }
        }
        System.out.print("\nСписок з елементів лише типу float: ");
        for (Object el2 : lst_float) {
            System.out.print(el2 + " ");
        }

        //дробові числа double
        ArrayList<Object> lst_double = new ArrayList<>();
        for (Object el3 : lst) {
            if (el3 instanceof Double) {
                lst_double.add(el3);
            }
        }
        System.out.print("\nСписок з елементів лише типу double: ");
        for (Object i : lst_double) {
            System.out.print(i + " ");
        }

        //дробові числа bd
        ArrayList<Object> lst_bd = new ArrayList<>();
        for (Object i : lst) {
            if (i instanceof BigDecimal) {
                lst_bd.add(i);
            }
        }
        System.out.print("\nСписок з елементів лише типу BigDecimal: ");
        for (Object i : lst_bd) {
            System.out.print(i + " ");
        }


        BigDecimal int1 = new BigDecimal((Integer) lst_int.get(0));
        BigDecimal bd1 = (BigDecimal) lst_bd.get(0);
        BigDecimal res1 = bd1.add(int1);
        res1 = res1.setScale(0, RoundingMode.HALF_UP);
        System.out.println("\nint1 + bd1: " + res1);




        //цілі числа bi
        ArrayList<Object> lst_bi = new ArrayList<>();
        for (Object i : lst) {
            if (i instanceof BigInteger) {
                lst_bi.add(i);
            }
        }
        System.out.print("\nСписок з елементів лише типу BigInteger: ");
        for (Object i : lst_bi) {
            System.out.print(i + " ");
        }



        task_V10(lst);
    }


    public static void task_V10(ArrayList<Object> lst) {
        //ArrayList<Object> lst = new ArrayList<>(Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9));

        System.out.print("\nСписок, де до кожного елемента списку з доданими елементами застосована формула (число + 10)/2:\n");

        BigDecimal res = new BigDecimal("0");
        BigDecimal num_bd = new BigDecimal("0");

        for (Object i : lst) {
            if (i instanceof Integer) {
                num_bd = BigDecimal.valueOf((Integer) i);
            } else if (i instanceof Long) {
                num_bd = BigDecimal.valueOf((Long) i);
            } else if (i instanceof Double) {
                num_bd = BigDecimal.valueOf((Double) i);
            } else if (i instanceof String) {
                num_bd = new BigDecimal((String) i);
            } else if (i instanceof Float) {
                num_bd = BigDecimal.valueOf((Float) i);
            } else if (i instanceof BigDecimal) {
                num_bd = (BigDecimal) i;
            } else if (i instanceof BigInteger) {
                num_bd = new BigDecimal((BigInteger) i);
            } else if (i instanceof Byte){
                num_bd = BigDecimal.valueOf((Byte) i);
            }

            res = num_bd.add(BigDecimal.valueOf(10)).divide(BigDecimal.valueOf(2));
            res = res.setScale(2, RoundingMode.HALF_UP);
            System.out.print(res + " ");
        }





    }
}






















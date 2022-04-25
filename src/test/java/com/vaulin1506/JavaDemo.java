package com.vaulin1506;

public class JavaDemo {
    public static void main (String[] args) {

        byte byte0, byte1;
        byte0 = (byte) 128;
        byte1 = 3;
        short short1, short0;
        //short0 = 33000; либо мигрировать в инт либо каст в шорт, не компелируется.
        short1 = 10000;
        int int1 = 129;
        long long1 = 30000L;
        float float1 = 1.5F;
        double double1 = 1.2;
        char symbol = '&';
        boolean flag = true;
        boolean flag1 = false;

        String name = "Artem";
        String name0 = "Artem";
        String name1 = "Ivan";
        String text = "Hi";

        int[] array1 = new int [] {3, 2, 1} ;
        int[] array2 = new int [2];
        array2 [0] = array1[0];
        array2 [1] = array1[2] + array1[0];


        System.out.println (int1 + long1);
        System.out.println (double1 + double1 + double1);
        System.out.println ("1.5-1.5-1.5=" + (float1 - float1 - float1));
        System.out.println ("128/2=" + byte0 / 2); // поломанная переменная
        System.out.println ("3/2=" + byte1 % 2);
        System.out.println ("10000 + 1 =" + (short1++));
        System.out.println ("10000 + 1 =" + (short1));
        System.out.println ("10000 + 1 =" + (++short1));
        System.out.println ("10000 + 1 =" + (short1));
        System.out.println ("10000 - 1 =" + (--short1));
        System.out.println (--short1);
        System.out.println (--int1);
        System.out.println (int1--);
        System.out.println (int1++);
        System.out.println (++int1);
        System.out.println ("float1 " + symbol + " double1 = " + (float1+double1));
        System.out.println (int1 == long1);
        System.out.println (name == name0);
        System.out.println (int1 != long1);
        System.out.println (int1 > long1);
        System.out.println (int1 < long1);

        System.out.println ("операторы логические");
        //System.out.println (int1 && long1); неверный тип операндов
        //System.out.println (symbol && flag); -//-
        System.out.println (flag1 || flag);
        System.out.println (flag1 && flag);
        System.out.println (!(flag1 && flag));

        int [] array3 = new int [array1.length+array2.length];
        System.out.println (array3.length);

        boolean result = name instanceof String;
        //boolean result1 = byte0 instanceof byte; не работает с примитивами
        //boolean result2 = byte0 instanceof int;
        boolean result3 = array3 instanceof int [];
        System.out.println (result);
        //System.out.println (result1);
        //System.out.println (result2);
        System.out.println (result3);

        if (name.equals("Artem")) {
            System.out.println("Hi");
        }
        if (name.equals("noArtem")) {
            System.out.println("Hi");
            } else if (name0.equals("Artem"));{
            System.out.println(text + name0);
            } if (name1.equals("Ivan"));{
            System.out.println("error");
        }
        switch (name) {
            case "Artem":
            case "Ivan":
                System.out.println(text + " " + name);
                break;
        }

        name = name == name0
                ? "Artem"
                : "Ivan";

        if (name == name0) {
            name = "Artem";
        } else {
            name = "Ivan";
        }








    }
    }




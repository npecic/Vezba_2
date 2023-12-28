package com.company;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        int x = 53523;
//        byte y = (byte)x;
//
//        System.out.println(x);
//        System.out.println(y);
//
//
//    }
//}


//public class Main {
//
//    public static void main(String[] args) {
//
//
//        int x = 10;
//        int y= 010; //dekadni sistem
//        int z = 0x10; //dekadni sistem
//        int i = 0b10; //dekadni sistem
//
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(i);
//
//
//    }
//}


/**
 * Pretvaranje stringa u integer
 *
 */
//public class Main {
//
//    public static void main(String[] args) {
//
//
//        char x = 's';
//        int y= 010;
//        String x = "10";
//        int y = Integer.parseInt(x);
//        double z = Double.parseDouble(x);
//
//
//        System.out.println(x);
//        System.out.println(y);
//    }
//}


/**
 * String xs primeri
 *
 */
//public class Main {
//
//    public static void main(String[] args) {
//        String xs = "Danas je lep dan";
//
//      //  System.out.println(xs.equals("fddsds"));
//        System.out.println(xs.equalsIgnoreCase("fddsds"));
//        System.out.println(xs.toUpperCase());
//        System.out.println(xs.contains("sd"));
//        System.out.println(xs.substring(0,5));
//        System.out.println(xs.split(" ")[1]); // niz ide od 0
//        System.out.println(xs.replace("je lep", "nije"));
//
//
//    }
//}


import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *
 * String primeri
 */
//public class Main {
//
//    public static void main(String[] args) {
//
////        Scanner scanner = new Scanner(System.in);
////
////        String message = null;
//
//        String s1 = "Cao";
//        String s2 = "Svima";
//        System.out.println(s1 + " "+ s2 +" " + (5+5)); // Bez zagrade ga cita kao text "Cao Svima 55"
//    }
//}

public class Main {
    public static void main(String[] args) {
        /**Prvi primer*/
//          int x = 10;
//          System.out.println(++x); // inkrement - uvecanje za 1
        /**Drugi primer*/
//        boolean x = false;
//        System.out.println(!x); // invertuje vrednost boolean-a
        /**Treci primer*/
//        int x = 10;
//        x++; // uvecavamo vrednost
//        x--; // smanjujemo vrednost
//        System.out.println(x);
        /**Cetvrti primer*/
//        int x = 10;
//        int y = ++x; / ++ - Ispred - Prvo ce se izvrisit inkrement X-a, a zatim dodela vrednosti
//        System.out.println(x);
//        System.out.println(y);
        /**Peti primer*/
//        int x = 10;
//        int y = x++; // Prvo ce se Y dodeliti vrednost pa ce se X uvecati
//        System.out.println(x);
//        System.out.println(y);
        /**Sesti primer*/

//        int a = 2, b = 3;
//        add(a, b++);
//        add(a, ++b);
//    }
//    public static void add(int x, int y){
//        System.out.println(x+y);

//        /**Sedmi primer*/
//
//        int a = 2, b = 3;
//        add(a, b++);
//        add(a, ++b);
//    }
//    public static void add(int x, int y){
//        System.out.println(x+y);

//        /**Sedmi primer*/
//
//        int a = 2, b = 3;
//        int res = a*(b++)+b; // prvo cemo da b vrednost iz zagrade, pa cemo uvecati b na kraju
//        int res1 = a* (++b)+b;
//
//
//     //   System.out.println(res); // 2*3+4
//      System.out.println(res1); // 2*5+5

        /**Osmi primer*/

//        System.out.println(5==5);
//        System.out.println(5!=5);
//        System.out.println(5<5);
//        System.out.println(5>5);
//        System.out.println(5<=5);
//        System.out.println(5>=5);
//        System.out.println(5==5 && 10<5);
//        System.out.println(5==5 && 10>5);
//        System.out.println(5==5 || 10>5);
//        System.out.println(5==6 || 10<5);
//

        /**Deveti primer*/
//
//        int x = 10;
//        int y = 20;
//
//        boolean res = x<20 && x>10; // rezultat je false
//        System.out.println(res);
//        res= x<20 || x>10; // menjamo rezultat u true koristeci || ili
//        System.out.println(res);


        /**10-ti primer*/

//        int x = 10;
//        int y = 20;
//
//        boolean res = (x == 10 || ++y == 20); // "Y" nece biti uvecan zato sto je prvi uslov ispunjen
//
//        System.out.println(res);
//        System.out.println(x);
//        System.out.println(y);


        /**
         * 11-ti primer - Zadatak 2 iz KT - 2
         */
//        System.out.println("Unesite broj: ");
//        Scanner scanner = new Scanner(System.in);
//        int broj = Integer.parseInt(scanner.nextLine());
//        System.out.println("Vas broj je: " + broj);
//        //    System.out.println(broj%2==0);
//        if (broj % 2 == 0) {
//            System.out.println("Broj Je Paran.");
//        } else  {
//            System.out.println("Broj je neparan.");
//        }
        /**
         * 12-ti primer
         */


    }
}

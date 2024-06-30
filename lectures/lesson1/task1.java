package lesson1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task1 { 
    /**
     * @param args
     */
    static public void main(String[] args){  
System.out.print("Hi");


// java lesson1/task1.java - пуск в терминале

// ==================================== Типы данных ==========================================

short age = 10;
int salary = 123456;
System.out.println(age); //10
System.out.println(salary); //123456


float e = 2.7f;
double pi = 3.1415;
System.out.println(e); // 2.7
System.out.println(pi); // 3.1415


char ch = '1';
System.out.println(Character.isDigit(ch)); // true
ch = 'a';
System.out.println(Character.isDigit(ch)); // false


boolean flag1 = 123 <= 234;
System.out.println(flag1); // true
boolean flag2 = 123 >= 234 || flag1;
System.out.println(flag2); // true
boolean flag3 = flag1 ^ flag2; // "^"" - возвращает true если строго одно из значений является истиной
System.out.println(flag3); // false


String msg ="Hello world";
System.out.println(msg); // Hello world


// ================================= НЕЯВНАЯ ТИПИЗАЦИЯ ===================================


var i = 555; // var - будет подставлен тот тип данных, который наиболее вероятен для значения переменной
System.out.println(i);
var a = 123;
System.out.println(a); // 123
var d = 123.456;
System.out.println(d); // 123.456


// КЛАССЫ - ОБЕРТКИ
System.out.println(Integer.MAX_VALUE); // 2147483647
System.out.println(Integer.MIN_VALUE); // -2147483648



// ==================================== МАССИВЫ =====================================

// Одномерные

int[] ar = new int[10];
System.out.println(ar.length); // 10
ar = new int[] { 1, 2, 3, 4, 5 };
System.out.println(ar[2]); // 3


// Многомерные
int[] arr[] = new int[3][5];
 for (int[] line : arr) {
 for (int item : line) {
 System.out.printf("%d ", item);
 }
 System.out.println();
    }


// Получение данных из терминала
// import java.util.Scanner; - необходимо импортировать

Scanner iScanner = new Scanner(System.in);
 System.out.printf("name: ");
 String name = iScanner.nextLine(); // .nextInt() // .nextDouble()
 System.out.printf("Привет, %s!", name);
 iScanner.close();


// IF - ELSE
int o = 1;
int b = 2;
int c;
if (o > b) { c = o; } 
else { c = b; }
System.out.println("\n"+c);
// ИЛИ
if (o > b) c = o;
if (b > o) c = b;
System.out.println(c);
// ИЛИ
int min = o < b ? o : b;
System.out.println(min);



// ========================================= ЦИКЛЫ ================================

// ============== WHILE
int value = 321;
 int count = 0;
 while (value != 0) {
 value /= 10;
 count++;
 }
 System.out.println(count);



 // ============== DO WHILE
int value2 = 321;
int count2 = 0;
do {
value2 /= 10;
count2++;
} while (value2 != 0);
System.out.println(count2);



// Операторы для управления циклами — continue и break.
// Выполнение следующей итерации цикла — continue.
// Прерывание текущей итерации цикла — break.



// ============== FOR
int s = 0;
 for (int p = 1; p <= 10; p++) {
 s += p;
 }
 System.out.println(s);



// =============== ВЛОЖЕННЫЕ ЦИКЛЫ
for (int l = 0; l < 5; l++) {
    for (int j = 0; j < 5; j++) {
    System.out.print("* ");
    }
    System.out.println();
}



// ======= FOR ДЛЯ КОЛЛЕКЦИИ
int arr3[] = new int[10];
 for (int item : arr3) {
 System.out.printf("%d ", item);
 }
 System.out.println();



// ================================= РАБОТА С ФАЙЛАМИ =======================================
// ПРИМЕР



// ============================= Создание и запись\ дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class Program {
//  public static void main(String[] args) {
//  try (FileWriter fw = new FileWriter("file.txt", false)) {
//  fw.write("line 1");
//  fw.append('\n');
//  fw.append('2');
//  fw.append('\n');
//  fw.write("line 3");
//  fw.flush();
//  } catch (IOException ex) {
//  System.out.println(ex.getMessage());
//  }
//  } }


// ================================ Чтение, Вариант посимвольно ================================
// import java.io.*;
// public class Program {
//  public static void main(String[] args) throws Exception {
//  FileReader fr = new FileReader("file.txt");
//  int c;
//  while ((c = fr.read()) != -1) {
//  char ch = (char) c;
//  if (ch == '\n') {
//  System.out.print(ch);
//  } else {
//  System.out.print(ch);
//  }
//  }
//  } }


// ============================ Вариант построчно
// import java.io.*;
// public class Program {
//  public static void main(String[] args) throws Exception {
//  BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//  String str;
//  while ((str = br.readLine()) != null) {
//  System.out.printf("== %s ==\n", str);
//  }
//  br.close();
//  }
// }




}
}


import java.util.HashSet;
import java.util.Arrays;

public class Exemplyar {


    public static void main(String[] args) {

    Worker w1 = new Worker();
    w1.firstName = "Дурак";
    w1.lastName = "Бездельников";
    w1.id = 1;
    w1.salary = 150000;
    System.out.println(w1.firstName);

    Worker w2 = new Worker();
    w2.firstName = "Дурак";
    w2.lastName = "Бездельников";
    w2.id = 1;
    w2.salary = 150000;

    Worker w3 = new Worker();
    w3.firstName = "Бездельник";
    w3.lastName = "Дураков";
    w3.id = 3;
    w3.salary = 100000;

    Worker w4 = new Worker();
    w4.firstName = "Без";
    w4.lastName = "Дел";
    w4.id = 4;
    w4.salary = 200000;


        var workers = new HashSet<Worker>(Arrays.asList(w1, w3, w4));
        System.out.print("Работники одинаковые? ");
        System.out.println(w1 == w2); // false сравнивнение
        System.out.println(workers.contains(w2)); // true сравнивнение
        System.out.println(w1.equals(w2)); // true сравнивнение
        if (w1.equals(w2)){System.out.println(w1+"\n");}

        System.out.println(workers);


}
}

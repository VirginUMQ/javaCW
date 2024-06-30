package TASK;

public class Nout {

    String name; // Марка
    int RAM; // Объем ОЗУ
    int HDD; // Объем ЖБ
    String OS;
    String Color;
    int price;


    @Override
    public String toString() {
        
        return String.format("Ноутбук: %s \nОбъём ОЗУ: %d \nОбъём ЖД: %d \nОперационная система: %s \nЦвет: %s \nЦена: %d", name, RAM, HDD, OS, Color, price);
    }


    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Nout n = (Nout) obj;
        return RAM == n.RAM && HDD == n.HDD && OS == n.OS; 
        
    }

    @Override
    public int hashCode() {
        return RAM, HDD, OS;
    }

}

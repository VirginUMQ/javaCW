package TASK;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ExNout {

/**
 * @param args
 */
public static void main(String[] args) {
        

    Nout n1 = new Nout();
    n1.name = "Lenovo";
    n1.RAM = 8;
    n1.HDD = 512;
    n1.OS = "Windows";
    n1.Color = "Black";
    n1.price = 50000;


    Nout n2 = new Nout();
    n2.name = "MacBook";
    n2.RAM = 32;
    n2.HDD = 1024;
    n2.OS = "macOS";
    n2.Color = "White";
    n2.price = 225000;

    Nout n3 = new Nout();
    n3.name = "Huawei";
    n3.RAM = 16;
    n3.HDD = 512;
    n3.OS = "Windows";
    n3.Color = "Black";
    n3.price = 100000;

    Nout n4 = new Nout();
    n4.name = "Lenovo";
    n4.RAM = 16;
    n4.HDD = 1024;
    n4.OS = "Windows";
    n4.Color = "Blue";
    n4.price = 75000;

    Nout n5 = new Nout();
    n5.name = "MacBook";
    n5.RAM = 16;
    n5.HDD = 512;
    n5.OS = "macOS";
    n5.Color = "Black";
    n5.price = 150000;


    ArrayList nouts = new ArrayList();
    nouts.add(n1);
    nouts.add(n2);
    nouts.add(n3);
    nouts.add(n4);
    nouts.add(n5);


    Scanner iScanner = new Scanner(System.in);
   
        for(int j = 0; j <= 5;){
            System.out.println("\nСтраница № " + (j+1));
            System.out.println(nouts.get(j) + "\n\"N\" - Next\t\"B\" - Back\t\"F\" - Find\t\"S\" - Stop");
            String bORn = iScanner.nextLine();
            if(bORn.equals("N")){ if(j == 4) { j = 0; } else { j++;} }
            if(bORn.equals("B")){ if(j == 0) { j = 4; } else { j--;} }
            if(bORn.equals("S")){ System.out.println("Возвращайся! ;)"); j = 6; } 
            if(bORn.equals("F")){

                Nout findNout = new Nout();
                
                while(true){
            System.out.println("\"W\" - Windows\t \"M\" - macOS");
            String wORm = iScanner.nextLine();
            if(wORm.equals("W")){ wORm = "Windows"; findNout.OS = wORm; break; }
            if(wORm.equals("M")){ wORm = "macOS"; findNout.OS = wORm; break; }
                }

                while(true){
            System.out.println("RAM 8 / 16 / 32");
            int userRAM = iScanner.nextInt();
            if(userRAM == 8 || userRAM == 16 || userRAM == 32){ findNout.RAM = userRAM; break; }
                }

                while(true){
            System.out.println("HDD 512 / 1024");
            int userHDD = iScanner.nextInt();
            if(userHDD == 512 || userHDD == 1024){ findNout.HDD = userHDD; break; }
                }

          
            
            
            System.out.println("\nВам могут подойти следующие модели:");
            for (int i = 0; i < 5; i++){
            if (nouts.get(i).equals(findNout)){ System.out.println(nouts.get(i)+"\n"); }
            }

            
            while(true){
            String end = iScanner.nextLine();
            if(end.equals("S")){j = 6; System.out.println("Возвращайся! ;)"); break; }
            if(end.equals("R")){ break; }
            System.out.println("\"R\"- Вернуться\t\"S\" - Выйти");
            }

            }
            
}











    }
}

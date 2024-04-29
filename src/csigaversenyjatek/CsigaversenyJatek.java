
package csigaversenyjatek;

import java.util.Scanner;


public class CsigaversenyJatek {
    
    Scanner sc = new Scanner(System.in);
    
    public CsigaversenyJatek(){
        //start();
    }
    
    void start(){
        String eredmeny = "";
        jatekKezdes();
        fogadasCsigara();
        kiIr(fogadasEredmeny(eredmeny));
        palya();
        gyorsitoKiszamol();
        gyorsitasAllito();
        duplazoGyorsito();
        sebessegRandom();
        nyertesCsiga();
        kiIr("");
    }
    
    private void jatekKezdes() {
        kiIr("A játék elkezdödött... ");
    }
    
    private String fogadasCsigara() {
        kiIr("Szerinted melyik csiga fog nyerni?(P/K/Z): ");
        String fogad = sc.nextLine();
        
        return fogad;
    }

    private String fogadasEredmeny(String eredmeny) {
        String fogad = "";
        String eredemny = "";
        if(fogad == "kek"){
            eredmeny = "eltaláltad";
        }else if(fogad == "zold"){
            eredmeny = "eltaláltad";
        }else if(fogad == "piros"){
            eredmeny = "eltaláltad";
        }else{
            eredmeny = "nem talált";
        }
        return eredmeny;
        
    }

    private int palya() {
    
        return 0;
    
    }

    private int gyorsitoKiszamol() {
        
        return 0;
        
    }


    private int gyorsitasAllito() {

        return 0;

    }

    private void duplazoGyorsito() {

    }

    private int sebessegRandom() {

        return 0;

    }

    private String nyertesCsiga() {

        return null;

    }

    private void kiIr(String uzenet) {
        System.out.print(uzenet);
    }

    
    
}

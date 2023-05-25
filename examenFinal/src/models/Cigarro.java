package models;

import java.util.ArrayList;

/**
 *
 * @author Brayan Chan
 */
public class Cigarro {
    public static ArrayList<Cigarro> cigarros = new ArrayList<>();
    
    private int cantHojas;
    private int tiemPicado;
    private int aroma;
    private int azucar;
    private int nicotina;

    public Cigarro() {
    }

    public Cigarro(int cantHojas, int tiemPicado, int aroma, int azucar, int nicotina) {
        this.cantHojas = 92;
        this.tiemPicado = 11;
        this.aroma = 07;
        this.azucar = 13;
        this.nicotina = 2;
    }

    public int getCantHojas() {
        return cantHojas;
    }

    public void setCantHojas(int cantHojas) {
        this.cantHojas = cantHojas;
    }

    public int getTiemPicado() {
        return tiemPicado;
    }

    public void setTiemPicado(int tiemPicado) {
        this.tiemPicado = tiemPicado;
    }

    public int getAroma() {
        return aroma;
    }

    public void setAroma(int aroma) {
        this.aroma = aroma;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public int getNicotina() {
        return nicotina;
    }

    public void setNicotina(int nicotina) {
        this.nicotina = nicotina;
    }

    @Override
    public String toString() {
        return "Cigarro{" + "cantHojas=" + cantHojas + ", tiemPicado=" + tiemPicado + ", aroma=" + aroma + ", azucar=" + azucar + ", nicotina=" + nicotina + '}';
    }
    
    public static int Cigarrillos (){
        int cantHojas = 92;
        int tiemPicado = 11;
        int aroma = 07;
        int azucar = 13;
        int nicotina = 2;
        int totalCigarros;
        totalCigarros = cantHojas + tiemPicado + aroma + azucar + nicotina;
        System.out.println(totalCigarros + " cigarrillos");
        System.out.println("=================TOTAL=================");
        System.out.println("Cantidad de hojas: " + cantHojas);
        System.out.println("Tiempo de picado: " + tiemPicado);
        System.out.println("Aroma: " + aroma);
        System.out.println("Azucar: " + azucar);
        System.out.println("Nicotina: " + nicotina);
        return totalCigarros;
                
    }
    
    public static void picadoHojas (){
        System.out.println("Proceso de picado de hojas");
        for (int i = 0; i <= 11; i++) {
            System.out.println("Picado y desvenado " + (i) + ": ");
            if (i == 0){
                System.out.println("Arrancando la maquina...");
            } 
            
        }
    }
    
    public static void cajetillas (){
        int cantHojas = 92;
        int tiemPicado = 11;
        int aroma = 07;
        int azucar = 13;
        int nicotina = 2;
        int totalCigarros;
        totalCigarros = cantHojas + tiemPicado + aroma + azucar + nicotina;
        System.out.println(totalCigarros + " cigarrillos");
        int totalCajetillas;
        totalCajetillas = totalCigarros / 14;
        int resta;
        resta = totalCajetillas * 14;
        int excedente = totalCigarros - resta;
        System.out.println("Total de cajetillas");
        System.out.println(totalCajetillas + " Cajetillas");
        System.out.println("Total excedentes");
        System.out.println(excedente + " Cigarros sueltos");
    }
}

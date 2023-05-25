package examenfinal;

import models.Cigarro;

/**
 *
 * @author BrayanChan
 */
public class ExamenFinal {
    
    public static void author71392 (){
        String nombre = "Brayan Nathanael Chan Pacheco";
        int matricula = 71392;
        String correo = "al071392@uacam.mx";
        System.out.println("Mi nombre es: " + nombre + "\nMi matricula es: " + matricula +
                "\nMi correo electronico es: " + correo);
    }
    
    //Proyecto facultad de quimica
    //92 cantidad de hojas
    //11 tiempo de picado
    //07 aroma
    //13 azucar
    //2 nicotina
    
    public static void cigarro (){
        int cantHojas = 92;
        int tiemPicado = 11;
        int aroma = 07;
        int azucar = 13;
        int nicotina = 2;
        int totalCigarrillos;
        totalCigarrillos = cantHojas + tiemPicado + aroma + azucar + nicotina;
        System.out.println(totalCigarrillos);
    }
    
    public static void instanciaCigarros (){
        System.out.println("---------------------------------------------------------");
        System.out.println("Cigarreria la Ilusion");
        System.out.println("Proyecto de sistematizacion del proceso produccion de cigarros");
        System.out.println("");
        Cigarro.picadoHojas();
        System.out.println("Total de cigarros producidos: ");Cigarro.Cigarrillos();
        Cigarro.cajetillas();
        
    }
    
    public static void main(String[] args) {
        author71392();
        //cigarro();
        instanciaCigarros();
        
    }
    
}

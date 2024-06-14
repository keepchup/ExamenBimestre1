package BusesBuho;

import java.util.Scanner;

public class Servicios extends ticket{
    cliente pasajero1;

    public Servicios(cliente pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public void selecciondeServicio(){
        if (pasajero1.getCat_ticket()==("Ticket Normal")){
            s_normal();
        } else if (pasajero1.getCat_ticket()==("Ticket VIP")){
            s_vip();
        }
    }

    public void s_normal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Servicios Normales");
        System.out.println("Usted puede seleccionar su asiento a la ventana, pasillo, al final, adelante con su ticket");
        System.out.println("Usted dispone de espacio para 1 maletas");
        System.out.println("Puede añadir un espacio extra para otra maleta por un cargo adicional");

        System.out.println("¿Desea añadir un espacio adicional por $5?\n\t1. Si\n\t2. No");
        int op = sc.nextInt();
        if (op==1){
            pasajero1.precio_Ticket= pasajero1.precio_Ticket+5;
        } else {
            System.out.println("Entendible, muchas gracias");
        }
    }

    public void s_vip() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Servicios VIP");
        System.out.println("Usted dispone de Television e internet incluido con su ticket");
        System.out.println("Usted dispone de espacio para 2 maletas");
        System.out.println("Puede añadir un espacio extra para otra maleta por un cargo adicional");

        System.out.println("¿Desea añadir un espacio adicional por $5?\n\t1. Si\n\t2. No");
        int op = sc.nextInt();
        if (op==1){
            pasajero1.precio_Ticket= pasajero1.precio_Ticket+5;
        } else {
            System.out.println("Entendible, muchas gracias");
        }
    }
}

package BusesBuho;

import java.util.Scanner;

public class s_vip extends t_vip{
    cliente pasajero1;

    public s_vip(cliente pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public s_vip() {
    }

    public void serviciosVIP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Servicios VIP");
        System.out.println("Usted dispone de Television e internet incluido con su ticket");
        System.out.println("Usted dispone de espacio para 2 maletas");
        System.out.println("Puede añadir un espacio extra para otra maleta por un cargo adicional");

        System.out.println("¿Desea añadir un espacio adicional por $5?\n\t1. Si\n\t2. No");
        int op = sc.nextInt();
        if (op==1){
            pasajero1.precio_Ticket= precio_Ticket+5;
        } else {
            System.out.println("Entendible, muchas gracias");
        }
    }
}
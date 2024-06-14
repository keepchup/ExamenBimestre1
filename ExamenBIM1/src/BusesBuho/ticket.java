package BusesBuho;

import java.util.Scanner;

public class ticket extends ruta{
    cliente pasajero1;
    public ticket() {
    }

    public ticket(cliente pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public String seleccionCategoria() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la categoria de su ticket");
        System.out.println("\n\t1. Clase Normal\n\t2. Clase vip");
        int op=sc.nextInt();
        if(op==1){
            pasajero1.setCat_ticket("Ticket Normal");
        } else if(op==2){
            pasajero1.setCat_ticket("Ticket VIP");
        } else {
            System.out.println("valor no valido");
        }
        return pasajero1.cat_ticket;
    }

    public void precioTicket() {
        if (pasajero1.getCat_ticket() == "Ticket Normal") {
            pasajero1.setPrecio_Ticket(pasajero1.precio_Ticket);
        } else if (pasajero1.getCat_ticket() == "Ticket VIP") {
            pasajero1.setPrecio_Ticket(pasajero1.precio_Ticket*1.30);
        }
    }
}

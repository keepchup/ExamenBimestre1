package BusesBuho;

import java.util.Scanner;

public class ruta extends cliente{
    cliente pasajero1;
    double p_ruta1=20;
    double p_ruta2=17.5;
    double p_ruta3=15;
    double p_ruta4=17.5;

    public ruta(cliente pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public ruta() {
    }

    public ruta(double p_ruta1, double p_ruta2, double p_ruta3, double p_ruta4) {
        this.p_ruta1 = p_ruta1;
        this.p_ruta2 = p_ruta2;
        this.p_ruta3 = p_ruta3;
        this.p_ruta4 = p_ruta4;
    }

    public double getP_ruta2() {
        return p_ruta2;
    }

    public void setP_ruta2(double p_ruta2) {
        this.p_ruta2 = 20;
    }

    public double getP_ruta3() {
        return p_ruta3;
    }

    public void setP_ruta3(double p_ruta3) {
        this.p_ruta3 = 17.5;
    }

    public double getP_ruta4() {
        return p_ruta4;
    }

    public void setP_ruta4(double p_ruta4) {
        this.p_ruta4 = 15;
    }

    public double getP_ruta1() {
        return p_ruta1;
    }

    public void setP_ruta1(double p_ruta1) {
        this.p_ruta1 = 17.5;
    }

    public void seleccionDeRuta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione su destino: ");
        System.out.println("\n\t1. Quito - Guayaquil\n\t2. Quito - Tulcan\n\t3. Quito - Puyo\n\t4. Quito - Riobamba");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("\n\t1. Quito - Guayaquil");
                System.out.println("\nTicket Normal $" + p_ruta1 + "\nTicket Vip $" + p_ruta1*1.30);
                pasajero1.precio_Ticket= p_ruta1;
                pasajero1.setRuta("Quito - Guayaquil");
                break;
            case 2:
                System.out.println("\nTicket Normal $" + p_ruta2 + "\nTicket Vip $" + p_ruta2*1.30);
                pasajero1.setRuta("Quito - Tulcan");
                pasajero1.precio_Ticket= p_ruta1;
                break;
            case 3:
                System.out.println("\nTicket Normal $" + p_ruta3 + "\nTicket Vip $" + p_ruta3*1.30);
                pasajero1.precio_Ticket= p_ruta1;
                pasajero1.setRuta("Quito - Puyo");
                break;
            case 4:
                System.out.println("\nTicket Normal $" + p_ruta4 + "\nTicket Vip $" + p_ruta4*1.30);
                pasajero1.precio_Ticket= p_ruta1;
                pasajero1.setRuta("Quito - Riobamba");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}


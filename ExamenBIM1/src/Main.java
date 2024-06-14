import java.sql.ClientInfoStatus;
import java.util.Scanner;
import BusesBuho.cliente;
import BusesBuho.ruta;
import BusesBuho.ticket;
import BusesBuho.Servicios;

public class Main {
    public static void main(String[] args) {
        cliente pasajero1 = new cliente();
        ruta r1 = new ruta(pasajero1);
        ticket t1 = new ticket(pasajero1);
        Servicios s1 = new Servicios(pasajero1);

        pasajero1.setNombre("Adrian Ramos");

        r1.seleccionDeRuta();
        t1.seleccionCategoria();
        t1.precioTicket();
        s1.selecciondeServicio();

        pasajero1.mostrarDatosCliente();
    }
}
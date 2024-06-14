package BusesBuho;

public class cliente {
    String nombre;
    String ruta;
    String cat_ticket;
    double precio_Ticket;

    public cliente() {
    }

    public cliente(String nombre, String ruta, String cat_ticket, double precio_Ticket) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.cat_ticket = cat_ticket;
        this.precio_Ticket = precio_Ticket;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getCat_ticket() {
        return cat_ticket;
    }

    public void setCat_ticket(String cat_ticket) {
        this.cat_ticket = cat_ticket;
    }

    public double getPrecio_Ticket() {
        return precio_Ticket;
    }

    public void setPrecio_Ticket(double precio_Ticket) {
        this.precio_Ticket = precio_Ticket;
    }

    public void mostrarDatosCliente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Destino del cliente: " + ruta);
        System.out.println("Tipo de cliente: " + cat_ticket);
        System.out.println("Precio Ticket: " + precio_Ticket);
    }
}

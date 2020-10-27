package grupal1;

public class Producto {
    private String tamaño;
    private String nombre;
    private String categoria;
    private int stock;
    private boolean oferta;
    private String color;
    private int precio;

    public Producto(String tamaño, String nombre, String categoria, int stock, boolean oferta, String color, int precio) {
        this.tamaño = tamaño;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
        this.oferta = oferta;
        this.color = color;
        this.precio = precio;
    }

    public Producto() {
        this.tamaño = "No ingresado";
        this.nombre = "No ingresado";
        this.categoria = "No ingresado";
        this.stock = 0;
        this.oferta = false;
        this.color = "No ingresado";
        this.precio = 0;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }


    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean setStock(int stock) {
        if (stock > 0) {
            this.stock = stock;
            return true;
        }
        return false;
    }


    public boolean setPrecio(int precio) {
        if (precio > 0) {
            this.precio = precio;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "tamaño='" + tamaño + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", stock=" + stock +
                ", oferta=" + oferta +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}

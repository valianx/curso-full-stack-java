package grupal1;

public class Pasaje {
    private int id;
    private int numero;
    private char tipo;
    private boolean local;
    private float valor;
    private float peso;
    private Usuario user;

    public Pasaje(int id, int numero, char tipo, boolean local, float valor, float peso, Usuario user) {

        this.numero = numero;
        this.id = id;
        this.tipo = tipo;
        this.local = local;
        this.valor = valor;
        this.peso = peso;
        this.user = user;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public boolean isLocal() {
        return local;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public float aplicarDescuento() {
        if (getTipo() == 'V') return getValor() - (float) (getValor() * 0.15);
        return getValor();
    }

    public boolean validarUsuario(String nombre, String password) {
        if (nombre.length() <= 4) {
            System.out.println("El nombre debe tener minimo 5 carácters");
            return false;
        }
        if (password.length() <= 4) {
            System.out.println("la contraseña debe tener minimo 5 carácteres");
            return false;
        }
        return true;
    }

    public float aplicarTasa() {
        if (isLocal()) {
            System.out.println("Aplicando tasa de embarque vuelo local");
            return getValor() + 129990;
        } else {
            System.out.println("Aplicando tasa de embarque vuelo internacional");
            return getValor() + 16890;
        }
    }

    public float sobrepeso() {
        if (getPeso() < 20) {
            System.out.println("Aplicando un cargo del 0% por sobrepeso");
            return getValor();
        }
        if (getPeso() >= 21 && getPeso() <= 39) {
            System.out.println("Aplicando un cargo del 5% por sobrepeso");
            return getValor() + (float) (getValor() * 0.05);
        }
        if (getPeso() >= 40 && getPeso() <= 59) {
            System.out.println("Aplicando un cargo del 10% por sobrepeso");
            return getValor() + (float) (getValor() * 0.1);
        }
        if (getPeso() >= 60) {
            System.out.println("Aplicando un cargo del 20% por sobrepeso");
            return getValor() + (float) (getValor() * 0.2);
        }
        System.out.println("valor no válido");
        return 0;
    }

    public boolean login (String nombre, String password){
        if(nombre.length() >= 5 && password.length() >= 5 ){
            System.out.println("Si es válido");
            return true;
        }else{
            System.out.println("No es válido");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pasaje{" +
                "id=" + id +
                ", tipo=" + tipo +
                ", local=" + local +
                ", valor=" + valor +
                ", peso=" + peso +
                ", user=" + user +
                '}';
    }
}

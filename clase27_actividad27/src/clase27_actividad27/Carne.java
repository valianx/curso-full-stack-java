/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27_actividad27;

/**
 *
 * @author Katherine
 */
public class Carne extends Producto{
    private char categoria;

    public Carne(char categoria, int codigo, int stock, double valor, String pais) {
        super(codigo, stock, valor, pais);
        setCategoria(categoria);
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        if(categoria=='V'||categoria=='A'||categoria=='C'||categoria=='U'||categoria=='N'||categoria=='O'){
            this.categoria = categoria;
        }else{
            System.out.println("ERROR. Ingrese categoría válida ('V','A','C','U','N' u 'O')");
        }        
    }

    @Override
    public String toString() {
        return "Carne{" + "categoria=" + categoria +", "+super.toString()+ '}';
    }

    /*calcularTotal: retorna el precio total de la venta si hay stock del producto. Se calcula: 
    cantidad (parámetro) * valor considerando los descuentos
    Si la cantidad a comprar es mayor al stock, enviará un mensaje de alerta. Si hay stock del producto,
    deberá descontar la cantidad  comprada al stock.	*/
    @Override
    public double calcularTotal(int cantidad, String dia) {
        double valorTotal = 0;
        if(cantidad <= super.getStock()){
            valorTotal = (super.getValor() - calcularDescuento(dia))*cantidad;
            super.setStock(super.getStock()-cantidad);
        }else{
            System.out.println("ERROR. Cantidad solicitada excede stock disponible.");
        }
        return valorTotal;
    }

    //calcularDescuento: realiza el descuento a los productos dependiendo del día  de la 
    //semana (parámetro   del método). Si es “MIERCOLES” se    descuenta    el    porcentajeDescuento  
    //de    la   Carne. Si es “LUNES”, se descuenta el porcentajeDescuento  de la FrutaVerdura. 
    @Override
    public double calcularDescuento(String dia) {
        double descuento=0;
        if(dia.toLowerCase().equals("miercoles")){
            //valorDespuesDescuento = super.getValor()*(1-IProductoDescontable.porcentajeDescuento);
            descuento = super.getValor()*(IProductoDescontable.porcentajeDescuento);
            //super.setValor(valorDespuesDescuento);
        }
        return descuento;
    }
      

}

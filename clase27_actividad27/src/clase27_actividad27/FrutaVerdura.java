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
public class FrutaVerdura extends Producto{
    private String organica;

    public FrutaVerdura(String organica, int codigo, int stock, double valor, String pais) {
        super(codigo, stock, valor, pais);
        setOrganica(organica);
    }

    public String getOrganica() {
        return organica;
    }

    public void setOrganica(String organica) {
        if(organica.toLowerCase().equals("si")||organica.toLowerCase().equals("no")){
            this.organica = organica;
        }else{
            System.out.println("Error. Ingrese SI o NO.");
        }        
    }

    @Override
    public String toString() {
        return "FrutaVerdura{" + "organica=" + organica + ", "+ super.toString()+'}';
    }

    

    /*@Override
    public double calcularTotal(int cantidad) {
        double valorTotal = 0;
        if(cantidad <= super.getStock()){
            valorTotal = super.getValor()*cantidad;
            super.setStock(super.getStock()-cantidad);
        }else{
            System.out.println("ERROR. Cantidad solicitada excede stock disponible.");
        }
        return valorTotal;
    }*/
    
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

   /* @Override
    public double calcularDescuento(String dia) {
        double valorDespuesDescuento = super.getValor();
        if(dia.toLowerCase().equals("lunes")){
            valorDespuesDescuento = super.getValor()*(1-IProductoDescontable.porcentajeDescuento);
            super.setValor(valorDespuesDescuento);
        }
        return valorDespuesDescuento;
    }*/
       
@Override
    public double calcularDescuento(String dia) {
        double descuento=0;
        if(dia.toLowerCase().equals("lunes")){
            //valorDespuesDescuento = super.getValor()*(1-IProductoDescontable.porcentajeDescuento);
            descuento = super.getValor()*(IProductoDescontable.porcentajeDescuento);
            //super.setValor(valorDespuesDescuento);
        }
        return descuento;
    }
    
    
    
}

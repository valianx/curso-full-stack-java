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
public abstract class Producto implements IProductoDescontable {
    private int codigo;
    private int stock;
    private double valor;
    private String pais;

    public Producto(int codigo, int stock, double valor, String pais) {
        this.codigo = codigo;
        setStock(stock);
        setValor(valor);
        setPais(pais);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock>=0){
            this.stock = stock;
        }else{
            System.out.println("ERROR. Valor debe ser mayor o igual a cero.");
        }
        
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor){
        if(valor>=100){
            this.valor = valor;
        }
        else{
            System.out.println("Error. Valor debe ser mayor o igual a 100");
        }
        
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        
       //if(pais.trim().length()>=1)
        
        if(pais != null && !pais.isEmpty()){
            this.pais = pais;
        }
        else{
            System.out.println("ERROR. País debe contener al menos un caracter.");
        }               
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", stock=" + stock + ", pais=" + pais +", valor=" + valor + '}';
    }
    
    public abstract double calcularTotal(int cantidad, String dia);
    
    
}

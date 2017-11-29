/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author felip
 */
public class Piano extends Instrumento {
    
    private boolean deCola;
    
    public Piano(){
        this.tipoInstrumento = "Piano";
    }
    
    public Piano(int codigo, String nombre, int stock, boolean deCola) {
        super (codigo, nombre, stock);
        this.tipoInstrumento = "Piano";
        this.deCola = deCola;
    }
    
    public boolean isDeCola(){
        return this.deCola;
    }
    
    public void setDeCola(boolean deCola){
        this.deCola = deCola;
    }
    
    @Override
    public String mostrar(){
        String dc = "";
        if(this.isDeCola()){
            dc = "SI";
        } else {
            dc = "NO";
        }
        
        return "PIANO     Código: " + this.getCodigo() +
               "  Nombre: " + this.getNombre() +
               "  ¿De cola?: " + dc +
               "  Stock: " + this.getStock();
    }
}

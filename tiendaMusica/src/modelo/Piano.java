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
    }
    
    public Piano(int codigo, String nombre, int stock, boolean deCola) {
        super (codigo, nombre, stock);
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
        String dc="";
        if(this.isDeCola()){
            dc = "SI";
        } else {
            dc = "NO";
        }
        
        return "Piano: {" + 
               "\n    Código: " + this.getCodigo() +
               "\n    Nombre: " + this.getNombre() +
               "\n    ¿De cola?: " + dc +
               "\n    Stock: " + this.getStock() +
               "}\n";
    }
}

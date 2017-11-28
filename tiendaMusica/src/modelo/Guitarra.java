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
public class Guitarra extends Instrumento {
   private String tipoGuitarra;
   
   public Guitarra(){}
   
   public Guitarra(int codigo, String nombre, int stock, String tipoGuitarra) {
       super(codigo, nombre, stock);
       this.tipoGuitarra = tipoGuitarra;
   }
   
   public String getTipoGuitarra(){
       return this.tipoGuitarra;
   }
   
   public void setTipoGuitarra(String tipoGuitarra){
       this.tipoGuitarra = tipoGuitarra;
   }
   
   @Override
   public String mostrar(){
       return "Guitarra: {" + 
               "\n    Código: " + this.getCodigo() +
               "\n    Nombre: " + this.getNombre() +
               "\n    Tipo: " + this.getTipoGuitarra() +
               "\n    Stock: " + this.getStock() +
               "}\n";
   }
}

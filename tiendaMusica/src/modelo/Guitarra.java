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

    public Guitarra(){
        this.tipoInstrumento = "Guitarra";
    }

    public Guitarra(int codigo, String nombre, int stock, String tipoGuitarra) {
        super(codigo, nombre, stock);
        this.tipoInstrumento = "Guitarra";
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
        return "GUITARRA  Código: " + this.getCodigo() +
                "  Nombre: " + this.getNombre() +
                "  Tipo: " + this.getTipoGuitarra() +
                "  Stock: " + this.getStock();
    }
}

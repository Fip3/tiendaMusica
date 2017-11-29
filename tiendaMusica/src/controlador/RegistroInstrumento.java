/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author felip
 */
public class RegistroInstrumento {
    private ArrayList<Instrumento> instCol;
    
    public RegistroInstrumento(){
        instCol = new ArrayList<>();
    }
    
    public boolean agregar(Instrumento inst){
        boolean ok = false;
        
        if(!this.existeCodigo(inst.getCodigo())){
            instCol.add(inst);
            if(inst.getTipoInstrumento().equals("Guitarra")){
                System.out.println("Guitarra agregada");
            } else {
                System.out.println("Piano agregada");
            }
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eliminar(int codigo){
        
        boolean ok = false;
        for (int i=0; i < instCol.size(); i++){
            if(instCol.get(i).getCodigo() == codigo){
                instCol.remove(i);
                ok = true;
                break;
            }
        }
        return ok;
    }
    
    public String listar() {
        String lista = "";
        for(Instrumento elem : instCol){
            lista = lista + elem.mostrar() + "\n";
        }
        
        return lista;
    }
    
    public boolean existeCodigo(int codigo) {
        boolean existe = false;
        for (Instrumento elem : instCol) {
            if (elem.getCodigo() == codigo) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    
}

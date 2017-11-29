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
        
        if(this.existeCodigo(inst.getCodigo())){
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
    
    public boolean existeCodigo(int c) {
        boolean existe = false;
        for (Instrumento elem : instCol) {
            if (elem.getCodigo() == c) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    
}

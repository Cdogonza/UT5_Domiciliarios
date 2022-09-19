/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpaz.pd1;

/**
 *
 * @author gpaz1
 */
public class TArbolGenerico {
     private TNodoGenerico raiz = new TNodoGenerico("", "");
    
    
    public boolean insertar(Comparable unidadEtiqueta, Comparable etiquetaPadre){
        
        if (raiz.getEtiqueta().equals("")){
            raiz = new TNodoGenerico(unidadEtiqueta,etiquetaPadre);
            return true;
        }else {
            return raiz.insertar(unidadEtiqueta, etiquetaPadre);
        }
    }
    
    public TNodoGenerico buscar(Comparable unaEtiqueta) {
        
        if (raiz.getEtiqueta().equals(unaEtiqueta)){
            return raiz;
        }else{
            return raiz.buscar(unaEtiqueta);
        }
    }
    
    public boolean esVacio() {
        return this.raiz == null;
    }
    
    public String listarIndentado(){
        if (raiz == null){
            return "nulo";
        } else {
            return raiz.listarIndentado(0);
        }
    }
    
    public TNodoGenerico getRaiz(){
        return raiz;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gpaz.pd1;

/**
 *
 * @author gpaz1
 */
public class PD1 {

    public static void main(String[] args) {
        TArbolGenerico arbol = new TArbolGenerico();
        // Rectoria, la raiz
        arbol.insertar("RECTORIA", "");
        // Vicerectoerias
        arbol.insertar("VICERRECTORIA DEL MEDIO UNIVERSITARIO","RECTORIA");
        arbol.insertar("VICERRECTORIA ACADEMICA","RECTORIA");
        arbol.insertar("VICERRECTORIA ADMINISTRATIVA","RECTORIA");
        // Facultades
        arbol.insertar("FACULTAD DE CIENCIAS EMPRESARIALES","VICERRECTORIA ACADEMICA");
        arbol.insertar("FACULTAD DE CIENCIAS HUMANAS","VICERRECTORIA ACADEMICA");
        arbol.insertar("FACULTAD DE INGENIERIA Y TECNOLOGIAS","VICERRECTORIA ACADEMICA");
        arbol.insertar("FACULTAD DE PSICOLOGIA","VICERRECTORIA ACADEMICA");
        // Departamentos
        arbol.insertar("DEPARTAMENTO DE INFORMATICA Y CIENCIAS DE LA COMPUTACION","FACULTAD DE INGENIERIA Y TECNOLOGIAS");
        arbol.insertar("DEPARTAMENTO DE INGENIERIA ELECTRICA","FACULTAD DE INGENIERIA Y TECNOLOGIAS");
        arbol.insertar("DEPARTAMENTO DE MATEMATICAS","FACULTAD DE INGENIERIA Y TECNOLOGIAS");        
        System.out.println(arbol.listarIndentado());
        // Busqueda exitosa 
        TNodoGenerico nodoC = arbol.buscar("FACULTAD DE INGENIERIA Y TECNOLOGIAS");
        System.out.println("Busqueda exitosa: " + nodoC.getEtiqueta());
        
        // Busqueda erronea
        
        System.out.println("Busqueda erronea: " + arbol.buscar("FACULTAD"));
        
    }
    }


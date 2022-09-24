/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gpaz.pd3_ut5;

/**
 *
 * @author gpaz1
 */
public class PD3_ut5 {

    public static void main(String[] args) {
        String[] libro = ManejadorArchivosGenerico.leerArchivo("src/Libro.txt");  // CARGO EL LIBRO CRUDO COMO STA      
        
        TArbolTrie trie = new TArbolTrie(); //CREO EL ARBOL DE TIPO TRIE
        
        trie.indizarLibro(libro,0); // TRABAJA PARA INIZAR EL LIBRO PASADO POR PARAMETRO Y EL CERO INDICA EL COMIENZO DE PAGINA
        
        trie.imprimir(); //IMPRIME EL INDICE DEL TRIE
    }
}

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
        String[] libro = ManejadorArchivosGenerico.leerArchivo("src/Libro.txt");
        TArbolTrie trie = new TArbolTrie();
        for (int i = 0; i < libro.length; i++){
            trie.indizarLibro(libro[i], i);
        }
        /*trie.imprimir();
        for (int i = 0; i < libro.length; i++){
            TNodoTrie.printwords(libro[i]);
        }*/
    }
}

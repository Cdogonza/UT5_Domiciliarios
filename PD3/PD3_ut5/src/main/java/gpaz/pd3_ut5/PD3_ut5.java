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
        int cont=0;
        for (String string : libro) {
            String stringg = string.trim().toLowerCase();
            String[] sep = stringg.split("\\W+");            
            for(int i=0;i<sep.length;i++){           
                String valor = sep[i].replace("_", "");
                String valor1 = valor.replace("1", "uno");
                String valor2 = valor1.replace("2", "dos");
                String valor3 = valor2.replace("3", "tres");
                String valor4 = valor3.replace("4", "cuatro");
                String valor5 = valor4.replace("5", "cinco");
                String valor6 = valor5.replace("6", "seis");
                String valor7 = valor6.replace("7", "siete");
                String valor8 = valor7.replace("8", "ocho");
                String valor81 = valor8.replace("9", "nueve");
                String valor82 = valor81.replace("0", "cero");
                String valor9[] = valor82.split(" ");
                for (String string1 : valor9) {
                    trie.insertar(string1);
                    System.out.println(string1);
                }
                
                //trie.insertar(sep[i]);
                
            }
            cont++;
        }
        
        System.out.println(cont);
        /*trie.imprimir();
        for (int i = 0; i < libro.length; i++){
            TNodoTrie.printwords(libro[i]);
        }*/
    }
}

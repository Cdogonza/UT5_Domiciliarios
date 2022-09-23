package gpaz.pd3_ut5;


import java.util.ArrayList;
import java.util.LinkedList;

public class TNodoTrie implements INodoTrie {

    private static final int CANT_CHR_ABECEDARIO = 26;
    private TNodoTrie[] hijos;
    private boolean esPalabra;
    private final LinkedList<Object> contadorPaginas;
    private ArrayList<Integer> paginas;        

    public TNodoTrie() {
        this.contadorPaginas = new LinkedList<>();
        hijos = new TNodoTrie[CANT_CHR_ABECEDARIO];
        esPalabra = false;
    }

    @Override
    public void insertar(String unaPalabra) {
        TNodoTrie nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
        
    }

    private void imprimir(String s, TNodoTrie nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(s);

            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos[c] != null) {
                    imprimir(s + (char) (c + 'a'), nodo.hijos[c]);
                }
            }
        }
    }

    @Override
    public void imprimir() {
        imprimir("", this);
    }


    @Override
    public void predecir(String prefijo, LinkedList<String> palabras) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override

    public int buscar(String unaPalabra) {
        TNodoTrie nodo = this;
        int comparaciones = 0;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            comparaciones++;
            if (nodo.hijos[indice] == null) {
                return comparaciones;
            }
            nodo = nodo.hijos[indice];
            
        }
        return comparaciones;
    }
    private void insertLibro(String palabra, int valor){
        TNodoTrie nodo = this;
        for (int c = 0; c < palabra.length(); c++) {
            int indice = palabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];
        }
        if (nodo.paginas != null){
            nodo.paginas.add(valor);
        } else {
            nodo.paginas = new ArrayList(1);
            nodo.paginas.add(valor);
        }
        nodo.esPalabra = true;
    }
    public void indizarLibro(String texto, int valor){
        texto = texto.trim();
        String delims = "\\W+";
        String[] palabras = texto.split(delims);
        for (String palabra : palabras){
            if (palabra.compareTo("\n") != 0 || palabra.compareTo(" ") != 0){
                insertLibro(palabra.toLowerCase(), valor);
            }
        }
    }
    static void printwords(String str)
    {
        int contador =0;
        str = str.trim().toLowerCase();
            str = str.replaceAll("(\n|\r)", "");
        if (str != null){           
            String delims = "\\W+";
            String[] tokens = str.split(delims);
            for (String item : tokens) {
                System.out.println(item + " ");
            }
        }
    }
}


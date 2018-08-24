/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

/**
 *
 * @author Julian
 */
public class Cola {

    private Nodo inicio;
    private Nodo cola;
    private int tamanio;
    
    public void Cola(){
        inicio = null;
        tamanio = 0;
        cola = null;
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public void encolar(String valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        }else if(inicio.getSiguiente() == null){
            nuevo.setAnterior(inicio);
            cola = nuevo;
            inicio.setSiguiente(cola);
        }
        else{
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        tamanio++;
    }
    
    public String desencolar(){
        String desencolado = "";
        if(esVacia()){
            desencolado = "No hay clientes";            
        }else{
            desencolado = inicio.getValor();
            inicio = inicio.getSiguiente();
            tamanio--;
        }
        return desencolado;
    }
}

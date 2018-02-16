


public class nodo {
    private String dato;
    private nodo izq;
    private nodo der;
    
    public nodo(String dato){
        this.dato = dato;}
   
    public nodo getNodoIzquierdo(){
        return izq; }
     
    public nodo getNodoDerecho(){
        return der; }
    
    public void setNodoIzquierdo(nodo nodo){
        izq = nodo; }
    
    public void setNodoDerecho(nodo nodo){
        der = nodo; } 
    
   public String getDato () {
       return dato;
   }
}

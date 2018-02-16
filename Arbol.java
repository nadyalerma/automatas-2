public class Arbol {
    
    public static void main(String[] args) {
       nodo raiz = new nodo("*");
       nodo nodo2 = new nodo("+");
       nodo nodo3 = new nodo("-");
      
       
       raiz.setNodoIzquierdo(nodo2);
       raiz.setNodoDerecho(nodo3);
     
       nodo2.setNodoIzquierdo(new nodo("a"));
       nodo2.setNodoDerecho(new nodo("5"));
       nodo3.setNodoIzquierdo(new nodo("b"));
       nodo3.setNodoDerecho(new nodo("7"));
      
        preOrden(raiz);
        System.out.println("Preorden");
        postOrden(raiz);
        System.out.println("Postorden");
        inOrden(raiz);
        System.out.println("Inorden");
        
    } 
    
    private static void preOrden(nodo raiz){
        if(raiz != null){
            System.out.print(raiz.getDato()+" ");
            preOrden(raiz.getNodoIzquierdo());
            preOrden(raiz.getNodoDerecho());
        }} 
    private static void postOrden(nodo raiz){
        if(raiz != null){
            postOrden(raiz.getNodoIzquierdo());
            postOrden(raiz.getNodoDerecho());                  
            System.out.print(raiz.getDato()+" ");
        } }
    
    private static void inOrden(nodo raiz){
        if(raiz != null){
            inOrden(raiz.getNodoIzquierdo());
            System.out.print(raiz.getDato()+" ");
            inOrden(raiz.getNodoDerecho()); }
    }
       
 
    
}
    
        

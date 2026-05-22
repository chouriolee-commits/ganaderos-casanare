package src.main.java;
public class ArbolBST {
    
    NodoBST raiz;

    public ArbolBST(){
        this.raiz = null;
    }

    //método público que llama al privado recursivo
    public void insertar(int codigo, String raza,  double peso, int edad){
        raiz = insertarRec(raiz,codigo, raza, peso,edad
        ); 
    }

    //metodo privado recursivo
    private NodoBST insertarRec(NodoBST nodo, int codigo, String raza, double peso, int edad){
        if(nodo == null){
            return new NodoBST(codigo, raza, peso,edad);
        }

        if(codigo < nodo.codigo){
            //Va a la izquierda
            nodo.izquierdo = insertarRec(nodo.izquierdo,codigo, raza, peso,edad);
        }else if (codigo > nodo.codigo){
            //va a la derecha
            nodo.derecho = insertarRec(nodo.derecho, codigo, raza, peso,edad);
        }

        //si codigo == nodo.codigo, no se inserta (código duplicado)

        return nodo;
    }

    public NodoBST buscar(int codigo){
        return buscarRec (raiz, codigo);
    }

    private NodoBST buscarRec (NodoBST nodo, int codigo){
        //caso base: no existe o lo encontramos
        if(nodo == null || nodo.codigo == codigo){
            return nodo;
        }

        if(codigo < nodo.codigo){
            return buscarRec(nodo.izquierdo, codigo);
        }else{
            return buscarRec(nodo.derecho,codigo);
        }
    }

    // Pre Orden: Raíz -> Izquierda -> Derecha

    public void preOrden(){
        System.out.println("\nRecorrido PreOrden:");
        preOrdenRec(raiz);
        System.out.println();
    }

    private void preOrdenRec (NodoBST nodo){
        if (nodo == null) return;
       System.out.println("Raza: " + nodo.raza + " Edad: " + nodo.edad + " peso: " + nodo.peso);
       System.out.println("=======================");
        preOrdenRec(nodo.izquierdo);
        preOrdenRec(nodo.derecho);
    }

}

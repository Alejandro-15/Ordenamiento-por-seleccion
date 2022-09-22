
package OrdenamientoPorSeleccion;


public class PruebaOrdenamiento {

    public static void main(String[] args) {
        
        Ordenamiento ordena = new Ordenamiento();
        int [] arreglo = {4, 3, 31, 54, 64, 21, 2};
        ordena.ordenamientoPorSeleccion(arreglo);
        ordena.imprime(arreglo);
    }
   
}

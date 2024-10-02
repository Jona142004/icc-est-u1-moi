public class Insercion {
    public int[] sortbyInsercion(int[] arreglo){
        int tam = arreglo.length;
        for (int i = 1; i < tam; i++ ){
            int aux = arreglo[i];
            int j = i - 1;
            while (j >= 0  && arreglo[j] > aux) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1; 
                arreglo[j + 1] = aux;
            }       
        }
        return arreglo;
    }
    public void printArreglo(int[]arreglo){
        for (int elemento : arreglo){ //for each el arreglo va instanciando cada elemento del arreglo se va almacenando
            System.out.print(elemento + ",");
        }
    }
}
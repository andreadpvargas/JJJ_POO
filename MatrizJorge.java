package matrizjorge;

public class MatrizJorge {

    public static void main(String[] args) {
       metodoJorge metJ = new metodoJorge();
       int arr[] = {4,2,3,4};
       metJ.setArreglo(arr);
       metJ.setCant(arr.length);
       System.out.println("Resultado: " + metJ.cantidadPar());
       System.out.println(metJ.getVar());
    }
    
}

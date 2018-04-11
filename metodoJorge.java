package matrizjorge;

public class metodoJorge implements interMatriz {

    int cant = 0;
    int arreglo[] = null;
    String var = "";

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int cantidadPar() {
        int count = 0;

        for (int i = 0; i < cant; i++) {
            if (arreglo[i] % 2 == 1) {
                count++;
                if (count == 1) {
                  var = "Necesitas eliminar el " + arreglo[i];
                }
            }
        }
        if (count % 2 == 0) {
            return 0;
        } else {
            return 1;
        }

    }

}

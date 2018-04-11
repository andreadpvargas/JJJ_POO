package cuadradomatriz;

import javax.swing.JOptionPane;


public class Matriz implements interfacematriz {
    int filas;
    int columnas;
    int matriz[][];

    public void setMatriz() {
        matriz = new int [filas][columnas];
    }
    
    
    
    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    
    public void LeerDatos(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero en la posición "+(i+1)+","+(j+1)));
            }
        }
    }
    
    public void Calcular(){
        String resultado1 = "Diagonal uno: ";
        String resultado2 = "Diagonal dos: ";
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i == j){
                    resultado1 = resultado1 + (matriz [i][j]*matriz [i][j]+". ");
                }
            }
        }
        
        int j = matriz[0].length-1;
        for (int i = 0; i < matriz.length; i++) {
            resultado2 = resultado2 + (matriz [i][j]*matriz [i][j]+". ");
            j--;
        }
        
        JOptionPane.showMessageDialog(null, resultado1);
        JOptionPane.showMessageDialog(null, resultado2);
    }
}


package 
        cuadradomatriz;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Matriz m = new Matriz();
        
        m.setFilas(Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas")));
        m.setColumnas(Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas")));
        m.setMatriz();
        m.LeerDatos();
        
        
        for (int i = 0; i < m.matriz.length; i++) {
            for (int j = 0; j < m.matriz[0].length; j++) {
                System.out.print(m.matriz[i][j]);
            }
            System.out.println("");
        }
        
        m.Calcular();
    }
}

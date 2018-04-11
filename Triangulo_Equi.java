/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo_equi;

import javax.swing.JOptionPane;

/**
 *
 * @author AlejoeIsa
 */
public class Triangulo_Equi {

    public static void main(String[] args) {
        double a =Double.parseDouble(JOptionPane.showInputDialog("digite un lado del triangulo "));
        
        area ar = new area();
        JOptionPane.showMessageDialog(null, "area de cicumcircle es " + ar.area_circumcircle(a));
        //System.out.println(ar.area_circumcircle(a));

    }
}

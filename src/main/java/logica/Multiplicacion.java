package logica;

import javax.swing.JLabel;

/**
 *
 * @author johaco
 */
public class Multiplicacion {
    public float multiplicacion(float primer_num, float segundo_num, JLabel pantalla){
        primer_num = Float.parseFloat(pantalla.getText());
        pantalla.setText("");
        return primer_num;
    }
    public String obtener_operador(String operador){
        operador = "X";
        return operador;
    }
}

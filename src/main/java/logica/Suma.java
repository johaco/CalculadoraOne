package logica;


/**
 *
 * @author johaco
 */
import javax.swing.JLabel;

public class Suma {
    public float sumar(float primer_num, float segundo_num, JLabel pantalla){
        primer_num = Float.parseFloat(pantalla.getText());
        pantalla.setText("");
        return primer_num; 
    }
    public String obtener_operador(String operador){
        operador = "+";
        return operador;
    }
}

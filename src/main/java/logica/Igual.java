package logica;

import javax.swing.JLabel;

/**
 *
 * @author johaco
 */
public class Igual {
     public void resultado(float segundo_num, float primer_num, JLabel pantalla, String operador){
        segundo_num = Float.parseFloat(pantalla.getText());
        switch (operador) {
            case "+":
                pantalla.setText(Float.toString(primer_num+segundo_num));
                break;
            case "-":
                pantalla.setText(Float.toString(primer_num-segundo_num));
                break;
            case "X":
                pantalla.setText(Float.toString(primer_num*segundo_num));
                break;
            case "%":
                if(primer_num == 0 && segundo_num == 0){
                    pantalla.setText("Math ERROR");
                }
                else{
                    pantalla.setText(Float.toString(primer_num/segundo_num));   
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}

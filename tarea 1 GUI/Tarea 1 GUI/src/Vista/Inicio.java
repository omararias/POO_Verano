package Vista;

import Modelo.PorPagar;
import java.util.ArrayList;

/**
 *
 * @author omar
 */
public class Inicio {

    public static ArrayList<PorPagar> porPagarLista = new ArrayList<PorPagar>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FrmInicio().setVisible(true);
    }

}

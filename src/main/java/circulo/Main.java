package circulo;

import java.text.DecimalFormat;

/**
 * Pruebas de refactorización en NetBeans con la clase Aro
 *
 * @author a22fatimasb
 */
public class Main {

    /**
     * Clase de probas
     *
     * @param args
     */
    public static void main(String[] args) {
        Aro circulo = new Aro(37, 43, 2.5);
        String saida
                = "A coordenada X é " + circulo.getCoordenadaX()
                + "\nA coordenada Y é " + circulo.getCoordenadaY()
                + "\nO radio é " + circulo.getRadio();
        circulo.setCoordenadaX(35);
        circulo.setCoordenadaY(20);
        circulo.setRadio(4.2);
        DecimalFormat dousDixitos = new DecimalFormat("0.00");
        saida += "\nO diámetro é " + dousDixitos.format(circulo.obterDiametro());
        saida += "\nA circunferencia é " + dousDixitos.format(circulo.obterCircunferencia());
        saida += "\nA área é " + dousDixitos.format(circulo.obterSuperficie());
        System.out.println(saida); //NOSONAR
        System.exit(0);
    }

}

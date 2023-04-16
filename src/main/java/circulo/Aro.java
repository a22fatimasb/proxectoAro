package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 *
 * @author a22fatimasb
 */
public class Aro {

    /**
     * valor mínimo do radio
     */
    public static final double MINIMO = 0.0;

    /**
     * valor limite do radio
     */
    public static final double LIMITERADIO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * constructor vacío
     */
    public Aro() {
    }

    /**
     * contructor cos valores seguintes
     * @param valorX 
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     *
     * @return valor da coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * 
     * @param coordenadaX novo valor da coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     *
     * @return valor da coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     *
     * @param coordenadaY novo valor da coordenadaY
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     *
     * @return valor de radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     *
     * @param valorRadio novo valor de radio
     */
    public void setRadio(double valorRadio) {
        this.radio = (valorRadio < MINIMO ? MINIMO : valorRadio);
    }

    /**
     *
     * @return valor do diametro
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     *
     * @return valor da circuferencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *
     * @return valor superficie
     */
    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     * Desplaza as coordenadas do aro unha intancia
     * @param trasladarX nova posición de coordenadaX sumando o valor de TraladasX
     * @param trasladarY nova posición de coordenadaY sumando o valor de TraladasY
     */
    public void trasladarCentro(int trasladarX, int trasladarY) {
        coordenadaX = coordenadaX + trasladarX;
        coordenadaY = coordenadaY + trasladarY;
    }
}

package tarea;
/**
 * Esta clase representa una calculadora del Teorema de Pitágoras.
 * Permite calcular la longitud de un lado de un triángulo rectángulo
 * dada la longitud de los otros dos lados.
 */

public class PitagorasCalculatora {
	
	/**
     * Calcula la longitud del tercer lado de un triángulo rectángulo
     * utilizando el Teorema de Pitágoras.
     * a La longitud del primer lado del triángulo (cateto).
     * b La longitud del segundo lado del triángulo (cateto).
     * La longitud del tercer lado del triángulo (hipotenusa).
     * throw IllegalArgumentException Si alguno de los lados proporcionados es negativo o cero.
     */
    public static double calcularHipotenusa(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Los lados deben ser positivos y diferentes de cero.");
        }
        
        // Aplicamos el Teorema de Pitágoras para calcular la hipotenusa
        double hipotenusa = Math.sqrt(a * a + b * b);
        return hipotenusa;
    }

    /**
     * Método principal para probar la calculadora del Teorema de Pitágoras.
     * Ejemplo de uso:
     * PitagorasCalculatora calculadora = new PitagorasCalculatora();
     * double resultado = calculadora.calcularHipotenusa(3.0, 4.0);
     * System.out.println("La hipotenusa es: " + resultado);
     *
     * args Argumentos de línea de comandos (no se utilizan en este caso).
     */

	public static void main(String[] args) {
		try {
            double cateto1 = 3.0;
            double cateto2 = 4.0;

            double hipotenusa = calcularHipotenusa(cateto1, cateto2);
            System.out.println("La hipotenusa es: " + hipotenusa);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}

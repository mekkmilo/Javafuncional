import java.util.function.Function;

public class Punto8 {

        private double result;

        // Constructor
        public Punto8(double initialValue) {
            this.result = initialValue;
            System.out.println("Inicial: " + this.result);
        }

        // Método para sumar
        public Punto8 add(double value) {
            this.result += value;
            System.out.println("Suma: " + this.result);
            return this;
        }

        // Método para restar
        public Punto8 subtract(double value) {
            this.result -= value;
            System.out.println("Resta: " + this.result);
            return this;
        }

        // Método para multiplicar
        public Punto8 multiply(double value) {
            this.result *= value;
            System.out.println("Multiplicación: " + this.result);
            return this;
        }

        // Método para obtener el resultado final
        public double getResult() {
            return this.result;
        }

    }


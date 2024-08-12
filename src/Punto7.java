

public class Punto7 {


    // Método para formatear la fecha
    public static void mostrarFecha(String fecha) {
        // Dividir la fecha en día, mes y año
        String[] partes = fecha.split("-");
        if (partes.length == 3) {
            String dia = partes[0];
            String mes = partes[1];
            String ano = partes[2];

            // Mostrar la fecha en el formato deseado
            System.out.printf("La fecha es %s del %s del %s%n", dia, mes, ano);
        } else {
            System.out.println("Formato de fecha inválido: " + fecha);
        }
    }
}
public class Alumno {

    // Atributos de la clase
    String nombre;
    double[] calificaciones = new double[5];

    // Método 1: calcula el promedio de las cinco calificaciones
    public double calcularPromedio(double[] calificaciones) {

        double suma = 0;

        for (double calificacion : calificaciones) {
            suma = suma + calificacion;
        }

        return suma / calificaciones.length;
    }

    // Método 2: obtiene la calificación final
    public char obtenerCalificacion(double promedio) {

        if (promedio <= 50) {
            return 'F';

        } else if (promedio > 50 && promedio <= 60) {
            return 'E';

        } else if (promedio > 60 && promedio <= 70) {
            return 'D';

        } else if (promedio > 70 && promedio <= 80) {
            return 'C';

        } else if (promedio > 80 && promedio <= 90) {
            return 'B';

        } else {
            return 'A';
        }
    }

    // Método 3: imprime los resultados
    public void imprimirResultados(
            String nombre,
            double promedio,
            char calificacion) {

        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // Método principal
    public static void main(String[] args) {

        Alumno alumno = new Alumno();

        alumno.nombre = "Nestor Villagrana";

        alumno.calificaciones[0] = 95;
        alumno.calificaciones[1] = 92;
        alumno.calificaciones[2] = 88;
        alumno.calificaciones[3] = 96;
        alumno.calificaciones[4] = 91;

        double promedio =
                alumno.calcularPromedio(alumno.calificaciones);

        char calificacion =
                alumno.obtenerCalificacion(promedio);

        alumno.imprimirResultados(
                alumno.nombre,
                promedio,
                calificacion);
    }
}
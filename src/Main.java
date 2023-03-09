class Alumno {
    private String nombre;
    private int[] calificaciones = new int[5];

    public Alumno(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public int calcularPromedio() {
        int total = 0;
        for (int i = 0; i <calificaciones.length; i++) {
            total += calificaciones[i];
        }
        return total / calificaciones.length;
    }

    public char obtenerCalifFinal() {
        int promedio = calcularPromedio();
        System.out.println(promedio / 10);
        switch (promedio / 10) {
            case 10:
            case 9:
                return  'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return  'D';
            case 5:
                return  'E';
            default:
                return  'F';
        }
    }

    public void imprimirCalificaciones() {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Calificación: " + obtenerCalifFinal());

    }

}


public class Main {
    public static void main(String[] args) {
        int[] califsLuis = {85, 75, 70, 100, 55};
        Alumno luis = new Alumno("Luis", califsLuis);
        luis.imprimirCalificaciones();

        int[] califsAna = {100, 85, 90, 100, 95};
        Alumno ana = new Alumno("Ana", califsAna);
        ana.imprimirCalificaciones();

        int[] califsCarlos = {0, 55, 40, 70, 50};
        Alumno carlos = new Alumno("Carlos", califsCarlos);
        carlos.imprimirCalificaciones();
    }
}
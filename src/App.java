public class App {
    public static void main(String[] args) throws Exception {
       //Instanciamos un objeto Persona usando el primer constructor
        Persona persona1 = new Persona("Celeste", "Ortiz", 25, "TIC", 5, true);

        //Instanciamos un objeto Persona usando el segundo constructor envíandole menos atributos
         Persona persona2 = new Persona("Erick", "Ortiz", 25, "Administración");

        System.out.println("Nombre: " + persona1.getNombreCompleto());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Carrera: " + persona1.carrera.nombre);
        System.out.println("Duración de carrera: " + persona1.carrera.duracionAnios + " años");
        System.out.println("¿Está en curso?: " + persona1.carrera.enCurso); 

         System.out.println("Nombre: " + persona2.getNombreCompleto());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Carrera: " + persona2.carrera.nombre);
      


    }
}

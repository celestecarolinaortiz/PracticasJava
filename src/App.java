public class App {
    public static void main(String[] args) throws Exception {
        /*ARREGLLOS: Estructuras de datos que permiten almacenar múltiples valores en una sola variable
        Se puede acceder a ellos a través de un índice que empieza en 0 
        También conocidos como Vectores o Matrices en otros lenguajes */

        int[] numeros = new int[5]; //Declaración e instanciación de un arreglo de enteros con 5 posiciones
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 400;
        numeros[3] = 500;
        numeros[4] = 600;

        System.out.println("Elemento en la posición 2: " + numeros[2]); 
        System.out.println("Longitud del array: " + numeros.length);

        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }

        //Declaración, instanciación y asignación de valores en una sola línea 
        String[] alfabeto = {"A", "B", "C", "D", "E"};  
       
         //For mejorado para recorrer arreglos. Sin índice
         for(String letra : alfabeto){ 
            System.out.println(letra);
         }



        /*EJEMPLO DE PROGRAMACIÓN ORIENTADA A OBJETOS*/

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


public class Persona {

    //Atributos (características de un objeto)
    private String nombre;
    private String apellido;
    private int edad;
     Carrera carrera; // CLASE Carrera: Una persona tiene una carrera

     //Constructor: método especial para crear objetos
    public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracionAnios, boolean enCurso) {
        //Inicializamos el atributo carrera creando un nuevo objeto Carrera
        carrera = new Carrera(nombreCarrera, duracionAnios, enCurso);

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Sobrecarga de constructores: Mismo nombre de constructor, diferente comportamiento
    public Persona(String nombre, String apellido, int edad, String nombreCarrera) {
        //Inicializamos el atributo carrera creando un nuevo objeto Carrera
        carrera = new Carrera(nombreCarrera);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Métodos (comportamiento de un objeto)
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    } 

    public String saludar(String saludado, int edadSaludado) {
        //El if no lleva llaves porque solo hay una línea de código
        if(edadSaludado > 40) return "Hola, ¿cómo está " + saludado + "?";
        //No hay else porque si se cumple el if, ya se ejecuta el return y no sigue con el código
        return "Hola, ¿cómo estás " + saludado + "?";
    }

     //Getters y Setters
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

  
   

}

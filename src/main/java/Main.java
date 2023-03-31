public class Main {
    public static void main(String[] args) {
        Student estudiante = new Student("Alexander","Barrios",19,22670046,"22670018@gamil.edu.mx","iguala.gro #9");
        Teacher maestro = new Teacher("Juan","Louis",30,"hernancort@23","iguala.gro");

        estudiante.Soy();
        estudiante.toString();

        System.out.println(" ");

        maestro.soy();
        maestro.toString();

        // System.out.println("mostrar toString();"+maestro.toString());
    }
}

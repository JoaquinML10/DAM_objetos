//package insti;
//
//public class InstiAPP {
//    static void main(String[] args) {
//
//        Instituto instituto = new Instituto("IES MUTXAMEL");
//        Curso cursoJava = new Curso("Java", 100);
//        Curso cursoPython = new Curso("Python", 70);
//        instituto.agregarCurso(cursoJava);
//        instituto.agregarCurso(cursoPython);
//
//        try {
//            Estudiante estudiante1 = new Estudiante("Carlos", 20, cursoJava);
//            Estudiante estudiante2 = new Estudiante("Ana", 22, cursoPython);
//            instituto.agregarEstudiante(estudiante1);
//            instituto.agregarEstudiante(estudiante2);
//        } catch (NullPointerException e) {
//            System.out.println("Error: No se puede crear un estudiante con nombre nulo.");
//        }
//        instituto.agregarEstudiante(null);
//        instituto.agregarCurso(null);
//        System.out.println("Cursos disponibles:");
//        System.out.println(instituto.getListCurso());
//        System.out.println("Estudiantes registrados:");
//        System.out.println(instituto.getListaEstudiantes());
//
//    }
//}
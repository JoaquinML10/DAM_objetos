package insti;

public class InstiAPP {
    static void main(String[] args) {

        Instituto instituto = new Instituto("IES MUTXAMEL");
        Curso cursoJava = new Curso("Java",100);
        Curso cursoPython = new Curso("Python", 70);
        Estudiante estudiante2 = new Estudiante("Ana", 22, cursoPython);
        Estudiante jacobo = new Estudiante("carlos",20, cursoJava);

        jacobo.setNombre("jaja");
        System.out.println(jacobo);

        System.out.println(instituto);
        instituto.duplicados_Curso(cursoJava);
        System.out.println(instituto.getListCurso());
        instituto.duplicados_Curso(cursoJava);
        System.out.println(instituto.getListCurso());

    }
}
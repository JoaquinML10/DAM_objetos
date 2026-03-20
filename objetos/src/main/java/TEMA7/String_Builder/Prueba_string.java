package TEMA7.String_Builder;

public class Prueba_string {

    static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Calleu ");
        sb.append("Mantecao").append(" Joaquin!!").append(" adios");

        sb.insert(16, "de chocolate ");
        sb.replace(29,36,"Jacobo");
        sb.delete(29, 36);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}

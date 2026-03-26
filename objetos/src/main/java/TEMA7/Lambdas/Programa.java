package TEMA7.Lambdas;

public class Programa {
    static void main(String[] args) {
        Prueba anonima = new Prueba() {
            @Override
            public String  aprobar(int nota) {
                System.out.println("Aprobando robando anonimus " + nota);
                if (nota >= 5){
                    return "Aprobado";
                }else{
                    return "AL MIERCOLES";
                }
            }
        };

        Prueba lambda = (int nota) -> {System.out.println("Aprobando programacion desde una lambda " + nota);
            if (nota >= 5){
                return "Aprobado";
            }else {
                return "A LA ISLA EPSTEIN";
            }
        };

        System.out.println(anonima.aprobar(4));
        System.out.println(lambda.aprobar(0));
    }
}

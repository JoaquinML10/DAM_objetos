package TEMA7.Mapas;

import java.util.*;

public class Diccionario {
    static private HashMap<String,String> mapa = new HashMap<>();
    static Random aleatorio = new Random();
    static int correcto = 0;
    static int preguntas = 0;
    static private ArrayList<String> listaesp  =new ArrayList<>();

    public Diccionario() {
        mapa = new HashMap<>();
        listaesp = new ArrayList<>();
    }

    public static HashMap<String, String> getMapa() {
        return mapa;
    }

    public static void setMapa(HashMap<String, String> mapa) {
        Diccionario.mapa = mapa;
    }

    public static ArrayList<String> getListaesp() {
        return listaesp;
    }

    public static void setListaesp(ArrayList<String> listaesp) {
        Diccionario.listaesp = listaesp;
    }

    static public void nuevoPar(String esp, String inglish){
        mapa.put(esp,inglish);


    }
    static public String traduce(String esp){

        return mapa.get(esp);
    }
    static public String palabraAleatoria(){

        String palabra  = listaesp.get(aleatorio.nextInt(0,listaesp.size()));

        listaesp.remove(palabra);
        return palabra;
    }
    static public char primeraLetraTraduccion(String inglish){

        return inglish.toUpperCase().charAt(0);
    }
    static public void llamarApar(){
        nuevoPar("casa", "house");
        nuevoPar("perro", "dog");
        nuevoPar("gato", "cat");
        nuevoPar("mesa", "table");
        nuevoPar("silla", "chair");
        nuevoPar("puerta", "door");
        nuevoPar("ventana", "window");
        nuevoPar("coche", "car");
        nuevoPar("calle", "street");
        nuevoPar("ciudad", "city");
        nuevoPar("pueblo", "town");
        nuevoPar("escuela", "school");
        nuevoPar("libro", "book");
        nuevoPar("cuaderno", "notebook");
        nuevoPar("boligrafo", "pen");
        nuevoPar("lapiz", "pencil");
        nuevoPar("papel", "paper");
        nuevoPar("mochila", "backpack");
        nuevoPar("profesor", "teacher");
        nuevoPar("estudiante", "student");
        nuevoPar("amigo", "friend");
        nuevoPar("familia", "family");
        nuevoPar("madre", "mother");
        nuevoPar("padre", "father");
        nuevoPar("hermano", "brother");
        nuevoPar("hermana", "sister");
        nuevoPar("niño", "child");
        nuevoPar("niña", "girl");
        nuevoPar("hombre", "man");
        nuevoPar("mujer", "woman");
        nuevoPar("comida", "food");
        nuevoPar("agua", "water");
        nuevoPar("leche", "milk");
        nuevoPar("pan", "bread");
        nuevoPar("queso", "cheese");
        nuevoPar("carne", "meat");
        nuevoPar("pollo", "chicken");
        nuevoPar("pescado", "fish");
        nuevoPar("fruta", "fruit");
        nuevoPar("verdura", "vegetable");
        nuevoPar("manzana", "apple");
        nuevoPar("naranja", "orange");
        nuevoPar("platano", "banana");
        nuevoPar("uva", "grape");
        nuevoPar("fresa", "strawberry");
        nuevoPar("azucar", "sugar");
        nuevoPar("sal", "salt");
        nuevoPar("cafe", "coffee");
        nuevoPar("te", "tea");
        nuevoPar("desayuno", "breakfast");
        nuevoPar("almuerzo", "lunch");
        nuevoPar("cena", "dinner");
        nuevoPar("trabajo", "work");
        nuevoPar("oficina", "office");
        nuevoPar("empresa", "company");
        nuevoPar("dinero", "money");
        nuevoPar("tienda", "shop");
        nuevoPar("mercado", "market");
        nuevoPar("hospital", "hospital");
        nuevoPar("farmacia", "pharmacy");
        nuevoPar("parque", "park");
        nuevoPar("playa", "beach");
        nuevoPar("montaña", "mountain");
        nuevoPar("rio", "river");
        nuevoPar("mar", "sea");
        nuevoPar("cielo", "sky");
        nuevoPar("sol", "sun");
        nuevoPar("luna", "moon");
        nuevoPar("estrella", "star");
        nuevoPar("dia", "day");
        nuevoPar("noche", "night");
        nuevoPar("mañana", "morning");
        nuevoPar("tarde", "afternoon");
        nuevoPar("tiempo", "time");
        nuevoPar("hora", "hour");
        nuevoPar("minuto", "minute");
        nuevoPar("segundo", "second");
        nuevoPar("año", "year");
        nuevoPar("semana", "week");
        nuevoPar("mes", "month");
        nuevoPar("invierno", "winter");
        nuevoPar("verano", "summer");
        nuevoPar("primavera", "spring");
        nuevoPar("otoño", "autumn");
        nuevoPar("frio", "cold");
        nuevoPar("calor", "heat");
        nuevoPar("lluvia", "rain");
        nuevoPar("viento", "wind");
        nuevoPar("nieve", "snow");
        nuevoPar("rapido", "fast");
        nuevoPar("lento", "slow");
        nuevoPar("grande", "big");
        nuevoPar("pequeño", "small");
        nuevoPar("alto", "tall");
        nuevoPar("bajo", "short");
        nuevoPar("nuevo", "new");
        nuevoPar("viejo", "old");
        nuevoPar("bueno", "good");
        nuevoPar("malo", "bad");
        nuevoPar("feliz", "happy");
        nuevoPar("triste", "sad");
        nuevoPar("facil", "easy");
        nuevoPar("dificil", "difficult");
        for (Map.Entry<String,String> mapita : mapa.entrySet()){
            listaesp.add(mapita.getKey());
        }
    }
}

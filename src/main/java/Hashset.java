import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> Names=  new HashSet<> ();

        Names.add("Manisha");
        Names.add("anisha");
        Names.add("nisha");
        Names.add("isha");
        Names.add("sha");
        Names.add("ha");
        Names.add("a");
        Names.remove("anisha");
        System.out.println(Names);
    }
}

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("happy");
        names.add("holiday");
        names.add("new");
        names.add("celebrations");
        for(String a : names){
            System.out.println(a);

        }
        ListIterator<String>  iterator= names.listIterator();
        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}

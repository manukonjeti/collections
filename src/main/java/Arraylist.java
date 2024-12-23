import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<>();
       // ArrayList<String> names = new ArrayList<>();
        num.add(26);
        num.add(6);
        num.add(2);
        num.add(16);
        System.out.println(num.get(1));

        for( int a : num){
            System.out.println(a);
        }
    }
}

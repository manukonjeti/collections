
    import java.util.ArrayDeque;

    public class ArrayDeqeue {
        public static void main(String[] args) {
            ArrayDeque<String> deque = new ArrayDeque<>();

            // Adding elements
            deque.addFirst("Front");
            deque.addLast("Back");

            // Accessing elements
            System.out.println("First Element: " + deque.peekFirst()); // Front
            System.out.println("Last Element: " + deque.peekLast());   // Back

            // Removing elements
            System.out.println("Removed First: " + deque.removeFirst()); // Front
            System.out.println("Deque after removal: " + deque);
        }
    }

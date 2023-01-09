import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Ana");
        set.add("Maria");
        set.add("Andrei");
        set.add("Mihai");
        set.add("Ana");
        System.out.println(set);
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("Element: " + next);
        }

        Set<String> linkedSet = new LinkedHashSet<String>();
        linkedSet.add("Ana");
        linkedSet.add("Maria");
        linkedSet.add("Andrei");
        linkedSet.add("Mihai");
        linkedSet.add("Ana");
        System.out.println(linkedSet);
        Iterator<String> linkedSetIterator = linkedSet.iterator();
        while(linkedSetIterator.hasNext()) {
            String next = linkedSetIterator.next();
            System.out.println("Element: " + next);
        }

        TreeSet<Student> treeSet = new TreeSet<>(new StudentComparator());
        treeSet.add(new Student("Vasilica"));
        treeSet.add(new Student("Gigel"));
        treeSet.add(new Student("Popescu"));
        System.out.println(treeSet);

        Queue<String> coada = new LinkedList<String>();
        coada.offer("rosu");
        coada.offer("verde");
        coada.offer("albastru");
        // rosu, verde, albastru, ....
        while (coada.size() > 0) {
            String elem = coada.remove();
            System.out.print(elem + " ");
        }
        System.out.println();

        Queue<Car> carQueue = new PriorityQueue<>();
        carQueue.offer(new Car("Dacia", "Logan", 3000));
        carQueue.offer(new Car("Tesla", "Model3", 20 * 1000));
        carQueue.offer(new Car("Daewoo", "Tico", 500));
        System.out.println(carQueue);

        while(carQueue.size() > 0) {
            Car car = carQueue.remove();
            System.out.println(car + " ");
        }
        System.out.println();



    }
}

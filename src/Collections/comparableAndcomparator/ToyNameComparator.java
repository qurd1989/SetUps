package Collections.comparableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToyNameComparator implements Comparator<ToyNameComparator.Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return o1.getName().compareTo(o2.getName());
    }

    class Toy {
        private String name;
        private String color;

        public Toy(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Toy [name=" + name + ", color=" + color + "]";
        }
    }

    public static void main(String[] args) {
        ToyNameComparator comparator = new ToyNameComparator();
        List<Toy> toys = new ArrayList<>();
        toys.add(comparator.new Toy("Car", "Red"));
        toys.add(comparator.new Toy("Doll", "Blue"));
        toys.add(comparator.new Toy("Ball", "Green"));

        System.out.println("Before sorting: " + toys);
        Collections.sort(toys, comparator);
        System.out.println("After sorting by name: " + toys);
    }
}
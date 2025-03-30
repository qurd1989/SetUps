package Collections.comparableAndcomparator;

import java.util.*;
import java.util.TreeSet;

public class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        return a.compareTo(b);
    }

}
    class CompDemp {
        String name;
        boolean complete;

        CompDemp(String name) {
            this.name = name;
            this.complete = false;
        }
        public static void main(String[] args) {
            MyComp mc = new MyComp();
            TreeSet<String> ts = new TreeSet<>(mc.reversed());
            ts.add("C");
            ts.add("A");
            ts.add("B");
            ts.add("E");
            ts.add("F");

            for (String element : ts) {
                System.out.print(element + " ");
            }
            System.out.println(equals(new ArrayList<>(List.of(
                    new CompDemp("John"),
                    new CompDemp("Smith"),
                    new CompDemp("Alex"))),"Smith"));
        }
        public static boolean equals(List<CompDemp> taskList, String name) {
            for (CompDemp task : taskList) {
                if (task.name.equals(name)) {
                    task.complete = !task.complete;
                }
            }
            return false;
        }
}

package javainterview;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//🔍 What is a Fail-Fast List in Java?
//A fail-fast list is a collection (like ArrayList, HashSet, etc.)
// that throws a ConcurrentModificationException if you try to modify the list while iterating over it using an iterator.
public class FastFail {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nikhil");
        names.add("Akhil");
        names.add("Rahul");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Akhil")) {
                iterator.remove(); // ✅ safe removal
            }
        }
    }
}

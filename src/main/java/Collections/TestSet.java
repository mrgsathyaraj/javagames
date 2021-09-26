package Collections;

import java.util.*;

public class TestSet {

    public static void main(String[] args) {

        Set<String> objset = new HashSet<>();

        objset.add("test");
        objset.add("abc");
        objset.add("abc");
        objset.add("mas");
        objset.add("vas");

        Iterator itset = objset.iterator();
        while(itset.hasNext())
        {
            System.out.println(itset.next());
        }

        TreeSet<String> treeobj = new TreeSet(objset);
        System.out.println(treeobj);


    }
}

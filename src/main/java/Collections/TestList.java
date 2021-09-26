package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;

public class TestList {


    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(1);
        list.add("test");
        list.add(500);
        list.add(5);
        list.add(14.5f);
        list.add(200.00);
        list.add("aa");

        System.out.println(list + "    " +list.size());

        System.out.println(list.remove("500"));
        list.remove(5);

        System.out.println("get list "+list.get(5) + " "+list.contains(1));

        System.out.println(list + "    " +list.size());

        List<String> listString = new ArrayList<String>();

        listString.add("z");
        listString.add("x");
        listString.add("a");
        listString.add("c");
        listString.add("M");
        listString.add("A");
        listString.add(null);

        listString.addAll(list);

        System.out.println(listString + "  size "+ listString.size());

        listString.removeAll(list);

        System.out.println("after remove list 1");

        System.out.println(listString + "  size "+ listString.size());

        listString.addAll(list);
        listString.addAll(listString);
        listString.set(1,"set value");
        System.out.println(listString + "  size "+ listString.size());

        for(int i =0;i<7;i++)
        {
            System.out.println(listString.get(i));
        }

        for (Object s : listString)
        {
            System.out.println("for each :"+s);
        }

        Iterator itl = list.listIterator();
        int i =0;
        while(itl.hasNext())
        {
            System.out.println(itl.next());

            List<String> obj2 = listString;
            System.out.println(" get usage in iterator " +obj2.get(i));
            i++;
        }

     ArrayList<Integer> obj2 = new ArrayList<>();
        obj2.add(80);
        obj2.add(-5);
        obj2.add(0);
        obj2.add(1);
        obj2.add(100);



        Collections.sort(obj2);

        System.out.println("sorted array list :" + obj2);

        Collections.sort(obj2,Collections.reverseOrder());
        System.out.println("reversed array list :" + obj2);

        Collections.swap(obj2,0,2);
        System.out.println("swapped  array list :" + obj2);

    }



}

package Collections;

import java.util.*;

public class TestMap
{

    public static void main(String[] args) {

     Map<Integer,String> objmap = new HashMap<>();

     objmap.put(1,"A");
     objmap.put(1,"B");
     objmap.put(2,"B");
     objmap.put(3,"Z");
     objmap.put(7,"Y");
     objmap.put(4,"D");
     objmap.put(5,"l");
     objmap.put(6,"O");
     objmap.put(26,"X");
     objmap.put(null,null);
     objmap.put(null,null);
     objmap.put(26,null);

        System.out.println("contains key chck :"+objmap.containsKey("1"));

        System.out.println("contains value chck :"+objmap.containsValue("D"));
        objmap.remove("O");
        objmap.size();
        System.out.println(objmap.isEmpty());


        System.out.println(objmap.keySet());
        System.out.println(objmap.values());

        for(int i =0;i< objmap.size();i++)
        {
            System.out.println("value "+ objmap.get(i));

        }

        for(Map.Entry entry : objmap.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }

        Iterator<Map.Entry<Integer, String>> itl = objmap.entrySet().iterator();
        while(itl.hasNext())
        {
            System.out.println("iterate " + itl.next());


        }

    }

}

package Collectionofjava;
import java.util.*;
public class MapDemo{
    public static void main(String[] args) {
        Map<Integer,Integer>hm = new HashMap<>();
        hm.put(10,96);
        hm.put(9,95);
        hm.put(8,94);
        hm.put(7,93);
        for (Map.Entry<Integer, Integer> i : hm.entrySet()) {
            // Object key = en.getKey();
            // Object val = en.getValue();
            System.out.println(i.getKey() + " " + i.getValue());
            
        }
    }
}
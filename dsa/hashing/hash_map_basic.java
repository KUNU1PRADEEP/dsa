package hashing;

import java.util.HashMap;

public class hash_map_basic {
    public static void main(String[] args) {
        HashMap<String, Integer> hm=new HashMap<>();

        //Insert - O(1)
        hm.put("India", 150);
        System.out.println(hm);
        hm.put("China", 100);
        hm.put("India", 100);
        hm.put("US", 50);
        System.out.println(hm);

        //get - O(1)

        int population=hm.get("India");
        System.out.println(population);
    }
    
}

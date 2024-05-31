package org.Manish;

import java.util.HashMap;
import java.util.Map;

public class MapRevision {

    public static void main(String[] args) {
        Map<String,String> m1 = new HashMap<>();
        for (int i = 1; i <= 10; i++) {

            m1.put(i+"",i*i+"");

        }
        m1.entrySet().forEach(s-> System.out.println(s.getKey()+" "+s.getValue()));
    }
}

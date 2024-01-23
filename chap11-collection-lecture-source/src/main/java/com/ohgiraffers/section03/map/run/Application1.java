package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */
        Map<Object, Object> hmap = new HashMap<>();
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        /* 설명. 순서를 보장하지 않는다. */
        System.out.println("키가 \"one\"인 value 값: " + hmap.get("one"));      // 키가 "one"인 value 값: Tue Jan 23 14:35:30 KST 2024
        System.out.println("Map의 toString(): " + hmap);                      // Map의 toString(): {33=123, one=Tue Jan 23 14:35:30 KST 2024, 12=red apple}

        /* 설명. 키 값이 중복되면 나중에 put 되는 키의 벨류가 값을 덮어 씌운다. (명심할 것!!) */
        hmap.put(12, "purple banana");
        System.out.println(hmap.get(12));

        /* 설명. value는 중복되어도 상관이 없다. */
        hmap.put(77, "purple banana");
        System.out.println(hmap);

        System.out.println("Map이 지닌 entry(쌍)의 수: " + hmap.size());

        System.out.println("77번 키와 관련된 entry 삭제: " + hmap.remove(77));
        System.out.println("삭제 후 entry(쌍)의 수: " + hmap.size());
        System.out.println();

        /* 필기. Map을 반복하여 각 entry들(키와 벨류)을 활용해 보자. */
        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "java 17");
        hmap2.put("two", "mariaDB 10");
        hmap2.put("three", "servlet/jsp");
        hmap2.put("four", "springboot 3.0");
        hmap2.put("five", "vue.js");

        /* 목차. 1. keySet()을 활용한 iterator 활용하기 */
        Set<String> keys = hmap2.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println("key값: " + key + ", value값: " + hmap2.get(key));
        }
        System.out.println();

        /* 목차. 2. entrySet()을 활용한 iterator 활용하기 */
        Set<Map.Entry<String, String>> set = hmap2.entrySet();
        Iterator<Map.Entry<String, String>> iterEntry = set.iterator();
        while(iterEntry.hasNext()){
            Map.Entry<String, String > entry = iterEntry.next();

            System.out.println("key 값: " + entry.getKey() + ", value 값: " + entry.getValue());
        }


    }
}

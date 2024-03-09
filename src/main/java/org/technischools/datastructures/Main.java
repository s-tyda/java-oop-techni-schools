package org.technischools.datastructures;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        int x = 5;
        Integer y = x;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(list);
        List<Integer> list3 = new ArrayList<>(Arrays.asList(array));
        List<Integer> list4 = new LinkedList<>();

        list.add(5);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(!list.isEmpty());
        list.add(0, 6);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(Integer.valueOf(5));
        System.out.println(list);
        list.addAll(list2);
        list.addAll(0, list2);
        list.add(4);
        list.add(5);
        list2.add(4);
        System.out.println(list);
        System.out.println(list2);
        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.contains(5));
        System.out.println(list.contains(4));

        System.out.println(list.containsAll(list2));

//        list.clear();
        System.out.println(list);
        int z = list.get(0);
        System.out.println(z);

        list2.clear();
        list2.add(5);

        System.out.println(list);
        System.out.println(list2);
        System.out.println(list.equals(list2));

        list.add(5);
        System.out.println(list);
        System.out.println(list.indexOf(5));
        System.out.println(list.lastIndexOf(5));
        list.set(0, 4);
        System.out.println(list);
        Integer[] arr = (Integer[]) list.toArray();
//        list.sort();
        Collections.sort(list);

        System.out.println(list.subList(0, 1));

        Set<String> stringSet = new HashSet<>();
        stringSet.add("cos");

        Set<String> stringLinkedSet = new LinkedHashSet<>();
        stringSet.add("cos");

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer key:map.keySet()) {
            Integer value = map.get(key);
        }

        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
        }

//        Lista wartosci
//        map.values();
    }
    public static Map<Integer, Integer> duplicatesOccurrences(List<Integer> list){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Integer element = list.get(i);
            if(map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            }else{
                map.put(element, 1);
            }
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() != 1){
                map2.put(entry.getKey(), entry.getValue());
            }
        }

        return map2;

    }

}

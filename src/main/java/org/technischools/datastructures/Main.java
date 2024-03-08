package org.technischools.datastructures;

import org.technischools.oop.users.User;

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
    public static Map<Integer, Integer> dupaKalanMorski(List<Integer> dupa){
        Map<Integer, Integer> chuj = new HashMap<>();
        for (int i = 0; i < dupa.size(); i++) {
            Integer element = dupa.get(i);
            if(chuj.containsKey(element)) {
                chuj.put(element, chuj.get(element) + 1);
            }else{
                chuj.put(element, 1);
            }


        }
        Map<Integer, Integer> chuj2 = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry: chuj.entrySet()){
            if(entry.getValue() != 1){
                chuj2.put(entry.getKey(), entry.getValue());
            }
        }

        return chuj2;

    }

}

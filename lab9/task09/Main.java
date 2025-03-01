package lab9.task09;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();

        System.out.println("Добавление элементов:");
        System.out.println("ArrayList: " + getRunningTimeAdd(arrayList) + " ms");
        System.out.println("LinkedList: " + getRunningTimeAdd(linkedList) + " ms");
        System.out.println("TreeSet: " + getRunningTimeAdd(sortedSet) + " ms");

        System.out.println("\nДобавление в начало:");
        System.out.println("ArrayList: " + getRunningTimeAddFirst(arrayList) + " ms");
        System.out.println("LinkedList: " + getRunningTimeAddFirst(linkedList) + " ms");

        System.out.println("\nДобавление в середину:");
        System.out.println("ArrayList: " + getRunningTimeAddMiddle(arrayList) + " ms");
        System.out.println("LinkedList: " + getRunningTimeAddMiddle(linkedList) + " ms");

        System.out.println("\nДобавление в конец:");
        System.out.println("ArrayList: " + getRunningTimeAddLast(arrayList) + " ms");
        System.out.println("LinkedList: " + getRunningTimeAddLast(linkedList) + " ms");
        System.out.println("TreeSet: " + getRunningTimeAddLast(sortedSet) + " ms");

        System.out.println("\nУдаление из начала:");
        System.out.println("ArrayList: " + getRunningTimeRemoveFirst(arrayList) + " ms");
        System.out.println("LinkedList: " + getRunningTimeRemoveFirst(linkedList) + " ms");

        System.out.println("\nУдаление из середины:");
        System.out.println("ArrayList: " + getRunningTimeRemoveMiddle(arrayList) + " ms");
        System.out.println("LinkedList: " + getRunningTimeRemoveMiddle(linkedList) + " ms");

        System.out.println("\nУдаление из конца:");
        System.out.println("ArrayList: " + getRunningTimeRemoveLast(arrayList) + " ms");
        System.out.println("LinkedList: " + getRunningTimeRemoveLast(linkedList) + " ms");
        System.out.println("TreeSet: " + getRunningTimeRemoveLast(sortedSet) + " ms");

        System.out.println("\nПолучение элемента по индексу:");
        System.out.println("ArrayList: " + getRunningTimeGet(arrayList) + " ms");
        System.out.println("LinkedList: " + getRunningTimeGet(linkedList) + " ms");
        System.out.println("TreeSet: " + getRunningTimeGet(sortedSet) + " ms");
    }

    // Добавление всех элементов
    private static long getRunningTimeAdd(Collection<Integer> collection) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            collection.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    // Добавление в начало (ArrayList, LinkedList)
    private static long getRunningTimeAddFirst(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            list.add(0, i);
        }
        return System.currentTimeMillis() - start;
    }

    // Добавление в середину (ArrayList, LinkedList)
    private static long getRunningTimeAddMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();
        int middle = list.size() / 2;
        for (int i = 0; i < 200000; i++) {
            list.add(middle, i);
        }
        return System.currentTimeMillis() - start;
    }

    // Добавление в конец (ArrayList, LinkedList, TreeSet)
    private static long getRunningTimeAddLast(Collection<Integer> collection) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            collection.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    // Удаление из начала (ArrayList, LinkedList)
    private static long getRunningTimeRemoveFirst(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 200000 && !list.isEmpty(); i++) {
            list.remove(0);
        }
        return System.currentTimeMillis() - start;
    }
    // Удаление из середины (ArrayList, LinkedList)
    private static long getRunningTimeRemoveMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();
        int middle = list.size() / 2;
        for (int i = 0; i < 200000 && middle < list.size(); i++) {
            list.remove(middle);
        }
        return System.currentTimeMillis() - start;
    }

    // Удаление из конца (ArrayList, LinkedList, TreeSet)
    private static long getRunningTimeRemoveLast(Collection<Integer> collection) {
        long start = System.currentTimeMillis();
        if (collection instanceof List) {
            List<Integer> list = (List<Integer>) collection;
            for (int i = 0; i < 200000 && !list.isEmpty(); i++) {
                list.remove(list.size() - 1);
            }
        } else if (collection instanceof SortedSet) {
            SortedSet<Integer> set = (SortedSet<Integer>) collection;
            for (int i = 0; i < 200000 && !set.isEmpty(); i++) {
                set.remove(set.last());
            }
        }
        return System.currentTimeMillis() - start;
    }

    // Получение элемента по индексу (ArrayList, LinkedList, TreeSet)
    private static long getRunningTimeGet(Collection<Integer> collection) {
        long start = System.currentTimeMillis();
        if (collection instanceof List) {
            List<Integer> list = (List<Integer>) collection;
            for (int i = 0; i < 200000; i++) {
                list.get(i % list.size()); // Берём случайный индекс
            }
        } else if (collection instanceof SortedSet) {
            SortedSet<Integer> set = (SortedSet<Integer>) collection;
            for (int i = 0; i < 200000; i++) {
                set.contains(i);
            }
        }
        return System.currentTimeMillis() - start;
    }
}
package lab9.task08;

public class Main {
    public static void main(String[] args) {
        MyLinkedList listHead = new MyLinkedList();
        MyLinkedList listTail = new MyLinkedList();
        String[] values = {"Kirill", "Danil", "Denis", "Vlad", "Daniel"};
        System.out.println("Заполение списка с головы:");
        listHead.createHead(values);
        System.out.println(listHead.toString());
        System.out.println("Заполение списка с хвоста:");
        listTail.createTail(values);
        System.out.println(listTail.toString());
        System.out.println("Добавление элемента в начало списка:");
        listHead.addFirst("Victor");
        System.out.println(listHead.toString());
        System.out.println("Добавление элемента в конец списка:");
        listHead.addLast("Magnus");
        System.out.println(listHead.toString());
        System.out.println("Добавление элемента в указанное место списка:");
        listHead.insert(2, "Linkoln");
        System.out.println(listHead.toString());
        System.out.println("Удаление первого элемента из списка:");
        listHead.removeFirst();
        System.out.println(listHead.toString());
        System.out.println("Удаление последнего элемента из списка:");
        listHead.removeLast();
        System.out.println(listHead.toString());
        System.out.println("Удаление элемента по индексу из списка:");
        listHead.remove(3);
        System.out.println(listHead.toString());
        MyLinkedList listHeadRec = new MyLinkedList();
        System.out.println("Заполение списка с головы c помощью рекурсии:");
        listHeadRec.createHeadRec(values);
        System.out.println(listHeadRec.toString());
        MyLinkedList listTailRec = new MyLinkedList();
        System.out.println("Заполение списка с хвоста с помощью рекурсии:");
        listTailRec.createTailRec(values);
        System.out.println(listTailRec.toString());
        System.out.println("Вывод списка с помощью рекурсии:");
        System.out.println(listTailRec.toStringRec());
    }
}

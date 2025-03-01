package lab9.task08;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private Node tail;

    public void createHead(String[] values) {
        head = null;
        tail = null;
        for (String value : values) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        }
    }

    public void createHeadRec(String[] values) {
        Node newNode = new Node(values[0]);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        if (values.length > 1) {
            String newValue [] = Arrays.copyOfRange(values, 1, values.length);
            createHeadRec(newValue);
        }
        return;
    }

    public void createTail(String[] values) {
        head = null;
        tail = null;
        for (String value : values) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    public void createTailRec(String[] values) {
        Node newNode = new Node(values[0]);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        if (values.length > 1) {
            String newValue [] = Arrays.copyOfRange(values, 1, values.length);
            createTailRec(newValue);
        }
        return;
    }

    public void addFirst(String value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }

    public void addLast(String value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insert(int index, String value) {
        Node newNode = new Node(value);
        if (index == 0) {
            addFirst(value);
        }
        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            addLast(value);
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void removeFirst() {
        head = head.next;
    }

    public void removeLast() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void remove(int index) {
        Node current = head;
        int count = 0;
        while (count < index - 1) {
            current = current.next;
            count++;
        }
        current.next = current.next.next;
    }

    public String toString() {
        String result = "";
        Node current = head;
        while (current != null) {
            result += current.value + " -> ";
            current = current.next;
        }
        result += "null";
        return result;
    }

    public String toStringRec() {
        String result = "";
        Node current = head;
        if (current.next != null) {
            result += current.value + " -> ";
            head = current.next;
            result += toStringRec();
        } else {
            result = head.value + " -> " + "null";
        }
        return result;
    }
}

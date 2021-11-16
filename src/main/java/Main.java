import list.ArrayListManipulation;
import list.LinkedListManipulation;
import printer.Printer;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Input number of experiments:");
        int count = in.nextInt();
        var allOperations = new ArrayDeque<Integer>();
        for (int i = 0; i < count; i++) {
            System.out.println("Input number of operations for " + (i + 1) + " experiment");
            allOperations.add(in.nextInt());
        }

        Printer.separateLines();
        for (int i = 0; i < count; i++) {
            fillInsertRemoveStatistic(allOperations.pop());
        }
    }

    private static void fillInsertRemoveStatistic(int listSize) {
        LinkedListManipulation linkedList = new LinkedListManipulation();
        ArrayListManipulation arrayList = new ArrayListManipulation(listSize);

        // LinkedList.
        linkedList.fillLinkedList(listSize);
        Printer.separateLines();

        linkedList.removeElem(0);
        linkedList.removeElem(linkedList.linkedList.size() / 2);
        linkedList.removeElem(linkedList.linkedList.size() - 1);
        Printer.separateLines();

        linkedList.insertElem(0);
        linkedList.insertElem(linkedList.linkedList.size() / 2);
        linkedList.insertElem(linkedList.linkedList.size() - 1);
        Printer.separateLines();

        linkedList.getElem(0);
        linkedList.getElem(linkedList.linkedList.size() / 2);
        linkedList.getElem(linkedList.linkedList.size() - 1);
        Printer.separateLines();

        // ArrayList.
        arrayList.fillArrayList();
        Printer.separateLines();

        arrayList.removeElem(0);
        arrayList.removeElem(arrayList.arrayList.size() / 2);
        arrayList.removeElem(arrayList.arrayList.size() - 1);
        Printer.separateLines();

        arrayList.insertElem(0);
        arrayList.insertElem(arrayList.arrayList.size() / 2);
        arrayList.insertElem(arrayList.arrayList.size() - 1);
        Printer.separateLines();

        arrayList.getElem(0);
        arrayList.getElem(arrayList.arrayList.size() / 2);
        arrayList.getElem(arrayList.arrayList.size() - 1);
        Printer.separateLines();
    }
}
package list;

import printer.Printer;

import java.util.LinkedList;
import java.util.List;

public class LinkedListManipulation {
    public List<Integer> linkedList;

    public LinkedListManipulation() {
        this.linkedList = new LinkedList<>();
    }

    public void fillLinkedList(int listCount) {
        var startTime = System.currentTimeMillis();
        for(int i = 0; i < listCount; i++)
            this.linkedList.add(i);
        Printer.filledArrayMessage(System.currentTimeMillis() - startTime, listCount, this.linkedList);
    }

    public void removeElem(int index) {
        var startTime = System.currentTimeMillis();
        this.linkedList.remove(index);
        Printer.removeMessage(System.currentTimeMillis() - startTime, index, this.linkedList);
    }

    public void insertElem(int index) {
        var startTime = System.currentTimeMillis();
        this.linkedList.add(index,1);
        Printer.insertMessage(System.currentTimeMillis() - startTime, index, this.linkedList);
    }

    public void getElem(int index) {
        var startTime = System.currentTimeMillis();
        var item = this.linkedList.get(index);
        Printer.getMessage(System.currentTimeMillis() - startTime, index, this.linkedList);
    }
}

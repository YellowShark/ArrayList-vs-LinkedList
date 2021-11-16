package list;

import printer.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListManipulation {
    public List<Integer> arrayList;
    private final int listSize;

    public ArrayListManipulation(int listSize) {
        this.listSize = listSize;
        this.arrayList = new ArrayList<>(this.listSize);
    }

    public void fillArrayList() {
        var startTime = System.currentTimeMillis();
        for (int i = 0; i < this.listSize; i++)
            this.arrayList.add(new Random().nextInt(50000));
        Printer.filledArrayMessage(System.currentTimeMillis() - startTime, this.arrayList.size(), this.arrayList);
    }

    public void removeElem(int index) {
        var startTime = System.currentTimeMillis();
        this.arrayList.remove(index);
        Printer.removeMessage(System.currentTimeMillis() - startTime, index, this.arrayList);
    }

    public void insertElem(int index) {
        var startTime = System.currentTimeMillis();
        this.arrayList.add(index, 1);
        Printer.insertMessage(System.currentTimeMillis() - startTime, index, this.arrayList);
    }

    public void getElem(int index) {
        var startTime = System.currentTimeMillis();
        var item = this.arrayList.get(index);
        Printer.getMessage(System.currentTimeMillis() - startTime, index, this.arrayList);
    }
}
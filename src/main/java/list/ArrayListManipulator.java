package list;

import printer.Printer;
import timer.MyTimer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListManipulator {
    public List<Integer> arrayList;
    private final int listSize;
    private final MyTimer timer;

    public ArrayListManipulator(int listSize) {
        this.listSize = listSize;
        this.arrayList = new ArrayList<>(this.listSize);
        this.timer = new MyTimer();
    }

    public void fillArrayList() {
        var time = timer.calculateExecutionTime(() -> {
            for (int i = 0; i < this.listSize; i++)
                this.arrayList.add(i);
        });
        Printer.filledArrayMessage(time, this.arrayList.size(), this.arrayList);
    }

    public void removeElem(int index) {
        var time = timer.calculateExecutionTime(() -> {
            this.arrayList.remove(index);
        });
        Printer.removeMessage(time, index, this.arrayList);
    }

    public void insertElem(int index) {
        var time = timer.calculateExecutionTime(() -> {
            this.arrayList.add(index, 1);
        });
        Printer.insertMessage(time, index, this.arrayList);
    }

    public void getElem(int index) {
        var time = timer.calculateExecutionTime(() -> {
            var item = this.arrayList.get(index);
        });
        Printer.getMessage(time, index, this.arrayList);
    }
}
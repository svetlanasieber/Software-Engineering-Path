package CustomList_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    //void add(T element)
    public void add(T element) {
        this.elements.add(element);
    }

    //T remove(int index)
    public T remove(int index) {
        return this.elements.remove(index);
    }

    //boolean contains(T element)
    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    //void swap(int index, int index)
    public void swap(int index1, int index2) {
        Collections.swap(this.elements, index1, index2);
    }

    //int countGreaterThan(T element)
    public int countGreaterValues(T elementToCompare) {
        int count = 0;
        for (T element : this.elements) {
            int comparingResult = element.compareTo(elementToCompare);
            if (comparingResult > 0) {
                count++;
            }
        }
        return count;
    }

    //T getMax()
    public T getMax() {
        return Collections.max(this.elements);
    }

    //T getMin()
    public T getMin() {
        return Collections.min(this.elements);
    }

    public void sort() {
        Collections.sort(this.elements);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : this.elements) {
            sb.append(element.toString()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}

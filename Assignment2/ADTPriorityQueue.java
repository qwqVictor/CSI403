/**
 * Priority queue class implementation
 * 
 * @author Huang Kaisheng <2020215138@stu.cqupt.edu.cn>
 * @version 1.0
 */

import java.util.Comparator;
import java.util.List;

public class ADTPriorityQueue<T extends Comparable<T>> {
    private ADTHeap<T> heap;

    public ADTPriorityQueue() {
        this.heap = new ADTHeap<T>();
    }

    public ADTPriorityQueue(Comparator<T> comparator) {
        this.heap = new ADTHeap<T>(comparator);
    }

    public void insert(T value) {
        this.heap.insert(value);
    }

    public T delete() {
        return this.heap.delete();
    }

    public T top() {
        return this.heap.top();
    }

    public boolean isEmpty() {
        return this.heap.isEmpty();
    }

    public void sort(List<T> list) {
        this.heap.sort(list);
    }
}
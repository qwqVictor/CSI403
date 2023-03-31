
/**
* Heap class implementation
* @author Huang Kaisheng <2020215138@stu.cqupt.edu.cn>
* @version 1.0
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ADTHeap<T extends Comparable<T>> {
    private ArrayList<T> tree;
    private Comparator<T> comparator;

    /**
     * Default constructor
     */
    public ADTHeap() {
        this(null);
    }

    /**
     * Constructor with comparator
     * @param comparator Custom comparator
     */
    public ADTHeap(Comparator<T> comparator) {
        this.tree = new ArrayList<T>();
        this.comparator = comparator;
    }

    /**
     * Constructor with size
     * 
     * @param size Allocated size
     */
    public ADTHeap(int size) {
        this(size, null);
    }

    /**
     * Constructor with size and comparator
     * 
     * @param size Allocated size
     * @param comparator Custom comparator
     */
    public ADTHeap(int size, Comparator<T> comparator) {
        this.tree = new ArrayList<T>((1 << (int)(Math.log(size) / Math.log(2))) + 1);
        this.comparator = comparator;
    }

    /**
     * insert a new value into tree
     * @param value the value to be inserted
     */
    public void insert(T value) {
        this.tree.add(value);
        this.siftUp(this.tree.size() - 1);
    }

    /**
     * delete the root value from heap
     * @return the root value
     */
    public T delete() {
        T root = this.tree.get(0);
        T last = this.tree.get(this.tree.size() - 1);
        this.tree.set(0, last);
        this.tree.remove(this.tree.size() - 1);
        this.siftDown(0);
        return root;
    }

    /**
     * Maintain the heap property
     */
    public void heapify() {
        this.siftDown(0);
    }

    /**
     * Sort a list using this heap. Note all existing items will be CLEARED!!
     * @param list the list to be sorted
     */
    public void sort(List<T> list) {
        this.tree.clear();
        for (T value : list)
            this.insert(value);
        int i = 0;
        while (!this.isEmpty()) {
            list.set(i, this.delete());
            i++;
        }
    }

    /**
     * Get the top root
     * @return the root value
     */
    public T top() {
        return this.tree.get(0);
    }

    /**
     * Check whether the heap is empty
     * @return if the heap is empty
     */
    public boolean isEmpty() {
        return this.tree.isEmpty();
    }

    private boolean elementLessEqual(T a, T b) {
        if (this.comparator != null)
            return this.comparator.compare(a, b) <= 0;
        else
            return a.compareTo(b) < 0;
    }

    private int leftChild(int index) {
        return (index << 1) + 1;
    }

    private int rightChild(int index) {
        return (index << 1) + 2;
    }

    private int parent(int index) {
        return (index - 1) >> 1;
    }

    /**
     * sift up from the bottom
     * @param index to be sifted
     */
    private void siftUp(int index) {
        if (index == 0) return;
        T current = this.tree.get(index);
        T parent = this.tree.get(this.parent(index));
        if (!this.elementLessEqual(parent, current)) {
            this.tree.set(this.parent(index), current);
            this.tree.set(index, parent);
            this.siftUp(this.parent(index));
        }
    }

    /**
     * sift down from the top
     * 
     * @param index to be sifted
     */
    private void siftDown(int index) {
        int least = index;
        if (this.leftChild(index) < this.tree.size()
                && !this.elementLessEqual(this.tree.get(least), this.tree.get(this.leftChild(index)))) {
            least = this.leftChild(index);
        }
        if (this.rightChild(index) < this.tree.size()
                && !this.elementLessEqual(this.tree.get(least), this.tree.get(this.rightChild(index)))) {
            least = this.rightChild(index);
        }
        if (least != index) {
            T current = this.tree.get(index);
            T target = this.tree.get(least);
            this.tree.set(index, target);
            this.tree.set(least, current);
            this.siftDown(least);
        }
    }
}
import java.util.Comparator;

/**
 * Priority queue class implementation
 * 
 * @author Huang Kaisheng <2020215138@stu.cqupt.edu.cn>
 * @version 1.0
 */
public class ADTPriorityQueue<T extends Comparable<T>> {
    private ADTHeap<T> heap;

    public MyPriorityQueue() {
        this.heap = new ADTHeap<T>();
    }

    public MyPriorityQueue(Comparator<T> comparator) {
        this.heap = new ADTHeap<T>(comparator);
    }

    
}
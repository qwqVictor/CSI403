/**
* Heap node class implementation
* @author Huang Kaisheng <2020215138@stu.cqupt.edu.cn>
* @version 1.0
*/
public class ADTHeapNode<T> {
    private T value;
    private ADTHeapNode<T> left, right;

    public ADTHeapNode(T value) {
        this(value, null, null);
    }

    public ADTHeapNode(T value, ADTHeapNode<T> left, ADTHeapNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    /**
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * @return the left
     */
    public ADTHeapNode<T> getLeft() {
        return left;
    }

    /**
     * @return the right
     */
    public ADTHeapNode<T> getRight() {
        return right;
    }
}
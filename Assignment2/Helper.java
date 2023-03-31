/**
* Helper for testing purpose only
* @author Huang Kaisheng <2020215138@stu.cqupt.edu.cn>
* @version 1.0
*/
public class Helper {
    
    public static void start() {
        ADTHeap<Integer> a = new ADTHeap<Integer>();
        a.insert(2);
        a.insert(3);
        a.insert(5);
        a.insert(4);
        a.insert(7);
        while (!a.isEmpty()) {
            Integer x = a.delete();
            System.out.println(x);
        }
    }
}
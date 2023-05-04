/**
* Command line entry for testing purpose only
* @author Huang Kaisheng <2020215138@stu.cqupt.edu.cn>
* @version 1.0
*/
public class Test {
    public static void main(String[] args) {
        int vertexMax = 5;
        String graphData = "1 2 45\n1 5 20\n2 3 70\n2 4 60\n2 5 120\n3 4 30\n4 5 220";
        Helper.start(vertexMax, graphData, true);
    }
}
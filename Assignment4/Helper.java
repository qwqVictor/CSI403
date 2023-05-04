/**
* Helper for testing purpose only
* @author Huang Kaisheng <2020215138@stu.cqupt.edu.cn>
* @version 1.0
*/

public class Helper {
    public static void start(int vertexMax, String graphData, boolean undirected) {
        ADTGraph<Integer> graph = new ADTGraph<Integer>();
        for (int i = 1; i <= vertexMax; i++) {
            graph.addVertex(i);
        }
        for (String edgeString : graphData.split("\n")) {
            String[] edgeComponents = edgeString.split(" ");
            int s = Integer.parseInt(edgeComponents[0]);
            int t = Integer.parseInt(edgeComponents[1]);
            int w = Integer.parseInt(edgeComponents[2]);
            graph.addEdge(s, t, w);
            if (undirected)
                graph.addEdge(t, s, w);
        }
        ADTGraph<Integer>.ADTGraphIterator<Integer> gIterator = graph.new ADTGraphIterator<Integer>(graph.getVertex(1));
        while (gIterator.hasNext()) {
            System.out.println(gIterator.next());
        }
    }
}
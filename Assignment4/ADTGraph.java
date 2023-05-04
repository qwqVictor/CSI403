
/**
 * Graph class implementation
 * 
 * @author Huang Kaisheng <2020215138@stu.cqupt.edu.cn>
 * @version 1.0
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * Graph class implementation
 * This class represents a graph using an adjacency list representation.
 * @param <T> the type of value stored in the vertices of the graph
 */
public class ADTGraph<T extends Comparable<T>> {

    /**
     * A map of vertices in the graph, keyed by their value.
     */
    TreeMap<T, Vertex<T>> vertices;

    /**
     * Constructs a new empty graph.
     */
    public ADTGraph() {
        this.vertices = new TreeMap<T, Vertex<T>>();
    }

    /**
     * Adds a vertex to the graph.
     * 
     * @param v the vertex to add
     */
    public void addVertex(Vertex<T> v) {
        this.vertices.put(v.value, v);
    }

    /**
     * Adds a vertex with the given value to the graph.
     * 
     * @param x the value of the new vertex to add
     */
    public void addVertex(T x) {
        Vertex<T> v = new Vertex<T>(x);
        this.vertices.put(x, v);
    }

    /**
     * Adds an edge to the graph.
     * 
     * @param e the edge to add
     */
    public void addEdge(Edge<T> e) {
        e.start.addEdge(e);
    }

    /**
     * Adds an edge between two vertices in the graph with the given weight.
     * 
     * @param u one endpoint of the edge
     * @param v the other endpoint of the edge
     * @param w the weight of the edge
     */
    public void addEdge(Vertex<T> u, Vertex<T> v, Integer w) {
        Edge<T> e = new Edge<T>(u, v, w);
        this.addEdge(e);
    }

    /**
     * Adds an unweighted edge between two vertices in the graph.
     * 
     * @param u one endpoint of the edge
     * @param v the other endpoint of the edge
     */
    public void addEdge(T u, T v) {
        this.addEdge(u, v, null);
    }

    /**
     * Adds a weighted edge between two vertices in the graph.
     * 
     * @param u one endpoint of the edge
     * @param v the other endpoint of the edge
     * @param w the weight of the edge
     */
    public void addEdge(T u, T v, Integer w) {
        Vertex<T> vU = this.vertices.get(u);
        Vertex<T> vV = this.vertices.get(v);
        this.addEdge(vU, vV, w);
    }

    /**
     * Returns the vertex in the graph with the given value.
     * 
     * @param value the value of the vertex to retrieve
     * @return the vertex with the given value, or null if no such vertex exists
     */
    public Vertex<T> getVertex(T value) {
        return this.vertices.get(value);
    }

    /**
     * An implementation of the Iterator interface that can be used to traverse the
     * graph in a breadth-first search order.
     * 
     * @param <T> the type of value stored in the vertices of the graph
     */
    public class ADTGraphIterator<T extends Comparable<T>> implements Iterator<Vertex<T>> {
        private TreeMap<Vertex<T>, Boolean> visited;
        private LinkedList<Vertex<T>> queue;

        /**
         * Constructs a new iterator starting at the given root vertex.
         * 
         * @param root the vertex at which to start the traversal
         */
        public ADTGraphIterator(Vertex<T> root) {
            this.visited = new TreeMap<Vertex<T>, Boolean>();
            this.queue = new LinkedList<Vertex<T>>();
            this.queue.add(root);
            this.visited.put(root, true);
        }

        /**
         * Returns true if there are more vertices to be visited in the traversal.
         * 
         * @return true if there are more vertices to be visited, false otherwise
         */
        public boolean hasNext() {
            return !queue.isEmpty();
        }

        /**
         * Returns the next vertex in the breadth-first search traversal of the graph.
         * 
         * @return the next visited vertex
         */
        public Vertex<T> next() {
            Vertex<T> node = queue.poll();
            List<Edge<T>> adj = node.edges;
            for (int i = 0; i < adj.size(); i++) {
                Vertex<T> neighbor = adj.get(i).end;
                if (!(visited.get(neighbor) != null && visited.get(neighbor))) {
                    visited.put(neighbor, true);
                    queue.add(neighbor);
                }
            }
            return node;
        }
    }
}
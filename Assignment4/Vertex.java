/**
 * Vertex class implementation
 * 
 * @author Huang Kaisheng <2020215138@stu.cqupt.edu.cn>
 * @version 1.0
 */

import java.util.ArrayList;
/**
 * This class represents a vertex in a graph, which holds a certain value and a list of adjacent edges.
 * It implements the Comparable interface to compare vertices based on their values. 
 * @param <T> the type of the value to be held by the vertex
 */
public class Vertex<T extends Comparable<T>> implements Comparable<Vertex<T>> {

    T value; // the value held by this vertex
    ArrayList<Edge<T>> edges; // the list of neighboring edges of this vertex

    /**
     * Constructs a new Vertex object with the given value and an empty list of
     * edges.
     * 
     * @param value the value to be held by the vertex
     */
    public Vertex(T value) {
        this.value = value;
        this.edges = new ArrayList<Edge<T>>();
    }

    /**
     * Adds a new edge to the list of neighboring edges of this vertex.
     * 
     * @param e the edge to be added
     */
    public void addEdge(Edge<T> e) {
        this.edges.add(e);
    }

    /**
     * Constructs a new Vertex object with a null value and an empty list of edges.
     */
    public Vertex() {
        this(null);
    }

    /**
     * Returns a string representation of this Vertex object.
     * 
     * @return a string representation of this Vertex object
     */
    public String toString() {
        return "(" + value.toString() + ")";
    }

    /**
     * Compares this Vertex object with the specified Vertex object based on their
     * values.
     * 
     * @param that the Vertex object to be compared
     * @return a negative integer, zero, or a positive integer as this Vertex object
     *         is less than, equal to, or greater than the specified Vertex object
     */
    public int compareTo(Vertex<T> that) {
        return this.value.compareTo(that.value);
    }
}
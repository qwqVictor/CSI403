/**
 * Edge class implementation
 * 
 * @author Huang Kaisheng <2020215138@stu.cqupt.edu.cn>
 * @version 1.0
 */

/**
 * Represents a weighted edge between two vertices in a graph.
 * 
 * @param <T> the type of values stored in the vertices
 */
public class Edge<T extends Comparable<T>> {

    /**
     * The starting vertex of the edge.
     */
    Vertex<T> start;

    /**
     * The ending vertex of the edge.
     */
    Vertex<T> end;

    /**
     * The weight (cost) of the edge.
     */
    Integer weight;

    /**
     * Creates an edge with a weight of null.
     * 
     * @param start the starting vertex of the edge
     * @param end   the ending vertex of the edge
     */
    public Edge(Vertex<T> start, Vertex<T> end) {
        this(start, end, null);
    }

    /**
     * Creates an edge with a given weight.
     * 
     * @param start  the starting vertex of the edge
     * @param end    the ending vertex of the edge
     * @param weight the weight of the edge
     */
    public Edge(Vertex<T> start, Vertex<T> end, Integer weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    /**
     * Returns the starting vertex of the edge.
     * 
     * @return the starting vertex of the edge
     */
    public Vertex<T> getStart() {
        return this.start;
    }

    /**
     * Returns the ending vertex of the edge.
     * 
     * @return the ending vertex of the edge
     */
    public Vertex<T> getEnd() {
        return this.end;
    }

    /**
     * Returns the weight of the edge.
     * 
     * @return the weight of the edge
     */
    public Integer getWeight() {
        return this.weight;
    }

    /**
     * Sets the starting vertex of the edge.
     * 
     * @param start the new starting vertex of the edge
     */
    public void setStart(Vertex<T> start) {
        this.start = start;
    }

    /**
     * Sets the ending vertex of the edge.
     * 
     * @param end the new ending vertex of the edge
     */
    public void setEnd(Vertex<T> end) {
        this.start = end;
    }

    /**
     * Sets the weight of the edge.
     * 
     * @param weight the new weight of the edge
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * Determines if two edges are equal.
     * 
     * @param that the other edge to compare to
     * @return true if both edges have the same starting vertex, ending vertex, and
     *         weight; false otherwise
     */
    public boolean equals(Edge<T> that) {
        return (this.start == that.start) && (this.end == that.end) && (this.weight.equals(that.weight));
    }

    /**
    * Returns a string representation of the edge.
    * @return a string representing the edge in the format "startVertex ===weight==> endVertex"
    */
    public String toString() {
        return (this.start.toString() + " ===" + this.weight.toString() + "==> " + this.end.toString());
    }
}
package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    Graph graph;
    @Before
    public void setup(){

        graph = new Graph();

    }

    @Test
    public void addNodes() {

        graph.addNodes(10);

    }

    @Test
    public void addEdge() {

        graph.addNodes(4);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(3,0);
        graph.bfs(1);
    }
}
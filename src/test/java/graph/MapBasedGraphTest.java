package graph;

import org.junit.Before;
import org.junit.Test;

public class MapBasedGraphTest {

    MapBasedGraph mapBasedGraph;
    @Before
    public void setup(){

        mapBasedGraph = new MapBasedGraph();

    }

    @Test
    public void addNodes() {

        mapBasedGraph.addNodes(10);

    }

    @Test
    public void addEdge() {

        mapBasedGraph.addNodes(4);
        mapBasedGraph.addEdge(0,2);
        mapBasedGraph.addEdge(1,2);
        mapBasedGraph.addEdge(1,3);
        mapBasedGraph.addEdge(3,0);
        mapBasedGraph.bfs(1);
        mapBasedGraph.dfs(1);
    }
}

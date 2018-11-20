package graph;

import java.util.Map;
import java.util.Set;

public class Node {

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public Map<Integer, Node> getConnectedNodes() {
        return connectedNodes;
    }

    public void setConnectedNodes(Map<Integer, Node> connectedNodes) {
        this.connectedNodes = connectedNodes;
    }

    Node(int nodeId){
        this.nodeId = nodeId;
    }
    int nodeId;
    Map<Integer,Node> connectedNodes;


}

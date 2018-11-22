package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MapBasedGraph {


    Map<Integer,Node> graph = new HashMap<>();

    public void addNodes(Integer n){


        for(int i = 0;i<n;i++){

            graph.put(i,new Node(i));
        }

    }

    public void addEdge(Integer nodeId,Integer nodeId2){

        if(graph.get(nodeId).getConnectedNodes()!=null)
        {
            graph.get(nodeId).getConnectedNodes().put(nodeId2,graph.get(nodeId2));
        }
        else
        {
            Map<Integer,Node> map  =  new HashMap<>();
            map.put(nodeId2,graph.get(nodeId2));
            graph.get(nodeId).setConnectedNodes(map);
        }

    }

    public void bfs(Integer source){

        boolean visited[] = new boolean[graph.size()];
        LinkedList<Integer> visitQueue = new LinkedList();

        visitQueue.offer(source);
        visited[source] = true;
        while (!visitQueue.isEmpty()){

           Integer nodeId =  visitQueue.poll();

           System.out.print(nodeId + " ");

            Map<Integer, Node> connectedNodes = graph.get(nodeId).getConnectedNodes();
            if(connectedNodes==null)continue;
            for(Integer nodekey : connectedNodes.keySet()){

                if(!visited[nodekey]){

                    visited[nodekey] = true;
                    visitQueue.offer(nodekey);
                }

           }

        }




    }

    public void dfs(Integer source) {

        boolean visited[] = new boolean[graph.size()];
        LinkedList<Integer> visitQueue = new LinkedList();

        visited[source] = true;
        visitQueue.push(source);

        while (!visitQueue.isEmpty()) {

            Integer nodeId = visitQueue.pop();
            System.out.print(nodeId + " ");

            Map<Integer, Node> connectedNodes = graph.get(nodeId).getConnectedNodes();
            if (connectedNodes == null) continue;
            for (Integer nodekey : connectedNodes.keySet()) {

                if (!visited[nodekey]) {

                    visited[nodekey] = true;
                    visitQueue.push(nodekey);
                }

            }

        }
    }

        public void shortestPath(Integer source) {

            boolean visited[] = new boolean[graph.size()];
            LinkedList<Integer> visitQueue = new LinkedList();

            visitQueue.offer(source);
            visited[source] = true;
            while (!visitQueue.isEmpty()) {

                Integer nodeId = visitQueue.poll();

                System.out.print(nodeId + " ");

                Map<Integer, Node> connectedNodes = graph.get(nodeId).getConnectedNodes();
                if (connectedNodes == null) continue;
                for (Integer nodekey : connectedNodes.keySet()) {

                    if (!visited[nodekey]) {

                        visited[nodekey] = true;
                        visitQueue.offer(nodekey);
                    }

                }

            }

        }

}

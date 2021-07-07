package Djikstra;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ShortestPath {
    private WeightedGraph graph;

    ShortestPath(WeightedGraph graph) {
        this.graph = graph;
    }

    private Node getLowestDistanceNode(Set<Node> unsettledNodes){
        Integer smallestDistance = Integer.MAX_VALUE;
        Node smallestDistanceNode = null;
        for(Node node: unsettledNodes){
            if(node.getDistance() < smallestDistance){
                smallestDistance = node.getDistance();
                smallestDistanceNode = node;
            }
        }
        return smallestDistanceNode;
    }

    private void calculateMinimumDistance(Node evaluationNode, Integer edgeWeight, Node sourceNode) {

    }

    public WeightedGraph getShortestPath(Node source){
        source.setDistance(0);
        Set<Node> settled = new HashSet<>();
        Set<Node> unSettled = new HashSet<>();
        unSettled.add(source);
        while (unSettled.size() != 0) {
            Node current = getLowestDistanceNode(unSettled);
            unSettled.remove(current);
            for (Map.Entry<String, Integer> friends : current.getFriends().entrySet()) {

            }
        }
        return null;
    }
}
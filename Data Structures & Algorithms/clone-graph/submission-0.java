/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> cloneMap = new HashMap<Node, Node>();

        return dfs(node, cloneMap);  
    }

    public Node dfs(Node node, Map<Node, Node> cloneMap) {
        if (cloneMap.containsKey(node)) {
            return cloneMap.get(node);
        }
        Node clonedNode = new Node(node.val);

        cloneMap.put(node, clonedNode);

        for (Node neighbor: node.neighbors) {
            Node clonedNeighbor = dfs(neighbor, cloneMap);
            clonedNode.neighbors.add(clonedNeighbor);
        }

        return clonedNode;
    }

}
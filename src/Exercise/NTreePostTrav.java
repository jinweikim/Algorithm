package Exercise;

import org.w3c.dom.Node;

import java.util.*;

public class NTreePostTrav {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public static void main(String[] args){


    }

    public void solution(Node root){
        List<Integer> res = new ArrayList<>();
        List<Node> curr = new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        while( !s1.isEmpty() ){
            Node node = s1.pop();
            curr = node.children;
            s2.push(node);
            for(Node n: curr){ //孩子入栈
                if(n != null){
                    s2.push(n);
                }
            }
        }

        while( !s2.isEmpty()){
            Node node = s2.pop();
            res.add(node.val);
        }
    }


}

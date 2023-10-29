package Stack.LinkedListStack;

public class NodeManager {
    Node top;

    public NodeManager(){
        this.top = null;
    }
    public void push(int data){
        Node node =  new Node(data);
        node.linkNode(top);
        top = node;
    }

    public void pop(){
        top = top.getNextNode(); // 현재 top이 가리키고 있는 노드를 가리키게 함
    }

    public int peek(){
        return top.getData();
    }

}

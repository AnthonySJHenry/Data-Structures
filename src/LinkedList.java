public class LinkedList {

    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        if(this.head == null){
            this.head = new Node(data);
        }
        else{
            Node currentHead = new Node(data);
            currentHead.setNextNode(this.head);
            this.head = currentHead;
        }
    }

    public void addToTail(String data){
        Node currentHead = this.head;
        if (currentHead == null){
            this.addToHead(data);
        }
        else {
            while (currentHead.getNextNode() != null) {
                currentHead = currentHead.getNextNode();
            }
            currentHead.setNextNode(new Node(data));
        }
    }

    public String removeHead(){
        if(this.head == null){
            return null;
        }
        else{
            Node currentHead = this.head;
            this.head = this.head.getNextNode();
            return "Removed " + currentHead.data;
        }
    }

    public String removeTail(){
        if(this.head == null){
            return null;
        }
        else {
            Node currentHead = this.head;
            while(currentHead.getNextNode().getNextNode() != null){
                currentHead = currentHead.getNextNode();
            }
            String data = currentHead.getNextNode().data;
            currentHead.setNextNode(null);
            return "Removed " + data;
        }
    }

    public String toString(){
        String list = "<head> ";
        if(this.head == null){
            return null;
        }
        else{
            Node currentHead = this.head;
            while(currentHead != null){
                list += currentHead.data + " ";
                currentHead = currentHead.getNextNode();
            }
        }
        list += "<tail>\n";
        return list;
    }


}
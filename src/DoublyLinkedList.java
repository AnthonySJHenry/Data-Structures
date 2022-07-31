public class DoublyLinkedList<E> {
    Node head;
    Node tail;
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void addToHead(String data){
        if(this.head == null){
            this.head = new Node(data);
        }
        else if(this.tail == null){
            this.tail = this.head;
            this.head = new Node(data);
            this.head.setNextNode(this.tail);
            this.tail.setPrevNode(this.head);
        }
        else{
            Node currentHead = this.head;
            this.head = new Node(data);
            this.head.setNextNode(currentHead);
            currentHead.setPrevNode(this.head);
        }
    }

    public void addToTail(String data){
        if(this.head == null){
            this.head = new Node(data);
        }
        else if(this.tail == null){
            this.tail = new Node(data);
            this.head.setNextNode(this.tail);
            this.tail.setPrevNode(this.head);
        }
        else{
            Node currentTail = this.tail;
            this.tail = new Node(data);
            currentTail.setNextNode(this.tail);
            this.tail.setPrevNode(currentTail);
        }
    }

    public String removeHead(){
        String data = "";
        if(this.head == null){
            return null;
        }
        data = this.head.data;
        this.head = this.head.getNextNode();
        this.head.setPrevNode(null);
        return data;
    }

    public String removeTail(){
        String data = "";
        if(this.head == null || this.tail == null){
            return null;
        }
        data = this.tail.data;
        this.tail = this.tail.getPrevNode();
        this.tail.setNextNode(null);
        return data;

    }

    public Boolean remove(E str){
        if(str == this.head.data){
            this.removeHead();
            return true;
        }
        else if(str == this.tail.data){
            this.removeTail();
            return true;
        }
        Node currentHead = this.head.getNextNode();
        while(currentHead != null){
            if(currentHead.data == str){
                currentHead.getPrevNode().setNextNode(currentHead.getNextNode());
                currentHead.getNextNode().setPrevNode(currentHead.getPrevNode());
                return true;
            }
            currentHead = currentHead.getNextNode();
        }
        return false;
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

//    public static void main(String []args) {
//        DoublyLinkedList<String> names = new DoublyLinkedList();
//
//        names.addToTail("David");
//        names.addToTail("Emily");
//        names.addToTail("Igor");
//        names.addToTail("Kate");
//        names.addToTail("Ricky");
//        names.addToHead("Anna");
//        names.addToHead("Alex");
//        names.addToHead("Adele");
//        names.addToTail("Sally");
//
//        System.out.println(names);
//        names.removeTail();
//        names.removeHead();
//        System.out.println(names);
//        names.remove("Emily");
//        System.out.println(names);
//
//    }

}

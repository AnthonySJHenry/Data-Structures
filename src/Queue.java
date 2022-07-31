public class Queue {
    public LinkedList queue;
    public int size;
    public int max = Integer.MAX_VALUE;

    public Queue(){
      this.queue = new LinkedList();
      this.size = 0;
    }

    public Queue(int max_val){
        this.queue = new LinkedList();
        this.size = 0;
        this.max = max_val;
    }

    public void enqueue(String data){
        if (this.hasSpace()){
            this.queue.addToTail(data);
            this.size++;
        }
        else {
            System.out.println("Error: Queue FULL! Could not add Node: "+data);
        }

    }

    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }
        return false;
    }

    public boolean hasSpace(){
        if (this.size < this.max){
            return true;
        }
        return false;
    }

    public String dequeue(){
        if (this.isEmpty()){
            return "Error: Queue is EMPTY! No data to remove. Operation aborted.";
        }
        String data = this.queue.removeHead();
        this.size--;
        return data;
    }

    public String peek(){
        return "Front of queue: "+this.queue.head.data;
    }

//    public static void main(String[] args) {
//        Queue q = new Queue(5);
//        System.out.println(q.dequeue());
//        q.enqueue("Anthony");
//        q.enqueue("Crystal");
//        q.enqueue("Evan");
//        q.enqueue("Gloria");
//        q.enqueue("Isaiah");
//        q.enqueue("Kim");
//        System.out.println(q.peek()+"\n"+q.dequeue()+"\n"+q.peek());
//    }
}

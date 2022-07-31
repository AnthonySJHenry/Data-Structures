public class Stack {
    LinkedList stack;
    int size;
    int max = Integer.MAX_VALUE;

    public Stack(){
        this.stack = new LinkedList();
        this.size = 0;
    }

    public Stack(int maxVal){
        this.stack = new LinkedList();
        this.max = maxVal;
        this.size = 0;
    }

    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }
        return false;
    }

    public boolean hasSpace(){
        if(this.size < this.max) {
            return true;
        }
        return false;
    }

    public void push(String data){
        if(this.hasSpace()){
            this.stack.addToHead(data);
            this.size++;
        }
        else {
            System.out.println("Error: Stack Overflow! Could not add Node: "+data);
        }
    }

    public String pop(){
        if(this.isEmpty()){
            return ("Error: Stack EMPTY! No data to be removed (Operation aborted).");
        }
        else {
            this.size--;
            return this.stack.removeHead();
        }
    }

    public String peek(){
        if(this.isEmpty()){
            return ("Error: Stack EMPTY! No data to peak (Operation aborted).");
        }
        return this.stack.head.data;
    }

    public static void main(String[] args) {
        Stack s = new Stack(3);
        System.out.println(s.pop()+"\n"+ s.peek());
        s.push("Anthony");
        s.push("Brenda");
        System.out.println(s.peek());
        s.push("Charles");
        System.out.println(s.pop());
        s.push("Diana");
        System.out.println(s.peek());
        s.push("Elijah");

    }
}

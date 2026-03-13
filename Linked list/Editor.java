class Editor{
    class Node{
        String text;
        Node prev,next;
        Node(String t){text=t;}
    }
    Node current;
    int size=0,limit=10;

    void type(String t){
        Node n=new Node(t);
        if(current!=null){
            current.next=n;
            n.prev=current;
        }
        current=n;
        size++;
    }

    void undo(){
        if(current!=null && current.prev!=null)
            current=current.prev;
    }

    void redo(){
        if(current!=null && current.next!=null)
            current=current.next;
    }

    void show(){
        if(current!=null)System.out.println(current.text);
    }
}

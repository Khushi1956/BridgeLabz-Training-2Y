class RoundRobin{
    class Node{
        int id,burst;
        Node next;
        Node(int i,int b){id=i;burst=b;}
    }
    Node head;

    void add(int id,int b){
        Node n=new Node(id,b);
        if(head==null){head=n;n.next=head;return;}
        Node t=head;
        while(t.next!=head)t=t.next;
        t.next=n; n.next=head;
    }

    void execute(int quantum){
        if(head==null)return;
        Node t=head,prev=null;
        do{
            t.burst-=quantum;
            if(t.burst<=0){
                if(prev!=null)prev.next=t.next;
                if(t==head)head=t.next;
            }else prev=t;
            t=t.next;
        }while(t!=head);
    }
}

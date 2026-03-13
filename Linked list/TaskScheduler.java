class TaskScheduler{
    class Node{
        int id,priority;
        String name,date;
        Node next;
        Node(int i,String n,int p,String d){id=i;name=n;priority=p;date=d;}
    }
    Node head;

    void addEnd(int i,String n,int p,String d){
        Node nn=new Node(i,n,p,d);
        if(head==null){head=nn;nn.next=head;return;}
        Node t=head;
        while(t.next!=head)t=t.next;
        t.next=nn;
        nn.next=head;
    }

    void delete(int id){
        if(head==null)return;
        Node t=head,prev=null;
        do{
            if(t.id==id){
                if(prev!=null)prev.next=t.next;
                if(t==head)head=t.next;
                return;
            }
            prev=t;
            t=t.next;
        }while(t!=head);
    }

    void nextTask(){
        if(head!=null)head=head.next;
    }

    void display(){
        if(head==null)return;
        Node t=head;
        do{
            System.out.println(t.id+" "+t.name);
            t=t.next;
        }while(t!=head);
    }

    void searchPriority(int p){
        Node t=head;
        if(t==null)return;
        do{
            if(t.priority==p) System.out.println(t.name);
            t=t.next;
        }while(t!=head);
    }
}

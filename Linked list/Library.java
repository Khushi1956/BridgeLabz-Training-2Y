class Library{
    class Node{
        String title,author,genre,status;
        int id;
        Node next,prev;
        Node(String t,String a,String g,int i,String s){title=t;author=a;genre=g;id=i;status=s;}
    }
    Node head,tail;

    void addEnd(String t,String a,String g,int i,String s){
        Node n=new Node(t,a,g,i,s);
        if(head==null){head=tail=n;return;}
        tail.next=n; n.prev=tail; tail=n;
    }

    void delete(int id){
        Node t=head;
        while(t!=null && t.id!=id)t=t.next;
        if(t==null)return;
        if(t.prev!=null)t.prev.next=t.next; else head=t.next;
        if(t.next!=null)t.next.prev=t.prev; else tail=t.prev;
    }

    void searchTitle(String title){
        for(Node t=head;t!=null;t=t.next)
            if(t.title.equals(title))System.out.println(t.author);
    }

    void updateStatus(int id,String s){
        for(Node t=head;t!=null;t=t.next)
            if(t.id==id)t.status=s;
    }

    int count(){
        int c=0;
        for(Node t=head;t!=null;t=t.next)c++;
        return c;
    }
}

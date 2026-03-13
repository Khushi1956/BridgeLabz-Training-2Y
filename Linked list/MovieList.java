class MovieList{
    class Node{
        String title,director;
        int year;
        double rating;
        Node next,prev;
        Node(String t,String d,int y,double r){title=t;director=d;year=y;rating=r;}
    }
    Node head,tail;

    void addEnd(String t,String d,int y,double r){
        Node n=new Node(t,d,y,r);
        if(head==null){head=tail=n;return;}
        tail.next=n;
        n.prev=tail;
        tail=n;
    }

    void delete(String title){
        Node t=head;
        while(t!=null && !t.title.equals(title))t=t.next;
        if(t==null)return;
        if(t.prev!=null)t.prev.next=t.next; else head=t.next;
        if(t.next!=null)t.next.prev=t.prev; else tail=t.prev;
    }

    void searchDirector(String d){
        for(Node t=head;t!=null;t=t.next)
            if(t.director.equals(d))
                System.out.println(t.title);
    }

    void displayForward(){
        for(Node t=head;t!=null;t=t.next)
            System.out.println(t.title);
    }

    void displayReverse(){
        for(Node t=tail;t!=null;t=t.prev)
            System.out.println(t.title);
    }

    void updateRating(String title,double r){
        for(Node t=head;t!=null;t=t.next)
            if(t.title.equals(title)) t.rating=r;
    }
}

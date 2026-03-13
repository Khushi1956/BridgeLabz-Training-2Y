class Inventory{
    class Node{
        String name;
        int id,qty;
        double price;
        Node next;
        Node(String n,int i,int q,double p){name=n;id=i;qty=q;price=p;}
    }
    Node head;

    void add(String n,int i,int q,double p){
        Node nn=new Node(n,i,q,p);
        nn.next=head;
        head=nn;
    }

    void delete(int id){
        Node t=head,prev=null;
        while(t!=null && t.id!=id){prev=t;t=t.next;}
        if(t==null)return;
        if(prev==null)head=t.next;
        else prev.next=t.next;
    }

    void updateQty(int id,int q){
        for(Node t=head;t!=null;t=t.next)
            if(t.id==id)t.qty=q;
    }

    void search(String name){
        for(Node t=head;t!=null;t=t.next)
            if(t.name.equals(name))System.out.println(t.id);
    }

    double totalValue(){
        double sum=0;
        for(Node t=head;t!=null;t=t.next)
            sum+=t.qty*t.price;
        return sum;
    }
}

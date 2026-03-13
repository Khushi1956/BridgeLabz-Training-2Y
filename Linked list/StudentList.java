class StudentList {
    class Node {
        int roll, age;
        String name, grade;
        Node next;
        Node(int r,String n,int a,String g){roll=r;name=n;age=a;grade=g;}
    }
    Node head;

    void addBeg(int r,String n,int a,String g){
        Node n1=new Node(r,n,a,g);
        n1.next=head;
        head=n1;
    }

    void addEnd(int r,String n,int a,String g){
        Node n1=new Node(r,n,a,g);
        if(head==null){head=n1;return;}
        Node t=head;
        while(t.next!=null)t=t.next;
        t.next=n1;
    }

    void addPos(int pos,int r,String n,int a,String g){
        if(pos==1){addBeg(r,n,a,g);return;}
        Node t=head;
        for(int i=1;i<pos-1 && t!=null;i++) t=t.next;
        if(t==null)return;
        Node n1=new Node(r,n,a,g);
        n1.next=t.next;
        t.next=n1;
    }

    void delete(int roll){
        if(head==null)return;
        if(head.roll==roll){head=head.next;return;}
        Node t=head;
        while(t.next!=null && t.next.roll!=roll) t=t.next;
        if(t.next!=null)t.next=t.next.next;
    }

    Node search(int roll){
        Node t=head;
        while(t!=null){
            if(t.roll==roll)return t;
            t=t.next;
        }
        return null;
    }

    void updateGrade(int roll,String g){
        Node s=search(roll);
        if(s!=null)s.grade=g;
    }

    void display(){
        Node t=head;
        while(t!=null){
            System.out.println(t.roll+" "+t.name+" "+t.age+" "+t.grade);
            t=t.next;
        }
    }
}

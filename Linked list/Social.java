class Social{
    class FriendNode{
        int id;
        FriendNode next;
        FriendNode(int i){id=i;}
    }
    class User{
        int id,age;
        String name;
        FriendNode friends;
        User next;
        User(int i,String n,int a){id=i;name=n;age=a;}
    }
    User head;

    User findUser(int id){
        for(User u=head;u!=null;u=u.next)
            if(u.id==id)return u;
        return null;
    }

    void addFriend(int u1,int u2){
        User a=findUser(u1), b=findUser(u2);
        if(a==null||b==null)return;
        FriendNode f=new FriendNode(u2);
        f.next=a.friends;
        a.friends=f;
    }
}

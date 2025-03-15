class node{
    int data;
    node next;
    public node(int data){
        this.data=data;
    }
}
class LDE{
    public static node head;
    public static void createLL(int num){
        node newnode = new node(num);
        node temp=head;
        if(head==null){
            head=newnode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public static void enddeletion(){
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void display(){
        node temp=head;
        if(head==null){
            System.out.print("no LL");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
class enddeletion{
    public static void main(String[] args) {
        LDE.createLL(1);
        LDE.createLL(2);
        LDE.createLL(3);
        LDE.createLL(4);
        LDE.createLL(5);
        System.out.println("orginal list");
        LDE.display();
        LDE.enddeletion();
        System.out.println("after deletion");
    LDE.display();
    }

}
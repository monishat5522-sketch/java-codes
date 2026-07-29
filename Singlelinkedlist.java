class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Main{
    static node head;
    static void insertEnd (int data)
    {
        node newnode=new node(data);
        if (head==null)
        {
            head=newnode;
            return;
        }
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    static void insertbeg(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            newnode=head;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    static void deletefirst()
    {
        if(head!=null)
        {
            head=head.next;
        }
    }
    static void deleteend(){
        if(head==null)
        {
            System.out.println("list is empty");
        }
        node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    static void search(int d)
    {
        node temp=head;
        while(temp!=null)
        {
            if (temp.data==d){
                System.out.println(d+"Element found");
                return;
            }
            temp=temp.next;
        }
        System.out.println(d+" "+"Element not found");
    }
    static void display(){
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[]args){
        System.out.println("Insert at beginning:");
        insertEnd(10);
         insertEnd(20);
        insertEnd(30);
          display();
          System.out.println();
          System.out.println("Insert At end:");
          insertbeg(50);
          insertbeg(60);
          display();
          System.out.println();
          System.out.println("Delete At beginning:");
          deletefirst();
          display();
          System.out.println();
          System.out.println("Delete At end:");
          deleteend();
          display();
          System.out.println();
          search(20);
    }
    }

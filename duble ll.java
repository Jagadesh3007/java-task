import java.util.*;
 public class m{
    class Node{
        int data;
        Node prev;
        Node next;
    
    public Node(int data){
        this.data=data;
    }
}

    Node head,tail=null;
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            head.prev=null;
            tail.next=null;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
            
        }
    }
    public void display(){
       Node current=head;
        if(head==null){
            System.out.println("list empty");
        }
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String args[]){
        m li=new m();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.display();
   }
}

import java.util.Scanner;
public class SingleLinedList{
    static Node head=null;
    static Node tail=null;
    
    public static Node create(Node start){
        start=new Node(99,20);
        Node p=new Node(100,21);
        Node q=new Node(101,22);
        start.next=p;
        p.next=q;
        q.prev=p;
        return start;
    }
    public static Node display(Node start){
        Node temp=start;
        while(temp!=null){
            System.out.println("("+temp.reg_no+","+temp.marks+")");
            temp=temp.next;
        }
        System.out.println();
        return start;
    }
    public static Node InsBeg(Node start){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter reg_no:");
        int r=sc.nextInt();
        System.out.println("Enter marks:");
        float m=sc.nextFloat();
        Node n=new Node(r,m);
        n.next=start;
        start.prev=n;
        return start;
    } 
    public static Node InsEnd(Node start,Node tail){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter reg_no:");
        int r=sc.nextInt();
        System.out.println("Enter marks:");
        float m=sc.nextFloat();
        Node n=new Node(r,m);
        tail.next=n;
        n.prev=tail;
        return start;
        }
    public static Node InsAny(Node start,Node Tail){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter reg_no:");
        int r=sc.nextInt();
        System.out.println("Enter marks:");
        float m=sc.nextFloat();            
        Node n=new Node(r,m);
        System.out.println("Enter the position u want to enter:");
        int p=sc.nextInt();
        Node temp=start;
        int i=1;
        while(i<p-1){
            i++;
            temp=temp.next;
        }
        Node x=temp.next;
        temp.next=n;
        n.prev=temp;
        n.next=x;
        x.prev=n;
        return start;
    }
    public static Node DelBeg(Node start){
        start=start.next;
        start.prev=null;
        return start;
    }
    public static Node DelEnd(Node start,Node tail){
        tail=tail.prev;
        tail.next=null;
        return start;
    }
    public static Node DelAny(Node start,Node tail){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the position u want to enter");
        int p=sc.nextInt();
        Node temp=start;
        int i=1;
        while(i<p-1){
            i++;
            temp=temp.next;
        }
        Node x=temp.next;
        Node y=temp.next.next;
        temp.next=y;
        y.prev=temp;
        x.next=null;
        x.prev=null;
        return start;
    }

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    while(true){
        System.out.println("enter the choices" +'\n'+ "1-display" +'\n'+ "2-insBeg" +'\n'+ "3-InsEnd"+'\n'+"4-insAny"+'\n'+"5-DelBeg"+'\n'+"6-DelEnd"+'\n'+"7-DelAny"+'\n');
        int choice=sc.nextInt();
        switch(choice){
           case 0:
            head=create(head);
            head=display(head);
            break;
            case 1:
            head=display(head);
            break;
            case 2:
            head=InsBeg(head);
            head=display(head);
            break;
            case 3:
           head= InsEnd(head,tail);
            head=display(head);
            break;
            case 4:
           head= InsAny(head,tail);
            head=display(head);
            break;
            case 5:
           head= DelBeg(head);
            head=display(head);
            break;
            case 6:
            head=DelEnd(head,tail);
            head=display(head);
            break;
            case 7:
           head= DelAny(head,tail);
            head=display(head);
            break;
        }
    }
}
}   
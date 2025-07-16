class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;
        this.next = null;
    }
}
public class SLL 
{
    Node head;

    public void InsertAtBeginning(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void InsertAtEnd(int data)
    {
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void InsertAtSpecificPosition(int data, int position)
    {
        if(position <1)
        {
            System.out.println("Invalid position");
            return;
        }
        if(position == 1)
        {
            InsertAtBeginning(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        for(int i = 1;temp != null && i< position-1;i++)
        {
            temp = temp.next;
        }
        if(temp == null)
        {
            System.out.println("position out of range");
        }
        else
        {
            newNode.next = temp.next;
            temp.next = newNode;
        //  temp.next = newNode;
        //  newNode.next = null;

        }
    }
     public void deleteatend()
     {
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next = null;
    }

    
    
    // display method 
    
    public void display()
    {
     
       Node temp = head;
       while(temp!=null)
       {
           System.out.print(temp.data + " ->");
           temp = temp.next;
       }
    
       System.out.print("null");
    }
    public static void main(String[] args)
    {
        
        SLL list = new SLL();
        list.InsertAtBeginning(143);
        list.InsertAtBeginning(25);
        list.InsertAtBeginning(20);
        list.InsertAtBeginning(434);
        
        list.InsertAtEnd(75);
        list.InsertAtEnd(80);
        list.InsertAtEnd(12);
        
        list.InsertAtSpecificPosition(650, 3);
     
        list.deleteatend();
        
        list.display();
    }
}


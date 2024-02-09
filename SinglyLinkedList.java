class SinglyLinkedList{
    Node head;
    Node temp;

    class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }
    SinglyLinkedList()
    {
        head = null;
    }

    public void insertAtBeg(int val)
    {
        Node newNode = new Node(val);
        if(head == null)
        {
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtPos(int pos,int val)
    {
        Node newNode = new Node(val);
        temp = head;
        if(pos == 0)
        {
            insertAtBeg(val);
            return;
        }
        for(int i=1;i<pos;i++)
        {
            temp = temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void deleteAtPos(int pos)
    {
        Node temp = head;
        Node prev = null;
        if(pos == 0)
        {
            head = head.next;
            return;
        }
        for(int i=1;i<=pos;i++)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }
    public void display()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("List is empty..!");
            return;
        }
        while(temp != null)
        {
            System.out.print(temp.data +"\t");
            temp = temp.next;
        }
        System.out.println("");
    }
}

class List{
    public static void main(String[] args)
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeg(7);
        list.insertAtBeg(3);
        list.display();
        list.insertAtPos(0,6);
        list.display();
        list.deleteAtPos(0);
        list.display();

    }
} 

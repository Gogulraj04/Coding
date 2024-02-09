class SinglyLinkedList<T>{
    Node head;
    Node temp;

    class Node{
        T data;
        Node next;

        Node(T val){
            data = val;
            next = null;
        }
    }
    SinglyLinkedList()
    {
        head = null;
    }

    public void insertAtBeg(T val)
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

    public void insertAtPos(int pos,T val)
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
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insertAtBeg(7);
        list.insertAtBeg(3);
        list.display();
        list.insertAtPos(0,6);
        list.display();
        list.deleteAtPos(0);
        list.display();


        SinglyLinkedList<String> list1 = new SinglyLinkedList<String>();
        list1.insertAtBeg("gogul");
        list1.insertAtBeg("raj");
        list1.insertAtBeg("asif");
        list1.insertAtBeg("shyam");
        list1.display();
        list1.insertAtPos(2, "ahamed");
        list1.display();
        list1.deleteAtPos(3);
        list1.display();
    }
} 

import java.util.*;

class dynamicArray
{
    private static int initialCapacity = 16;
    private int arr[];
    private int size;
    private int capacity;

    dynamicArray(){
        arr = new int[initialCapacity];
        size = 0;
        capacity = initialCapacity;
    }

    public void insertAtEnd(int val)
    {
        if(size==capacity)
        {
            expandArr();
        }
        arr[size++]=val;

    }

    private void expandArr()
    {
        capacity *= 2;
        java.util.Arrays.copyOf(arr,capacity);
    }

    public void display()
    {
        System.out.println("Elements in list are: ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i] +" ");
        }
    }

    public void insertAtpos(int pos,int val)
    {
        for(int i=size-1;i>=pos;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos] = val;
        size++;

    }

    public void deleteAtpos(int pos)
    {
        for(int i=pos+1;i<=size;i++)
        {
            arr[i-1]=arr[i];
        }
        size--;
        if((capacity > initialCapacity) && (capacity > 3*size))
            shrinkArr();
    }

    private void shrinkArr()
    {
        capacity /= 2;
        java.util.Arrays.copyOf(arr, capacity);
    }

}

public class dynamicArrayDemo{
    public static void main(String[] args)
    {
        int choice,val,pos;
        dynamicArray list = new dynamicArray();
        while(true)
        {
            System.out.println("-----------------------------");
            System.out.println("1. Insert at end");
            System.out.println("3. Display a list");
            System.out.println("2. Insert at position");
            System.out.println("4. Delete at position");
            System.out.println("5. Exit");
            System.out.println("------------------------------");
        }
        
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        switch(choice)
        {
            case 1:
                    System.out.println("Enter the value: ");
                    val = scan.nextInt();    
                    list.insertAtEnd(val);
                    break;

            case 2:
                    list.display();
                    break;

            case 3:
                    System.out.println("Enter the position & value to insert the element:");
                    pos = scan.nextInt();
                    val = scan.nextInt();
                    list.insertAtpos(pos,val);
                    break;

            case 4:
                    System.out.println("Enter the position to delete: ");
                    pos = scan.nextInt();
                    list.deleteAtpos(pos);
                    break;

            case 5:
                    System.exit(0);
                    break;

            default:
                    System.out.println("Invalid choice..!");
        }

    }
}

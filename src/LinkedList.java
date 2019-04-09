
public class LinkedList {

    Node head;

    static class Node{
        String data;
        Node nextNode;

        Node(String data){
            this.data = data;
        }
    }

    public static LinkedList Insert(LinkedList list, String data){
        Node new_node= new Node(data);


        if (list.head == null){
            list.head = new_node;
        }else{
            Node last = list.head;
            while(last.nextNode != null){
                last = last.nextNode;
            }

            last.nextNode = new_node;
        }

        return list;
    }

    public static void PrintList(LinkedList list){
        Node currentNode = list.head;
        System.out.println("Linked List:");

        while (currentNode != null){
            System.out .println(currentNode.data + ",");
        }
    }


}

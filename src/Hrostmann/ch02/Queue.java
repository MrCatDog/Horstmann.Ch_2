package Hrostmann.ch02;

public class Queue {
    Node head;

    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public class Iterator {
        private Node actualNode=head;

        public boolean hasNext() {
            if(actualNode.next!=null)
                return true;
            else
                return false;
        }

        public boolean next(){
            if(hasNext()) {
                actualNode = actualNode.next;
                return true;
            }
            else
                return false;
        }

        public String getNode()
        {
            return actualNode.data;
        }
    }

    public void add(String value) {
        Node newNode = new Node(value);
        if (head == null)
            head = newNode;
        else {
            Node actualNode = head;
            while (actualNode.next != null)
                actualNode = actualNode.next;
            actualNode.next=newNode;
        }
    }

    public String remove() {
        String value = head.data;
        if(value==null)
            return null;
        head = head.next;
        return value;
    }

    public String showAll() {
        String allNodes = "";
        Node actualNode = head;
        while (actualNode != null) {
            allNodes += actualNode.data + " ";
            actualNode = actualNode.next;
        }
        return allNodes;
    }

    public void showAll(Iterator iter)
    {
        do {
            System.out.println(iter.getNode());
        }while(iter.next());
    }

    public Iterator iterator() {
        if(head==null)
            return null;
        return new Iterator();
    }
}

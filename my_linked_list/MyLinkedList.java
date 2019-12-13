package com.greekk.hometask5.my_linked_list;

public class MyLinkedList {
    private Node last = null;
    private Node current = null;
    private int length;

    public MyLinkedList(){
        length = 0;
    }

    public void add(int data){
        Node node = new Node(data);

        if(this.last != null){
            node.setNextNode(last);
            int index = last.getIndex();
            node.setIndex(++index);
        }
        else{
            node.setIndex(0);
            current = node;
        }
        last = node;
        length++;
    }

    public Node get(int index){
        Node current;
        while(true){
            current = next();
            if(current == null){
                System.out.println("Error!!");
                break;
            }
            if(current.getIndex()==index);
                break;
        }
        return current;
    }

    public Node next(){
        if(current != null ){
            if(current.getNextNode()!=null){
                current = current.getNextNode();
            }
            else{
                current = last;
                System.out.println("End of the list!");
                return null;
            }
        }
        else{
            if (last != null) {
                current = last;
            }
            else{
                System.out.println("List is empty!");
                return null;
            }
        }

        return current;
    }
}

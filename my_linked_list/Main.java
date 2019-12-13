package com.greekk.hometask5.my_linked_list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList myLinkedListTwo = new MyLinkedList();

        myLinkedList.add(3);
        myLinkedList.add(2);
        myLinkedList.add(1);
        myLinkedList.add(5);
        myLinkedList.add(37);
        myLinkedList.add(4);
        Node node;

        while ((node = myLinkedList.next())!=null){
            System.out.println(node.getData());
        }
        while ((node = myLinkedListTwo.next())!=null){
            System.out.println(node.getData());
        }

        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(7));

    }

}

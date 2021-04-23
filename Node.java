package com.oops;/*package com.oops;

public class Node {
    int data;
    Node next;

}
class LinkedList{
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data=data;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){

                n = n.next;



            }
            n.next=node;
        }

    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.data=data;
        node.next=head;
        head=node;

    }
    public void insertAtIndex(int position,int data){
        Node node  = new Node();
        node.data=data;
        node.next=null;
        Node n= head;
        if (position==0) {
            insertAtStart(data);
            return;
        }

        for(int i=0;i<position-1;i++){
            n=n.next;
        }
       node.next=n.next;
        n.next=node;


    }
    public void delete(int index){
        if (index==0){
            head=head.next;
            return;
        }
        Node n1=null;
        Node n= head;
        for (int i=0;i<index-1;i++){
            n=n.next;
        }
        n1=n.next;
        n.next=n1.next;
    }
    public void print(){
        Node node  = head;
        while (node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

}
/*
public class Node{
    private int data;
    private Node next;
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setData(int data){
        this.data=data;
    }
    public void setNext(Node next){
        this.next=next;
    }
}
class LinkedList{
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        if (head==null){
            head=node;
        }
        else {
            Node n =head;
            while (n.getNext()!=null){
                n=n.getNext();
            }
            n.setNext(node);
        }


    }
    public void print(){
        Node node =head;
        while (node!=null){
            System.out.println(node.getData());
            node=node.getNext();
        }
    }
}
*/

/*package whatever //do not write package name here */

import java.io.*;

class Main {
    private static Node head;

    static class Node{
        private int data;
        private Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private static void insert(int data){
        Node node = new Node(data);
        if (head==null){
            head=node;
            return;
        }
        Node n= head;
        while(n.next!=null){
            n=n.next;
        }

        n.next=node;
    }
    private static void show(){
        Node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }


    public static void main (String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        show();

    }
}
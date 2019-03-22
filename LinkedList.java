/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList
{   
    Node head;
    
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    
    public void insertFirst(int new_data){
        Node newNode= new Node(new_data);//creatint one new node
        newNode.next=head; //initialise the head node to next of the new node
        head=newNode; //change the newnode to head
        
    
   public void insertAfter(Node prev_node,int new_data){
        if(prev_node==null)//check if the node is null or not
        {
            return;
        }
        
        Node new_node=new Node(new_data);//create the new node
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }
    
    public void insertEnd(int new_data){
        Node new_node=new Node(new_data);//create the new node
        if(head==null)
        {
            head=new_node;
        }
        new_node.next=null; // the last next of the last node must be a null
        Node last=head;     //to find the last node
        while(last!=null)
            last=last.next;
        
        last.next=new_node;    
    }
    
    public void InsertAtNth(Node head,int data,int position){
        int count=0;
        Node node=head;//iniialise the first node
        Node prev=null;//set previous to null
        while(count!=position){
            count++;
            prev=node;//skip the place one by one
            node=node.next;//goes to the next node
        }
        Node new_node=new Node(data);
        new_node.next=node;
        if(count==0)// if count is zero then insert at the first
        {
            head=new_node;
        }
        else{
            prev.next=new_node; //otherwise insert the node at the position next tho the  which prev points
        }
    }
    
    public void listNode(){
        Node thead=head;
        while(thead!=null)
        {
            System.out.print(thead.data+ "->");
            thead=thead.next;
        }
    }

    
	public static void main (String[] args) throws java.lang.Exception
	{
	     LinkedList list=new LinkedList();
	     list.insertFirst(4);
	     list.insertFirst(5);
	     list.insertFirst(10);
	     list.insertAfter(list.head.next,8);
	     list.InsertAtNth(list.head,0,3);
	     list.insertEnd(56);
	     list.listNode();
	
	}
	
	
	
}

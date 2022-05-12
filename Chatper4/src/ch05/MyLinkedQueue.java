package ch05;

import 자료구조_자바.MyLinkedList;
import 자료구조_자바.MyListNode;

interface myQueue{
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
	
}
public class MyLinkedQueue extends MyLinkedList implements myQueue {

	
	MyListNode front;
	MyListNode rear;
	
	
	@Override
	public void enQueue(String data) {
		
		MyListNode newNode;
		if(isEmpty()) {
			newNode=addElement(data);
			front=newNode;
			rear=newNode;
			
			
			
		}
		else {
			newNode=addElement(data);
			rear=newNode;
		}
		System.out.println(newNode.getData()+"added");
	}

	@Override
	public String deQueue() {
		
		if(isEmpty()) {
			return null;
		}
		
		String data=front.getData();
		front=front.next;
		
		if(front==null) {
			rear=null;
		}
		return null;
	}

	@Override
	public void printQueue() {
		
		printAll();
	}

	
}

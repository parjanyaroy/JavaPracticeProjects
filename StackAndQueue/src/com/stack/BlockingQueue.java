package com.stack;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {

  private List queue = new LinkedList();
  private int  limit = 10;

  public BlockingQueue(int limit){
    this.limit = limit;
  }


  public synchronized void enqueue(Object item)
  throws InterruptedException  {
    while(this.queue.size() == this.limit) {
    	System.out.println("Queue limit reached waiting");
      wait();
    }
    if(this.queue.size() == 0) {
    	System.out.println("Notifying all to enqueue");
      notifyAll();
    }
    System.out.println("queuing item "+item.toString());
    this.queue.add(item);
  }


  public synchronized Object dequeue()
  throws InterruptedException{
    while(this.queue.size() == 0){
    	System.out.println("Queue empty waiting");
      wait();
    }
    if(this.queue.size() == this.limit){
    	System.out.println("Notifying all to dequeue");
      notifyAll();
    }
    Object removedItem = this.queue.remove(0);
    System.out.println("deuing item "+removedItem.toString());
    return removedItem;
  }

}
    
package queue;

import java.util.ArrayList;
import java.util.List;

public class Queue {

	private ArrayList list;

	
	public Queue() {
		list=new ArrayList();
	}
	
	public Queue(int limit) {
		list=new LimitedArrayList(limit);

	}
	
	public void push(int element) {
		list.add(element);
	}
	
	public Integer pop() {
		if(!isEmpty()) {
			Integer temp = (Integer) list.get(0);
			list.remove(0);
			return temp;
		}
		else return null;
	}
	
	
	public boolean isFull() {
		return(list.getClass() == LimitedArrayList.class & list.add(0));
	}
	
	public boolean isEmpty() {
		return(list.size()<=0);
	}
	
	public void display() {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}
	

}


class LimitedArrayList extends ArrayList<Object> {
	  int limit;
	  
	  
	  public LimitedArrayList(int limit) {
		  super();
		  this.limit=limit;
	  }
	  
	  @Override
	  public boolean add(Object e) {
	      if (this.size() < limit) {
	          return super.add(e);
	      }
	      return false;
	  }
	}



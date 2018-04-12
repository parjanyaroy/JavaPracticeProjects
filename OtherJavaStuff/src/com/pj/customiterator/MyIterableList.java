package com.pj.customiterator;

import java.util.Iterator;
import java.util.List;

public class MyIterableList<T> implements Iterable<T> {

	List<T> iteratingList;
	boolean isEven=true;
	
	public List<T> getIteratingList() {
		return iteratingList;
	}
	public void setIteratingList(List<T> iteratingList) {
		this.iteratingList = iteratingList;
	}
	public boolean isEven() {
		return isEven;
	}
	public void setEven(boolean isEven) {
		this.isEven = isEven;
	}
	MyIterableList(List<T> list,boolean isEven)
	{
		this.iteratingList=list;
		this.isEven=isEven;
	}
	@Override
	public Iterator<T> iterator() {
		return isEven?new EvenIterator<>():new OddIterator<>();
	}
	
	@SuppressWarnings("hiding")
	private class EvenIterator<T> implements Iterator<T>
	{
		int count=0;
		int size=iteratingList.size();

		@Override
		public boolean hasNext() {
			return count<size;
		}

		@Override
		public T next() {
			@SuppressWarnings("unchecked")
			T element = (T) iteratingList.get(count);
			count=count+2;
			return element;
		}
		
	}
	
	private class OddIterator<T> implements Iterator<T>
	{
		int count=1;
		int size=iteratingList.size();

		@Override
		public boolean hasNext() {
			return count<size;
		}

		@Override
		public T next() {
			@SuppressWarnings("unchecked")
			T element = (T) iteratingList.get(count);
			count=count+2;
			return element;
		}
		
	}

}

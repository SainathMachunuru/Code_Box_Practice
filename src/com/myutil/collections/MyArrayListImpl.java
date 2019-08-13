package com.myutil.collections;

import java.util.Arrays;

//ArrayList Impl Using Array
public class MyArrayListImpl {
	private static final int MAX_SIZE = 5;
	private Object[] dataArray;
	private int index;
	private int currentSize;
	private int size;

	public MyArrayListImpl() {
		this.dataArray = new Object[MAX_SIZE];
		this.currentSize = MAX_SIZE;
	}

	public void addElement(Object data) {
		if (this.index > this.currentSize - 1) {
			increaseArraySize();
		}
		dataArray[this.index] = data;
		this.index++;
		this.size = this.index;

	}

	public Object get(int indx) throws Exception {
		if (indx < 0) {
			throw new Exception("Error: negative index");

		}
		if (indx > this.index - 1) {
			throw new ArrayIndexOutOfBoundsException();

		}
		return dataArray[indx];

	}

	public void removeElement(int indx) throws Exception {
		System.out.println("index: "+this.index+" curretSize: "+this.currentSize+" size "+this.size);
		if (indx < 0) {
			throw new Exception("Error: negative index");

		}
		if (indx > this.index - 1) {
			throw new ArrayIndexOutOfBoundsException();

		}

		for (int i = indx; i < this.dataArray.length-1; i++) {
			dataArray[i] = dataArray[i+1];

		}
		this.index--;
		this.size = this.index;

	}

	private void increaseArraySize() {
		this.currentSize = this.currentSize + MAX_SIZE;
		this.dataArray = Arrays.copyOf(this.dataArray, this.currentSize);

	}

	public static void main(String[] args) throws Exception {
		MyArrayListImpl list = new MyArrayListImpl();
		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		list.addElement(4);
		list.addElement(5);
		list.removeElement(2);

		for (int i = 0; i < list.size; i++) {
			System.out.println(list.get(i));

		}

	}

}

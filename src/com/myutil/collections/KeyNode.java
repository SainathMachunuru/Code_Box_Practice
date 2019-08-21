package com.myutil.collections;

public class KeyNode {
	Object key;
	Object value;
	KeyNode next;
	
	public KeyNode(Object key, Object value, KeyNode next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}

	public Object getKey() {
		return key;
	}



	public void setKey(Object key) {
		this.key = key;
	}



	public Object getValue() {
		return value;
	}



	public void setValue(Object value) {
		this.value = value;
	}



	public KeyNode getNext() {
		return next;
	}



	public void setNext(KeyNode next) {
		this.next = next;
	}



	public int hashCode() {
		return key.hashCode();
		
	}
	public boolean equals(Object obj) {
		return this.equals(obj);
		
	}

}

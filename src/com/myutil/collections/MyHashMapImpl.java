package com.myutil.collections;

public class MyHashMapImpl {
	private KeyNode buckets[];
	private static final int INITIAL_CAPACITY = 16;
	private int size = 0;

	public MyHashMapImpl() {
		this(INITIAL_CAPACITY);

	}
	public MyHashMapImpl(int capacity) {
		this.buckets = new KeyNode[capacity];
		
	}
	public void put(Object key,Object value) {
		KeyNode node = new KeyNode(key, value, null);
		int hash = key.hashCode();
		int index = hash%buckets.length;
		KeyNode existing = buckets[index];
		if(existing == null) {
			buckets[index] = node;
			size++;
			
		}
		else {
			while(existing.next!=null) {
				if(existing.key.equals(key)) {
					existing.value = value;
					break;
				}
				existing = existing.next;
				
			}
			if(existing.key.equals(key)) {
				existing.value = value;
			}
			else {
				existing.next = node;
				size++;
			}
		}
		
		
	}
	public Object get(Object key) {
		int index = key.hashCode()%buckets.length;
		KeyNode node = buckets[index];
		while(node!=null) {
			if(key.equals(node.key)) {
				return node.value;
			}
			node = node.next;
			
			
		}
		return null;
		
		
	}
	public void printMap() {
		for(int i=0;i<buckets.length;i++) {
			if(buckets[i]!=null) {
				System.out.println(buckets[i].key+" : "+buckets[i].value);
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		MyHashMapImpl myMap = new MyHashMapImpl();
	    myMap.put("USA", "Washington DC");
	    myMap.put("Nepal", "Kathmandu");
	    myMap.put("India", "New Delhi");
	    myMap.put("Australia", "Sydney");
	    myMap.printMap();
	   // System.out.println(myMap.get("Nepal"));
	    
	   

	  

	}

}

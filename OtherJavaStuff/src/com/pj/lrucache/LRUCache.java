package com.pj.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {

	private final int CACHE_SIZE;
	private final int initialCapacity = 16;
	private final float loadFactor = 0.75F;

	public LRUCache(int size) {
		this.CACHE_SIZE = size;
	}

	public LinkedHashMap<K, V> cache = new LinkedHashMap<K, V>(initialCapacity, loadFactor, true) {
		private static final long serialVersionUID = 1L;
		@Override
		protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
			boolean ifRemove = this.size() > CACHE_SIZE;
			return ifRemove;
		}
	};

	public synchronized void put(K key, V value) {
		if (value == null)
			return;
		else
			cache.put(key, value);
	}

	public synchronized V get(K key) {
		return cache.get(key);
	}

	public synchronized void clear() {
		cache.clear();
	}

	// Test routine for the LRUCache class.
	public static void main(String[] args) {
		LRUCache<String, String> c = new LRUCache<String, String>(3);
		c.put("1", "one"); // 1
		c.put("2", "two"); // 2 1
		c.put("3", "three"); // 3 2 1
		c.put("4", "four"); // 4 3 2
		c.get("3");
		for (Map.Entry<String, String> e : c.cache.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}
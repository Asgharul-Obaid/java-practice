package com.collection;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram {
	private static final Set<Entry<String, Integer>> HashPrintRequestAttributeSet = null;
	private static final PrintStream PrintStream = null;

	public static void main(String[] args) {
		Map<String, Integer> has = new HashMap<String, Integer>();
		has.put("Obaid", 12345);
		has.put("salman", 23456);
		System.err.println(has);

		Set<Entry<String, Integer>> set = has.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println("--------------------------");
		}
		if (set == HashPrintRequestAttributeSet) {
		}

		if (itr.equals("salman")) {
			itr.remove();
			System.err.println(itr.next());
		}
	}

	private static PrintStream println() {
		// TODO Auto-generated method stub
		return PrintStream;
	}
}

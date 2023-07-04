package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapProgramDEMO {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("UK", "United Kingdom");
		map.put("UAE", "United Arab Emirates");
		map.put("Delhi", "India");
		System.out.println(map);
		Set<String> keySet = map.keySet();
		System.out.println("---------"+keySet);
		
		Collection<String> values = map.values();
		System.out.println(values);

//		for (Map.Entry<String, String> itr : map.entrySet()) {
//			System.out.println(itr.getKey() + ":" + itr.getValue());
//		}	
		Map.Entry<String, String> m=map.entrySet().iterator().next();
		System.out.println(m.getKey());
	}
}

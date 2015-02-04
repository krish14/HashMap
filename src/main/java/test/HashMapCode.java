package test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class HashMapCode  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map mapA = new TreeMap();
		Map mapB = new HashMap();
		
		mapA.put("hibernate", "database");
		mapA.put("spring", "bussiness");
		mapA.put("struts", "ui");
		mapA.put("java", "core");
		
		
		Iterator i = mapA.keySet().iterator();
		while (i.hasNext()){
			Object key = i.next();
			Object value = mapA.get(key);
			System.out.println(value.toString());
		}
			
	}

}

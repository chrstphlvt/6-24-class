package com.revature.l.maps;

import java.util.HashMap;
import java.util.Map;

public class MapsDriver {
	public static void main(String[] args) {
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("Code", "Secret languages");
		dictionary.put("Language", "A standardized form of communication");
		dictionary.put("Java", "A caffenated beverage");
		// should override the previous definition for the key Java
		dictionary.put("Java", "An Object Oriented Programming language, that is high level");

		for(String key: dictionary.keySet()) {
			System.out.println(key + ": " + dictionary.get(key));
		}
	}
}

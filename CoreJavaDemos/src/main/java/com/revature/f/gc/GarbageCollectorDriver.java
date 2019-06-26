package com.revature.f.gc;

import com.revature.d.objects.Dog;

public class GarbageCollectorDriver {
	public static void main(String[] args) {
		while(true) {
			new Dog("Drew", true);
		}
	}
}

package com.revature.t.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyTreeNode<T> {
	T value;
	List<MyTreeNode<T>> children = new ArrayList<>();

	public MyTreeNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyTreeNode(T value) {
		super();
		this.value = value;
	}

	public MyTreeNode(T value, Collection<MyTreeNode<T>> children) {
		super();
		this.value = value;
		this.children.addAll(children);
	}

}

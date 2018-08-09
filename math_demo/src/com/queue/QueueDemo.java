package com.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<String> queue=new LinkedList<String>();
		Queue<String> queue2=new LinkedList<String>();
		List<String> list=new ArrayList<String> ();
		
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		for(String str:queue){
			System.out.println(str);
			list.add(str);
		}
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		for (String string : list) {
			queue2.offer(string);
		}
		System.out.println("========");
		for (String string : queue2) {
			System.out.println(string);
		}
	}

}

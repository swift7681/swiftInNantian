package sortmap_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSort {

	public static void main(String[] args) {

		Map<User,Integer> map=new HashMap<User,Integer>();
		map.put(new User("王伦",30), 1);
		map.put(new User("林冲",33), 2);
		map.put(new User("鲁智深",36), 3);
		map.put(new User("阮小七",22), 4);
		
		Set<Entry<User, Integer>> set = map.entrySet();
		List<Entry<User, Integer>> list = new ArrayList<Entry<User, Integer>>(set);
		Collections.sort(list, new Comparator<Entry<User, Integer>>() {

			@Override
			public int compare(Entry<User, Integer> o1, Entry<User, Integer> o2) {
				return o2.getKey().getAge()-o1.getKey().getAge();
			}
		});
		
		LinkedHashMap<User, Integer> linkedmap = new LinkedHashMap<User, Integer>();
		
		for (Entry<User, Integer> entry : list) {
			linkedmap.put(entry.getKey(), entry.getValue());
		}
		for (User user: linkedmap.keySet()) {
			System.out.println(user+" "+linkedmap.get(user));
		}
	}

}

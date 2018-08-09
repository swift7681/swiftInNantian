package sortmap_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsSort {

	public static void main(String[] args) {

		Map<Integer,User> map=new TreeMap<Integer,User>();
		map.put(1,new User("张三",28));
		map.put(2,new User("李四",29));
		map.put(3,new User("王五",30));
		map.put(4,new User("赵六",31));
		Set<Entry<Integer, User>> set = map.entrySet();
		List<Entry<Integer, User>> list = new ArrayList<Entry<Integer, User>>(set);
		Collections.sort(list,new Comparator<Entry<Integer, User>>() {

			@Override
			public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
				return o2.getValue().getAge()-o1.getValue().getAge();
			}
		});
		for (Entry<Integer, User> u : list) {
			System.out.println(u.getKey()+"--"+u.getValue());
		}
}
}
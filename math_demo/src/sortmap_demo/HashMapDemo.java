package sortmap_demo;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<User,Integer> map=new TreeMap<User,Integer>(new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				if(o1.getAge()>o2.getAge()){
                    return -1;
                }else if(o1.getAge()==o2.getAge()){
                     return 0;
                }else{
                  return 1;
                }          
			}
		});
		map.put(new User("张三",28),1);
		map.put(new User("李四",29),2);
		map.put(new User("王五",30),3);
		map.put(new User("赵六",31),4);
		for (User u : map.keySet()) {
			System.out.println(u+"--"+map.get(u));
		}
}
}
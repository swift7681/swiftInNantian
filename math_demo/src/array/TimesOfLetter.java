package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TimesOfLetter {

	public static void main(String[] args) {

		List<Character> list=new ArrayList<Character>();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		list.add('B');
		list.add('E');
		list.add('A');
		list.add('A');
		//统计字符出现的次数
		Map<Character,Integer> map=new TreeMap<Character,Integer>(new Comparator<Character>() {

			@Override
			public int compare(Character arg0, Character arg1) {
				return arg1-arg0;
			}
		});
		for (Character character : list) {
			if(map.containsKey(character)){
				Integer num = map.get(character);
				num++;
				map.put(character, num);
			}else{
				map.put(character, 1);
			}
		}
		
		//遍历map
		for(Character character:map.keySet()){
			System.out.println(character+"---"+map.get(character));
		}
	}

}

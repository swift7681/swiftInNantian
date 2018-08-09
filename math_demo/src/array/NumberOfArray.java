package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class NumberOfArray {

	public static void main(String[] args) {

		int[] arr={1,4,4,2,4,88,6,7,5,2,7,9,10,1,13,15,9,8,2,4};
		Map<Integer,Integer> map=new TreeMap<Integer,Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
			if(map.containsKey(arr[i])){
				int num=map.get(arr[i]);
				num++;
				map.put(arr[i], num);
			}else{
				map.put(arr[i], 1);
			}
		}
		for(Integer i:map.keySet()){
			System.out.println("数值"+i+"的个数是："+map.get(i));
		}
		Set<Entry<Integer, Integer>> set = map.entrySet();
		List<Entry<Integer, Integer>> list=new ArrayList<Entry<Integer, Integer>>(set);
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().intValue()-o1.getValue().intValue();
			}
		});
		LinkedHashMap<Integer, Integer> linkmap=new LinkedHashMap<Integer, Integer>();
		for (Entry<Integer, Integer> entry : list) {
			linkmap.put(entry.getKey(), entry.getValue());
		}
		System.out.println("===========================");
		for(Integer i:linkmap.keySet()){
			System.out.println("数值"+i+"的个数是："+map.get(i));
		}
	}

}

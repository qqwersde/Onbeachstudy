package Collection.com.itheima_07;

import java.util.ArrayList;
import java.util.List;

/*
 * 需求：定义一个方法，返回指定列表中指定元素的索引位置
 * 
 * 判断元素是否存在
 * 
 */
public class ListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//int index = index(list,"php");
		//System.out.println(index);
		
		//boolean flag = contains(list, "php");
		//System.out.println(flag);
		
		boolean flag = list.contains("php");
		System.out.println(flag);
	}
	
	public static int index(List list,Object other) {
		for(int x = 0;x < list.size();x++) {
			//获取列表中的元素
			Object obj = list.get(x);
			//使用列表中的元素和指定的元素进行比较
			if(obj.equals(other)) {
				return x;
			}
		}
		//查找不到指定的元素
		return -1;
	}
	
	public static boolean contains(List list,Object other) {
		//获取指定元素在指定列表中的索引位置
		int index = index(list,other);
		//如果索引位置大于等于0，则认为元素存在，否则不存在
		if(index >= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}

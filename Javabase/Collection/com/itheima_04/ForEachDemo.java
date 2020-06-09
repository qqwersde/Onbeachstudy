package Collection.com.itheima_04;

import java.util.ArrayList;
import java.util.Collection;

/*
 * foreach:增强for循环，一般用于遍历集合或者数组
 * 格式：
 * 		for(元素的类型 变量 : 集合或者数组对象) {
 * 			可以直接使用变量;
 * 		}
	注意：在增强for循环中不能修改集合，否则会出现并发修改异常。
	
	public interface Iterable<T>
	实现这个接口允许对象成为 "foreach" 语句的目标。

 */
public class ForEachDemo {
	public static void main(String[] args) {
		 //创建集合对象
		Collection<String> c = new ArrayList<String>();
		//添加元素
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//增强for循环遍历集合
		/*for(Object obj : c) {
			System.out.println(obj);
		}*/
		
		
		/*for(String s : c) {
			System.out.println(s.toUpperCase());
		}*/
		
		for (String string : c) {
			c.add("android");
			System.out.println(string);
		}
	}
}

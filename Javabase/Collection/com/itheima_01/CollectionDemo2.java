package Collection.com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 	Collection 	
 * 			boolean add(E e)  
 * 			void clear()  
 * 			boolean contains(Object o)  
 * 			boolean isEmpty() 
 * 			boolean remove(Object o) 
 * 			int size() 
 * 			Object[] toArray()  
 
 
 * 
 * 
 * Iterator<E> iterator()  
 
 * 		
 */
public class CollectionDemo2 {
	public static void main(String[] args) {		
		//创建集合对象
		//Collection c = new Collection();//Collection是接口，不能实例化
		Collection c = new ArrayList();//多态，父类引用指向子类对象  
		
		//boolean add(E e)  
		System.out.println(c.add("hello"));//永远可以添加成功，因为ArrayList他允许重复
		System.out.println(c.add("world"));
		
		//void clear()：清空集合
		//c.clear();
		
		//boolean contains(Object o)  :判断集合中是否包含指定元素
		//System.out.println(c.contains("java"));
		
		//boolean isEmpty() :是否为空
		//System.out.println(c.isEmpty());
		
		
		//boolean remove(Object o) :删除元素
		//System.out.println(c.remove("java"));
		
		//int size() :返回集合中的元素个数
		//System.out.println(c.size());
		
		//Object[] toArray()  :将集合转换成一个Object类型的数组
		Object[] objs = c.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
		
		
		
		System.out.println(c);
	}
}

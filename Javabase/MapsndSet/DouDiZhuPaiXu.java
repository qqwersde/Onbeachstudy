package MapsndSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DouDiZhuPaiXu {
	
	//分析 我们知道牌的顺序1-13这样排列好的, 
	//所以我们首先,必须有一个排列规则,我们应该按照规则去排列就行了,这个规则是不能改变的;
	//我们能改变的是,每位玩家拿到的规则的角标值;
	//将牌的角标打乱;
	//每一个用户发的其实就是规则对应的角标,也就是一个int值
	//通过collections的sort方法对每一位玩家的角标值进行排序,然后根据排好序的角标值,去规则找牌就会完成排序效果

	public static void main(String[] args) {
		String[] arr = {"♠", "♥", "♣", "♦" };
		String[] arr1 = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int m = 0;
		ArrayList<Integer> indexs = new ArrayList<>();//所有牌的角标
		ArrayList<String> cards = new ArrayList<>();//所有的牌,也就是规则,规则的排列顺序规则不变
		for (int i = 0; i < arr1.length; i++) {
			String string1 = arr1[i];

			for (int j = 0; j < arr.length; j++) {
				String string2 = arr[j];
				cards.add(string1 + string2);//将牌的规则定义好

				indexs.add(m);//将角标添加到 角标的集合当中
				m++;

			}
		}

		cards.add("大王");//添加未添加的牌
		cards.add("小王");
		indexs.add(52);//添加未添加的角标
		indexs.add(53);
		//洗的角标
		Collections.shuffle(indexs);//注意打乱的是角标

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		ArrayList<Integer> list4 = new ArrayList<>();

		for (int i = 0; i < indexs.size() - 3; i++) {//给每个玩家分发角标

			if (i % 3 == 0) {
				list1.add(indexs.get(i));

			} else if (i % 3 == 1) {
				list2.add(indexs.get(i));

			} else if (i % 3 == 2) {
				list3.add(indexs.get(i));

			}

		}
		//将底牌的角标添加进去
		list4.add(indexs.get(arr.length-1));
		list4.add(indexs.get(arr.length-2));
		list4.add(indexs.get(arr.length-3));
		
		
		
		//给所有玩家的拿到的角标进行排序
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);
		Collections.sort(list4);
		//创建出每个玩家牌的集合
		ArrayList<String> qing = new ArrayList<>();
		ArrayList<String> zhi = new ArrayList<>();
		ArrayList<String> ru = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		//通过排好的角标顺序去拿牌;
		findCard(list1, qing, cards);
		findCard(list2, zhi, cards);
		findCard(list3, ru, cards);
		findCard(list4, dipai, cards);
		
		//看牌
		System.out.println(qing);
		System.out.println(zhi);
		System.out.println(ru);
		System.out.println(dipai);

	}
	//通过排好序的角标找牌
	/**
	 * 
	 * @param indexs  每位玩家排好角标顺序的集合
	 * @param player  每位玩家实际牌的集合
	 * @param sort    规则集合(需要通过排好序的角标查实际牌,添加到玩家实际牌的集合当中)
	 */
	public static void findCard(ArrayList<Integer> sortIndex,ArrayList<String> player,ArrayList<String> sort){
		for (int i = 0; i < sortIndex.size(); i++) {
			player.add(sort.get(sortIndex.get(i)));
		}
	}
	
	

}

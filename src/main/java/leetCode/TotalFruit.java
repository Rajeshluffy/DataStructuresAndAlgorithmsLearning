package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import org.junit.Test;

public class TotalFruit {
	/**
	 * A solution to the Fruit Into Baskets
 problem.
	 * 
	 * @author rajesh
	 * @param fruits 
	 * @see <a href="https://leetcode.com/problems/fruit-into-baskets/">Fruit Into Basket - LeetCode</a>
	 */
	public int totalFruit(int[] fruits) {
		if(fruits.length==1) {
			return 1;
		}
		int p1=0,p2=0,possibleTotalFruit=0;
		HashMap<Integer, Integer> fruitCount = new HashMap<>();
		while(p2<fruits.length) {

			fruitCount.put(fruits[p2], fruitCount.getOrDefault(fruits[p2], 0) + 1);

			while(fruitCount.size()>2) {
				int startFruit = fruits[p1];
				fruitCount.put(startFruit, fruitCount.get(startFruit) - 1);
				if (fruitCount.get(startFruit) == 0) {
					fruitCount.remove(startFruit);
				}
				p1++;



			}
			possibleTotalFruit = Math.max(possibleTotalFruit, p2 - p1 + 1);
			p2++;

		}

		return possibleTotalFruit;
	}

	//	  public int totalFruit(int[] fruits) {
	//	     	if(fruits.length==1) {
	//				return 1;
	//			}
	//			int p1=0,p2=1,possibleTotalFruit=0;
	//			HashSet<Integer> set = new HashSet<Integer>();
	//			set.add(fruits[0]);
	//			while(p2<fruits.length) {
	//				if (!set.contains(fruits[p2])) {
	//					//expand the window
	//					if(set.size()<2){
	//						set.add(fruits[p2]);
	//					}else {
	//						//shrink the window
	//						set.remove(fruits[p1]);
	//						p1=p2-1;
	//						set.add(fruits[p1]);
	//						
	//						continue;
	//					}
	//				} 
	//
	//				possibleTotalFruit=	Math.max(possibleTotalFruit, p2-p1+1);
	//
	//				p2++;
	//
	//
	//			}
	//
	//			return possibleTotalFruit; 
	//	    }




	
		@Test
		public void testData1() {
			int[] fruits = {1,2,1};
			System.out.println(totalFruit(fruits));
	
		} 
	
		@Test
		public void testData2() {
			int[] fruits = {0,1,2,2};
			System.out.println(totalFruit(fruits));
	
		} 
	
		@Test
		public void testData3() {
			int[] fruits = {1,2,3,2,2};
			System.out.println(totalFruit(fruits));
		} 
	@Test
	public void testData4() {
		int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
		System.out.println(totalFruit(fruits));
	}
	@Test
	public void testData5() {
		int[] fruits = {1,0,2,3,4};
		System.out.println(totalFruit(fruits));
	}

}

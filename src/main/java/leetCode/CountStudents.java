package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;

public class CountStudents {
	/**
	 * A solution to  Number of Students Unable to Eat Lunch problem.
	 * 
	 * @author rajesh
	 * @see <a href="https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/">Number of Students Unable to Eat Lunch - LeetCode</a>
	 *
	 */
	public int countStudents(int[] students, int[] sandwiches) {
		Queue<Integer> queue = new LinkedList<>();
		List<Integer> sandwichList = new ArrayList<>();

		for (int student : students) {
			queue.offer(student);
		}

		for (int sandwich : sandwiches) {
			sandwichList.add(sandwich);
		}
        int rotations = 0;

        while (!queue.isEmpty() && rotations < queue.size()) {
            if (queue.peek() == sandwichList.get(0)) {
                // Student can eat, remove them and the sandwich
                queue.poll();
                sandwichList.remove(0);
                rotations = 0; // Reset rotations
            } else {
                // Student cannot eat, move them to the back
            	int poll = queue.poll();
                queue.offer(poll);
                rotations++;
            }
        }

		return queue.size();
	}
	@Test
	public void testData1() {
		int[] students = {1,1,0,0};
		int[] sandwiches = {0,1,0,1};
		System.out.println(countStudents(students, sandwiches)); 
	}
	@Test
	public void testData2() {
		int[] students = {0,0,0,5};
		int[] sandwiches = {1,1,1,1};
		System.out.println(countStudents(students, sandwiches)); 
	}

}

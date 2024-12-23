package interviewPrepartioncode;

import java.util.Arrays;

import org.junit.Test;

public class PlatformTime {
	public int  findPlatformTime(int[] arr, int[] dep) {
		/*
		 * sort the array
		 * Initiates platformNeeded ,p1,p2
		 * 
		 * 	if its overlapping
		 * 		increase the platform
		 * 		p1++
		 * 	else if its not overlapping
		 * 		decrease the platform
		 * 		increase the p2++
		 * 
		 *  update the highest platform
		 */

		Arrays.sort(arr);
		Arrays.sort(dep);
		int p1=0,p2=0,platformRequired=0,platform=0;

		while(p1<arr.length && p2<dep.length) {
			if(arr[p1]<=dep[p2]) {
				platform++;
				p1++;
			}else if(arr[p1]>dep[p2]) {
				platform--;
				p2++;
			}
			platformRequired=	 Math.max(platformRequired, platform);
		}

		return platformRequired;
	}

	@Test
	public void testData1() {
		int[] arrival= {900, 940, 950, 1100, 1500, 1800};
		int[] departure= {910, 1200, 1120, 1130, 1900, 2000};

		System.out.println(		findPlatformTime(arrival,departure));
	}
	@Test
	public void testData2() {
		int[] arrival= {900, 1235, 1100};
		int[] departure= {1000, 1240, 1200};

		System.out.println(		findPlatformTime(arrival,departure));
	}
	@Test
	public void testData3() {
		int[] arrival= {1000, 935, 1100};
		int[] departure= {1200, 1240, 1130};

		System.out.println(	findPlatformTime(arrival,departure));
	}
}

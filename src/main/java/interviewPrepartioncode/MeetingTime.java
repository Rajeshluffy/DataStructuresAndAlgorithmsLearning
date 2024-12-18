package interviewPrepartioncode;

import java.util.Arrays;
import org.junit.Test;

public class MeetingTime {


/*
 * sort the array
 * start time index0,0
 * end time index 0,1
 * iterate till array
 * 	if intervals[i][0]<=endTime 
 * 		return false
 * 	else 
 * 		increase the startTime and endTime
 * return false
 * 	
 * 
 */
	public boolean meetingOverlaping(int[][] intervals) {
		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
		int startTime=intervals[0][0];
		int endTime=intervals[0][1];
		for (int i = 1; i < intervals.length; i++) {

			if(intervals[i][0]<=endTime) {
				return false;

			}else {
				startTime=intervals[i][0];
				endTime=intervals[i][1];
			}
		} 
		return true;
	}

	@Test
	public void testData1() {
		int[][] intervals = {{0,30},{5,10},{15,20}};
		System.out.println(meetingOverlaping(intervals));
	}
	@Test
	public void testData2() {
		int[][] intervals = {{7,10},{2,4}};
		System.out.println(meetingOverlaping(intervals));
	}
}

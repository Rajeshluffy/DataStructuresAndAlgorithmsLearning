package interviewPrepartioncode;

import java.util.Arrays;

import org.junit.Test;

public class MeetingRooms {
	public int meetingRoomsII(int[] startTime, int[] endTime) {
		Arrays.sort(startTime);
		Arrays.sort(endTime);
		int p1=0,p2=0,totalRoom=0,rooms=0;

		while(p1<startTime.length) {
			if(startTime[p1]<=endTime[p2]) {
				rooms++;
				p1++;
			}else {
				rooms--;
				p2++;
			}
			totalRoom=	 Math.max(totalRoom, rooms);

		}


		return totalRoom;
	}



	@Test
	public void testData1() {
		int[] startTime= {1, 10, 7};
		int[] endTime= {4, 5, 10};

		System.out.println(	meetingRoomsII(startTime,endTime));

	}
	@Test
	public void testData2() {
		int[] startTime= {2,9,6};
		int[] endTime= {4, 12, 10};

		System.out.println(	meetingRoomsII(startTime,endTime));

	}


}

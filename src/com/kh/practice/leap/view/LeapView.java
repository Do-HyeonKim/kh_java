package com.kh.practice.leap.view;

import java.util.Calendar;
import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	private LeapController ctrl = new LeapController();
	public LeapView () {
		//2019년은 평년입니다.
		//총 날짜 수 : 737164
		
		//칼렌더 객체 생성은 new로 하는 것이 아님
		Calendar cal =  Calendar.getInstance(); //싱글톤패턴
		System.out.println(cal.getTime());
		
	}
}

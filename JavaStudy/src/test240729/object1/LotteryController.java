package test240729.object1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		boolean isRemove = lottery.remove(l);
		if(isRemove && win != null) {
			win.remove(l);
		}
		return lottery.remove(l);
		 
	}
	
	public HashSet winObject() {
		if(lottery.size() < 4) {
			return null;
		}
		List<Lottery> list = new ArrayList<>();
		list.addAll(lottery);
		
		while(win.size() < 4){ // 사이즈확인해서 4명이하면 계속 진행
			int rand = (int)Math.random()* list.size(); // 랜덤발생
			win.add(list.get(rand));// 랜덤자리에 있는 사람을 당첨목록에 추가
		}
		return win;
	}
	
	public TreeSet sortedWinObject() {
		return null;
	}
	
	public boolean searchWinner(Lottery l) {
		return false;
	}
}

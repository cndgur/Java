package test240712.object;

import java.util.Scanner;

public class MemberController {
Scanner sc = new Scanner(System.in);
		private Member[]m = new Member[SIZE];
		public static final int SIZE = 10;
		
	public int existMemberNum() {
		int count = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				count++;
			}else {
				break;
			}
		}
			
		return count;
	}
	
	public boolean checkId(String inputId) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				return true;	
			}
			if(m[i].getId().equals(inputId)) {
				return false;	
			}
		}
		return true;
	
	}
	public void insertMember(String id, String name, String password, String email, String gender, int age) {
		for(int i = 0; i < m.length; i++) {
			
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}
	
	public String searchId(String id) {
	      for(int i = 0; i < m.length; i++) {
	    	  if(m[i] != null && m[i].getId().equals(id)) {
	    		  return m[i].inform();
	    	  }
	      }
	        return null;
	    }
	public Member[] searchName(String name) {
		Member[] mArr = new Member[this.SIZE];
		
		int index = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(name)){
				mArr[index++] = m[i];
			}
		}
		return mArr;
	}
	public Member[] searchEmail(String email) {
		return null;
	}
	public boolean updatePassword(String id, String password) {
		for(int i = 0; i<m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}
	public boolean updateName(String id, String name) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}
	public boolean updataEmail(String id, String email) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				return false;
			}else if (m[i].getId().equals(id)) {
				for(int j = 0; j <(m.length -1 ); j++) {
					m[j] = m[j+1];
				}
				m[m.length - 1] = null;
				return true;
			}
		}
		return false;
	}
	public boolean deleteOne(String id) {
		return false;
	}
	public void deleteAll() {
		this.m = new Member[this.SIZE];
	}
	public Member[] printAll() {
		return this.m;
	}
}

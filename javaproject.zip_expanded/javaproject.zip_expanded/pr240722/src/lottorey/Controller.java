package lottorey;

public class Controller {
    Person[] psArr = new Person[1]; 
    LottoNumber [] lnArr = new LottoNumber[5];
    public void insertPerson(String name, String id, String pwd, int year, int month, int day) {
        for (int i = 0; i < psArr.length; i++) { // psArr.length로 수정
            if (psArr[i] == null) {
                psArr[i] = new Person(name, id, pwd, year, month, day); 
                break;
            }
        }
    }

    public void insertLottoNumber(int num1, int num2, int num3, int num4, int num5, int num6) {
        for(int i = 0; i < lnArr.length; i++) {
        	if(lnArr[i] == null) {
        		lnArr[i] = new LottoNumber(num1, num2, num3, num4, num5, num6);
        		break;
        	}
        }
    }

    public Person[] printPerson() {
        for (Person p : psArr) {
            if (p == null) {
                break;
            }
            System.out.println(p.toString());
        }
        return this.psArr;
    }

    public LottoNumber[] printLottoNumber() {
        for(LottoNumber l : lnArr) {
        	if(l == null) {
        		break;
        	}
        	System.out.println(l.toString());
        }
        return this.lnArr;
    }
    
    public Person[] searchName(String name) {
    	Person[] prArr = new Person[this.searchName(name)];
    
    	for(int i = 0; i<prArr.length; i++) {
    		if(prArr[i] != null && prArr[i].getName().equals(name)) {
    			
    		}
    	}
    }
}

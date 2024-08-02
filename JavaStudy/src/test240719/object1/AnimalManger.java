package test240719.object1;

public class AnimalManger {
	public static void main(String[] args) {
		Animal [] ani = new Animal[5];
		
		ani [0] = new Dog("흰둥이", "시골잡종", 20);
		ani [1] = new Cat("귀요미", "저도 잘 모르는데 아마 잡종이지 않을까 하고 생각 중", "동네 길", "똥색");
		ani [2] = new Dog("봄이", "말티푸", 4);
		ani [3] = new Cat("똥바보", "길고양이라서 잘 모르는 상황", "길거리", "깜둥이");
		ani [4] = new Dog("디디", "말티즈", 7);
		
		for(Animal aniArr : ani) {
			aniArr.speak();
		}
	}

}
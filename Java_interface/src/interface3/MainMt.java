package interface3;

public class MainMt {

	public static void main(String[] args) {
	Animal[] animal = new Animal[4];
	animal[0] = new Dog();
	animal[1] = new Cat();
	animal[2] = new Chicken();
	animal[3] = new Dog();
	
	
	for( Animal ani : animal) {
		ani.sound();
	}
	
		
		
		

	}

}


// 동물 소리 
// 고양이소리, 닭소리, 강아지소리
// 인터페이스 : Animal
// 클래스 : cat, chicken, dog

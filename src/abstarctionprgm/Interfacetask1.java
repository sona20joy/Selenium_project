package abstarctionprgm;

interface BasicAnimal {
    void eat();
    void sleep();
}

class Monkey {
    void jump() {
        System.out.println("Monkey is jumping");
    }

    void bite() {
        System.out.println("Monkey is biting");
    }
}

class Human extends Monkey implements BasicAnimal {

    void speak() {
        System.out.println("Human is speaking");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping");
    }
}



public class Interfacetask1 {
	
	public static void main(String[] args) {
		Human h = new Human();

        h.jump();
        h.bite();
        h.speak();
        h.eat();
        h.sleep();
    
}

	}



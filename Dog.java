public class Dog extends Animal implements Comparable<Animal>{
	String name;
	int legs;
	
	public Dog(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}
	public String getName() {
		return name;
	}
	public int getLegs() {
		return legs;
	}
	
	@Override
	public int compareTo(Animal a) {
		return name.compareToIgnoreCase(a.getName());
	}
	public String toString() {
		return this.getName() + " " + this.getLegs();
	}
	
}

# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

1.A list of dogs. 2.Dog("Fido", 4 legs)) 3.Dog("Fido", 3 legs)) 4.Dog("Alfie", 4 legs)
5.One comparator of dogs.

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?

This is the comparator constructor call "Collections.sort(dogs, new Comparator<Animal>()"

Below is the class definition for the comparator.
Collections.sort(dogs, new Comparator<Animal>(){
			@Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}
		});
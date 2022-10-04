package optionals;

import java.util.Optional;

public class Fruit {

	String colour;
	Integer quantity;
	String name;

	public Fruit() {
	};

	public Fruit(String colour, Integer quantity, String name) {
		this.colour = colour;
		this.quantity = quantity;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getStock() {
		return Integer.toString(quantity);
	}

	public String getColour() {
		return colour;
	}

	public void fruitNull() {
		// The ofNullable function wraps around the object or variable and means that if
		// it is null, Java won't throw an exception. We we just use Optional.of then
		// Java will throw an exception whenever it is null. The code below shows a
		// 50/50 chance of either the correct attributes (String, String, and Integer)
		// being added to a new fruit or nothing being added. As the object Apple
		// (fruit) cannot be null, Java would throw an exception, but now it doesn't.
		// This is most useful for things like databases where data may be empty.
		Fruit apple = new Fruit();
		if (Math.random() >= 0.5) {
			apple.name = "Apple";
			apple.colour = "red";
			apple.quantity = 1;
		} else {
			apple.name = null;
			apple.colour = null;
			apple.quantity = null;
		}
		;
		System.out.println(Optional.ofNullable(apple.getName()) + " has been created");
		System.out.println("");
	}
	
	public void fruitPresent() {
		// Next we look at the use of the isPresent() function. We can create a new
		// variable or object as an optional by first 'wrapping' the class name with
		// 'Optional' and then specifying the instance as an 'Optional.of'. From
		// here, optional can now cast to the object and tell us if it is present as a
		// simple boolean, which we print out to look at. The code below shows creating
		// a new instance of Fruit called pear, which is done by wrapping it in the
		// optional class, and then asking the console to print out the result of the
		// isPresent() test. As above, we have used the Math.random function to
		// determine outcome - either we create an Optional Fruit called pear (which
		// should return true, or the Optional Fruit pear is in fact empty (which should
		// return false).
		if (Math.random() >= 0.5) {
			Optional<Fruit> pear = Optional.of(new Fruit("green", 1, "Pear"));
			System.out.println("Optional<Fruit> pear created:");
			System.out.println(pear.isPresent());
		} else {
			Optional<Fruit> pear = Optional.empty();
			System.out.println("Was optional<Fruit> pear created:");
			System.out.println(pear.isPresent());
		}
		System.out.println("");
	}
	
	public void fruitElse() {
		// Here, the optional orElse is being used to determine output. A new fruit,
		// bananas, is created and Math.random() is used to determine whether or not
		// after eating a banana you remember to buy some more. If you did buy more,
		// then the Optional String bananaBuy is called. If you didn't buy bananas then
		// instead the usual string bananaEat is called
		Fruit bananas = new Fruit("yellow", 3, "Bananas");
		if (Math.random() >= 0.5) {
			bananas.quantity = bananas.quantity - 1;
			String bananaEat = "You ate a banana and didn't buy anymore, so have " + bananas.quantity + " bananas!";
			Optional<String> bananaBuy = Optional.empty();
			System.out.println("What is the banana stock like?");
			System.out.println(bananaBuy.orElse(bananaEat));

		} else {
			bananas.quantity = bananas.quantity + 3;
			String bananaEat = "You ate a banana and didn't buy anymore, so have " + bananas.quantity + " bananas!";
			Optional<String> bananaBuy = Optional
					.of("You ate a banana, and then you bough three more, so have " + bananas.quantity + " bananas!");
			System.out.println("What is the banana stock like?");
			System.out.println(bananaBuy.orElse(bananaEat));
		}
		System.out.println("");
	}
	
	public void fruitMap() {
		// Using the .map function, we can use various expressions and perform a
		// function on the optional. In the example below, a function is mapped to
		// orangeStock which tells it to call the amount of oranges. .map is also useful
		// when combined with the ifPresent() function - in the second example below,
		// the stock of strawberries is printed only if they are present, which is
		// determined by the Math.random() function. The combination of the two examples
		// means that the number of Oranges (2) will always be printed, but if no
		// Strawberries are created then nothing else will be printed.
		Optional<Fruit> orange = Optional.of(new Fruit("orange", 2, "Orange"));
		Optional<String> orangeStock = orange.map(Fruit -> Fruit.getStock());
		System.out.print("What new fruit do we have?\nOranges: ");
		System.out.println(orangeStock.get());

		if (Math.random() >= 0.5) {
			Optional<Fruit> strawberries = Optional.of(new Fruit("red", 14, "Strawberries"));
			Optional<String> strawberryPunnet = strawberries.map(Fruit -> Fruit.getStock());
			strawberries.ifPresent(strawberryPunney -> System.out.println("Strawberries: " + strawberryPunnet.get()));
		} else {
			Optional<Fruit> strawberries = Optional.empty();
			Optional<String> strawberryPunnet = strawberries.map(Fruit -> Fruit.getStock());
			strawberries.ifPresent(strawberryPunney -> System.out.println("Strawberries: " + strawberryPunnet.get()));
		}
		System.out.println(" ");
	}
	
	public void fruitThrow() {
		// Here, the ifElseThrow is used to throw an exception when the item is null. In
		// the example below, if grapes aren't instantiated then you can't really ask
		// what colour they are - as a result, a new exception is thrown stating that no
		// grapes were actually bought. If there are grapes, then the colour is returned
		System.out.println("What is the colour of the grapes you bought?");
		if (Math.random() >= 0.5) {
			Optional<Fruit> grapes = Optional.of(new Fruit("purple", 24, "Grapes"));
			Optional<String> grapeColour = grapes.map(Fruit -> Fruit.getColour());
			System.out.println(grapeColour
					.orElseThrow(() -> new RuntimeException(">> You silly little goose - you didn't buy any grapes!")));
		} else {
			Optional<Fruit> grapes = Optional.empty();
			Optional<String> grapeColour = grapes.map(Fruit -> Fruit.getColour());
			System.out.println(grapeColour
					.orElseThrow(() -> new RuntimeException(">> You silly little goose - you didn't buy any grapes!")));
		}
		System.out.println(" ");
	}
	
	public void fruitGet() {
		// Finally, the get() command can be used to get an optional, generally to print
		// it out to the console. In the below example it has been combined with the
		// mapping function to get the name, colour, and quantity of the fruit rather
		// than just it's optional name
		Optional<Fruit> melon = Optional.of(new Fruit("red", 1, "Watermelon"));
		Optional<String> melonName = melon.map(Fruit -> Fruit.getName());
		Optional<String> melonColour = melon.map(Fruit -> Fruit.getColour());
		Optional<String> melonStock = melon.map(Fruit -> Fruit.getStock());
		System.out.println("Here are some facts about this fruit!\n" + melonName.get() + " is " + melonColour.get()
				+ " and you currently own " + melonStock.get());
		
		System.out.println("");
	}
}

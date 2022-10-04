package personSolutions;

import java.util.ArrayList;
import java.util.List;

public class PersonHandler extends Person {

	List<Person> people = new ArrayList<>();

	public PersonHandler() {
	}

	public PersonHandler(List<Person> people) {
		this.people = people;
	}

	public void addPerson(Person person) {
		this.people.add(person);
	}

	public void removePerson(Person person) {
		this.people.remove(person);
	}

	public Person findByName(String name) {
		for (Person p : people) {
			if (p.getName().equalsIgnoreCase(name)) {
				return p;
			}
		}
		return null;
	}

	@Override
	public String personString() {
		String details = (getName() + " is " + getAge() + " years old and works as a " + getJob());
		return details;
	}
}

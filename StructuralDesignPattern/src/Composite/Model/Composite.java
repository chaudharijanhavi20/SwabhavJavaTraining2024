package Composite.Model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponents {
	String name;

	public Composite(String name) {
		super();
		this.name = name;
	}

	List<IComponents> components = new ArrayList<>();

	public void addComponents(IComponents com) {
		components.add(com);
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		for (IComponents c : components) {
			c.showPrice();
		}
	}

}

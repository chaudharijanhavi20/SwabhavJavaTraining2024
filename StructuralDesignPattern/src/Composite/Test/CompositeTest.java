package Composite.Test;

import Composite.Model.Composite;
import Composite.Model.IComponents;
import Composite.Model.Leaf;

public class CompositeTest {
	public static void main(String[] args) {
		IComponents hd = new Leaf(4000, "HDD");
		IComponents monitor = new Leaf(5000, "MONITOR");
		IComponents mouse = new Leaf(450, "MOUSE");
		IComponents ram = new Leaf(1000, "RAM");
		IComponents cpu = new Leaf(6000, "CPU");

		Composite cabinet = new Composite("CABINET");
		Composite mb = new Composite("MB");
		Composite ph = new Composite("PH");
		Composite computer = new Composite("COMPUTER");

		cabinet.addComponents(hd);
		cabinet.addComponents(mb);
		mb.addComponents(cpu);
		mb.addComponents(ram);
		ph.addComponents(monitor);
		ph.addComponents(mouse);
		computer.addComponents(ph);
		computer.addComponents(cabinet);

		computer.showPrice();

	}
}

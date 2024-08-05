package Proxy.Model;

public class RealDocument implements IDocument {
	private String name;

	public RealDocument(String name) {
		this.name = name;
	}

	@Override
	public void open() {
		System.out.println("Opening document: " + name);
	}

}

package Proxy.Model;

public class ProxyDocument implements IDocument {
	private String name;
	private RealDocument realDocument;
	private boolean permissionGranted = false;

	public ProxyDocument(String name) {
		this.name = name;
	}

	@Override
	public void open() {
		if (permissionGranted) {
			if (realDocument == null) {
				realDocument = new RealDocument(name);
			}
			realDocument.open();
		} else {
			System.out.println("Permission denied.");
		}
	}

	public void setPermission(boolean permissionGranted) {
		this.permissionGranted = permissionGranted;
	}

}

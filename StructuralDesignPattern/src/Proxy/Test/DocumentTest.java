package Proxy.Test;

import Proxy.Model.ProxyDocument;

public class DocumentTest {
public static void main(String[] args) {
	ProxyDocument proxyDocument = new ProxyDocument("Confidential Report");
	proxyDocument.open(); 
	proxyDocument.setPermission(true);
	proxyDocument.open(); 
}
}

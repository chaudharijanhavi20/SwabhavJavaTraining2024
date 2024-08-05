package Sreaming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingTest {
public static void main(String[] args) throws IOException{
	FileInputStream fileInputStream=new FileInputStream("D:\\Aurionpro\\Streams\\src\\Sreaming\\Aurionpro");
	int ch;
	FileOutputStream fileOutputStream=new FileOutputStream("D:\\Aurionpro\\Streams\\src\\Sreaming\\Aurionpro2");
	while((ch=fileInputStream.read()) !=-1){
		fileOutputStream.write(ch);
	}
	fileInputStream.close();
}
}

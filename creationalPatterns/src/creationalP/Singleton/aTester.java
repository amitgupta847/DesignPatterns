package creationalP.Singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class aTester {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		DateUtil dateU1 = DateUtil.getInstance();

		// write
		FileOutputStream stream = new FileOutputStream(
				new File("D:\\java_workspace_aug2020\\DesignPatterns\\testFiles\\dateUtil.ser"));
		ObjectOutputStream oos = new ObjectOutputStream(stream);
		oos.writeObject(dateU1);

		// read back
		FileInputStream streamRead = new FileInputStream(
				new File("D:\\java_workspace_aug2020\\DesignPatterns\\testFiles\\dateUtil.ser"));
		ObjectInputStream oInputS = new ObjectInputStream(streamRead);
		DateUtil dateU2 = (DateUtil) oInputS.readObject();

		oos.close();
		oInputS.close();
		
		System.out.println(dateU1 == dateU2);
		System.out.println("Singleton serialization test");
	}
}

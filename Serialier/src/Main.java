
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		//Serialization: is the process of converting an object into a byte stream
		//Byte Stream can be saved as a file (.ser) which is a platform independent
		//Think of this as if you are saving a file with the Object's information
		//A Byte stream is a sequence of bytes or called Binary Sequence.
		//Deserialization: the reverse of converting a byte stream back to an Object.
		
		NewTaxForCounties tax = new NewTaxForCounties();
		
		tax.countyName = "Riverside";
		tax.cityName = "Corona";
		tax.secretPassword = "tax<3!increase";
		tax.amountIncrease = 8.75;
		
		tax.showTaxInfo();
		
		//Important Steps Below:
		//Step 1: Your object class should be implemented Serializable
		//Step 2: Add import java.io.Serializable
		//Step 3: FileOutputStream fileOut = new FileOutputStream(.ser)
		//Step 4: ObjectOutputStream out = new ObjectOutputStream(fileOut)
		//Step 5: out.writerObject(Object name)
		//Step 6: out.close(); fileOut.close();
		
		FileOutputStream fileOut = new FileOutputStream("FeeTables.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(tax);
		out.close();
		fileOut.close();
		
		System.out.println("Object tax info saved! :)");
		
	}
		
}

package Flight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Flight {
	
	public void addpassenger() throws IOException{
		
		BufferedReader reader = null;
		int passengers = 0;
		reader = new BufferedReader( new FileReader("C:\\Users\\Tushar\\Desktop\\File.txt"));
		String line = null;
		while((line = reader.readLine()) != null) {
			String [] parts = line.split(" ");
			passengers += Integer.valueOf(parts[0]);
			System.out.println(parts[0]);
					
		}
	}
	
}

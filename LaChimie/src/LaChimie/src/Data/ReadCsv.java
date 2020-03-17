package Data;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Chimie.Atome;
import Chimie.ListAtome;

public class ReadCsv extends ListAtome{
	
	public void ReadCSVAtome(String separator, String fileName) {
		String line, fields[];
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			br.readLine();			
			while((line = br.readLine()) != null) {
				fields = line.split(separator);
				Atome atome = new Atome(fields[0], fields[1], fields[2], fields[3]);
				double masseAtomique =Double.parseDouble(fields[2]);
				add(atome);
			}
		
		br.close();
		}
		catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
	} 
		
		catch (IOException e) {
		System.err.println(e.getMessage());
	}
	}
}
	import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TemperatureAverage {

	final String DELIMITER = ",";
	

	//Reader - gets line (String)
	
		//ReadLine(String
			//Split tokens
			//Parse tokens as ints
			//Average and count tokens
			//returns int[av][num]
		
		//Adds to int[][]
			
	
		
	
	public void launch(String filename){
			String line;
			String[] tokens;
			List temperatureRecords = new ArrayList();
				
			BufferedReader reader = null;
			try{
				FileReader in = new FileReader(filename);
				reader = new BufferedReader(in);
				while (((line = reader.readLine()) != null)){
					temperatureRecords.add(this.parseLine(line));
				}
				
				this.printRecords(temperatureRecords);
				
			}catch (FileNotFoundException ex){
				System.out.println("No such file '"+filename+"'");
				
			} catch (IOException ex) {
				ex.printStackTrace();
			}finally{
				try{
					if (reader != null)
						reader.close();
				}catch (IOException ex){
					ex.printStackTrace();
				}
			}
		}


	private void printRecords(List temperatureRecords) {
		// TODO Auto-generated method stub
		
	}


	private int[] parseLine(String line) {
		int[] result = new int[2];
		String[] tokens = line.split(DELIMITER);
		
		
		//TODO - Add in a splitter here
		
		
		
		return result;
	}

}



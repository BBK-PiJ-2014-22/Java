	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

public class TemperatureAverage {

	final String DELIMITER = ",";
	

	
	public int[] splitLine(String filename){
		
	
	}
	
	public void readLines(String filename){
			String line;
			String[] tokens;
				
			BufferedReader reader = null;
			try{
				FileReader in = new FileReader(filename);
				reader = new BufferedReader(in);
				while (((line = reader.readLine()) != null)){
					tokens = line.split(DELIMITER);
					
				}
				
							
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

	}

	
	
}

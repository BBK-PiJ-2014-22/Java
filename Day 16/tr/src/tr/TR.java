package tr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TR {

	public static void main(String[] args){
		TR tr = new TR();
		String file = args[0];
		String oldString = args[1];
		String newString = args[2];
				
		tr.launch(file, oldString, newString);
	}
	
	public void launch(String file,String oldString, String newString){
		
	}

	public void display(String filename,String oldString, String newString){
		String line;
		BufferedReader reader = null;
		
		try{
			FileReader in = new FileReader(filename);
			reader = new BufferedReader(in);
			while (((line = reader.readLine()) != null))
				System.out.println(line);
			
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
	
	public String removeString(String line, String oldString, String newString){
		int lineCharacter = 0;
		int tokenCharacter = 0;
		String currentToken = "";
		
		
		
		
		
		
		return "Foobar";
		
		
		
	}
}

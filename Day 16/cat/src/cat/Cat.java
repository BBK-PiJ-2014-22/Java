package cat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Cat {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.launch(args);
	}
	
	public void launch(String[] args){
		for (int i = 0; i < args.length ; i++){
			display(args[i]);
		}
	}
	
	public void display(String filename){
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

}

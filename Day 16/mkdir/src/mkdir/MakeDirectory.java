package mkdir;

import java.io.File;


public class MakeDirectory {

	public static void main(String[] args) {
		MakeDirectory mkd = new MakeDirectory();
		mkd.launch(args[0]);
	}
	
	public void launch(String directory){
		this.makeDirectory(directory);
	}
	
	public void makeDirectory(String newDir){
		String currentDir = System.getProperty("user.dir");
		
		if (newDir.charAt(0) == '/')
			newDir = newDir.substring(1,newDir.length());
			
		newDir = currentDir+"/"+newDir;
		
		File directory = new File(newDir);
		
		directory.mkdirs();
		
		
	}

}

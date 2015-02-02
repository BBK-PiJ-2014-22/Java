import java.io.File;

public class DirectoryDisplay {
	
	public static void main(String[] args){
		
	String[] list = displayList();
		for (int i = 0; i < list.length ; i++){
			System.out.println(list[i]);
		}
	
	}
	
	
	public static String[] displayList(){
		String currentDir = System.getProperty("user.dir");
		File directory = new File(currentDir);
		return directory.list(); 		
	}	
	
}

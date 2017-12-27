import java.io.File;

public class searchallpathindirectory {
	
	public static void main (String[] args){
		File f = new File ("/home/cloudera/Documents");
		getpath(f,1);
	}
	public static void getpath (File f, int depth){
		StringBuffer space = new StringBuffer();
		for(int i=0; i<depth;i++){
			space.append(" ");
		}
		File[] childfile = f.listFiles();
		for (int i = 0; i<childfile.length; i++)
		{	System.out.println(space.toString()+childfile[i]);
			if(childfile[i].isDirectory()){	
				getpath(childfile[i],depth++);
			}
		}	
	}
}
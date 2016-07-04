package bouffeMaison;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class remplissageTableau {
	
	public ArrayList<String> remplissageTableau(ArrayList<String> tableauBouffePasRempli) throws IOException{
		
		String fichier = "ProgrammeBouffe.txt";
		
		try {

			
			Path filePath = new File("E:\\Users\\Arnaud\\Desktop\\ProgrammeBouffe.txt").toPath();
			
			
			Charset charset = Charset.defaultCharset();
			
			List<String> stringList = Files.readAllLines(filePath, charset);
			
			
			for (int i = 0; i < stringList.size(); i++)
			{
				//System.out.println(stringList.get(i));
				tableauBouffePasRempli.add(stringList.get(i));
				//System.out.println(tableauBouffePasRempli.get(i));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		
		return tableauBouffePasRempli;
	}

}

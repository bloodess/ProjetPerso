package bouffeMaison;

import java.util.ArrayList;

public class FonctionTriTab {
	
	public String[] tableauDeuxSemaines(ArrayList<String> tableauBouffe){
		
		String[] tableauDeuxSemaines = new String[14];
		
		int lower = 0;
		int higher = 15;
		
		int random = (int)(Math.random() * (higher + 1-lower)) + lower;
		
		for (int i = 0; i < tableauBouffe.size();i++ ){
			tableauDeuxSemaines[i] = tableauBouffe.get(random);
			System.out.println("tableau random : "+tableauDeuxSemaines[i]);
		}
		//test de github coucou ta mere caca
		
		return tableauDeuxSemaines;
	}

}

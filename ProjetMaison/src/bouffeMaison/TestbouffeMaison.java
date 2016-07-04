package bouffeMaison;

import java.io.IOException;
import java.util.ArrayList;

public class TestbouffeMaison {
	
	public static void main(String args[]) throws IOException{
		
		remplissageTableau fonctionRemplissage = new remplissageTableau();
		
		FonctionTriTab fonctionTri = new FonctionTriTab();
		
		ArrayList<String> ListBouffe = new ArrayList<String>();
		
		fonctionRemplissage.remplissageTableau(ListBouffe);
		
		fonctionTri.tableauDeuxSemaines(ListBouffe);
		
	}

}

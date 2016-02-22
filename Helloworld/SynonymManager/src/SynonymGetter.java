/** Author(s)/Contributor(s): Fausto Tommasi
 *  Date: 2/21/2016
 *  Purpose: First implementation of SynonymManager that will use a Thesaurus
 */



import edu.smu.tspell.wordnet.Synset;
import edu.smu.tspell.wordnet.WordNetDatabase;


public class SynonymGetter implements SynonymManager{
	//private Synset[] mySyns;
	
	
	public SynonymGetter(){
		
	}
	
	@Override
	public Synset[] getSynonym(String target) {
		// TODO(Fausto): Implement and test against an open knowledge source 
		WordNetDatabase database = WordNetDatabase.getFileInstance();		
		Synset[] mySyns = database.getSynsets(target);		
		return mySyns;
	}

}

package home.joci.dependencyinjection;

import java.util.List;
import java.util.Objects;

public class SpellChecker {
	
	private final Lexicon dictionary;

	public SpellChecker(Lexicon dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
	}
	
	public void isValid(String world) {
		
	}
	
	public List<String> suggestion(String typo){
		return null;
	}
	
}

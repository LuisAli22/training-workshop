package ar.com.learsoft.training;

import ar.com.learsoft.training.utils.ArgumentValidator;

public class App {
	/* PRE: Recibe una frase por argumento. La frase es ingresada entre comillas
	 * como unico argumento.
	 * POS: Cuenta la cantidad de palabras, la cantidad de consonantes y la 
	 * cantidad de palabras con mas de tres vocales diferentes e imprime por
	 * stdout dichas cantidades. 
	 * */
    public static void main( String[] args ){

        try {
        	ArgumentValidator argumentValidator= new ArgumentValidator(args);
        	argumentValidator.validate();
        	String phrase= argumentValidator.getPhrase();
			PhraseAnalyzer phraseAnalyzer= new PhraseAnalyzer();
			phraseAnalyzer.printCount(phrase);
			phraseAnalyzer.countConsonants();
			phraseAnalyzer.printCount(phrase);
			phraseAnalyzer.countMoreThanThreeDifferentVowelsWords();
			phraseAnalyzer.printCount(phrase);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
    }
}

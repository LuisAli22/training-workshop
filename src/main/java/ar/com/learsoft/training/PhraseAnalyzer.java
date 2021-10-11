package ar.com.learsoft.training;

import java.util.List;

import ar.com.learsoft.training.state.ConsonantCounterState;
import ar.com.learsoft.training.state.MoreThanThreeDifferentVowelsWordCounterState;
import ar.com.learsoft.training.state.PhraseAnalyzerState;
import ar.com.learsoft.training.state.WordCounterState;

public class PhraseAnalyzer {
	
	private PhraseAnalyzerState state;

	/* PRE: Ninguna
	 * POS: Inicializa al analizador de frases en el estado de conteo de 
	 * palabras.
	 * */
	public PhraseAnalyzer(){
		
		this.state = new WordCounterState();
	}
	/* PRE: Recibe una cadena con la frase recibida.
	 * POS: Imprime por stdout la cantidad de cosas que se deseaba buscar 
	 * dentro de la frase.
	 * */
	public void printCount(String phrase) {
        this.state.printCount(phrase);
   
    }
	/* PRE: Ninguna
	 * POS: Se pone al analizador de frase en el estado de conteo de palabras.
	 * */
	public void countWords() {
		this.state= new WordCounterState();
	}
	/* PRE: Ninguna
	 * POS: Se pone al analizador de frase en el estado de conteo de 
	 * consonantes.
	 * */
	public void countConsonants() {
		this.state= new ConsonantCounterState();
	}
	/* PRE: Ninguna
	 * POS: Se pone al analizador de frase en el estado de conteo de palabras
	 * con mas de tres vocales diferentes.
	 * */
	public void countMoreThanThreeDifferentVowelsWords() {
		this.state= new MoreThanThreeDifferentVowelsWordCounterState();
	}
}

package ar.com.learsoft.training.state;

import ar.com.learsoft.training.utils.Definitions;

public class WordCounterState extends PhraseAnalyzerState{
	/* PRE: Recibe una cadena con la frase indicada por argumento
	 * POS: Cuenta la cantidad de palabras que contiene la frase y muestra 
	 * dicho valor por stdout.
	 * */
	@Override
	public void printCount(String phrase) {
		this.currentCount=Definitions.INITIAL_COUNT;
		System.out.println("Contando palabras!!!");
	}

}

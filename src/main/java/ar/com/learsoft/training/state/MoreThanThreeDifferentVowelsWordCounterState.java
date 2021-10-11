package ar.com.learsoft.training.state;

import ar.com.learsoft.training.utils.Definitions;

public class MoreThanThreeDifferentVowelsWordCounterState extends PhraseAnalyzerState{
	/* PRE: Recibe una cadena con la frase indicada por argumento
	 * POS: Cuenta la cantidad de palabras dentro de la frase que contienen 
	 * mas de tres vocales diferentes y muestra dicho valor por stdout.
	 * */
	@Override
	public void printCount(String phrase) {
		this.currentCount=Definitions.INITIAL_COUNT;
		System.out.println("Contando palabras con mas de tres vocales!!!");
	}

}

package ar.com.learsoft.training.state;

import ar.com.learsoft.training.utils.Definitions;

public class ConsonantCounterState extends PhraseAnalyzerState{
	/* PRE: Recibe una cadena con la frase indicada por argumento
	 * POS: Cuenta la cantidad de consonantes que contiene la frase y muestra 
	 * dicho valor por stdout.
	 * */
	@Override
	public void printCount(String phrase) {
		this.currentCount=Definitions.INITIAL_COUNT;
		int consonantes = 0;
		for(int i=0;i <phrase.length(); i++) {
			char letra = phrase.charAt(i);
				if(esConsonante(letra)) {
					consonantes++;
				}
			}
		System.out.println("La cantidad de consonantes es: " + consonantes);
		}
		
		
	
	private boolean esConsonante (char letra) {
		return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
		
	}
}

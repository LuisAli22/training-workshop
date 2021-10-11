package ar.com.learsoft.training.state;

import ar.com.learsoft.training.utils.Definitions;

public abstract class PhraseAnalyzerState {
	protected int currentCount;
	public abstract void printCount(String phrase);
	/* PRE: Ninguna
	 * POS: Inicializa al estado poniendo el valor INITIAL_COUNT al conteo
	 * actual
	 * */
	public PhraseAnalyzerState() {
		this.currentCount=Definitions.INITIAL_COUNT;
	}
}

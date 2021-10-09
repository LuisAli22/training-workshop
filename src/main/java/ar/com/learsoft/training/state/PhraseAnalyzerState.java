package ar.com.learsoft.training.state;

import ar.com.learsoft.training.utils.Definitions;

public abstract class PhraseAnalyzerState {
	protected int currentCount;
	protected String phrase;
	public abstract void printCount(String phrase);
	public PhraseAnalyzerState() {
		this.currentCount=Definitions.INITIAL_COUNT;
	}
	public int getCurrentCount() {
		return currentCount;
	}
}

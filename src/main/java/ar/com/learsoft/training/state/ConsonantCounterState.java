package ar.com.learsoft.training.state;

import ar.com.learsoft.training.utils.Definitions;

public class ConsonantCounterState extends PhraseAnalyzerState{

	@Override
	public void printCount(String phrase) {
		this.currentCount=Definitions.INITIAL_COUNT;
		System.out.println("Contando consonantes!!!");
		
	}

}

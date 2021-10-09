package ar.com.learsoft.training.state;

public class ConsonantCounterState extends PhraseAnalyzerState{

	@Override
	public void printCount(String phrase) {
		System.out.println("Contando consonantes!!!");
		
	}

}

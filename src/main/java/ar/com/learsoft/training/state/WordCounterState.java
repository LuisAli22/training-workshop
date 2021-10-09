package ar.com.learsoft.training.state;

public class WordCounterState extends PhraseAnalyzerState{

	@Override
	public void printCount(String phrase) {
		System.out.println("Contando palabras!!!");
	}

}

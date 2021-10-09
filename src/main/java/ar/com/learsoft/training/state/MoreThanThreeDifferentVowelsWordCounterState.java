package ar.com.learsoft.training.state;

public class MoreThanThreeDifferentVowelsWordCounterState extends PhraseAnalyzerState{

	@Override
	public void printCount(String phrase) {
		System.out.println("Contando palabras con mas de tres vocales!!!");
	}

}

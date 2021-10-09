package ar.com.learsoft.training.utils;

import java.util.Arrays;
import java.util.List;

public class ArgumentValidator {
	private List<String> args;
	private String phrase;

	public ArgumentValidator(String[] args) {
		this.args = Arrays.asList(args);
	}
	public void validate() {
		if (badArgAmount()){
            throw new IllegalArgumentException("Debe ingresar la frase en 1 segmento indicado entre comillas");
        }
		this.phrase= this.args.get(Definitions.PHRASE_ARGUMENT_INDEX);
	}
	public String getPhrase() {
		return phrase;
	}
	private boolean badArgAmount() {
        return (args.size()!= Definitions.MAX_ARGUMENT_AMOUNT);
    }
	
}

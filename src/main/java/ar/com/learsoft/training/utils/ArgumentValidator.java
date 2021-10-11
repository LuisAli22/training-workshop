package ar.com.learsoft.training.utils;

import java.util.Arrays;
import java.util.List;

public class ArgumentValidator {
	private List<String> args;
	private String phrase;

	/* PRE: Recibe el argumento del programa principal
	 * POS: Construye ArgumentValidator con el argumento pasado por parametro
	 * */
	public ArgumentValidator(String[] args) {
		this.args = Arrays.asList(args);
	}
	/* PRE: Ninguno
	 * POS: Si se recibió unico argumento, setea el valor recibido como frase.
	 * Caso contrario lanza una excepción indicando que la cantidad de 
	 * argumentos recibidos es incorrecta.
	 * */
	public void validate() {
		if (badArgAmount()){
            throw new IllegalArgumentException(
            		Definitions.BAD_ARGUMENT_AMOUNT_ERROR_MESSAGE);
        }
		this.phrase= this.args.get(Definitions.PHRASE_ARGUMENT_INDEX);
	}
	/* PRE: Ninguna
	 * POS: Devuelve una cadena con la frase recibida por parametro.
	 * */
	public String getPhrase() {
		return phrase;
	}
	/* PRE: Ninguna.
	 * POS: Si la cantidad de argumentos recibidos es distinta a 
	 * MAX_ARGUMENT_AMOUNT devuelve True, sinio False. 
	 * */
	private boolean badArgAmount() {
        return (args.size()!= Definitions.MAX_ARGUMENT_AMOUNT);
    }
	
}

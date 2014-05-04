package plp.expressions1.expression;

import plp.expressions1.util.Tipo;
import plp.expressions1.util.TipoPrimitivo;

/**
 * 
 * @author Suzanna
 * Encapsula uum valor Char
 */
public class ValorChar extends ValorConcreto<Character>{

	public ValorChar(Character valor) {
		super(valor);
	}

	/**
	 * Retorna os tipos possiveis desta expressao.
	 * 
	 * @return os tipos possiveis desta expressao.
	 */
	public Tipo getTipo() {
		return TipoPrimitivo.CHARACTER;
	}
	
}

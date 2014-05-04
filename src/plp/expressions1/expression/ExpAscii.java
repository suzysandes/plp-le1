package plp.expressions1.expression;

import plp.expressions1.util.Tipo;
import plp.expressions1.util.TipoPrimitivo;

public class ExpAscii extends ExpUnaria{

	public ExpAscii(Expressao exp) {
		super(exp, "ascii");
	}

	/**
	 * Retorna o valor ascii do caracter
	 */
	public Valor avaliar(){
		return new ValorInteiro((int)((ValorChar) getExp().avaliar()).valor());
	}

	/**
	 * Realiza a verificacao de tipos desta expressao.
	 *
	 * @return <code>true</code> se os tipos da expressao sao validos;
	 *          <code>false</code> caso contrario.
	 */
	protected boolean checaTipoElementoTerminal() {
		return (getExp().getTipo().eChar());
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

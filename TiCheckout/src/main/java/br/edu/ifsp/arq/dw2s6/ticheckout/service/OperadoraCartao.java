package br.edu.ifsp.arq.dw2s6.ticheckout.service;

import br.edu.ifsp.arq.dw2s6.ticheckout.model.CartaoCredito;
import br.edu.ifsp.arq.dw2s6.ticheckout.model.Compra;

public interface OperadoraCartao {
	
	boolean autorizar(Compra compra, CartaoCredito cartao);
	
}

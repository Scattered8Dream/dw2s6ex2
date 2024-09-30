package br.edu.ifsp.arq.dw2s6.ticheckout.implementation;

import br.edu.ifsp.arq.dw2s6.ticheckout.model.Compra;
import br.edu.ifsp.arq.dw2s6.ticheckout.model.CartaoCredito;
import br.edu.ifsp.arq.dw2s6.ticheckout.service.OperadoraCartao;
import org.springframework.stereotype.Service;

@Service
public class Cielo implements OperadoraCartao {

	@Override
	public boolean autorizar(Compra compra, CartaoCredito cartao) {
		
		return cartao.getNumeroCartao().startsWith("1234") && compra.getValorTotal() < 1000;

	}
}

package br.edu.ifsp.arq.dw2s6.ticheckout.service;

import br.edu.ifsp.arq.dw2s6.ticheckout.model.Compra;
import br.edu.ifsp.arq.dw2s6.ticheckout.model.CartaoCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

	private final OperadoraCartao operadoraCartao;

    @Autowired
    public CheckoutService(OperadoraCartao operadoraCartao) {
        this.operadoraCartao = operadoraCartao;
    }

    public boolean processarPagamento(Compra compra, CartaoCredito cartao) {
        return operadoraCartao.autorizar(compra, cartao);
    }
}

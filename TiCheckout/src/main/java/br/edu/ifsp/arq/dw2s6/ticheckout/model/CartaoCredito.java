package br.edu.ifsp.arq.dw2s6.ticheckout.model;

import java.lang.String;

public class CartaoCredito {

	private String numeroCartao;
    private String nomeCliente;
    private String validade;

    // Construtores, Getters e Setters
    public CartaoCredito(String numeroCartao, String nomeCliente, String validade) {
        this.numeroCartao = numeroCartao;
        this.nomeCliente = nomeCliente;
        this.validade = validade;
    }

    // Getters e Setters
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getValidade() {
        return validade;
    }
}

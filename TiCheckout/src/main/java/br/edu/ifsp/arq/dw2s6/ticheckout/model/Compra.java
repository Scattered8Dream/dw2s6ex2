package br.edu.ifsp.arq.dw2s6.ticheckout.model;

import java.lang.String;

public class Compra {
    private String numeroCompra;
    private String nomeCliente;
    private String nomeProduto;
    private double valorTotal;

    // Construtores, Getters e Setters

    public Compra(String numeroCompra, String nomeCliente, String nomeProduto, double valorTotal) {
        this.numeroCompra = numeroCompra;
        this.nomeCliente = nomeCliente;
        this.nomeProduto = nomeProduto;
        this.valorTotal = valorTotal;
    }

    // Getters e Setters
    public String getNumeroCompra() {
        return numeroCompra;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}

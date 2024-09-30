package br.edu.ifsp.arq.dw2s6.ticheckout.controller;

import br.edu.ifsp.arq.dw2s6.ticheckout.model.Compra;
import br.edu.ifsp.arq.dw2s6.ticheckout.model.CartaoCredito;
import br.edu.ifsp.arq.dw2s6.ticheckout.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.lang.String;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

	private final CheckoutService checkoutService;

	@Autowired
	public CheckoutController(CheckoutService checkoutService) {
		this.checkoutService = checkoutService;
	}

	@PostMapping("/compra")
	public String realizarCompra(@RequestBody Compra compra, @RequestBody CartaoCredito cartao) {
		boolean autorizado = checkoutService.processarPagamento(compra, cartao);

		if (autorizado) {
			return "Compra autorizada com sucesso!";
		} else {
			return "Compra não autorizada.";
		}
	}
}

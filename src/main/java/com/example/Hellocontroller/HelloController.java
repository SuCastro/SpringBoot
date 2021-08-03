package com.example.Hellocontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Atividade")
public class HelloController {

    @GetMapping("/Habilidades-e-Mentalidades")
    public String rota1() {
        return "Com toda certeza, as habilidades utilizadas foram trabalho em equipe e"
                + " muita mais muitaa (mesmo que foi) persistencia";
    }

    @GetMapping("/Auto-cobrança")
    public String rota2() {
        return "Surtei hoje e me cobrei muito. Mas, consegui me superar e FINALIZAR ISSO !!!"
        		+ "OBRIGADA DEUS <3";
    }
	
	@GetMapping
	public String hello() {
		return"Hello World *_*";
	}
}

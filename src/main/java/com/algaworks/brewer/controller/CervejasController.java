package com.algaworks.brewer.controller;

import com.algaworks.brewer.model.Cerveja;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CervejasController {

    @RequestMapping("/cervejas/novo")
    public String novo() {
        return "cerveja/CadastroCerveja";
    }

    @RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
    public String cadastrar(Cerveja cerveja){
        /*
           O vinculo é feito pelo nome que está no input do html

         */
        System.out.println("Cadastrando...." + cerveja.getSku());
        return "cerveja/CadastroCerveja";
    }
}

package com.teste.xml.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/processo")
public class TransformaController {

    @PostMapping()
    public ProcessoNovo buscaProcesso(@RequestBody ProcessoNovo processoNovo){
        return processoNovo;
    }

}

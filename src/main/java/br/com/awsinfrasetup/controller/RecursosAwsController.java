package br.com.awsinfrasetup.controller;

import br.com.awsinfrasetup.service.impl.RecursosAwsServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/recursos")
public class RecursosAwsController {

    private final RecursosAwsServiceImpl recursosAwsServiceImpl;

    public RecursosAwsController(RecursosAwsServiceImpl recursosAwsServiceImpl) {
        this.recursosAwsServiceImpl = recursosAwsServiceImpl;
    }

    @GetMapping("/{nomeDoServico}")
    public ResponseEntity<?> listarPossiveisAcoes(@PathVariable String nomeDoServico) {
        String teste = recursosAwsServiceImpl.buscaListaDeFuncionalidesDeAlgumServicoAWS(nomeDoServico);
        return ResponseEntity.ok().build();
    }

}

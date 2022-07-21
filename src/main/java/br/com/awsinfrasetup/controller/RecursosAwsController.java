package br.com.awsinfrasetup.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/recursos")
public class RecursosAwsController {

    public RecursosAwsController() {

    }

    @GetMapping("/{nomeDoServico}")
    public ResponseEntity<?> listarPossiveisAcoes() {
        return ResponseEntity.ok().build();
    }

}

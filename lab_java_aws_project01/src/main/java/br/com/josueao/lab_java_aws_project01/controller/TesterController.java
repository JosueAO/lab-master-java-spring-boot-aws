package br.com.josueao.lab_java_aws_project01.controller;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TesterController {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(TesterController.class);

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> dogTeste(@PathVariable String name) {
        LOG.info("Test controller - name: {}", name);

        return ResponseEntity.ok("Name: " + name);
    }
}

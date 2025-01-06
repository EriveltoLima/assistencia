package com.example.demo.layers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.layers.entities.Cliente;
import com.example.demo.layers.services.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

        @Autowired
        private ClienteService clienteService;

        @PostMapping
        public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
            Cliente newCliente = clienteService.saveCliente(cliente);
            return ResponseEntity.ok(newCliente);
        }

        @GetMapping
        public ResponseEntity<List<Cliente>> getAllClientes() {
            List<Cliente> clientes = clienteService.getAllClientes();
            return ResponseEntity.ok(clientes);
        }

        @GetMapping("/{id}")
        public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
            Cliente cliente = clienteService.getClienteById(id);
            return ResponseEntity.ok(cliente);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente clienteDetails) {
            Cliente updatedCliente = clienteService.updateCliente(id, clienteDetails);
            return ResponseEntity.ok(updatedCliente);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteCliente(@PathVariable Cliente id) {
            clienteService.saveCliente(id);
            return ResponseEntity.noContent().build();
        }
    }


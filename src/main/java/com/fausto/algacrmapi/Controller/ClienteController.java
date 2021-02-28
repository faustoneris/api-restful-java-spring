package com.fausto.algacrmapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fausto.algacrmapi.Cliente;
import com.fausto.algacrmapi.Controller.com.fausto.com.fausto.ClienteRepository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    /**
     *
     */
    @Autowired
    private ClienteRepository ClienteRepository;

    @GetMapping
    public List<Cliente> listar() {
        List<Cliente> listar[];
        {
            return ClienteRepository.findAll();
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return ClienteRepository.save(cliente);
    }

    @DeleteMapping("{id}")
        public  void delete(@PathVariable("id") long id) {
            if (ClienteRepository.existsById(id)) {
                ClienteRepository.deleteById(id);
            } 
        }
    }
			
		
    


     
    
    




package br.com.cro.desafioemprestimospf.controller;

import br.com.cro.desafioemprestimospf.dto.ClienteDto;
import br.com.cro.desafioemprestimospf.dto.ContaDto;
import br.com.cro.desafioemprestimospf.mapper.ClienteMapper;
import br.com.cro.desafioemprestimospf.model.Cliente;
import br.com.cro.desafioemprestimospf.repository.ClienteRepository;
import br.com.cro.desafioemprestimospf.service.ClienteService;
import br.com.cro.desafioemprestimospf.service.ContaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ClienteController {

    private final ClienteService clienteService;
    private final ClienteMapper clienteMapper;

    private final ClienteRepository clienteRepository;

    @PostMapping("/cliente")
    public ResponseEntity<Cliente> save(@Valid @RequestBody ClienteDto clienteDto) {
        return new ResponseEntity<>(clienteRepository.save(
                clienteMapper.dtoToModel(clienteDto)),HttpStatus.CREATED);
    }

//    @GetMapping("/cliente")
//    public ResponseEntity<List<ClienteDto>> findAll() {
//        return new ResponseEntity<>(clienteMapper.modelsToDtos(clienteRepository.findAll()), HttpStatus.OK);
//    }


//




//    @PutMapping("{clienteId}")
//    public ResponseEntity<ClienteResponse> update(@Valid @RequestBody ClienteCadastroRequest clienteCadastroRequest, @PathVariable UUID clienteId) {
//        Cliente cliente = clienteService.update(clienteId, clienteCadastroRequest);
//        ClienteResponse clienteResponse = clienteMapper.toResponse(cliente);
//        return ResponseEntity.status(HttpStatus.OK).body(clienteResponse);
//    }


}

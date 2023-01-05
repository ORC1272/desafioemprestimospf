package br.com.cro.desafioemprestimospf.controller;

import br.com.cro.desafioemprestimospf.dto.ClienteDto;
import br.com.cro.desafioemprestimospf.mapper.ClienteMapper;
import br.com.cro.desafioemprestimospf.model.Cliente;
import br.com.cro.desafioemprestimospf.repository.ClienteRepository;
import br.com.cro.desafioemprestimospf.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private final ClienteService clienteService;
    private final ClienteMapper clienteMapper;
    private final ClienteRepository clienteRepository;

    @PostMapping("/cliente")
    public ResponseEntity<Cliente> save(@Valid @RequestBody ClienteDto clienteDto) {
        return new ResponseEntity<>(clienteRepository.save(
                clienteMapper.dtoToModel(clienteDto)),HttpStatus.CREATED);
    }

    @GetMapping("/cliente")
    public ResponseEntity<List<ClienteDto>> findAll() {
        return new ResponseEntity<>(clienteMapper.modelsToDtos(clienteRepository.findAll()), HttpStatus.OK);
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<ClienteDto> findById(@PathVariable(value = "id") UUID id) {
        return new ResponseEntity<>(clienteMapper.modelToDto(clienteRepository.findById(id).get()), HttpStatus.OK);
    }

//    @DeleteMapping("/id")
//    public void delete(@PathVariable UUID clienteId) {
//        clienteService.delete(clienteId);
//    }


//    @DeleteMapping("/cliente/{id}")
//    public ResponseEntity<Void> deleteById(@PathVariable(value = "id") UUID id) {
//        ClienteDto clienteDto = clienteMapper.modelToDto(clienteRepository.findById(id).get());
//        clienteRepository.deleteById(clienteDto.getId());
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//
//    }



//    @PutMapping("/cliente")
//    public ResponseEntity<ClienteDto> update(@Valid @RequestBody UUID clienteId, ClienteDto clienteDto) {
//        Cliente cliente = clienteService.update(clienteId, clienteDto);
//        ClienteDto clienteDt2= clienteMapper.modelToDto(cliente);
//        return ResponseEntity.status(HttpStatus.OK).body(clienteDto);
//    }

}
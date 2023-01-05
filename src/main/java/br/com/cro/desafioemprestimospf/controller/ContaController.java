package br.com.cro.desafioemprestimospf.controller;

import br.com.cro.desafioemprestimospf.dto.ClienteDto;
import br.com.cro.desafioemprestimospf.dto.ContaDto;
import br.com.cro.desafioemprestimospf.mapper.ContaMapper;
import br.com.cro.desafioemprestimospf.model.Conta;
import br.com.cro.desafioemprestimospf.repository.ContaRepository;
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
public class ContaController {

    private final ContaService contaService;
    private final ContaMapper contaMapper;

    private final ContaRepository contaRepository;

    @PostMapping("/conta")
    public ResponseEntity<Conta> save(@Valid @RequestBody ContaDto contaDto) {
        return new ResponseEntity<>(contaRepository.save(
                contaMapper.dtoToModel(contaDto)),HttpStatus.CREATED);
    }

    @GetMapping("/conta")
    public ResponseEntity<List<ContaDto>> findAll() {
        return new ResponseEntity<>(contaMapper.modelsToDtos(contaRepository.findAll()), HttpStatus.OK);
    }

    @GetMapping("/conta/{id}")
    public ResponseEntity<ContaDto> findById(@PathVariable (value = "contaId") UUID contaId) {
        return new ResponseEntity<>(contaMapper.modelToDto(contaRepository.findById(contaId).get()), HttpStatus.OK);
    }
    @DeleteMapping("/conta/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable (value = "contaId") UUID id){
        ContaDto contaDto = contaMapper.modelToDto(contaRepository.findById(id).get());
        contaRepository.deleteById(contaDto.getContaId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//    @PutMapping("{contaId}")
//    public ResponseEntity<ContaDto> update(@Valid @RequestBody ContaDto contaDto, @PathVariable UUID contaId) {
//        Conta conta = contaService.update(contaId, contaDto);
//        ContaDto contaDto1 = contaMapper.modelToDto(conta);
//        return ResponseEntity.status(HttpStatus.OK).body(contaDto1);
//    }



}

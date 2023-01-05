package br.com.cro.desafioemprestimospf.service;

import br.com.cro.desafioemprestimospf.dto.ContaDto;
import br.com.cro.desafioemprestimospf.exceptions.ItemNotExistsException;
import br.com.cro.desafioemprestimospf.mapper.ContaMapper;
import br.com.cro.desafioemprestimospf.model.Conta;
import br.com.cro.desafioemprestimospf.repository.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ContaService {

    private final ContaRepository contaRepository;

    private final ContaMapper contaMapper;


    public Conta save(ContaDto contaDto) {
        Conta conta = contaMapper.dtoToModel(contaDto);
        contaRepository.save(conta);
        return conta;

    }

    public List<Conta> findAll() {
        return contaRepository.findAll();
    }

//    @Override
//    public ContaDto findById(UUID contaId) throws ItemNotExistsException {
//        return contaMapper.modelToDto(contaRepository.findById(contaId)
//                .orElseThrow(() -> new ItemNotExistsException("Conta não encontrada!"));
//    }


//    public Conta findById(UUID contaId) {
//        return contaRepository.findById(contaId)
//                .orElseThrow(() -> new ItemNotExistsException("Conta não encontrada!"));
//    }




//    public Conta update(UUID contaId, ContaDto contaDto) {
//        Conta conta = findById(contaId);
//        conta = contaMapper.dtoToModel(contaDto);
//        conta.setContaId(contaId);
//        contaRepository.save(conta);
//        return conta;
//    }
//
//    public void delete(UUID contaId) {
//        Conta conta = contaRepository.findById(contaId)
//                .orElseThrow(() -> new ItemNotExistsException("Conta não encontrada!"));
//        contaRepository.delete(conta);
//    }





}

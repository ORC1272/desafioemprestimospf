package br.com.cro.desafioemprestimospf.service;

import br.com.cro.desafioemprestimospf.dto.ContaDto;
import br.com.cro.desafioemprestimospf.exceptions.ItemNotExistsException;
import br.com.cro.desafioemprestimospf.mapper.ContaMapper;
import br.com.cro.desafioemprestimospf.model.Conta;
import br.com.cro.desafioemprestimospf.repository.ContaRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    public Conta findById(UUID contaId) {
        return contaRepository.findById(contaId)
                .orElseThrow(() -> new ItemNotExistsException("Conta não encontrada!"));
    }

    public Conta update(UUID contaId, ContaDto contaDto) {
        Conta conta = findById(contaId);
        conta = contaMapper.dtoToModel(contaDto);
        conta.setContaId(contaId);
        contaRepository.save(conta);
        return conta;
    }

    public void delete(UUID contaId) {
        Conta conta = findById(contaId);
        contaRepository.delete(conta);
    }

    public List<Conta> findAll() {
        return contaRepository.findAll();
    }



}

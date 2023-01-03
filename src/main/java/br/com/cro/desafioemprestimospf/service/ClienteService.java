package br.com.cro.desafioemprestimospf.service;

import br.com.cro.desafioemprestimospf.dto.ClienteDto;
import br.com.cro.desafioemprestimospf.exceptions.ItemNotExistsException;
import br.com.cro.desafioemprestimospf.mapper.ClienteMapper;
import br.com.cro.desafioemprestimospf.model.Cliente;
import br.com.cro.desafioemprestimospf.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;
    public Cliente save(ClienteDto clienteDto) {
        Cliente cliente = clienteMapper.dtoToModel(clienteDto);
        clienteRepository.save(cliente);
        return cliente;
    }

    public Cliente findById(UUID contaId) {
        return clienteRepository.findById(contaId)
                .orElseThrow(() -> new ItemNotExistsException("Cliente não encontrado!"));
    }

    public Cliente update(UUID clienteId, ClienteDto clienteDto) {
        Cliente cliente = findById(clienteId);
        cliente = clienteMapper.dtoToModel(clienteDto);
        cliente.setClienteId(clienteId);
        clienteRepository.save(cliente);
        return cliente;
    }




    public void delete(UUID clienteId) {
        Cliente cliente = findById(clienteId);
        clienteRepository.delete(cliente);
    }


    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }





}

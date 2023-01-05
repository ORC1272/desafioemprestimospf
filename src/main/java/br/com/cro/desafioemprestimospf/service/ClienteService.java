package br.com.cro.desafioemprestimospf.service;

import br.com.cro.desafioemprestimospf.dto.ClienteDto;
import br.com.cro.desafioemprestimospf.mapper.ClienteMapper;
import br.com.cro.desafioemprestimospf.model.Cliente;
import br.com.cro.desafioemprestimospf.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }



//
//    public void delete(UUID id) {
//        Cliente cliente = new Cliente();
//        clienteRepository.delete(cliente);
//    }
//


//    @Override
//    public ClienteDto findById(UUID id){
//        return clienteMapper.dtoToModel(clienteRepository.findById(id).orElseThrow(
//                ()-> new NotFoundException(messageUtil.getMessage(
//                        "notFound",null, Locale.getDefault()))));
//
//
//    }

//    @Transactional
//    public void update(UUID id, ClienteDto clienteDto) {
//        Cliente cliente = clienteRepository.findById(id).orElseThrow(
//                () -> new ItemNotExistsException("Conta não encontrada!"));
//        clienteMapper.dtoToModel(clienteDto);
//        clienteRepository.save(cliente);
//
//    }


//    public Cliente update(UUID id, ClienteDto clienteDto) {
//        Cliente cliente = findById(id);
//        cliente = clienteMapper.dtoToModel(clienteDto);
//        cliente.setClienteId(id);
//        clienteRepository.save(cliente);
//        return cliente;
//    }
//    public void delete(UUID id) {
//        Cliente cliente = findById(id);
//        clienteRepository.delete(cliente);
//    }




}

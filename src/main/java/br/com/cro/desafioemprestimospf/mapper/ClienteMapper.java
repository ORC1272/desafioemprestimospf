package br.com.cro.desafioemprestimospf.mapper;

import br.com.cro.desafioemprestimospf.dto.ClienteDto;
import br.com.cro.desafioemprestimospf.model.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@Mapper (componentModel = "Spring")
public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);
    ClienteDto modelToDto(Cliente cliente);
    List<ClienteDto> modelsToDtos(List<Cliente> cliente);
    @InheritInverseConfiguration
    Cliente dtoToModel(ClienteDto clienteDto);


}






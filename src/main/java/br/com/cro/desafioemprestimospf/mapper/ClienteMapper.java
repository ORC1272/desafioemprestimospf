package br.com.cro.desafioemprestimospf.mapper;

import br.com.cro.desafioemprestimospf.dto.ClienteDto;
import br.com.cro.desafioemprestimospf.model.Cliente;
import br.com.cro.desafioemprestimospf.validator.ClienteValidator;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(uses = {ClienteValidator.class}, componentModel = "Spring")
public interface ClienteMapper {

//    ClienteDto INSTANCE= Mappers.getMapper(ClienteDto.class);

    ClienteDto modelToDto(Cliente cliente);

    @InheritInverseConfiguration
    Cliente dtoToModel(ClienteDto clienteDto);

    //List<ClienteDto> modelsToDtos(List<Cliente> cliente);


}

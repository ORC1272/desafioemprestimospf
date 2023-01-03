package br.com.cro.desafioemprestimospf.mapper;

import br.com.cro.desafioemprestimospf.dto.ClienteDto;
import br.com.cro.desafioemprestimospf.dto.ContaDto;
import br.com.cro.desafioemprestimospf.model.Cliente;
import br.com.cro.desafioemprestimospf.model.Conta;
import br.com.cro.desafioemprestimospf.validator.ClienteValidator;
import br.com.cro.desafioemprestimospf.validator.ContaValidator;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper(uses = {ContaValidator.class}, componentModel = "Spring")
public interface ContaMapper {

    ContaMapper INSTANCE = Mappers.getMapper(ContaMapper.class);
    ContaDto modelToDto(Conta conta);

//    List<ContaDto> modelsToDtos(List<Conta> conta);
    @InheritInverseConfiguration
    Conta dtoToModel(ContaDto contaDto);


}

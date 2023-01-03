package br.com.cro.desafioemprestimospf.repository;

import br.com.cro.desafioemprestimospf.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface ContaRepository extends JpaRepository<Conta, UUID> {
       Optional<Conta> findById(UUID contaId);
}

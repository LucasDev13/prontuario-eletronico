package com.sgh.prontuarioeletronico.repository;

import com.sgh.prontuarioeletronico.entities.Internamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternamentoRepository extends JpaRepository<Internamento, Long> {
}

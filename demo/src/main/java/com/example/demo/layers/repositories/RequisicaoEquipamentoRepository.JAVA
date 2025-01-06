import com.example.demo.layers.entities.RequisicaoEquipamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.example.demo.layers.repositories;


@Repository
public interface RequisicaoEquipamentoRepository extends JpaRepository<RequisicaoEquipamento, Long> {
    /
}
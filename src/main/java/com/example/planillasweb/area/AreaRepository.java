package com.example.planillasweb.area;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaRepository extends JpaRepository<Area, Long> {

    List<Area> findByEmpresaId(Long empresaId);
}

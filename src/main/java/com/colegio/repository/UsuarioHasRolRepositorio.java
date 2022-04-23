package com.colegio.repository;

import com.colegio.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioHasRolRepositorio extends JpaRepository<UsuarioHasRol, UsuarioHasRolPK>{

}

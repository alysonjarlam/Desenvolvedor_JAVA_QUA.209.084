package com.crud.javalanches.repository;

import org.springframework.data.jpa.repository.JpaRepository; //extends JpaRepository
import org.springframework.stereotype.Repository;

import com.crud.javalanches.models.Categoria;

@Repository // ao digitar o import Repository acima é puxado.
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}

package com.crud.javalanches.respository;


import org.spring.Framework.data.jpa.respository.JpaRepository;
import org.spring.Framework.stereotype.Repository;

import com.crud.javalanches.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, long>{

}

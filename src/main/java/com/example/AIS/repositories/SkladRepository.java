package com.example.AIS.repositories;

import com.example.AIS.models.Sklady;
import org.springframework.data.repository.CrudRepository;

public interface SkladRepository extends CrudRepository <Sklady, String> {
}

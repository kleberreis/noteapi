package br.com.kandrade.noteapi.repository;

import br.com.kandrade.noteapi.model.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NotaRepository extends MongoRepository<Nota,String>{
    List<Nota> findByTitulo(String titulo);
}

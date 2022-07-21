package br.com.awsinfrasetup.repository;


import br.com.awsinfrasetup.entidades.RecursoAWS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecursosAwsRepository extends CrudRepository<RecursoAWS, Long> {
}

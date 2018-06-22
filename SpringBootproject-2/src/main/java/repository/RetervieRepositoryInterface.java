package repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Retervie;
@Repository
public interface RetervieRepositoryInterface extends CrudRepository<Retervie, Long> {

	public Optional<Retervie> findById(Long Id);
}

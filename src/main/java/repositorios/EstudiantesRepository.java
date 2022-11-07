package repositorios;



import org.springframework.data.repository.CrudRepository;

import com.example.demo.Curso;


public interface EstudiantesRepository extends CrudRepository<Curso, Long> {

	public Iterable<Curso> findAll();
}

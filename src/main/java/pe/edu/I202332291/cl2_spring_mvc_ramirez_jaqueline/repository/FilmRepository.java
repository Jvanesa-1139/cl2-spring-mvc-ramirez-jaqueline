package pe.edu.I202332291.cl2_spring_mvc_ramirez_jaqueline.repository;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import pe.edu.I202332291.cl2_spring_mvc_ramirez_jaqueline.entity.Film;


public interface FilmRepository extends CrudRepository<Film, Integer> {

    @Cacheable(value = "films")
    Iterable<Film> findAll();

    @CacheEvict(value = "films", allEntries = true)
    Film save(Film film);

    @CacheEvict(value = "films", allEntries = true)
    void delete(Film film);

}

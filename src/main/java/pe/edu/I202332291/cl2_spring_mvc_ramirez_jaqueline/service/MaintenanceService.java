package pe.edu.I202332291.cl2_spring_mvc_ramirez_jaqueline.service;

import pe.edu.I202332291.cl2_spring_mvc_ramirez_jaqueline.dto.FilmCreateDto;
import pe.edu.I202332291.cl2_spring_mvc_ramirez_jaqueline.dto.FilmDetailDto;
import pe.edu.I202332291.cl2_spring_mvc_ramirez_jaqueline.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> findAllFilms();

    FilmDetailDto findDetailById(Integer id);

    Boolean updateFilm(FilmDetailDto filmDetailDto);

    Boolean createFilm(FilmCreateDto filmCreateDto);
    Boolean deleteFilmById(Integer id);

}

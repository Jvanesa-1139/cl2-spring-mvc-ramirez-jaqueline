package pe.edu.I202332291.cl2_spring_mvc_ramirez_jaqueline.dto;

public record FilmDto(Integer filmId,
                      String title,
                      String language,
                      Integer rentalDuration,
                      Double rentalRate) {
}

package pe.edu.I202332291.cl2_spring_mvc_ramirez_jaqueline.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public record FilmCreateDto(Integer filmId,
                            String title,
                            String description,
                            Integer releaseYear,
                            Integer languageId,
                            Integer rentalDuration,
                            Double rentalRate,
                            Integer length,
                            Double replacementCost,
                            String rating,
                            String specialFeatures,

                            @DateTimeFormat(pattern = "yyyy-MM-dd")
                            Date lastUpdate) {

}

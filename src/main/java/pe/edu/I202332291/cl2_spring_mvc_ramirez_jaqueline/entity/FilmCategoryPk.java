package pe.edu.I202332291.cl2_spring_mvc_ramirez_jaqueline.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmCategoryPk {

    private Integer filmId;
    private Integer categoryId;

}


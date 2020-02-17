package pl.lg.recruit.dtos;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import pl.lg.recruit.domain.entities.Flight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class TouristDataDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String sex;
    private String country;
    private String notes;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    private List<Flight> flights = new ArrayList<>();
}

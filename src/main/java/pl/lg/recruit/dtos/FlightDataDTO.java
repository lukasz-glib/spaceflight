package pl.lg.recruit.dtos;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import pl.lg.recruit.domain.entities.Tourist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class FlightDataDTO {

    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDate dateOfDeparture;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDate dateOfArrival;
    private Integer numberOfSeats;
    private Double priceOfTicket;
    private List<Tourist> tourists = new ArrayList<>();
}

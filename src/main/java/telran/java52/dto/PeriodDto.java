package telran.java52.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PeriodDto {
	LocalDate dateFrom;
	LocalDate dateTo;
}

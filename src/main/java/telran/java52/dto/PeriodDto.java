package telran.java52.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PeriodDto {
	LocalDateTime dateFrom;
	LocalDateTime dateTo;
}

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Gigasecond {
    LocalDateTime adjustedDate;
    Gigasecond(LocalDate birthDate) {
        adjustedDate = birthDate.atStartOfDay().plusSeconds(1_000_000_000L);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        adjustedDate = birthDateTime.plusSeconds(1_000_000_000L);
    }

    LocalDateTime getDate() {
        return adjustedDate;
    }

}

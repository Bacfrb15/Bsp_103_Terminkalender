package ex003;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author franz
 */
public class Appointment {
    private LocalDateTime ldt;
    private String terminname;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm");

    public Appointment(LocalDateTime ldt, String terminname) {
        this.ldt = ldt;
        this.terminname = terminname;
    }

    
    @Override
    public String toString() {
        return ldt.format(dtf) + " --> " + terminname;
    }
    
    
}

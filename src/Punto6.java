
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.function.BiFunction;

public class Punto6 {

    static PersonValidator validator = (name, age, birthDate) -> {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDateParsed = LocalDate.parse(birthDate, formatter);


        long calculatedAge = ChronoUnit.YEARS.between(birthDateParsed, LocalDate.now());


        BiFunction<Long, Integer, Boolean> ageValidator = (calculated, entered) ->
                Long.compare(calculated, entered) == 0;


        if (ageValidator.apply(calculatedAge, age)) {
            return "La fecha de nacimiento " + birthDate + " corresponde a la persona " + name;
        } else {
            return "La edad ingresada no coincide con la fecha de nacimiento";
        }
    };


    static String name;
    static int age;
    static String birthDate;


    @FunctionalInterface
    interface PersonValidator {
        String validate(String name, int age, String birthDate);
        }


    }
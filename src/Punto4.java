import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Punto4 {

    public static Consumer<List<Punto4Libros>> recommenderLibros(){

        Predicate<Punto4Libros> esRecomendado = libros -> libros.getScoreData() >= 7;

        return libros -> {
            List<Punto4Libros> recommenderLibros = libros.stream()
                    .filter(esRecomendado)
                    .collect(Collectors.toList());
            UnaryOperator<String> libroRecomendado = bo -> "El libro : " + bo.toString() + ", es recomendado 😊😊😊 \n";
                    recommenderLibros.forEach(value ->{
                        System.out.println(libroRecomendado.apply(value.getName().toString()));
                    });
        };
    }

    public static Supplier<List<Punto4Libros>>listLiibrosSupplier(){
        return  () -> Arrays.asList(
                new Punto4Libros("Code Lyoco", "Sophie Decroisette", 10),
                new Punto4Libros("Arte de la guerra", "Tzun zu", 6),
                new Punto4Libros("El caballero de la armadura Oxidada", "Robert Fisher", 9),
                new Punto4Libros("El coronel no tiene quien le escriba", "Gabriel Garcia Marquez", 7),
                new Punto4Libros("La rebelión de Atlas", "Ayn Rand", 1)
        );
    }
}


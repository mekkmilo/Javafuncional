import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {
//punto 1 mutable
        Punto1Mutable punto1Mutable = new Punto1Mutable("milo","cafe", List.of("milo@milo.com"));
        System.out.println(punto1Mutable);
        badFunction(punto1Mutable);
        System.out.println(punto1Mutable);

        System.out.println("//////////////////////////////////////////////////////////////");
//punto 1 inmutable
        Punto1Inmutable punto1Inmutable = new Punto1Inmutable("milo","cafe", List.of("milo@milo.com"));
        System.out.println(punto1Inmutable);
        badIntentionMethod(punto1Inmutable);
        System.out.println(punto1Inmutable);
        System.out.println("//////////////////////////////////////////////////////////////");

//punto 2
        Punto2 punto2 = new Punto2();
        Scanner puntoA2 = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int number = puntoA2.nextInt();
        int result = punto2.apply(number);
        System.out.println("el cuadrado del numero es : " + punto2.apply(number));

        System.out.println("//////////////////////////////////////////////////////////////");

//punto 3
        Punto3 punto3 = new Punto3();
        System.out.println("es par : " + punto3.test(result));

        System.out.println("//////////////////////////////////////////////////////////////");

//punto 4

        Supplier<List<Punto4Libros>> librosSupplier = Punto4.listLiibrosSupplier();
        Consumer<List<Punto4Libros>> listConsumer = Punto4.recommenderLibros();

        List<Punto4Libros> libros = librosSupplier.get();
        listConsumer.accept(libros);

        System.out.println("//////////////////////////////////////////////////////////////");

//punto 5
        BinaryOperator<BigDecimal> punto5 = new Punto5();
        System.out.println("ingrese un numero");
        BigDecimal bigDecimal = puntoA2.nextBigDecimal();
        System.out.println("ingrese un numero2");
        BigDecimal bigDecimal2 = puntoA2.nextBigDecimal();
        System.out.println("El resultado : " + punto5.apply(bigDecimal,bigDecimal2) + "\n");

        System.out.println("//////////////////////////////////////////////////////////////");

// punto 6
        Punto6 punto6 = new Punto6();


        System.out.println("ingrese su nombre");
        Punto6.name = puntoA2.next();

        System.out.println("ingrese su edad");
        Punto6.age = puntoA2.nextInt();

        System.out.println("ingresa tu fecha de nacimiento en formato yyyy-MM-dd");
        Punto6.birthDate = puntoA2.next();



        System.out.println(Punto6.validator.validate(Punto6.name, Punto6.age, Punto6.birthDate));

        System.out.println("//////////////////////////////////////////////////////////////");

// punto 7

        List<String> fechas = new ArrayList<>();
        
        fechas.add("25-07-2024");
        fechas.add("26-05-2015");
        fechas.add("26-09-2001");


        fechas.forEach(Punto7::mostrarFecha);

// punto 8

        double finalResult = new Punto8(10)
                .add(5)        // 10 + 5 = 15
                .subtract(2)   // 15 - 2 = 13
                .multiply(3)   // 13 * 3 = 39
                .getResult();  // Resultado final = 39

        System.out.println("Resultado final: " + finalResult);

    }

    static void badFunction(Punto1Mutable mutable){
        List<String> emails = new LinkedList<>();
        emails.add("soymalo@noterias.com");

        mutable.setEmails(emails);
    }

    static void badIntentionMethod(Punto1Inmutable inmutable){
        List<String> emails = inmutable.getEmails();
        emails.clear();
        emails.add("soymasmalo@noterias.com");
    }



}
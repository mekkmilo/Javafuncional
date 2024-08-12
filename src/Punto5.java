import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class Punto5 implements BinaryOperator<BigDecimal> {

    @Override
    public BigDecimal apply(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
       if(bigDecimal ==null || bigDecimal2 == null){
           throw new IllegalArgumentException("la entrada no puede ser null");
       }
       if(bigDecimal2.compareTo(BigDecimal.ZERO)==0){
           throw new ArithmeticException("la entrada no puede ser dividida por 0");
       }
        if(bigDecimal2.compareTo(bigDecimal) >= 0){
            throw new ArithmeticException("la entrada no puede ser mayor que el primer numero");

        }
       return bigDecimal.divide(bigDecimal2);
    }
}

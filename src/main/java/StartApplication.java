import java.util.Arrays;

import br.com.tino.models.Bonus;
import br.com.tino.models.Payment;
import br.com.tino.models.PaymentBuilder;
import br.com.tino.service.PaymentProcessor;

import static br.com.tino.models.PaymentType.CREDICARD;

public class StartApplication {

    public static void main(String[] args) {

        Payment payment1 = new PaymentBuilder().user("abc-123-teste")
                .price(1000.0)
                .type(CREDICARD)
                .bonus(Arrays.asList(new Bonus("PROMO", "Fathers Day", 0.3),
                        new Bonus("GIFT", "OFF10", 10.0)))
                .build();

        System.out.println("Payment before processing: ");
        System.out.println(payment1);

        Payment result = PaymentProcessor.execute(payment1);

        System.out.println("Payment after processing: ");
        System.out.println(result);
    }

}

package com.kaoutar.org.design.patterns.simpleExample;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class strategyTest {

    @Test
    public void testConcreteStrategyA() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        assertEquals("Exécution de la stratégie A\n", getOutput(context));
    }

    @Test
    public void testConcreteStrategyB() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyB());
        assertEquals("Exécution de la stratégie B\n", getOutput(context));
    }

    @Test
    public void testChangingStrategy() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        assertEquals("Exécution de la stratégie A\n", getOutput(context));

        context.setStrategy(new ConcreteStrategyB());
        assertEquals("Exécution de la stratégie B\n", getOutput(context));
    }

    private String getOutput(Context context) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        context.executeStrategy();
        return outputStream.toString();
    }
}

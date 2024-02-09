package com.kaoutar.org.design.patterns.simpleExample;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class strategyTest {

    @Test
    public void testConcreteStrategyA() throws IOException {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        assertEquals("Exécution de la stratégie A\n", getOutput(context));
    }

    @Test
    public void testConcreteStrategyB() throws IOException {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyB());
        assertEquals("Exécution de la stratégie B\n", getOutput(context));
    }

    @Test
    public void testChangingStrategy() throws IOException {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        assertEquals("Exécution de la stratégie A\n", getOutput(context));

        context.setStrategy(new ConcreteStrategyB());
        assertEquals("Exécution de la stratégie B\n", getOutput(context));
    }

    private String getOutput(Context context) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        context.executeStrategy();
        return outputStream.toString();
    }
}

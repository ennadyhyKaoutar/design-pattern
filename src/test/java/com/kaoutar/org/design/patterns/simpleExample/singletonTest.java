package com.kaoutar.org.design.patterns.simpleExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class singletonTest {

    @Test
    public void testGetInstance() {
        singleton instance1 = singleton.getInstance();

        singleton instance2 = singleton.getInstance();
        assertThrows(IllegalStateException.class, () -> {
            if (instance1 == instance2) {
                throw new IllegalStateException("Deux instances identiques de Singleton ont été créées.");
            }
        });
    }
}

package com.kodilla.mockito;

import com.kodilla.homework.mockito.MobilePhone;
import jdk.internal.jimage.ImageLocation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

//public class MobilePhoneTestSuite {
    private MobilePhone myPhone;

    @BeforeEach
    public void setup() {
        Object Mockito = null;
        myPhone = Mockito.mock(MobilePhone.class);
    }

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        Assertions.assertFalse(myPhone.needsCharging());
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }

    @Test
    public void testExpectation() {
        Object Mockito;
        Mockito.when(myPhone.needsCharging()).thenReturn(true);

        Assertions.assertFalse(myPhone.needsCharging());
        Assertions.assertTrue(myPhone.needsCharging());
    }

    @Test
    public void shouldCallLaunchApplication() {
        myPhone.launchApplication("Tetris4D");

        ImageLocation Mockito;
        Mockito.verify(myPhone).launchApplication("Tetris4D");
    }

    @Test
    public void testVerificationFailure() {
        myPhone.needsCharging();

        Mockito.verify(myPhone).getFreeStorage();
    }
}
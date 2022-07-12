package br.com.mj.alticci.domain.usecase;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class AlticciSequenceUsecaseTest {

    @Inject
    private AlticciSequenceUsecase alticciSequenceUsecase;

    @Test
    void whenCallAlticciSequenceNumber0_thenShouldReturn0() {
        assertEquals(0, alticciSequenceUsecase.call(0l));
    }

    @Test
    void whenCallAlticciSequenceNumber10_thenShouldReturn9() {
        assertEquals(9, alticciSequenceUsecase.call(10l));
    }
}

package com.lucas.example.prime.service;

import com.lucas.example.prime.PrimeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static com.lucas.example.prime.util.PrimeNumberUtilTest.KNOWN_PRIMES;
import static org.junit.Assert.assertEquals;

/**
 * @author Brendt Lucas
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(PrimeController.class)
public class PrimeNumberServiceImplTest {

    @Autowired
    private PrimeNumberService service;

    @Test
    public void testPrimeGenerator() {

        final List<Integer> primes = service.getPrimes(7919);
        assertEquals("'primes' and 'KNOWN_PRIMES' should be equal in size", KNOWN_PRIMES.length, primes.size());

        for (int i = 0; i < KNOWN_PRIMES.length; i++) {
            assertEquals("'primes.get(i)' should equal 'KNOWN_PRIMES[i]'", KNOWN_PRIMES[i], primes.get(i).intValue());
        }
    }
}

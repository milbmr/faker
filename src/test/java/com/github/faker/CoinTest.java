package com.github.faker;

import static org.junit.Assert.assertThat;
import static com.github.faker.matchers.MatchesRegularExpression.matchesRegularExpression;

import org.junit.Test;

public class CoinTest extends AbstractFakerTest {

    @Test
    public void coinFlip() {
        assertThat(faker.coin().flip(), matchesRegularExpression("\\w+"));
    }
}
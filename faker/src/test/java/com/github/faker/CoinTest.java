package com.github.faker;

import static org.hamcrest.MatcherAssert.assertThat;
import static com.github.faker.matchers.MatchesRegularExpression.matchesRegularExpression;

import org.junit.jupiter.api.Test;

public class CoinTest extends AbstractFakerTest {

    @Test
    public void coinFlip() {
        assertThat(faker.coin().flip(), matchesRegularExpression("\\w+"));
    }
}
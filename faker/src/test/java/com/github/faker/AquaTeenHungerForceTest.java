package com.github.faker;

import org.junit.jupiter.api.Test;

import static com.github.faker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;

public class AquaTeenHungerForceTest extends AbstractFakerTest {

    @Test
    public void character() {
        assertThat(faker.aquaTeenHungerForce().character(), matchesRegularExpression("[A-Za-z .]+"));
    }

}

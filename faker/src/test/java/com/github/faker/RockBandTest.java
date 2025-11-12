package com.github.faker;

import org.junit.jupiter.api.Test;

import static com.github.faker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;

public class RockBandTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.rockBand().name(), matchesRegularExpression("([\\w'/.,&]+ ?)+"));
    }
}

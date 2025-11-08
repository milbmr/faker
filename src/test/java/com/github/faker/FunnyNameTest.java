package com.github.faker;

import org.junit.Test;

import static com.github.faker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class FunnyNameTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.funnyName().name(), matchesRegularExpression("^(\\w+\\.?\\s?'?-?)+$"));
    }
}

package com.github.faker;

import org.junit.Test;

import static com.github.faker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class AnimalTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.animal().name(), matchesRegularExpression("[A-Za-z ]+"));
    }

}

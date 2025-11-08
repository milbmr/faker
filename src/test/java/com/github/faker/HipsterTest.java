package com.github.faker;

import org.junit.jupiter.api.Test;

import static com.github.faker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;

public class HipsterTest extends AbstractFakerTest {

    @Test
    public void word() {
        assertThat(faker.hipster().word(), matchesRegularExpression("^([\\w-+&']+ ?)+$"));
    }
}

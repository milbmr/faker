package com.github.faker;

import org.junit.Test;

import static com.github.faker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class RobinTest extends AbstractFakerTest {

    @Test
    public void quote() {
        assertThat(faker.robin().quote(), matchesRegularExpression("^(\\w+\\.?-?'?\\s?)+(\\(?)?(\\w+\\s?\\.?)+(\\))?$"));
    }
}

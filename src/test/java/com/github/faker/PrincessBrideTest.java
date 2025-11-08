package com.github.faker;

import org.junit.jupiter.api.Test;

import static com.github.faker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrincessBrideTest extends AbstractFakerTest {
    @Test
    public void character() {
        assertThat(faker.princessBride().character(), matchesRegularExpression("[A-Za-z .-]+"));
    }

    @Test
    public void quote() {
        assertThat(faker.princessBride().quote(), not(isEmptyOrNullString()));
    }
}

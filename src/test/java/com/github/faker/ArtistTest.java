package com.github.faker;

import org.junit.jupiter.api.Test;

import static com.github.faker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArtistTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.artist().name(), matchesRegularExpression("(\\w+ ?){1,2}"));
    }
}

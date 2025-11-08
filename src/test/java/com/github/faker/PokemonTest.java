package com.github.faker;

import static com.github.faker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PokemonTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.pokemon().name(), matchesRegularExpression("[\\w']+.?( \\w+)?"));
    }

    @Test
    public void location() {
        assertThat(faker.pokemon().location(), matchesRegularExpression("\\w+( \\w+)?( \\w+)?"));
    }
}

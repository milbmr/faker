package com.github.faker;

import org.junit.Test;

import static com.github.faker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class ProgrammingLanguageTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.programmingLanguage().name(), matchesRegularExpression("[A-Za-z0-9 :,.+*()#/\\–\\-@πéöü'′!]+"));
    }

    @Test
    public void creator() {
        assertThat(faker.programmingLanguage().creator(), matchesRegularExpression("[A-Za-z .,\\-]+"));
    }

}

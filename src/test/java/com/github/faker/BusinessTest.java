package com.github.faker;

import org.junit.jupiter.api.Test;

import static com.github.faker.matchers.IsStringWithContents.isStringWithContents;
import static org.hamcrest.MatcherAssert.assertThat;

public class BusinessTest extends AbstractFakerTest {
    @Test
    public void creditCardNumber() {
        assertThat(faker.business().creditCardNumber(), isStringWithContents());
    }

    @Test
    public void creditCardType() {
        assertThat(faker.business().creditCardType(), isStringWithContents());
    }

    @Test
    public void creditCardExpiry() {
        assertThat(faker.business().creditCardExpiry(), isStringWithContents());
    }

}

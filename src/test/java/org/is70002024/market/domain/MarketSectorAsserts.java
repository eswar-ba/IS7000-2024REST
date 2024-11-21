package org.is70002024.market.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class MarketSectorAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMarketSectorAllPropertiesEquals(MarketSector expected, MarketSector actual) {
        assertMarketSectorAutoGeneratedPropertiesEquals(expected, actual);
        assertMarketSectorAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMarketSectorAllUpdatablePropertiesEquals(MarketSector expected, MarketSector actual) {
        assertMarketSectorUpdatableFieldsEquals(expected, actual);
        assertMarketSectorUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMarketSectorAutoGeneratedPropertiesEquals(MarketSector expected, MarketSector actual) {
        assertThat(expected)
            .as("Verify MarketSector auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMarketSectorUpdatableFieldsEquals(MarketSector expected, MarketSector actual) {
        assertThat(expected)
            .as("Verify MarketSector relevant properties")
            .satisfies(e -> assertThat(e.getName()).as("check name").isEqualTo(actual.getName()))
            .satisfies(e -> assertThat(e.getPrice()).as("check price").isEqualTo(actual.getPrice()))
            .satisfies(e -> assertThat(e.getChange()).as("check change").isEqualTo(actual.getChange()))
            .satisfies(e -> assertThat(e.getMarketdate()).as("check marketdate").isEqualTo(actual.getMarketdate()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMarketSectorUpdatableRelationshipsEquals(MarketSector expected, MarketSector actual) {
        // empty method
    }
}


/*
 * Camel ApiName Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir.internal;

import org.apache.camel.support.component.ApiName;

/**
 * Camel {@link ApiName} Enumeration for Component Fhir
 */
public enum FhirApiName implements ApiName {

    CAPABILITIES("capabilities"),

    CREATE("create"),

    DELETE("delete"),

    HISTORY("history"),

    LOAD_PAGE("load-page"),

    META("meta"),

    OPERATION("operation"),

    PATCH("patch"),

    READ("read"),

    SEARCH("search"),

    TRANSACTION("transaction"),

    UPDATE("update"),

    VALIDATE("validate");


    private final String name;

    private FhirApiName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}

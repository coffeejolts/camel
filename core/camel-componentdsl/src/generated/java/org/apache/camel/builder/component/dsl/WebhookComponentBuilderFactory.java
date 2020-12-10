/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.webhook.WebhookComponent;

/**
 * Expose webhook endpoints to receive push notifications for other Camel
 * components.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface WebhookComponentBuilderFactory {

    /**
     * Webhook (camel-webhook)
     * Expose webhook endpoints to receive push notifications for other Camel
     * components.
     * 
     * Category: cloud
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-webhook
     */
    static WebhookComponentBuilder webhook() {
        return new WebhookComponentBuilderImpl();
    }

    /**
     * Builder for the Webhook component.
     */
    interface WebhookComponentBuilder
            extends
                ComponentBuilder<WebhookComponent> {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default WebhookComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Automatically register the webhook at startup and unregister it on
         * shutdown.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default WebhookComponentBuilder webhookAutoRegister(
                boolean webhookAutoRegister) {
            doSetProperty("webhookAutoRegister", webhookAutoRegister);
            return this;
        }
        /**
         * The first (base) path element where the webhook will be exposed. It's
         * a good practice to set it to a random string, so that it cannot be
         * guessed by unauthorized parties.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default WebhookComponentBuilder webhookBasePath(
                java.lang.String webhookBasePath) {
            doSetProperty("webhookBasePath", webhookBasePath);
            return this;
        }
        /**
         * The Camel Rest component to use for the REST transport, such as
         * netty-http.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default WebhookComponentBuilder webhookComponentName(
                java.lang.String webhookComponentName) {
            doSetProperty("webhookComponentName", webhookComponentName);
            return this;
        }
        /**
         * The URL of the current service as seen by the webhook provider.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default WebhookComponentBuilder webhookExternalUrl(
                java.lang.String webhookExternalUrl) {
            doSetProperty("webhookExternalUrl", webhookExternalUrl);
            return this;
        }
        /**
         * The path where the webhook endpoint will be exposed (relative to
         * basePath, if any).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default WebhookComponentBuilder webhookPath(java.lang.String webhookPath) {
            doSetProperty("webhookPath", webhookPath);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: advanced
         */
        default WebhookComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Set the default configuration for the webhook meta-component.
         * 
         * The option is a:
         * <code>org.apache.camel.component.webhook.WebhookConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default WebhookComponentBuilder configuration(
                org.apache.camel.component.webhook.WebhookConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    }

    class WebhookComponentBuilderImpl
            extends
                AbstractComponentBuilder<WebhookComponent>
            implements
                WebhookComponentBuilder {
        @Override
        protected WebhookComponent buildConcreteComponent() {
            return new WebhookComponent();
        }
        private org.apache.camel.component.webhook.WebhookConfiguration getOrCreateConfiguration(
                org.apache.camel.component.webhook.WebhookComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.webhook.WebhookConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((WebhookComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "webhookAutoRegister": getOrCreateConfiguration((WebhookComponent) component).setWebhookAutoRegister((boolean) value); return true;
            case "webhookBasePath": getOrCreateConfiguration((WebhookComponent) component).setWebhookBasePath((java.lang.String) value); return true;
            case "webhookComponentName": getOrCreateConfiguration((WebhookComponent) component).setWebhookComponentName((java.lang.String) value); return true;
            case "webhookExternalUrl": getOrCreateConfiguration((WebhookComponent) component).setWebhookExternalUrl((java.lang.String) value); return true;
            case "webhookPath": getOrCreateConfiguration((WebhookComponent) component).setWebhookPath((java.lang.String) value); return true;
            case "autowiredEnabled": ((WebhookComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "configuration": ((WebhookComponent) component).setConfiguration((org.apache.camel.component.webhook.WebhookConfiguration) value); return true;
            default: return false;
            }
        }
    }
}
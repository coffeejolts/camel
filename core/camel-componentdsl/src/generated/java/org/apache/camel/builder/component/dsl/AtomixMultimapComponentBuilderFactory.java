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
import org.apache.camel.component.atomix.client.multimap.AtomixMultiMapComponent;

/**
 * Access Atomix's distributed multi map.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AtomixMultimapComponentBuilderFactory {

    /**
     * Atomix MultiMap (camel-atomix)
     * Access Atomix's distributed multi map.
     * 
     * Category: clustering
     * Since: 2.20
     * Maven coordinates: org.apache.camel:camel-atomix
     */
    static AtomixMultimapComponentBuilder atomixMultimap() {
        return new AtomixMultimapComponentBuilderImpl();
    }

    /**
     * Builder for the Atomix MultiMap component.
     */
    interface AtomixMultimapComponentBuilder
            extends
                ComponentBuilder<AtomixMultiMapComponent> {
        /**
         * The Atomix instance to use.
         * 
         * The option is a: <code>io.atomix.Atomix</code> type.
         * 
         * Group: producer
         */
        default AtomixMultimapComponentBuilder atomix(io.atomix.Atomix atomix) {
            doSetProperty("atomix", atomix);
            return this;
        }
        /**
         * The shared component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.atomix.client.multimap.AtomixMultiMapConfiguration</code> type.
         * 
         * Group: producer
         */
        default AtomixMultimapComponentBuilder configuration(
                org.apache.camel.component.atomix.client.multimap.AtomixMultiMapConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The path to the AtomixClient configuration.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AtomixMultimapComponentBuilder configurationUri(
                java.lang.String configurationUri) {
            doSetProperty("configurationUri", configurationUri);
            return this;
        }
        /**
         * The default action.
         * 
         * The option is a:
         * <code>org.apache.camel.component.atomix.client.multimap.AtomixMultiMap.Action</code> type.
         * 
         * Default: PUT
         * Group: producer
         */
        default AtomixMultimapComponentBuilder defaultAction(
                org.apache.camel.component.atomix.client.multimap.AtomixMultiMap.Action defaultAction) {
            doSetProperty("defaultAction", defaultAction);
            return this;
        }
        /**
         * The key to use if none is set in the header or to listen for events
         * for a specific key.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default AtomixMultimapComponentBuilder key(java.lang.Object key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default AtomixMultimapComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The nodes the AtomixClient should connect to.
         * 
         * The option is a:
         * <code>java.util.List<io.atomix.catalyst.transport.Address></code>
         * type.
         * 
         * Group: producer
         */
        default AtomixMultimapComponentBuilder nodes(
                java.util.List<io.atomix.catalyst.transport.Address> nodes) {
            doSetProperty("nodes", nodes);
            return this;
        }
        /**
         * The header that wil carry the result.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AtomixMultimapComponentBuilder resultHeader(
                java.lang.String resultHeader) {
            doSetProperty("resultHeader", resultHeader);
            return this;
        }
        /**
         * The class name (fqn) of the Atomix transport.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: io.atomix.catalyst.transport.netty.NettyTransport
         * Group: producer
         */
        default AtomixMultimapComponentBuilder transportClassName(
                java.lang.String transportClassName) {
            doSetProperty("transportClassName", transportClassName);
            return this;
        }
        /**
         * The resource ttl.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: producer
         */
        default AtomixMultimapComponentBuilder ttl(long ttl) {
            doSetProperty("ttl", ttl);
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
        default AtomixMultimapComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * The cluster wide default resource configuration.
         * 
         * The option is a: <code>java.util.Properties</code> type.
         * 
         * Group: advanced
         */
        default AtomixMultimapComponentBuilder defaultResourceConfig(
                java.util.Properties defaultResourceConfig) {
            doSetProperty("defaultResourceConfig", defaultResourceConfig);
            return this;
        }
        /**
         * The local default resource options.
         * 
         * The option is a: <code>java.util.Properties</code> type.
         * 
         * Group: advanced
         */
        default AtomixMultimapComponentBuilder defaultResourceOptions(
                java.util.Properties defaultResourceOptions) {
            doSetProperty("defaultResourceOptions", defaultResourceOptions);
            return this;
        }
        /**
         * Sets if the local member should join groups as PersistentMember or
         * not. If set to ephemeral the local member will receive an auto
         * generated ID thus the local one is ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AtomixMultimapComponentBuilder ephemeral(boolean ephemeral) {
            doSetProperty("ephemeral", ephemeral);
            return this;
        }
        /**
         * The read consistency level.
         * 
         * The option is a: <code>io.atomix.resource.ReadConsistency</code>
         * type.
         * 
         * Group: advanced
         */
        default AtomixMultimapComponentBuilder readConsistency(
                io.atomix.resource.ReadConsistency readConsistency) {
            doSetProperty("readConsistency", readConsistency);
            return this;
        }
        /**
         * Cluster wide resources configuration.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.util.Properties></code> type.
         * 
         * Group: advanced
         */
        default AtomixMultimapComponentBuilder resourceConfigs(
                java.util.Map<java.lang.String, java.util.Properties> resourceConfigs) {
            doSetProperty("resourceConfigs", resourceConfigs);
            return this;
        }
        /**
         * Local resources configurations.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.util.Properties></code> type.
         * 
         * Group: advanced
         */
        default AtomixMultimapComponentBuilder resourceOptions(
                java.util.Map<java.lang.String, java.util.Properties> resourceOptions) {
            doSetProperty("resourceOptions", resourceOptions);
            return this;
        }
    }

    class AtomixMultimapComponentBuilderImpl
            extends
                AbstractComponentBuilder<AtomixMultiMapComponent>
            implements
                AtomixMultimapComponentBuilder {
        @Override
        protected AtomixMultiMapComponent buildConcreteComponent() {
            return new AtomixMultiMapComponent();
        }
        private org.apache.camel.component.atomix.client.multimap.AtomixMultiMapConfiguration getOrCreateConfiguration(
                org.apache.camel.component.atomix.client.multimap.AtomixMultiMapComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.atomix.client.multimap.AtomixMultiMapConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "atomix": getOrCreateConfiguration((AtomixMultiMapComponent) component).setAtomix((io.atomix.Atomix) value); return true;
            case "configuration": ((AtomixMultiMapComponent) component).setConfiguration((org.apache.camel.component.atomix.client.multimap.AtomixMultiMapConfiguration) value); return true;
            case "configurationUri": ((AtomixMultiMapComponent) component).setConfigurationUri((java.lang.String) value); return true;
            case "defaultAction": getOrCreateConfiguration((AtomixMultiMapComponent) component).setDefaultAction((org.apache.camel.component.atomix.client.multimap.AtomixMultiMap.Action) value); return true;
            case "key": getOrCreateConfiguration((AtomixMultiMapComponent) component).setKey((java.lang.Object) value); return true;
            case "lazyStartProducer": ((AtomixMultiMapComponent) component).setLazyStartProducer((boolean) value); return true;
            case "nodes": ((AtomixMultiMapComponent) component).setNodes((java.util.List) value); return true;
            case "resultHeader": getOrCreateConfiguration((AtomixMultiMapComponent) component).setResultHeader((java.lang.String) value); return true;
            case "transportClassName": getOrCreateConfiguration((AtomixMultiMapComponent) component).setTransportClassName((java.lang.String) value); return true;
            case "ttl": getOrCreateConfiguration((AtomixMultiMapComponent) component).setTtl((long) value); return true;
            case "autowiredEnabled": ((AtomixMultiMapComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "defaultResourceConfig": getOrCreateConfiguration((AtomixMultiMapComponent) component).setDefaultResourceConfig((java.util.Properties) value); return true;
            case "defaultResourceOptions": getOrCreateConfiguration((AtomixMultiMapComponent) component).setDefaultResourceOptions((java.util.Properties) value); return true;
            case "ephemeral": getOrCreateConfiguration((AtomixMultiMapComponent) component).setEphemeral((boolean) value); return true;
            case "readConsistency": getOrCreateConfiguration((AtomixMultiMapComponent) component).setReadConsistency((io.atomix.resource.ReadConsistency) value); return true;
            case "resourceConfigs": getOrCreateConfiguration((AtomixMultiMapComponent) component).setResourceConfigs((java.util.Map) value); return true;
            case "resourceOptions": getOrCreateConfiguration((AtomixMultiMapComponent) component).setResourceOptions((java.util.Map) value); return true;
            default: return false;
            }
        }
    }
}
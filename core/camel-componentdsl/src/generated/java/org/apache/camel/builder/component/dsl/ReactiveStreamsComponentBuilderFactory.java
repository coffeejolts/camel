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
import org.apache.camel.component.reactive.streams.ReactiveStreamsComponent;

/**
 * Exchange messages with reactive stream processing libraries compatible with
 * the reactive streams standard.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ReactiveStreamsComponentBuilderFactory {

    /**
     * Reactive Streams (camel-reactive-streams)
     * Exchange messages with reactive stream processing libraries compatible
     * with the reactive streams standard.
     * 
     * Category: reactive,streams
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-reactive-streams
     */
    static ReactiveStreamsComponentBuilder reactiveStreams() {
        return new ReactiveStreamsComponentBuilderImpl();
    }

    /**
     * Builder for the Reactive Streams component.
     */
    interface ReactiveStreamsComponentBuilder
            extends
                ComponentBuilder<ReactiveStreamsComponent> {
        /**
         * The maximum number of threads used by the reactive streams internal
         * engine.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 10
         * Group: common
         */
        default ReactiveStreamsComponentBuilder threadPoolMaxSize(
                int threadPoolMaxSize) {
            doSetProperty("threadPoolMaxSize", threadPoolMaxSize);
            return this;
        }
        /**
         * The minimum number of threads used by the reactive streams internal
         * engine.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default ReactiveStreamsComponentBuilder threadPoolMinSize(
                int threadPoolMinSize) {
            doSetProperty("threadPoolMinSize", threadPoolMinSize);
            return this;
        }
        /**
         * The name of the thread pool used by the reactive streams internal
         * engine.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: CamelReactiveStreamsWorker
         * Group: common
         */
        default ReactiveStreamsComponentBuilder threadPoolName(
                java.lang.String threadPoolName) {
            doSetProperty("threadPoolName", threadPoolName);
            return this;
        }
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
        default ReactiveStreamsComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The backpressure strategy to use when pushing events to a slow
         * subscriber.
         * 
         * The option is a:
         * <code>org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy</code> type.
         * 
         * Default: BUFFER
         * Group: producer
         */
        default ReactiveStreamsComponentBuilder backpressureStrategy(
                org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy backpressureStrategy) {
            doSetProperty("backpressureStrategy", backpressureStrategy);
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
        default ReactiveStreamsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default ReactiveStreamsComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use an existing reactive stream engine configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration</code> type.
         * 
         * Group: advanced
         */
        default ReactiveStreamsComponentBuilder reactiveStreamsEngineConfiguration(
                org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration reactiveStreamsEngineConfiguration) {
            doSetProperty("reactiveStreamsEngineConfiguration", reactiveStreamsEngineConfiguration);
            return this;
        }
        /**
         * Set the type of the underlying reactive streams implementation to
         * use. The implementation is looked up from the registry or using a
         * ServiceLoader, the default implementation is
         * DefaultCamelReactiveStreamsService.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default ReactiveStreamsComponentBuilder serviceType(
                java.lang.String serviceType) {
            doSetProperty("serviceType", serviceType);
            return this;
        }
    }

    class ReactiveStreamsComponentBuilderImpl
            extends
                AbstractComponentBuilder<ReactiveStreamsComponent>
            implements
                ReactiveStreamsComponentBuilder {
        @Override
        protected ReactiveStreamsComponent buildConcreteComponent() {
            return new ReactiveStreamsComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "threadPoolMaxSize": ((ReactiveStreamsComponent) component).setThreadPoolMaxSize((int) value); return true;
            case "threadPoolMinSize": ((ReactiveStreamsComponent) component).setThreadPoolMinSize((int) value); return true;
            case "threadPoolName": ((ReactiveStreamsComponent) component).setThreadPoolName((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((ReactiveStreamsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "backpressureStrategy": ((ReactiveStreamsComponent) component).setBackpressureStrategy((org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy) value); return true;
            case "lazyStartProducer": ((ReactiveStreamsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((ReactiveStreamsComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "reactiveStreamsEngineConfiguration": ((ReactiveStreamsComponent) component).setReactiveStreamsEngineConfiguration((org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration) value); return true;
            case "serviceType": ((ReactiveStreamsComponent) component).setServiceType((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}
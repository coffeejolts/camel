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
package org.apache.camel.builder.endpoint.dsl;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;

/**
 * Interact with the GitHub API.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GitHubEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the GitHub component.
     */
    public interface GitHubEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedGitHubEndpointConsumerBuilder advanced() {
            return (AdvancedGitHubEndpointConsumerBuilder) this;
        }
        /**
         * GitHub repository name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: common
         */
        default GitHubEndpointConsumerBuilder repoName(String repoName) {
            doSetProperty("repoName", repoName);
            return this;
        }
        /**
         * GitHub repository owner (organization).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: common
         */
        default GitHubEndpointConsumerBuilder repoOwner(String repoOwner) {
            doSetProperty("repoOwner", repoOwner);
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
        default GitHubEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GitHubEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GitHubEndpointConsumerBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GitHubEndpointConsumerBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            doSetProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            doSetProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            doSetProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            doSetProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder backoffMultiplier(
                int backoffMultiplier) {
            doSetProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder backoffMultiplier(
                String backoffMultiplier) {
            doSetProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * Milliseconds before the next poll.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 500
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder delay(long delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * Milliseconds before the next poll.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 500
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder delay(String delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder greedy(boolean greedy) {
            doSetProperty("greedy", greedy);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder greedy(String greedy) {
            doSetProperty("greedy", greedy);
            return this;
        }
        /**
         * Milliseconds before the first poll starts.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 1000
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder initialDelay(long initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Milliseconds before the first poll starts.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 1000
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder initialDelay(String initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the scheduler will only fire once. If you set it to 5, it will only
         * fire five times. A value of zero or negative means fire forever.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder repeatCount(long repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the scheduler will only fire once. If you set it to 5, it will only
         * fire five times. A value of zero or negative means fire forever.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder repeatCount(String repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * 
         * The option is a: <code>org.apache.camel.LoggingLevel</code> type.
         * 
         * Default: TRACE
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder runLoggingLevel(
                LoggingLevel runLoggingLevel) {
            doSetProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.LoggingLevel</code> type.
         * 
         * Default: TRACE
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder runLoggingLevel(
                String runLoggingLevel) {
            doSetProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * 
         * The option is a:
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * 
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            doSetProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * 
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            doSetProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz
         * component. Use value spring or quartz for built in scheduler.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Default: none
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder scheduler(Object scheduler) {
            doSetProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz
         * component. Use value spring or quartz for built in scheduler.
         * 
         * The option will be converted to a <code>java.lang.Object</code> type.
         * 
         * Default: none
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder scheduler(String scheduler) {
            doSetProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz, Spring based scheduler.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * The option is multivalued, and you can use the
         * schedulerProperties(String, Object) method to add a value (call the
         * method multiple times to set more values).
         * 
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder schedulerProperties(
                String key,
                Object value) {
            doSetMultiValueProperty("schedulerProperties", "scheduler." + key, value);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz, Spring based scheduler.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * The option is multivalued, and you can use the
         * schedulerProperties(String, Object) method to add a value (call the
         * method multiple times to set more values).
         * 
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder schedulerProperties(Map values) {
            doSetMultiValueProperties("schedulerProperties", "scheduler.", values);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder startScheduler(
                boolean startScheduler) {
            doSetProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder startScheduler(
                String startScheduler) {
            doSetProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * 
         * The option is a: <code>java.util.concurrent.TimeUnit</code> type.
         * 
         * Default: MILLISECONDS
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder timeUnit(TimeUnit timeUnit) {
            doSetProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.TimeUnit</code> type.
         * 
         * Default: MILLISECONDS
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder timeUnit(String timeUnit) {
            doSetProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder useFixedDelay(
                boolean useFixedDelay) {
            doSetProperty("useFixedDelay", useFixedDelay);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: scheduler
         */
        default GitHubEndpointConsumerBuilder useFixedDelay(String useFixedDelay) {
            doSetProperty("useFixedDelay", useFixedDelay);
            return this;
        }
        /**
         * GitHub OAuth token. Must be configured on either component or
         * endpoint.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GitHubEndpointConsumerBuilder oauthToken(String oauthToken) {
            doSetProperty("oauthToken", oauthToken);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the GitHub component.
     */
    public interface AdvancedGitHubEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default GitHubEndpointConsumerBuilder basic() {
            return (GitHubEndpointConsumerBuilder) this;
        }
        /**
         * To specify a custom strategy that configures how the EventsConsumer
         * fetches events.
         * 
         * The option is a:
         * <code>org.apache.camel.component.github.event.GitHubEventFetchStrategy</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGitHubEndpointConsumerBuilder eventFetchStrategy(
                Object eventFetchStrategy) {
            doSetProperty("eventFetchStrategy", eventFetchStrategy);
            return this;
        }
        /**
         * To specify a custom strategy that configures how the EventsConsumer
         * fetches events.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.github.event.GitHubEventFetchStrategy</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGitHubEndpointConsumerBuilder eventFetchStrategy(
                String eventFetchStrategy) {
            doSetProperty("eventFetchStrategy", eventFetchStrategy);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGitHubEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGitHubEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGitHubEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGitHubEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGitHubEndpointConsumerBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            doSetProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedGitHubEndpointConsumerBuilder pollStrategy(
                String pollStrategy) {
            doSetProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGitHubEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGitHubEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the GitHub component.
     */
    public interface GitHubEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGitHubEndpointProducerBuilder advanced() {
            return (AdvancedGitHubEndpointProducerBuilder) this;
        }
        /**
         * GitHub repository name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: common
         */
        default GitHubEndpointProducerBuilder repoName(String repoName) {
            doSetProperty("repoName", repoName);
            return this;
        }
        /**
         * GitHub repository owner (organization).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: common
         */
        default GitHubEndpointProducerBuilder repoOwner(String repoOwner) {
            doSetProperty("repoOwner", repoOwner);
            return this;
        }
        /**
         * To use the given encoding when getting a git commit file.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GitHubEndpointProducerBuilder encoding(String encoding) {
            doSetProperty("encoding", encoding);
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
        default GitHubEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default GitHubEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To set git commit status state.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GitHubEndpointProducerBuilder state(String state) {
            doSetProperty("state", state);
            return this;
        }
        /**
         * To set git commit status target url.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GitHubEndpointProducerBuilder targetUrl(String targetUrl) {
            doSetProperty("targetUrl", targetUrl);
            return this;
        }
        /**
         * GitHub OAuth token. Must be configured on either component or
         * endpoint.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GitHubEndpointProducerBuilder oauthToken(String oauthToken) {
            doSetProperty("oauthToken", oauthToken);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the GitHub component.
     */
    public interface AdvancedGitHubEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default GitHubEndpointProducerBuilder basic() {
            return (GitHubEndpointProducerBuilder) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGitHubEndpointProducerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGitHubEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the GitHub component.
     */
    public interface GitHubEndpointBuilder
            extends
                GitHubEndpointConsumerBuilder,
                GitHubEndpointProducerBuilder {
        default AdvancedGitHubEndpointBuilder advanced() {
            return (AdvancedGitHubEndpointBuilder) this;
        }
        /**
         * GitHub repository name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: common
         */
        default GitHubEndpointBuilder repoName(String repoName) {
            doSetProperty("repoName", repoName);
            return this;
        }
        /**
         * GitHub repository owner (organization).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: common
         */
        default GitHubEndpointBuilder repoOwner(String repoOwner) {
            doSetProperty("repoOwner", repoOwner);
            return this;
        }
        /**
         * GitHub OAuth token. Must be configured on either component or
         * endpoint.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GitHubEndpointBuilder oauthToken(String oauthToken) {
            doSetProperty("oauthToken", oauthToken);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the GitHub component.
     */
    public interface AdvancedGitHubEndpointBuilder
            extends
                AdvancedGitHubEndpointConsumerBuilder,
                AdvancedGitHubEndpointProducerBuilder {
        default GitHubEndpointBuilder basic() {
            return (GitHubEndpointBuilder) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGitHubEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedGitHubEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface GitHubBuilders {
        /**
         * GitHub (camel-github)
         * Interact with the GitHub API.
         * 
         * Category: file,cloud,api
         * Since: 2.15
         * Maven coordinates: org.apache.camel:camel-github
         * 
         * Syntax: <code>github:type/branchName</code>
         * 
         * Path parameter: type (required)
         * What git operation to execute
         * There are 10 enums and the value can be one of: CLOSEPULLREQUEST,
         * PULLREQUESTCOMMENT, COMMIT, PULLREQUEST, TAG, PULLREQUESTSTATE,
         * PULLREQUESTFILES, GETCOMMITFILE, CREATEISSUE, EVENT
         * 
         * Path parameter: branchName
         * Name of branch
         * 
         * @param path type/branchName
         */
        default GitHubEndpointBuilder github(String path) {
            return GitHubEndpointBuilderFactory.endpointBuilder("github", path);
        }
        /**
         * GitHub (camel-github)
         * Interact with the GitHub API.
         * 
         * Category: file,cloud,api
         * Since: 2.15
         * Maven coordinates: org.apache.camel:camel-github
         * 
         * Syntax: <code>github:type/branchName</code>
         * 
         * Path parameter: type (required)
         * What git operation to execute
         * There are 10 enums and the value can be one of: CLOSEPULLREQUEST,
         * PULLREQUESTCOMMENT, COMMIT, PULLREQUEST, TAG, PULLREQUESTSTATE,
         * PULLREQUESTFILES, GETCOMMITFILE, CREATEISSUE, EVENT
         * 
         * Path parameter: branchName
         * Name of branch
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path type/branchName
         */
        default GitHubEndpointBuilder github(String componentName, String path) {
            return GitHubEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static GitHubEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GitHubEndpointBuilderImpl extends AbstractEndpointBuilder implements GitHubEndpointBuilder, AdvancedGitHubEndpointBuilder {
            public GitHubEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GitHubEndpointBuilderImpl(path);
    }
}
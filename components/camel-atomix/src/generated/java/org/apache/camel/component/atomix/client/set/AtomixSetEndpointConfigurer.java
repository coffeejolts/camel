/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atomix.client.set;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AtomixSetEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AtomixSetEndpoint target = (AtomixSetEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "atomix": target.getConfiguration().setAtomix(property(camelContext, io.atomix.Atomix.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "defaultaction":
        case "defaultAction": target.getConfiguration().setDefaultAction(property(camelContext, org.apache.camel.component.atomix.client.set.AtomixSet.Action.class, value)); return true;
        case "defaultresourceconfig":
        case "defaultResourceConfig": target.getConfiguration().setDefaultResourceConfig(property(camelContext, java.util.Properties.class, value)); return true;
        case "defaultresourceoptions":
        case "defaultResourceOptions": target.getConfiguration().setDefaultResourceOptions(property(camelContext, java.util.Properties.class, value)); return true;
        case "ephemeral": target.getConfiguration().setEphemeral(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "nodes": target.getConfiguration().setNodes(property(camelContext, java.lang.String.class, value)); return true;
        case "readconsistency":
        case "readConsistency": target.getConfiguration().setReadConsistency(property(camelContext, io.atomix.resource.ReadConsistency.class, value)); return true;
        case "resourceconfigs":
        case "resourceConfigs": target.getConfiguration().setResourceConfigs(property(camelContext, java.util.Map.class, value)); return true;
        case "resourceoptions":
        case "resourceOptions": target.getConfiguration().setResourceOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "resultheader":
        case "resultHeader": target.getConfiguration().setResultHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "transportclassname":
        case "transportClassName": target.getConfiguration().setTransportClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "ttl": target.getConfiguration().setTtl(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "atomix": return io.atomix.Atomix.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "configurationuri":
        case "configurationUri": return java.lang.String.class;
        case "defaultaction":
        case "defaultAction": return org.apache.camel.component.atomix.client.set.AtomixSet.Action.class;
        case "defaultresourceconfig":
        case "defaultResourceConfig": return java.util.Properties.class;
        case "defaultresourceoptions":
        case "defaultResourceOptions": return java.util.Properties.class;
        case "ephemeral": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "nodes": return java.lang.String.class;
        case "readconsistency":
        case "readConsistency": return io.atomix.resource.ReadConsistency.class;
        case "resourceconfigs":
        case "resourceConfigs": return java.util.Map.class;
        case "resourceoptions":
        case "resourceOptions": return java.util.Map.class;
        case "resultheader":
        case "resultHeader": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "transportclassname":
        case "transportClassName": return java.lang.String.class;
        case "ttl": return long.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AtomixSetEndpoint target = (AtomixSetEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "atomix": return target.getConfiguration().getAtomix();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configurationuri":
        case "configurationUri": return target.getConfiguration().getConfigurationUri();
        case "defaultaction":
        case "defaultAction": return target.getConfiguration().getDefaultAction();
        case "defaultresourceconfig":
        case "defaultResourceConfig": return target.getConfiguration().getDefaultResourceConfig();
        case "defaultresourceoptions":
        case "defaultResourceOptions": return target.getConfiguration().getDefaultResourceOptions();
        case "ephemeral": return target.getConfiguration().isEphemeral();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "nodes": return target.getConfiguration().getNodes();
        case "readconsistency":
        case "readConsistency": return target.getConfiguration().getReadConsistency();
        case "resourceconfigs":
        case "resourceConfigs": return target.getConfiguration().getResourceConfigs();
        case "resourceoptions":
        case "resourceOptions": return target.getConfiguration().getResourceOptions();
        case "resultheader":
        case "resultHeader": return target.getConfiguration().getResultHeader();
        case "synchronous": return target.isSynchronous();
        case "transportclassname":
        case "transportClassName": return target.getConfiguration().getTransportClassName();
        case "ttl": return target.getConfiguration().getTtl();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "resourceconfigs":
        case "resourceConfigs": return java.util.Properties.class;
        case "resourceoptions":
        case "resourceOptions": return java.util.Properties.class;
        default: return null;
        }
    }
}


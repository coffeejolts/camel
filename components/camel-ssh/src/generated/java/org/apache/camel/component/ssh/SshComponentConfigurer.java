/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ssh;

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
public class SshComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.ssh.SshConfiguration getOrCreateConfiguration(SshComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.ssh.SshConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SshComponent target = (SshComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "certresource":
        case "certResource": getOrCreateConfiguration(target).setCertResource(property(camelContext, java.lang.String.class, value)); return true;
        case "certresourcepassword":
        case "certResourcePassword": getOrCreateConfiguration(target).setCertResourcePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "channeltype":
        case "channelType": getOrCreateConfiguration(target).setChannelType(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.ssh.SshConfiguration.class, value)); return true;
        case "failonunknownhost":
        case "failOnUnknownHost": getOrCreateConfiguration(target).setFailOnUnknownHost(property(camelContext, boolean.class, value)); return true;
        case "keypairprovider":
        case "keyPairProvider": getOrCreateConfiguration(target).setKeyPairProvider(property(camelContext, org.apache.sshd.common.keyprovider.KeyPairProvider.class, value)); return true;
        case "keytype":
        case "keyType": getOrCreateConfiguration(target).setKeyType(property(camelContext, java.lang.String.class, value)); return true;
        case "knownhostsresource":
        case "knownHostsResource": getOrCreateConfiguration(target).setKnownHostsResource(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "pollcommand":
        case "pollCommand": getOrCreateConfiguration(target).setPollCommand(property(camelContext, java.lang.String.class, value)); return true;
        case "shellprompt":
        case "shellPrompt": getOrCreateConfiguration(target).setShellPrompt(property(camelContext, java.lang.String.class, value)); return true;
        case "sleepforshellprompt":
        case "sleepForShellPrompt": getOrCreateConfiguration(target).setSleepForShellPrompt(property(camelContext, long.class, value)); return true;
        case "timeout": getOrCreateConfiguration(target).setTimeout(property(camelContext, long.class, value)); return true;
        case "username": getOrCreateConfiguration(target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "certresource":
        case "certResource": return java.lang.String.class;
        case "certresourcepassword":
        case "certResourcePassword": return java.lang.String.class;
        case "channeltype":
        case "channelType": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.ssh.SshConfiguration.class;
        case "failonunknownhost":
        case "failOnUnknownHost": return boolean.class;
        case "keypairprovider":
        case "keyPairProvider": return org.apache.sshd.common.keyprovider.KeyPairProvider.class;
        case "keytype":
        case "keyType": return java.lang.String.class;
        case "knownhostsresource":
        case "knownHostsResource": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "password": return java.lang.String.class;
        case "pollcommand":
        case "pollCommand": return java.lang.String.class;
        case "shellprompt":
        case "shellPrompt": return java.lang.String.class;
        case "sleepforshellprompt":
        case "sleepForShellPrompt": return long.class;
        case "timeout": return long.class;
        case "username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SshComponent target = (SshComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "certresource":
        case "certResource": return getOrCreateConfiguration(target).getCertResource();
        case "certresourcepassword":
        case "certResourcePassword": return getOrCreateConfiguration(target).getCertResourcePassword();
        case "channeltype":
        case "channelType": return getOrCreateConfiguration(target).getChannelType();
        case "configuration": return target.getConfiguration();
        case "failonunknownhost":
        case "failOnUnknownHost": return getOrCreateConfiguration(target).isFailOnUnknownHost();
        case "keypairprovider":
        case "keyPairProvider": return getOrCreateConfiguration(target).getKeyPairProvider();
        case "keytype":
        case "keyType": return getOrCreateConfiguration(target).getKeyType();
        case "knownhostsresource":
        case "knownHostsResource": return getOrCreateConfiguration(target).getKnownHostsResource();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "pollcommand":
        case "pollCommand": return getOrCreateConfiguration(target).getPollCommand();
        case "shellprompt":
        case "shellPrompt": return getOrCreateConfiguration(target).getShellPrompt();
        case "sleepforshellprompt":
        case "sleepForShellPrompt": return getOrCreateConfiguration(target).getSleepForShellPrompt();
        case "timeout": return getOrCreateConfiguration(target).getTimeout();
        case "username": return getOrCreateConfiguration(target).getUsername();
        default: return null;
        }
    }
}


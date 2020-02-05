/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kubernetes.persistent_volumes;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class KubernetesPersistentVolumesEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "apiVersion": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "dnsDomain": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setDnsDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "kubernetesClient": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setKubernetesClient(property(camelContext, io.fabric8.kubernetes.client.KubernetesClient.class, value)); return true;
        case "lazyStartProducer": ((KubernetesPersistentVolumesEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "portName": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setPortName(property(camelContext, java.lang.String.class, value)); return true;
        case "portProtocol": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setPortProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((KubernetesPersistentVolumesEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectionTimeout": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": ((KubernetesPersistentVolumesEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "caCertData": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "caCertFile": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientCertData": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientCertFile": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyAlgo": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyData": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyFile": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyPassphrase": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthToken": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "trustCerts": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setTrustCerts(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "apiversion": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "dnsdomain": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setDnsDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "kubernetesclient": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setKubernetesClient(property(camelContext, io.fabric8.kubernetes.client.KubernetesClient.class, value)); return true;
        case "lazystartproducer": ((KubernetesPersistentVolumesEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "portname": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setPortName(property(camelContext, java.lang.String.class, value)); return true;
        case "portprotocol": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setPortProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((KubernetesPersistentVolumesEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectiontimeout": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": ((KubernetesPersistentVolumesEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "cacertdata": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "cacertfile": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertdata": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertfile": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyalgo": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeydata": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyfile": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeypassphrase": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthtoken": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "trustcerts": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setTrustCerts(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username": ((KubernetesPersistentVolumesEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

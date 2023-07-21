/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vertx.kafka;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class VertxKafkaEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":topic";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(103);
        props.add("acks");
        props.add("additionalProperties");
        props.add("allowAutoCreateTopics");
        props.add("allowManualCommit");
        props.add("autoCommitIntervalMs");
        props.add("autoOffsetReset");
        props.add("batchSize");
        props.add("bootstrapServers");
        props.add("bridgeErrorHandler");
        props.add("bufferMemory");
        props.add("checkCrcs");
        props.add("clientDnsLookup");
        props.add("clientId");
        props.add("clientRack");
        props.add("compressionType");
        props.add("connectionsMaxIdleMs");
        props.add("defaultApiTimeoutMs");
        props.add("deliveryTimeoutMs");
        props.add("enableAutoCommit");
        props.add("enableIdempotence");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("excludeInternalTopics");
        props.add("fetchMaxBytes");
        props.add("fetchMaxWaitMs");
        props.add("fetchMinBytes");
        props.add("groupId");
        props.add("groupInstanceId");
        props.add("headerFilterStrategy");
        props.add("heartbeatIntervalMs");
        props.add("interceptorClasses");
        props.add("isolationLevel");
        props.add("keyDeserializer");
        props.add("keySerializer");
        props.add("lazyStartProducer");
        props.add("lingerMs");
        props.add("maxBlockMs");
        props.add("maxInFlightRequestsPerConnection");
        props.add("maxPartitionFetchBytes");
        props.add("maxPollIntervalMs");
        props.add("maxPollRecords");
        props.add("maxRequestSize");
        props.add("metadataMaxAgeMs");
        props.add("metadataMaxIdleMs");
        props.add("metricReporters");
        props.add("metricsNumSamples");
        props.add("metricsRecordingLevel");
        props.add("metricsSampleWindowMs");
        props.add("partitionAssignmentStrategy");
        props.add("partitionId");
        props.add("partitionerClass");
        props.add("receiveBufferBytes");
        props.add("reconnectBackoffMaxMs");
        props.add("reconnectBackoffMs");
        props.add("requestTimeoutMs");
        props.add("retries");
        props.add("retryBackoffMs");
        props.add("saslClientCallbackHandlerClass");
        props.add("saslJaasConfig");
        props.add("saslKerberosKinitCmd");
        props.add("saslKerberosMinTimeBeforeRelogin");
        props.add("saslKerberosServiceName");
        props.add("saslKerberosTicketRenewJitter");
        props.add("saslKerberosTicketRenewWindowFactor");
        props.add("saslLoginCallbackHandlerClass");
        props.add("saslLoginClass");
        props.add("saslLoginRefreshBufferSeconds");
        props.add("saslLoginRefreshMinPeriodSeconds");
        props.add("saslLoginRefreshWindowFactor");
        props.add("saslLoginRefreshWindowJitter");
        props.add("saslMechanism");
        props.add("securityProtocol");
        props.add("securityProviders");
        props.add("seekToOffset");
        props.add("seekToPosition");
        props.add("sendBufferBytes");
        props.add("sessionTimeoutMs");
        props.add("socketConnectionSetupTimeoutMaxMs");
        props.add("socketConnectionSetupTimeoutMs");
        props.add("sslCipherSuites");
        props.add("sslEnabledProtocols");
        props.add("sslEndpointIdentificationAlgorithm");
        props.add("sslEngineFactoryClass");
        props.add("sslKeyPassword");
        props.add("sslKeymanagerAlgorithm");
        props.add("sslKeystoreCertificateChain");
        props.add("sslKeystoreKey");
        props.add("sslKeystoreLocation");
        props.add("sslKeystorePassword");
        props.add("sslKeystoreType");
        props.add("sslProtocol");
        props.add("sslProvider");
        props.add("sslSecureRandomImplementation");
        props.add("sslTrustmanagerAlgorithm");
        props.add("sslTruststoreCertificates");
        props.add("sslTruststoreLocation");
        props.add("sslTruststorePassword");
        props.add("sslTruststoreType");
        props.add("topic");
        props.add("transactionTimeoutMs");
        props.add("transactionalId");
        props.add("valueDeserializer");
        props.add("valueSerializer");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("additionalProperties.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "vertx-kafka".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "topic", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

package com.mulesoft.connectors.internal.config;

import com.mulesoft.connectors.commons.template.config.ConnectorConfig;
import com.mulesoft.connectors.internal.connection.provider.GoogleDriveConnectionProvider;
import com.mulesoft.connectors.internal.operation.FileOperations;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Sources;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

@Operations(FileOperations.class)
@ConnectionProviders({GoogleDriveConnectionProvider.class})
@Configuration(name = "consumer-config")
@DisplayName("Consumer configuration")
public class GoogleDriveConfiguration implements ConnectorConfig {
}

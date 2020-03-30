package com.mulesoft.connectors.internal.extension;

import com.mulesoft.connectors.internal.config.GoogleDriveConfiguration;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

import static org.mule.runtime.api.meta.Category.SELECT;

@Extension(name = "Apache Kafka", category = SELECT)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
@Configurations({
        GoogleDriveConfiguration.class,
})
@Xml(prefix = "drive")
public class GoogleDriveConnector {
}

package com.mulesoft.connectors.internal.connection.provider;

import com.mulesoft.connectors.commons.template.connection.provider.ConnectorConnectionProvider;
import com.mulesoft.connectors.internal.connection.GoogleDriveConnection;
import org.mule.runtime.api.connection.CachedConnectionProvider;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.api.lifecycle.Disposable;
import org.mule.runtime.api.lifecycle.Initialisable;
import org.mule.runtime.api.lifecycle.InitialisationException;

public class GoogleDriveConnectionProvider implements ConnectorConnectionProvider<GoogleDriveConnection>,
        CachedConnectionProvider<GoogleDriveConnection>, Initialisable, Disposable {
    @Override
    public GoogleDriveConnection connect() throws ConnectionException {
        return null;
    }

    @Override
    public void dispose() {

    }

    @Override
    public void initialise() throws InitialisationException {

    }

    @Override
    public void disconnect(GoogleDriveConnection connection) {

    }

    @Override
    public ConnectionValidationResult validate(GoogleDriveConnection connection) {
        return null;
    }
}

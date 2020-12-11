// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Tag;

/**
 * Sample example showing how peek would work.
 */
@Tag("sample")
public class PeekMessageAsyncSample {
    /**
     * Main method to invoke this demo on how to peek at a message within a Service Bus Queue.
     *
     * @param args Unused arguments to the program.
     * @throws InterruptedException If the program is unable to sleep while waiting for the receive to complete.
     */
    public static void main(String[] args) throws InterruptedException {
        // The connection string value can be obtained by:
        // 1. Going to your Service Bus namespace in Azure Portal.
        // 2. Go to "Shared access policies"
        // 3. Copy the connection string for the "RootManageSharedAccessKey" policy.
        // We are reading 'connectionString/queueName' from environment variable. Your application could read it from
        // some other source. The 'connectionString' format is shown below.
        // "Endpoint={fully-qualified-namespace};SharedAccessKeyName={policy-name};SharedAccessKey={key}"

        String connectionString = System.getenv("AZURE_SERVICEBUS_NAMESPACE_CONNECTION_STRING");
        String queueName = System.getenv("AZURE_SERVICEBUS_SAMPLE_QUEUE_NAME");

        // Create a receiver using connection string.
        // "<<queue-name>>" will be the name of the Service Bus queue instance you created
        // inside the Service Bus namespace.
        ServiceBusReceiverAsyncClient receiver = new ServiceBusClientBuilder()
            .connectionString(connectionString)
            .receiver()
            .queueName(queueName)
            .buildAsyncClient();

        receiver.peekMessage().subscribe(
            message -> {
                System.out.println("Received Message Id: " + message.getMessageId());
                System.out.println("Received Message: " + message.getBody().toString());
            },
            error -> System.err.println("Error occurred while receiving message: " + error),
            () -> System.out.println("Receiving complete."));

        // Subscribe is not a blocking call so we sleep here so the program does not end while finishing
        // the peek operation.
        TimeUnit.SECONDS.sleep(10);

        // Close the receiver.
        receiver.close();
    }
}

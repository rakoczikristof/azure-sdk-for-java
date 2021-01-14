// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetInner;
import java.time.OffsetDateTime;
import java.util.UUID;

/** An immutable client-side representation of Asset. */
public interface Asset {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the assetId property: The Asset ID.
     *
     * @return the assetId value.
     */
    UUID assetId();

    /**
     * Gets the created property: The creation date of the Asset.
     *
     * @return the created value.
     */
    OffsetDateTime created();

    /**
     * Gets the lastModified property: The last modified date of the Asset.
     *
     * @return the lastModified value.
     */
    OffsetDateTime lastModified();

    /**
     * Gets the alternateId property: The alternate ID of the Asset.
     *
     * @return the alternateId value.
     */
    String alternateId();

    /**
     * Gets the description property: The Asset description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the container property: The name of the asset blob container.
     *
     * @return the container value.
     */
    String container();

    /**
     * Gets the storageAccountName property: The name of the storage account.
     *
     * @return the storageAccountName value.
     */
    String storageAccountName();

    /**
     * Gets the storageEncryptionFormat property: The Asset encryption format. One of None or MediaStorageEncryption.
     *
     * @return the storageEncryptionFormat value.
     */
    AssetStorageEncryptionFormat storageEncryptionFormat();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.fluent.models.AssetInner object.
     *
     * @return the inner object.
     */
    AssetInner innerModel();

    /** The entirety of the Asset definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Asset definition stages. */
    interface DefinitionStages {
        /** The first stage of the Asset definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Asset definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group within the Azure subscription.
             * @param accountName The Media Services account name.
             * @return the next definition stage.
             */
            WithCreate withExistingMediaService(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the Asset definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithAlternateId,
                DefinitionStages.WithDescription,
                DefinitionStages.WithContainer,
                DefinitionStages.WithStorageAccountName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Asset create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Asset create(Context context);
        }
        /** The stage of the Asset definition allowing to specify alternateId. */
        interface WithAlternateId {
            /**
             * Specifies the alternateId property: The alternate ID of the Asset..
             *
             * @param alternateId The alternate ID of the Asset.
             * @return the next definition stage.
             */
            WithCreate withAlternateId(String alternateId);
        }
        /** The stage of the Asset definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The Asset description..
             *
             * @param description The Asset description.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the Asset definition allowing to specify container. */
        interface WithContainer {
            /**
             * Specifies the container property: The name of the asset blob container..
             *
             * @param container The name of the asset blob container.
             * @return the next definition stage.
             */
            WithCreate withContainer(String container);
        }
        /** The stage of the Asset definition allowing to specify storageAccountName. */
        interface WithStorageAccountName {
            /**
             * Specifies the storageAccountName property: The name of the storage account..
             *
             * @param storageAccountName The name of the storage account.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountName(String storageAccountName);
        }
    }
    /**
     * Begins update for the Asset resource.
     *
     * @return the stage of resource update.
     */
    Asset.Update update();

    /** The template for Asset update. */
    interface Update
        extends UpdateStages.WithAlternateId,
            UpdateStages.WithDescription,
            UpdateStages.WithContainer,
            UpdateStages.WithStorageAccountName {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Asset apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Asset apply(Context context);
    }
    /** The Asset update stages. */
    interface UpdateStages {
        /** The stage of the Asset update allowing to specify alternateId. */
        interface WithAlternateId {
            /**
             * Specifies the alternateId property: The alternate ID of the Asset..
             *
             * @param alternateId The alternate ID of the Asset.
             * @return the next definition stage.
             */
            Update withAlternateId(String alternateId);
        }
        /** The stage of the Asset update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The Asset description..
             *
             * @param description The Asset description.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the Asset update allowing to specify container. */
        interface WithContainer {
            /**
             * Specifies the container property: The name of the asset blob container..
             *
             * @param container The name of the asset blob container.
             * @return the next definition stage.
             */
            Update withContainer(String container);
        }
        /** The stage of the Asset update allowing to specify storageAccountName. */
        interface WithStorageAccountName {
            /**
             * Specifies the storageAccountName property: The name of the storage account..
             *
             * @param storageAccountName The name of the storage account.
             * @return the next definition stage.
             */
            Update withStorageAccountName(String storageAccountName);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Asset refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Asset refresh(Context context);
}

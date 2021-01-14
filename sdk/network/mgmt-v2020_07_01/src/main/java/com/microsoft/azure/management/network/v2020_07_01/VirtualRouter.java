/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_07_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_07_01.implementation.VirtualRouterInner;

/**
 * Type representing VirtualRouter.
 */
public interface VirtualRouter extends HasInner<VirtualRouterInner>, Resource, GroupableResourceCore<NetworkManager, VirtualRouterInner>, HasResourceGroup, Refreshable<VirtualRouter>, Updatable<VirtualRouter.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the hostedGateway value.
     */
    SubResource hostedGateway();

    /**
     * @return the hostedSubnet value.
     */
    SubResource hostedSubnet();

    /**
     * @return the peerings value.
     */
    List<SubResource> peerings();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the virtualRouterAsn value.
     */
    Long virtualRouterAsn();

    /**
     * @return the virtualRouterIps value.
     */
    List<String> virtualRouterIps();

    /**
     * The entirety of the VirtualRouter definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualRouter definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualRouter definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VirtualRouter definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the virtualrouter definition allowing to specify HostedGateway.
         */
        interface WithHostedGateway {
            /**
             * Specifies hostedGateway.
             * @param hostedGateway The Gateway on which VirtualRouter is hosted
             * @return the next definition stage
             */
            WithCreate withHostedGateway(SubResource hostedGateway);
        }

        /**
         * The stage of the virtualrouter definition allowing to specify HostedSubnet.
         */
        interface WithHostedSubnet {
            /**
             * Specifies hostedSubnet.
             * @param hostedSubnet The Subnet on which VirtualRouter is hosted
             * @return the next definition stage
             */
            WithCreate withHostedSubnet(SubResource hostedSubnet);
        }

        /**
         * The stage of the virtualrouter definition allowing to specify VirtualRouterAsn.
         */
        interface WithVirtualRouterAsn {
            /**
             * Specifies virtualRouterAsn.
             * @param virtualRouterAsn VirtualRouter ASN
             * @return the next definition stage
             */
            WithCreate withVirtualRouterAsn(Long virtualRouterAsn);
        }

        /**
         * The stage of the virtualrouter definition allowing to specify VirtualRouterIps.
         */
        interface WithVirtualRouterIps {
            /**
             * Specifies virtualRouterIps.
             * @param virtualRouterIps VirtualRouter IPs
             * @return the next definition stage
             */
            WithCreate withVirtualRouterIps(List<String> virtualRouterIps);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualRouter>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithHostedGateway, DefinitionStages.WithHostedSubnet, DefinitionStages.WithVirtualRouterAsn, DefinitionStages.WithVirtualRouterIps {
        }
    }
    /**
     * The template for a VirtualRouter update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualRouter>, Resource.UpdateWithTags<Update>, UpdateStages.WithHostedGateway, UpdateStages.WithHostedSubnet, UpdateStages.WithVirtualRouterAsn, UpdateStages.WithVirtualRouterIps {
    }

    /**
     * Grouping of VirtualRouter update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualrouter update allowing to specify HostedGateway.
         */
        interface WithHostedGateway {
            /**
             * Specifies hostedGateway.
             * @param hostedGateway The Gateway on which VirtualRouter is hosted
             * @return the next update stage
             */
            Update withHostedGateway(SubResource hostedGateway);
        }

        /**
         * The stage of the virtualrouter update allowing to specify HostedSubnet.
         */
        interface WithHostedSubnet {
            /**
             * Specifies hostedSubnet.
             * @param hostedSubnet The Subnet on which VirtualRouter is hosted
             * @return the next update stage
             */
            Update withHostedSubnet(SubResource hostedSubnet);
        }

        /**
         * The stage of the virtualrouter update allowing to specify VirtualRouterAsn.
         */
        interface WithVirtualRouterAsn {
            /**
             * Specifies virtualRouterAsn.
             * @param virtualRouterAsn VirtualRouter ASN
             * @return the next update stage
             */
            Update withVirtualRouterAsn(Long virtualRouterAsn);
        }

        /**
         * The stage of the virtualrouter update allowing to specify VirtualRouterIps.
         */
        interface WithVirtualRouterIps {
            /**
             * Specifies virtualRouterIps.
             * @param virtualRouterIps VirtualRouter IPs
             * @return the next update stage
             */
            Update withVirtualRouterIps(List<String> virtualRouterIps);
        }

    }
}

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.stratos.messaging.event.instance.notifier;

import java.io.Serializable;

/**
 * This event is published by the instance before git pull.
 */

public class ArtifactDeploymentStartedEvent extends InstanceNotifierEvent implements Serializable {
    private String serviceName;
    private String clusterId;
    private String networkPartitionId;
    private String partitionId;
    private String memberId;
    private String status;
    private String tenantId;

    public ArtifactDeploymentStartedEvent(String serviceName, String clusterId,
                                        String networkPartitionId, String partitionId, String memberId) {
        this.serviceName = serviceName;
        this.clusterId = clusterId;
        this.networkPartitionId = networkPartitionId;
        this.partitionId = partitionId;
        this.memberId = memberId;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

    @Override
    public String toString() {
        return String.format("[cluster] %s [repo-url] %s [repo-username] %s [tenant] %s",
                getClusterId(), getTenantId());
    }

}

package org.xylia.microservices.odata.producer.entity.providers;

import org.apache.olingo.commons.api.edm.FullQualifiedName;


import org.springframework.stereotype.Component;
import org.xylia.microservices.odata.edm.framework.providers.entity.BaseEntityProviderProcessorImpl;
import org.xylia.microservices.odata.framework.edm.providers.EntityProvider;

/*
 * @author Rajesh Iyer 
 * 
 * LeaveEvent Entity provider implementation class. 
 */

@Component
public class LeaveEventEntityProvider extends BaseEntityProviderProcessorImpl implements EntityProvider {

	// Service Namespace
	public static final String NAMESPACE = "org.xylia.microservices.odata.producer.entities";

	// EDM Container
	public static final String CONTAINER_NAME = "Container";

	// Entity Name
	public static final String ENTITY_NAME = "LeaveEvent";

	@Override
	public String getEntityNameSpace() {
		return NAMESPACE;
	}

	@Override
	public FullQualifiedName getContainer() {
		return new FullQualifiedName(getEntityNameSpace(), CONTAINER_NAME);
	}

	@Override
	public String getProducerEntitySetName() {
		return ENTITY_NAME;
	}

	@Override
	public String getProducerEntityName() {
		return ENTITY_NAME;
	}

	@Override
	public FullQualifiedName getFullyQualifiedEntityName() {
		return new FullQualifiedName(NAMESPACE, ENTITY_NAME);
	}

	@Override
	public String getFullQualifiedEntityName() {
		return NAMESPACE + "." + ENTITY_NAME;
	}

}

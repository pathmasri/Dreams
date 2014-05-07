package src.com.exclusoft.webmodule_1.core.service;

import src.com.exclusoft.common.core.util.GenericLookupUtils;
import src.com.exclusoft.ejbmodule1.api.service.HouseBD;


public class ModuleServiceLocator {
	
//	private static Object lookupEJB3Service(String targetModuleName, String serviceName) {
//		return GenericLookupUtils.lookupEJB3Service(targetModuleName, serviceName, AiradminModuleUtils.getConfig(), "airadmin",
//				"airadmin.config.dependencymap.invalid");
//	}
//	
//	public final static HouseBD getgetHouseBD() {
//		try {
//			return (HouseBD) ModuleServiceLocator.lookupEJB3Service(EJBModule_1_Constants.MODULE_NAME,
//					HouseBD.SERVICE_NAME);
//		} catch (Exception e) {
//			log.error("Error locating ReservationBD", e);
//			throw new Exception(e, "module.lookup.failed", EJBModule_1_Constants.MODULE_NAME);
//		}
//
//	}
	
	public final static HouseBD getgetHouseBD() throws Exception {
	try {
		return (HouseBD) GenericLookupUtils.lookupEJB3Service(HouseBD.SERVICE_NAME,
				"remote");
	} catch (Exception e) {
		
		throw new Exception("EJBModule_1 fails");
	}

}
	

}

package com.exacttarget.example;

import com.exacttarget.wsdl.partnerapi.*;
import com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.*;
import com.exacttarget.wsdl.partnerapi.PerformRequestMsgDocument.PerformRequestMsg.Definitions;

public class PerformImportDefinition {
	public static void Run(PartnerAPIStub ps, String iImportDefinitionCustomerKey) {

		try {

			ImportDefinition id = ImportDefinition.Factory.newInstance();
    		id.setCustomerKey(iImportDefinitionCustomerKey);    
			    		
    		Definitions defs = Definitions.Factory.newInstance();
    		defs.setDefinitionArray(new ImportDefinition[] {id});    		    	
    		    		
    		PerformRequestMsg prm = PerformRequestMsg.Factory.newInstance();    		    	
    		prm.setAction("start");
    		prm.setDefinitions(defs);
    		
    		PerformRequestMsgDocument prmd = PerformRequestMsgDocument.Factory.newInstance();
    		prmd.setPerformRequestMsg(prm);

    		PerformResponseMsgDocument performResponseMsgDoc = ps.perform(prmd);
    		PerformResponseMsgDocument.PerformResponseMsg performResponseMsg = performResponseMsgDoc.getPerformResponseMsg();
    		
    		System.out.println("Status: " + performResponseMsg.getOverallStatus());
    		System.out.println("Status Message: " + performResponseMsg.getOverallStatusMessage());
    		System.out.println("Request ID: " + performResponseMsg.getRequestID());    		
    		    		
			for (PerformResult pr : performResponseMsg.getResults().getResultArray()) 
			{
				// Task.ID Value is needed in order to check status of import using follow-up call
				System.out.println("TaskID: " + pr.getTask().getID().toString());
				System.out.println("StatusCode: " + pr.getStatusCode());
				System.out.println("ErrorCode: " + pr.getErrorCode());
				System.out.println("StatusMessage: " + pr.getStatusMessage());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

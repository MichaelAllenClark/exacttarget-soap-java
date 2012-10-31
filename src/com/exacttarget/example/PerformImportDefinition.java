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
    		    		
    		PerformRequestMsg pr = PerformRequestMsg.Factory.newInstance();    		    	
    		pr.setAction("start");
    		pr.setDefinitions(defs);
    		
    		PerformRequestMsgDocument prmd = PerformRequestMsgDocument.Factory.newInstance();
    		prmd.setPerformRequestMsg(pr);

    		PerformResponseMsgDocument performResponseMsgDoc = ps.perform(prmd);
    		PerformResponseMsgDocument.PerformResponseMsg performResponseMsg = performResponseMsgDoc.getPerformResponseMsg();
    		System.out.println(performResponseMsg.getOverallStatus() + " " +performResponseMsg.getOverallStatusMessage());
    		System.out.println(performResponseMsgDoc.toString());

			for (UpdateResult ur : uResults.getResultsArray()) 
			{
				System.out.println("StatusCode: " + ur.getStatusCode());
				System.out.println("StatusMessage: " + ur.getStatusMessage());
				System.out.println("ErrorCode: " + ur.getErrorCode());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

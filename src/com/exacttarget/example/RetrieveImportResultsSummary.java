package com.exacttarget.example;

import com.exacttarget.wsdl.partnerapi.*;

public class RetrieveImportResultsSummary {
	public static void Run(PartnerAPIStub ps, String iTaskID) {

		try {
			
			RetrieveRequestMsgDocument retrieveRequestMsgDocument = RetrieveRequestMsgDocument.Factory.newInstance(); 
    		RetrieveRequest rr = com.exacttarget.wsdl.partnerapi.RetrieveRequest.Factory.newInstance();
    		
    		rr.setObjectType("ImportResultsSummary"); 
    		rr.setPropertiesArray(new String[] {"ImportStatus" });     		
    		
    		SimpleFilterPart sf = SimpleFilterPart.Factory.newInstance(); 
    		sf.setProperty("TaskResultID"); 
    		sf.setSimpleOperator(SimpleOperators.EQUALS); 
    		sf.setValueArray(new String[] {iTaskID}); 
    		
    		rr.setFilter(sf); 
    		
    		RetrieveRequestMsgDocument.RetrieveRequestMsg retrieveRequestMsg = retrieveRequestMsgDocument.addNewRetrieveRequestMsg(); 
    		retrieveRequestMsg.setRetrieveRequest(rr); 
    		
    		RetrieveResponseMsgDocument retrieveResponseMsgDocument = ps.retrieve(retrieveRequestMsgDocument); 
    		RetrieveResponseMsgDocument.RetrieveResponseMsg retrieveResponseMsg = retrieveResponseMsgDocument.getRetrieveResponseMsg();
    		
    		System.out.println("Status: " + retrieveResponseMsg.getOverallStatus()); 	
    		System.out.println("RequestID: " + retrieveResponseMsg.getRequestID());
    		    		
			for (APIObject apio : retrieveResponseMsg.getResultsArray() ) 
			{
				ImportResultsSummary irs = (ImportResultsSummary) apio;
				// Possible values for ImportStatus are New, Processing, Completed, Error, IOWork, and Unknown
				System.out.println("ImportStatus: " + irs.getImportStatus() );
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.exacttarget.example;

import com.exacttarget.wsdl.partnerapi.*;
import com.exacttarget.wsdl.partnerapi.CreateResponseDocument.*;

public class CreateTriggeredSend {
    public static void Run(PartnerAPIStub ps, 
    		String iTriggeredSendCustomerKey, 
            String iEmailAddress, 
            String iFirstName, 
            String iLastName ) {

        try {
           
            TriggeredSend ts = TriggeredSend.Factory.newInstance();            
            TriggeredSendDefinition tsd = TriggeredSendDefinition.Factory.newInstance();
            tsd.setCustomerKey(iTriggeredSendCustomerKey);
            ts.setTriggeredSendDefinition(tsd);

            Subscriber sub = Subscriber.Factory.newInstance();
            sub.setEmailAddress(iEmailAddress);
            sub.setSubscriberKey(iEmailAddress);

            Attribute firstName = Attribute.Factory.newInstance();
            firstName.setName("First Name");
            firstName.setValue(iFirstName);
            
            Attribute lastName = Attribute.Factory.newInstance();
            lastName.setName("Last Name");
            lastName.setValue(iLastName);

            sub.setAttributesArray(new Attribute[]{firstName, lastName});
            
            ts.setSubscribersArray(new Subscriber[]{sub});
            
            CreateRequestDocument createRequestDocument = 
            		CreateRequestDocument.Factory.newInstance();
            CreateRequestDocument.CreateRequest createRequest = 
            		CreateRequestDocument.CreateRequest.Factory.newInstance();
            createRequest.setObjectsArray(new APIObject[]{ts});
            CreateOptions createOptions = CreateOptions.Factory.newInstance();            
            createRequest.setOptions(createOptions);
            
            createRequestDocument.setCreateRequest(createRequest);            
            CreateResponseDocument responseDoc = ps.create(createRequestDocument);
            
    		CreateResponse cr = responseDoc.getCreateResponse();
    		System.out.println("Status: " + cr.getOverallStatus());
    		System.out.println("Request ID: " + cr.getRequestID());
    		
    		for(CreateResult createResult : cr.getResultsArray())
    		{
    			TriggeredSendCreateResult tscr = (TriggeredSendCreateResult) createResult;
    			for(SubscriberResult sr : tscr.getSubscriberFailuresArray())
    			{
    				System.out.println("ErrorCode: " + sr.getErrorCode());
    				System.out.println("ErrorDescription: " + sr.getErrorDescription());    				
    			}	    			
    		}

        }
        catch (Exception e) {
            e.printStackTrace();
        }    	    	    
    }
}

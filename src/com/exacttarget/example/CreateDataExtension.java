package com.exacttarget.example;

import com.exacttarget.wsdl.partnerapi.*;
import com.exacttarget.wsdl.partnerapi.CreateResponseDocument.*;

public class CreateDataExtension {
    public static void Execute(PartnerAPIStub ps, 
    		String iDataExtensionName, 
            String iDataExtensionCustomerKey)
    
    	{

        try {
           
            DataExtension de = DataExtension.Factory.newInstance();      
            
            de.setName(iDataExtensionName);
            de.setCustomerKey(iDataExtensionCustomerKey);

            de.setIsSendable(true);
            
            DataExtensionField def = DataExtensionField.Factory.newInstance();
            def.setName("EMAIL");
            de.setSendableDataExtensionField(def);
            
            //Sendable SubscriberField will be "Email Address" by default
            //If SubscriberKey option is enabled then value needs to be "Subscriber Key"            
            Attribute attr = Attribute.Factory.newInstance();
            attr.setName("Email Address");
            de.setSendableSubscriberField(attr);            
            
            DataExtensionField emailField = DataExtensionField.Factory.newInstance();
            emailField.setName("EMAIL");
            emailField.setFieldType(DataExtensionFieldType.EMAIL_ADDRESS);
            emailField.setIsRequired(true);
            emailField.setIsPrimaryKey(true);
            emailField.setMaxLength(50);            

            DataExtensionField fnameField =  DataExtensionField.Factory.newInstance();
            fnameField.setName("FIRST NAME");
            fnameField.setFieldType(DataExtensionFieldType.TEXT);            

            DataExtensionField lnameField =  DataExtensionField.Factory.newInstance();
            lnameField.setName("LAST NAME");
            lnameField.setFieldType(DataExtensionFieldType.TEXT);


            DataExtension.Fields fields = DataExtension.Fields.Factory.newInstance();
            fields.setFieldArray(new DataExtensionField[] { emailField, fnameField, lnameField });
            de.setFields(fields);
            
            CreateRequestDocument createRequestDocument = 
            		CreateRequestDocument.Factory.newInstance();
            CreateRequestDocument.CreateRequest createRequest = 
            		CreateRequestDocument.CreateRequest.Factory.newInstance();
            createRequest.setObjectsArray(new APIObject[]{de});
            CreateOptions createOptions = CreateOptions.Factory.newInstance();            
            createRequest.setOptions(createOptions);
            
            createRequestDocument.setCreateRequest(createRequest);            
            CreateResponseDocument responseDoc = ps.create(createRequestDocument);
            
    		CreateResponse cresponse = responseDoc.getCreateResponse();
    		System.out.println("Status: " + cresponse.getOverallStatus());
    		System.out.println("Request ID: " + cresponse.getRequestID());
    		
    		for(CreateResult cr : cresponse.getResultsArray())
    		{
   				System.out.println("StatusCode: " + cr.getStatusCode());
  				System.out.println("ErrorCode: " + cr.getErrorCode());
  				System.out.println("StatusMessage: " + cr.getStatusMessage());    			
    		}

        }
        catch (Exception e) {
            e.printStackTrace();
        }    	    	    
    }
}

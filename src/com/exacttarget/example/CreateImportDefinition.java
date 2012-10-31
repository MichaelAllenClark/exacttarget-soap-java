package com.exacttarget.example;

import com.exacttarget.wsdl.partnerapi.*;
import com.exacttarget.wsdl.partnerapi.CreateResponseDocument.*;

public class CreateImportDefinition {
    public static void Run(PartnerAPIStub ps, 
            String iImportDefinitionName,
            String iImportDefinitionCustomerKey,
            String iTargetDataExtensionCustomerKey,
            String iImportFileName)
    
    	{

        try {
                      
            ImportDefinition id = ImportDefinition.Factory.newInstance(); 
            id.setName(iImportDefinitionName);
            id.setCustomerKey(iImportDefinitionCustomerKey);
            
            // Optional value, if AllowErrors is true then it will not stop the import when
            // a single row has an error
            id.setAllowErrors(true);

            // For this example, we are sending to a data extension
            // Value for CustomerKey will be for a data extension already created in your account
            DataExtension de = DataExtension.Factory.newInstance(); 
            de.setCustomerKey(iTargetDataExtensionCustomerKey);
            id.setDestinationObject(de);
          
            AsyncResponse ar = AsyncResponse.Factory.newInstance();
            
            ar.setResponseType(AsyncResponseType.EMAIL);
            ar.setResponseAddress("example@bh.exacttarget.com");
            id.setNotification(ar);
                        
            FileTransferLocation ftl = FileTransferLocation.Factory.newInstance();
            ftl.setCustomerKey("ExactTarget Enhanced FTP");
            id.setRetrieveFileTransferLocation(ftl);

            // Specify how the import will be handled
            // If data extension has no primary key specified then only "Overwrite" will work
            id.setUpdateType(ImportDefinitionUpdateType.ADD_AND_UPDATE);            

            id.setFieldMappingType(ImportDefinitionFieldMappingType.INFER_FROM_COLUMN_HEADINGS);            

            id.setFileSpec(iImportFileName);

            id.setFileType(FileType.CSV);
            
            CreateRequestDocument createRequestDocument = 
            		CreateRequestDocument.Factory.newInstance();
            CreateRequestDocument.CreateRequest createRequest = 
            		CreateRequestDocument.CreateRequest.Factory.newInstance();
            createRequest.setObjectsArray(new APIObject[]{id});
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

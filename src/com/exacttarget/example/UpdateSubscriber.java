package com.exacttarget.example;

import com.exacttarget.wsdl.partnerapi.*;
import com.exacttarget.wsdl.partnerapi.UpdateResponseDocument.*;
import com.exacttarget.wsdl.partnerapi.UpdateRequestDocument;

public class UpdateSubscriber {
	public static void Run(PartnerAPIStub ps, String iEmailAddress, int iListID) {

		try {

			Subscriber sub = Subscriber.Factory.newInstance();
			sub.setEmailAddress(iEmailAddress);

			SubscriberList subList = SubscriberList.Factory.newInstance();
			subList.setID(iListID);
			subList.setStatus(SubscriberStatus.ACTIVE);
			
			// If no Action is specified at the SubscriberList level, the default action is to
            // update the subscriber if they already exist and create them if they do not.
			// subList.setAction("create");

			sub.setListsArray(new SubscriberList[] { subList });


			UpdateRequestDocument updateRequestDocument = UpdateRequestDocument.Factory
					.newInstance();
			UpdateRequestDocument.UpdateRequest UpdateRequest = UpdateRequestDocument.UpdateRequest.Factory
					.newInstance();
			UpdateRequest.setObjectsArray(new APIObject[] { sub });
			UpdateOptions updateOptions = UpdateOptions.Factory.newInstance();
			UpdateRequest.setOptions(updateOptions);

			updateRequestDocument.setUpdateRequest(UpdateRequest);
			UpdateResponseDocument responseDoc = ps
					.update(updateRequestDocument);

			UpdateResponse uResults = responseDoc.getUpdateResponse();
			System.out.println("Status: " + uResults.getOverallStatus());
			System.out.println("Request ID: " + uResults.getRequestID());

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

/*
 * An XML document type.
 * Localname: ExecuteRequestMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one ExecuteRequestMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class ExecuteRequestMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument
{
    
    public ExecuteRequestMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXECUTEREQUESTMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExecuteRequestMsg");
    
    
    /**
     * Gets the "ExecuteRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument.ExecuteRequestMsg getExecuteRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument.ExecuteRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument.ExecuteRequestMsg)get_store().find_element_user(EXECUTEREQUESTMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExecuteRequestMsg" element
     */
    public void setExecuteRequestMsg(com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument.ExecuteRequestMsg executeRequestMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument.ExecuteRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument.ExecuteRequestMsg)get_store().find_element_user(EXECUTEREQUESTMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument.ExecuteRequestMsg)get_store().add_element_user(EXECUTEREQUESTMSG$0);
            }
            target.set(executeRequestMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "ExecuteRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument.ExecuteRequestMsg addNewExecuteRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument.ExecuteRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument.ExecuteRequestMsg)get_store().add_element_user(EXECUTEREQUESTMSG$0);
            return target;
        }
    }
    /**
     * An XML ExecuteRequestMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ExecuteRequestMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ExecuteRequestMsgDocument.ExecuteRequestMsg
    {
        
        public ExecuteRequestMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Requests");
        
        
        /**
         * Gets array of all "Requests" elements
         */
        public com.exacttarget.wsdl.partnerapi.ExecuteRequest[] getRequestsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REQUESTS$0, targetList);
                com.exacttarget.wsdl.partnerapi.ExecuteRequest[] result = new com.exacttarget.wsdl.partnerapi.ExecuteRequest[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Requests" element
         */
        public com.exacttarget.wsdl.partnerapi.ExecuteRequest getRequestsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExecuteRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExecuteRequest)get_store().find_element_user(REQUESTS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Requests" element
         */
        public int sizeOfRequestsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTS$0);
            }
        }
        
        /**
         * Sets array of all "Requests" element
         */
        public void setRequestsArray(com.exacttarget.wsdl.partnerapi.ExecuteRequest[] requestsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(requestsArray, REQUESTS$0);
            }
        }
        
        /**
         * Sets ith "Requests" element
         */
        public void setRequestsArray(int i, com.exacttarget.wsdl.partnerapi.ExecuteRequest requests)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExecuteRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExecuteRequest)get_store().find_element_user(REQUESTS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(requests);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Requests" element
         */
        public com.exacttarget.wsdl.partnerapi.ExecuteRequest insertNewRequests(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExecuteRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExecuteRequest)get_store().insert_element_user(REQUESTS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Requests" element
         */
        public com.exacttarget.wsdl.partnerapi.ExecuteRequest addNewRequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExecuteRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExecuteRequest)get_store().add_element_user(REQUESTS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Requests" element
         */
        public void removeRequests(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTS$0, i);
            }
        }
    }
}

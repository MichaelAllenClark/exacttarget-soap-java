/*
 * An XML document type.
 * Localname: ExtractRequestMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one ExtractRequestMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class ExtractRequestMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument
{
    
    public ExtractRequestMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRACTREQUESTMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExtractRequestMsg");
    
    
    /**
     * Gets the "ExtractRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument.ExtractRequestMsg getExtractRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument.ExtractRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument.ExtractRequestMsg)get_store().find_element_user(EXTRACTREQUESTMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExtractRequestMsg" element
     */
    public void setExtractRequestMsg(com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument.ExtractRequestMsg extractRequestMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument.ExtractRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument.ExtractRequestMsg)get_store().find_element_user(EXTRACTREQUESTMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument.ExtractRequestMsg)get_store().add_element_user(EXTRACTREQUESTMSG$0);
            }
            target.set(extractRequestMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "ExtractRequestMsg" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument.ExtractRequestMsg addNewExtractRequestMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument.ExtractRequestMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument.ExtractRequestMsg)get_store().add_element_user(EXTRACTREQUESTMSG$0);
            return target;
        }
    }
    /**
     * An XML ExtractRequestMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ExtractRequestMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ExtractRequestMsgDocument.ExtractRequestMsg
    {
        
        public ExtractRequestMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Requests");
        
        
        /**
         * Gets array of all "Requests" elements
         */
        public com.exacttarget.wsdl.partnerapi.ExtractRequest[] getRequestsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REQUESTS$0, targetList);
                com.exacttarget.wsdl.partnerapi.ExtractRequest[] result = new com.exacttarget.wsdl.partnerapi.ExtractRequest[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Requests" element
         */
        public com.exacttarget.wsdl.partnerapi.ExtractRequest getRequestsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractRequest)get_store().find_element_user(REQUESTS$0, i);
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
        public void setRequestsArray(com.exacttarget.wsdl.partnerapi.ExtractRequest[] requestsArray)
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
        public void setRequestsArray(int i, com.exacttarget.wsdl.partnerapi.ExtractRequest requests)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractRequest)get_store().find_element_user(REQUESTS$0, i);
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
        public com.exacttarget.wsdl.partnerapi.ExtractRequest insertNewRequests(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractRequest)get_store().insert_element_user(REQUESTS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Requests" element
         */
        public com.exacttarget.wsdl.partnerapi.ExtractRequest addNewRequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractRequest target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractRequest)get_store().add_element_user(REQUESTS$0);
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

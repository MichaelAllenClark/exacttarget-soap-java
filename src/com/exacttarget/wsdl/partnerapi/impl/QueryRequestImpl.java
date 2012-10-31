/*
 * XML Type:  QueryRequest
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.QueryRequest
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML QueryRequest(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class QueryRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.QueryRequest
{
    
    public QueryRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTIDS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ClientIDs");
    private static final javax.xml.namespace.QName QUERY$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Query");
    private static final javax.xml.namespace.QName RESPONDTO$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RespondTo");
    private static final javax.xml.namespace.QName PARTNERPROPERTIES$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerProperties");
    private static final javax.xml.namespace.QName CONTINUEREQUEST$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ContinueRequest");
    private static final javax.xml.namespace.QName QUERYALLACCOUNTS$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "QueryAllAccounts");
    private static final javax.xml.namespace.QName RETRIEVEALLSINCELASTBATCH$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RetrieveAllSinceLastBatch");
    
    
    /**
     * Gets array of all "ClientIDs" elements
     */
    public com.exacttarget.wsdl.partnerapi.ClientID[] getClientIDsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLIENTIDS$0, targetList);
            com.exacttarget.wsdl.partnerapi.ClientID[] result = new com.exacttarget.wsdl.partnerapi.ClientID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ClientIDs" element
     */
    public com.exacttarget.wsdl.partnerapi.ClientID getClientIDsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().find_element_user(CLIENTIDS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ClientIDs" element
     */
    public int sizeOfClientIDsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTIDS$0);
        }
    }
    
    /**
     * Sets array of all "ClientIDs" element
     */
    public void setClientIDsArray(com.exacttarget.wsdl.partnerapi.ClientID[] clientIDsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clientIDsArray, CLIENTIDS$0);
        }
    }
    
    /**
     * Sets ith "ClientIDs" element
     */
    public void setClientIDsArray(int i, com.exacttarget.wsdl.partnerapi.ClientID clientIDs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().find_element_user(CLIENTIDS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(clientIDs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClientIDs" element
     */
    public com.exacttarget.wsdl.partnerapi.ClientID insertNewClientIDs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().insert_element_user(CLIENTIDS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ClientIDs" element
     */
    public com.exacttarget.wsdl.partnerapi.ClientID addNewClientIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().add_element_user(CLIENTIDS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ClientIDs" element
     */
    public void removeClientIDs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTIDS$0, i);
        }
    }
    
    /**
     * Gets the "Query" element
     */
    public com.exacttarget.wsdl.partnerapi.Query getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Query target = null;
            target = (com.exacttarget.wsdl.partnerapi.Query)get_store().find_element_user(QUERY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Query" element
     */
    public void setQuery(com.exacttarget.wsdl.partnerapi.Query query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Query target = null;
            target = (com.exacttarget.wsdl.partnerapi.Query)get_store().find_element_user(QUERY$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Query)get_store().add_element_user(QUERY$2);
            }
            target.set(query);
        }
    }
    
    /**
     * Appends and returns a new empty "Query" element
     */
    public com.exacttarget.wsdl.partnerapi.Query addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Query target = null;
            target = (com.exacttarget.wsdl.partnerapi.Query)get_store().add_element_user(QUERY$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "RespondTo" elements
     */
    public com.exacttarget.wsdl.partnerapi.AsyncResponse[] getRespondToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESPONDTO$4, targetList);
            com.exacttarget.wsdl.partnerapi.AsyncResponse[] result = new com.exacttarget.wsdl.partnerapi.AsyncResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RespondTo" element
     */
    public com.exacttarget.wsdl.partnerapi.AsyncResponse getRespondToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponse)get_store().find_element_user(RESPONDTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RespondTo" element
     */
    public int sizeOfRespondToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONDTO$4);
        }
    }
    
    /**
     * Sets array of all "RespondTo" element
     */
    public void setRespondToArray(com.exacttarget.wsdl.partnerapi.AsyncResponse[] respondToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(respondToArray, RESPONDTO$4);
        }
    }
    
    /**
     * Sets ith "RespondTo" element
     */
    public void setRespondToArray(int i, com.exacttarget.wsdl.partnerapi.AsyncResponse respondTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponse)get_store().find_element_user(RESPONDTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(respondTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RespondTo" element
     */
    public com.exacttarget.wsdl.partnerapi.AsyncResponse insertNewRespondTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponse)get_store().insert_element_user(RESPONDTO$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RespondTo" element
     */
    public com.exacttarget.wsdl.partnerapi.AsyncResponse addNewRespondTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponse)get_store().add_element_user(RESPONDTO$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "RespondTo" element
     */
    public void removeRespondTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONDTO$4, i);
        }
    }
    
    /**
     * Gets array of all "PartnerProperties" elements
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty[] getPartnerPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTNERPROPERTIES$6, targetList);
            com.exacttarget.wsdl.partnerapi.APIProperty[] result = new com.exacttarget.wsdl.partnerapi.APIProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PartnerProperties" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty getPartnerPropertiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(PARTNERPROPERTIES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PartnerProperties" element
     */
    public int sizeOfPartnerPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERPROPERTIES$6);
        }
    }
    
    /**
     * Sets array of all "PartnerProperties" element
     */
    public void setPartnerPropertiesArray(com.exacttarget.wsdl.partnerapi.APIProperty[] partnerPropertiesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(partnerPropertiesArray, PARTNERPROPERTIES$6);
        }
    }
    
    /**
     * Sets ith "PartnerProperties" element
     */
    public void setPartnerPropertiesArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty partnerProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(PARTNERPROPERTIES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(partnerProperties);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PartnerProperties" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty insertNewPartnerProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().insert_element_user(PARTNERPROPERTIES$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PartnerProperties" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty addNewPartnerProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().add_element_user(PARTNERPROPERTIES$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "PartnerProperties" element
     */
    public void removePartnerProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERPROPERTIES$6, i);
        }
    }
    
    /**
     * Gets the "ContinueRequest" element
     */
    public java.lang.String getContinueRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTINUEREQUEST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContinueRequest" element
     */
    public org.apache.xmlbeans.XmlString xgetContinueRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTINUEREQUEST$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContinueRequest" element
     */
    public boolean isSetContinueRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTINUEREQUEST$8) != 0;
        }
    }
    
    /**
     * Sets the "ContinueRequest" element
     */
    public void setContinueRequest(java.lang.String continueRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTINUEREQUEST$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTINUEREQUEST$8);
            }
            target.setStringValue(continueRequest);
        }
    }
    
    /**
     * Sets (as xml) the "ContinueRequest" element
     */
    public void xsetContinueRequest(org.apache.xmlbeans.XmlString continueRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTINUEREQUEST$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTINUEREQUEST$8);
            }
            target.set(continueRequest);
        }
    }
    
    /**
     * Unsets the "ContinueRequest" element
     */
    public void unsetContinueRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTINUEREQUEST$8, 0);
        }
    }
    
    /**
     * Gets the "QueryAllAccounts" element
     */
    public boolean getQueryAllAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYALLACCOUNTS$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "QueryAllAccounts" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetQueryAllAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(QUERYALLACCOUNTS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "QueryAllAccounts" element
     */
    public boolean isSetQueryAllAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYALLACCOUNTS$10) != 0;
        }
    }
    
    /**
     * Sets the "QueryAllAccounts" element
     */
    public void setQueryAllAccounts(boolean queryAllAccounts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYALLACCOUNTS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYALLACCOUNTS$10);
            }
            target.setBooleanValue(queryAllAccounts);
        }
    }
    
    /**
     * Sets (as xml) the "QueryAllAccounts" element
     */
    public void xsetQueryAllAccounts(org.apache.xmlbeans.XmlBoolean queryAllAccounts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(QUERYALLACCOUNTS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(QUERYALLACCOUNTS$10);
            }
            target.set(queryAllAccounts);
        }
    }
    
    /**
     * Unsets the "QueryAllAccounts" element
     */
    public void unsetQueryAllAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYALLACCOUNTS$10, 0);
        }
    }
    
    /**
     * Gets the "RetrieveAllSinceLastBatch" element
     */
    public boolean getRetrieveAllSinceLastBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRIEVEALLSINCELASTBATCH$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "RetrieveAllSinceLastBatch" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRetrieveAllSinceLastBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RETRIEVEALLSINCELASTBATCH$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "RetrieveAllSinceLastBatch" element
     */
    public boolean isSetRetrieveAllSinceLastBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETRIEVEALLSINCELASTBATCH$12) != 0;
        }
    }
    
    /**
     * Sets the "RetrieveAllSinceLastBatch" element
     */
    public void setRetrieveAllSinceLastBatch(boolean retrieveAllSinceLastBatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRIEVEALLSINCELASTBATCH$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETRIEVEALLSINCELASTBATCH$12);
            }
            target.setBooleanValue(retrieveAllSinceLastBatch);
        }
    }
    
    /**
     * Sets (as xml) the "RetrieveAllSinceLastBatch" element
     */
    public void xsetRetrieveAllSinceLastBatch(org.apache.xmlbeans.XmlBoolean retrieveAllSinceLastBatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RETRIEVEALLSINCELASTBATCH$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RETRIEVEALLSINCELASTBATCH$12);
            }
            target.set(retrieveAllSinceLastBatch);
        }
    }
    
    /**
     * Unsets the "RetrieveAllSinceLastBatch" element
     */
    public void unsetRetrieveAllSinceLastBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETRIEVEALLSINCELASTBATCH$12, 0);
        }
    }
}

/*
 * An XML document type.
 * Localname: CreateRequest
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.CreateRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one CreateRequest(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class CreateRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.CreateRequestDocument
{
    
    public CreateRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEREQUEST$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CreateRequest");
    
    
    /**
     * Gets the "CreateRequest" element
     */
    public com.exacttarget.wsdl.partnerapi.CreateRequestDocument.CreateRequest getCreateRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CreateRequestDocument.CreateRequest target = null;
            target = (com.exacttarget.wsdl.partnerapi.CreateRequestDocument.CreateRequest)get_store().find_element_user(CREATEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateRequest" element
     */
    public void setCreateRequest(com.exacttarget.wsdl.partnerapi.CreateRequestDocument.CreateRequest createRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CreateRequestDocument.CreateRequest target = null;
            target = (com.exacttarget.wsdl.partnerapi.CreateRequestDocument.CreateRequest)get_store().find_element_user(CREATEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.CreateRequestDocument.CreateRequest)get_store().add_element_user(CREATEREQUEST$0);
            }
            target.set(createRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateRequest" element
     */
    public com.exacttarget.wsdl.partnerapi.CreateRequestDocument.CreateRequest addNewCreateRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CreateRequestDocument.CreateRequest target = null;
            target = (com.exacttarget.wsdl.partnerapi.CreateRequestDocument.CreateRequest)get_store().add_element_user(CREATEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateRequest(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class CreateRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.CreateRequestDocument.CreateRequest
    {
        
        public CreateRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OPTIONS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Options");
        private static final javax.xml.namespace.QName OBJECTS$2 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Objects");
        
        
        /**
         * Gets the "Options" element
         */
        public com.exacttarget.wsdl.partnerapi.CreateOptions getOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.CreateOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.CreateOptions)get_store().find_element_user(OPTIONS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Options" element
         */
        public void setOptions(com.exacttarget.wsdl.partnerapi.CreateOptions options)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.CreateOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.CreateOptions)get_store().find_element_user(OPTIONS$0, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.CreateOptions)get_store().add_element_user(OPTIONS$0);
                }
                target.set(options);
            }
        }
        
        /**
         * Appends and returns a new empty "Options" element
         */
        public com.exacttarget.wsdl.partnerapi.CreateOptions addNewOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.CreateOptions target = null;
                target = (com.exacttarget.wsdl.partnerapi.CreateOptions)get_store().add_element_user(OPTIONS$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "Objects" elements
         */
        public com.exacttarget.wsdl.partnerapi.APIObject[] getObjectsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OBJECTS$2, targetList);
                com.exacttarget.wsdl.partnerapi.APIObject[] result = new com.exacttarget.wsdl.partnerapi.APIObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Objects" element
         */
        public com.exacttarget.wsdl.partnerapi.APIObject getObjectsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIObject target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(OBJECTS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Objects" element
         */
        public int sizeOfObjectsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJECTS$2);
            }
        }
        
        /**
         * Sets array of all "Objects" element
         */
        public void setObjectsArray(com.exacttarget.wsdl.partnerapi.APIObject[] objectsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(objectsArray, OBJECTS$2);
            }
        }
        
        /**
         * Sets ith "Objects" element
         */
        public void setObjectsArray(int i, com.exacttarget.wsdl.partnerapi.APIObject objects)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIObject target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(OBJECTS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(objects);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Objects" element
         */
        public com.exacttarget.wsdl.partnerapi.APIObject insertNewObjects(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIObject target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().insert_element_user(OBJECTS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Objects" element
         */
        public com.exacttarget.wsdl.partnerapi.APIObject addNewObjects()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIObject target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(OBJECTS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Objects" element
         */
        public void removeObjects(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJECTS$2, i);
            }
        }
    }
}

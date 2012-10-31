/*
 * An XML document type.
 * Localname: DeliveryProfile
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DeliveryProfileDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one DeliveryProfile(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class DeliveryProfileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DeliveryProfileDocument
{
    
    public DeliveryProfileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIVERYPROFILE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DeliveryProfile");
    
    
    /**
     * Gets the "DeliveryProfile" element
     */
    public com.exacttarget.wsdl.partnerapi.DeliveryProfile getDeliveryProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeliveryProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfile)get_store().find_element_user(DELIVERYPROFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeliveryProfile" element
     */
    public void setDeliveryProfile(com.exacttarget.wsdl.partnerapi.DeliveryProfile deliveryProfile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeliveryProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfile)get_store().find_element_user(DELIVERYPROFILE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DeliveryProfile)get_store().add_element_user(DELIVERYPROFILE$0);
            }
            target.set(deliveryProfile);
        }
    }
    
    /**
     * Appends and returns a new empty "DeliveryProfile" element
     */
    public com.exacttarget.wsdl.partnerapi.DeliveryProfile addNewDeliveryProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeliveryProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfile)get_store().add_element_user(DELIVERYPROFILE$0);
            return target;
        }
    }
}

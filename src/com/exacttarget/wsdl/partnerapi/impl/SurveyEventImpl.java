/*
 * XML Type:  SurveyEvent
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SurveyEvent
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SurveyEvent(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SurveyEventImpl extends com.exacttarget.wsdl.partnerapi.impl.TrackingEventImpl implements com.exacttarget.wsdl.partnerapi.SurveyEvent
{
    
    public SurveyEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUESTION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Question");
    private static final javax.xml.namespace.QName ANSWER$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Answer");
    
    
    /**
     * Gets the "Question" element
     */
    public java.lang.String getQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Question" element
     */
    public org.apache.xmlbeans.XmlString xgetQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Question" element
     */
    public boolean isSetQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUESTION$0) != 0;
        }
    }
    
    /**
     * Sets the "Question" element
     */
    public void setQuestion(java.lang.String question)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUESTION$0);
            }
            target.setStringValue(question);
        }
    }
    
    /**
     * Sets (as xml) the "Question" element
     */
    public void xsetQuestion(org.apache.xmlbeans.XmlString question)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUESTION$0);
            }
            target.set(question);
        }
    }
    
    /**
     * Unsets the "Question" element
     */
    public void unsetQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUESTION$0, 0);
        }
    }
    
    /**
     * Gets the "Answer" element
     */
    public java.lang.String getAnswer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANSWER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Answer" element
     */
    public org.apache.xmlbeans.XmlString xgetAnswer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANSWER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Answer" element
     */
    public boolean isSetAnswer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANSWER$2) != 0;
        }
    }
    
    /**
     * Sets the "Answer" element
     */
    public void setAnswer(java.lang.String answer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANSWER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANSWER$2);
            }
            target.setStringValue(answer);
        }
    }
    
    /**
     * Sets (as xml) the "Answer" element
     */
    public void xsetAnswer(org.apache.xmlbeans.XmlString answer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANSWER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANSWER$2);
            }
            target.set(answer);
        }
    }
    
    /**
     * Unsets the "Answer" element
     */
    public void unsetAnswer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANSWER$2, 0);
        }
    }
}

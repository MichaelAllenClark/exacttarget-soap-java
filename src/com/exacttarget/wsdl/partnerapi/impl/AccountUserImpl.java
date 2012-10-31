/*
 * XML Type:  AccountUser
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AccountUser
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML AccountUser(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class AccountUserImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.AccountUser
{
    
    public AccountUserImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTUSERID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AccountUserID");
    private static final javax.xml.namespace.QName USERID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UserID");
    private static final javax.xml.namespace.QName PASSWORD$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Password");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName EMAIL$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Email");
    private static final javax.xml.namespace.QName MUSTCHANGEPASSWORD$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MustChangePassword");
    private static final javax.xml.namespace.QName ACTIVEFLAG$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ActiveFlag");
    private static final javax.xml.namespace.QName CHALLENGEPHRASE$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ChallengePhrase");
    private static final javax.xml.namespace.QName CHALLENGEANSWER$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ChallengeAnswer");
    private static final javax.xml.namespace.QName USERPERMISSIONS$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UserPermissions");
    private static final javax.xml.namespace.QName DELETE$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Delete");
    private static final javax.xml.namespace.QName LASTSUCCESSFULLOGIN$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LastSuccessfulLogin");
    private static final javax.xml.namespace.QName ISAPIUSER$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsAPIUser");
    private static final javax.xml.namespace.QName NOTIFICATIONEMAILADDRESS$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationEmailAddress");
    private static final javax.xml.namespace.QName ISLOCKED$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsLocked");
    private static final javax.xml.namespace.QName UNLOCK$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Unlock");
    private static final javax.xml.namespace.QName BUSINESSUNIT$32 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BusinessUnit");
    private static final javax.xml.namespace.QName DEFAULTBUSINESSUNIT$34 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DefaultBusinessUnit");
    private static final javax.xml.namespace.QName LOCALE$36 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Locale");
    private static final javax.xml.namespace.QName TIMEZONE$38 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TimeZone");
    private static final javax.xml.namespace.QName DEFAULTBUSINESSUNITOBJECT$40 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DefaultBusinessUnitObject");
    private static final javax.xml.namespace.QName ASSOCIATEDBUSINESSUNITS$42 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AssociatedBusinessUnits");
    private static final javax.xml.namespace.QName ROLES$44 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Roles");
    private static final javax.xml.namespace.QName LANGUAGELOCALE$46 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LanguageLocale");
    private static final javax.xml.namespace.QName SSOIDENTITIES$48 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SsoIdentities");
    
    
    /**
     * Gets the "AccountUserID" element
     */
    public int getAccountUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTUSERID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccountUserID" element
     */
    public org.apache.xmlbeans.XmlInt xgetAccountUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACCOUNTUSERID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AccountUserID" element
     */
    public boolean isNilAccountUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACCOUNTUSERID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AccountUserID" element
     */
    public boolean isSetAccountUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTUSERID$0) != 0;
        }
    }
    
    /**
     * Sets the "AccountUserID" element
     */
    public void setAccountUserID(int accountUserID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTUSERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTUSERID$0);
            }
            target.setIntValue(accountUserID);
        }
    }
    
    /**
     * Sets (as xml) the "AccountUserID" element
     */
    public void xsetAccountUserID(org.apache.xmlbeans.XmlInt accountUserID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACCOUNTUSERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACCOUNTUSERID$0);
            }
            target.set(accountUserID);
        }
    }
    
    /**
     * Nils the "AccountUserID" element
     */
    public void setNilAccountUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACCOUNTUSERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACCOUNTUSERID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AccountUserID" element
     */
    public void unsetAccountUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTUSERID$0, 0);
        }
    }
    
    /**
     * Gets the "UserID" element
     */
    public java.lang.String getUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserID" element
     */
    public org.apache.xmlbeans.XmlString xgetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UserID" element
     */
    public void setUserID(java.lang.String userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$2);
            }
            target.setStringValue(userID);
        }
    }
    
    /**
     * Sets (as xml) the "UserID" element
     */
    public void xsetUserID(org.apache.xmlbeans.XmlString userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$2);
            }
            target.set(userID);
        }
    }
    
    /**
     * Gets the "Password" element
     */
    public java.lang.String getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Password" element
     */
    public org.apache.xmlbeans.XmlString xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Password" element
     */
    public boolean isSetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PASSWORD$4) != 0;
        }
    }
    
    /**
     * Sets the "Password" element
     */
    public void setPassword(java.lang.String password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$4);
            }
            target.setStringValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "Password" element
     */
    public void xsetPassword(org.apache.xmlbeans.XmlString password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$4);
            }
            target.set(password);
        }
    }
    
    /**
     * Unsets the "Password" element
     */
    public void unsetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PASSWORD$4, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "Email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Email" element
     */
    public org.apache.xmlbeans.XmlString xgetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Email" element
     */
    public void setEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$8);
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) the "Email" element
     */
    public void xsetEmail(org.apache.xmlbeans.XmlString email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$8);
            }
            target.set(email);
        }
    }
    
    /**
     * Gets the "MustChangePassword" element
     */
    public boolean getMustChangePassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUSTCHANGEPASSWORD$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "MustChangePassword" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMustChangePassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MUSTCHANGEPASSWORD$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "MustChangePassword" element
     */
    public boolean isSetMustChangePassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MUSTCHANGEPASSWORD$10) != 0;
        }
    }
    
    /**
     * Sets the "MustChangePassword" element
     */
    public void setMustChangePassword(boolean mustChangePassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUSTCHANGEPASSWORD$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MUSTCHANGEPASSWORD$10);
            }
            target.setBooleanValue(mustChangePassword);
        }
    }
    
    /**
     * Sets (as xml) the "MustChangePassword" element
     */
    public void xsetMustChangePassword(org.apache.xmlbeans.XmlBoolean mustChangePassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MUSTCHANGEPASSWORD$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MUSTCHANGEPASSWORD$10);
            }
            target.set(mustChangePassword);
        }
    }
    
    /**
     * Unsets the "MustChangePassword" element
     */
    public void unsetMustChangePassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MUSTCHANGEPASSWORD$10, 0);
        }
    }
    
    /**
     * Gets the "ActiveFlag" element
     */
    public boolean getActiveFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVEFLAG$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActiveFlag" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetActiveFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVEFLAG$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ActiveFlag" element
     */
    public boolean isSetActiveFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVEFLAG$12) != 0;
        }
    }
    
    /**
     * Sets the "ActiveFlag" element
     */
    public void setActiveFlag(boolean activeFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVEFLAG$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVEFLAG$12);
            }
            target.setBooleanValue(activeFlag);
        }
    }
    
    /**
     * Sets (as xml) the "ActiveFlag" element
     */
    public void xsetActiveFlag(org.apache.xmlbeans.XmlBoolean activeFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVEFLAG$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ACTIVEFLAG$12);
            }
            target.set(activeFlag);
        }
    }
    
    /**
     * Unsets the "ActiveFlag" element
     */
    public void unsetActiveFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVEFLAG$12, 0);
        }
    }
    
    /**
     * Gets the "ChallengePhrase" element
     */
    public java.lang.String getChallengePhrase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHALLENGEPHRASE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChallengePhrase" element
     */
    public org.apache.xmlbeans.XmlString xgetChallengePhrase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHALLENGEPHRASE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "ChallengePhrase" element
     */
    public boolean isSetChallengePhrase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHALLENGEPHRASE$14) != 0;
        }
    }
    
    /**
     * Sets the "ChallengePhrase" element
     */
    public void setChallengePhrase(java.lang.String challengePhrase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHALLENGEPHRASE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHALLENGEPHRASE$14);
            }
            target.setStringValue(challengePhrase);
        }
    }
    
    /**
     * Sets (as xml) the "ChallengePhrase" element
     */
    public void xsetChallengePhrase(org.apache.xmlbeans.XmlString challengePhrase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHALLENGEPHRASE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHALLENGEPHRASE$14);
            }
            target.set(challengePhrase);
        }
    }
    
    /**
     * Unsets the "ChallengePhrase" element
     */
    public void unsetChallengePhrase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHALLENGEPHRASE$14, 0);
        }
    }
    
    /**
     * Gets the "ChallengeAnswer" element
     */
    public java.lang.String getChallengeAnswer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHALLENGEANSWER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChallengeAnswer" element
     */
    public org.apache.xmlbeans.XmlString xgetChallengeAnswer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHALLENGEANSWER$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ChallengeAnswer" element
     */
    public boolean isSetChallengeAnswer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHALLENGEANSWER$16) != 0;
        }
    }
    
    /**
     * Sets the "ChallengeAnswer" element
     */
    public void setChallengeAnswer(java.lang.String challengeAnswer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHALLENGEANSWER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHALLENGEANSWER$16);
            }
            target.setStringValue(challengeAnswer);
        }
    }
    
    /**
     * Sets (as xml) the "ChallengeAnswer" element
     */
    public void xsetChallengeAnswer(org.apache.xmlbeans.XmlString challengeAnswer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHALLENGEANSWER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHALLENGEANSWER$16);
            }
            target.set(challengeAnswer);
        }
    }
    
    /**
     * Unsets the "ChallengeAnswer" element
     */
    public void unsetChallengeAnswer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHALLENGEANSWER$16, 0);
        }
    }
    
    /**
     * Gets array of all "UserPermissions" elements
     */
    public com.exacttarget.wsdl.partnerapi.UserAccess[] getUserPermissionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USERPERMISSIONS$18, targetList);
            com.exacttarget.wsdl.partnerapi.UserAccess[] result = new com.exacttarget.wsdl.partnerapi.UserAccess[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "UserPermissions" element
     */
    public com.exacttarget.wsdl.partnerapi.UserAccess getUserPermissionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UserAccess target = null;
            target = (com.exacttarget.wsdl.partnerapi.UserAccess)get_store().find_element_user(USERPERMISSIONS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "UserPermissions" element
     */
    public boolean isNilUserPermissionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UserAccess target = null;
            target = (com.exacttarget.wsdl.partnerapi.UserAccess)get_store().find_element_user(USERPERMISSIONS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "UserPermissions" element
     */
    public int sizeOfUserPermissionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERPERMISSIONS$18);
        }
    }
    
    /**
     * Sets array of all "UserPermissions" element
     */
    public void setUserPermissionsArray(com.exacttarget.wsdl.partnerapi.UserAccess[] userPermissionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(userPermissionsArray, USERPERMISSIONS$18);
        }
    }
    
    /**
     * Sets ith "UserPermissions" element
     */
    public void setUserPermissionsArray(int i, com.exacttarget.wsdl.partnerapi.UserAccess userPermissions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UserAccess target = null;
            target = (com.exacttarget.wsdl.partnerapi.UserAccess)get_store().find_element_user(USERPERMISSIONS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(userPermissions);
        }
    }
    
    /**
     * Nils the ith "UserPermissions" element
     */
    public void setNilUserPermissionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UserAccess target = null;
            target = (com.exacttarget.wsdl.partnerapi.UserAccess)get_store().find_element_user(USERPERMISSIONS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UserPermissions" element
     */
    public com.exacttarget.wsdl.partnerapi.UserAccess insertNewUserPermissions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UserAccess target = null;
            target = (com.exacttarget.wsdl.partnerapi.UserAccess)get_store().insert_element_user(USERPERMISSIONS$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UserPermissions" element
     */
    public com.exacttarget.wsdl.partnerapi.UserAccess addNewUserPermissions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UserAccess target = null;
            target = (com.exacttarget.wsdl.partnerapi.UserAccess)get_store().add_element_user(USERPERMISSIONS$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "UserPermissions" element
     */
    public void removeUserPermissions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERPERMISSIONS$18, i);
        }
    }
    
    /**
     * Gets the "Delete" element
     */
    public int getDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETE$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Delete" element
     */
    public org.apache.xmlbeans.XmlInt xgetDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DELETE$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Delete" element
     */
    public void setDelete(int delete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETE$20);
            }
            target.setIntValue(delete);
        }
    }
    
    /**
     * Sets (as xml) the "Delete" element
     */
    public void xsetDelete(org.apache.xmlbeans.XmlInt delete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DELETE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DELETE$20);
            }
            target.set(delete);
        }
    }
    
    /**
     * Gets the "LastSuccessfulLogin" element
     */
    public java.util.Calendar getLastSuccessfulLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTSUCCESSFULLOGIN$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastSuccessfulLogin" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLastSuccessfulLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTSUCCESSFULLOGIN$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "LastSuccessfulLogin" element
     */
    public boolean isSetLastSuccessfulLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTSUCCESSFULLOGIN$22) != 0;
        }
    }
    
    /**
     * Sets the "LastSuccessfulLogin" element
     */
    public void setLastSuccessfulLogin(java.util.Calendar lastSuccessfulLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTSUCCESSFULLOGIN$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTSUCCESSFULLOGIN$22);
            }
            target.setCalendarValue(lastSuccessfulLogin);
        }
    }
    
    /**
     * Sets (as xml) the "LastSuccessfulLogin" element
     */
    public void xsetLastSuccessfulLogin(org.apache.xmlbeans.XmlDateTime lastSuccessfulLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTSUCCESSFULLOGIN$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTSUCCESSFULLOGIN$22);
            }
            target.set(lastSuccessfulLogin);
        }
    }
    
    /**
     * Unsets the "LastSuccessfulLogin" element
     */
    public void unsetLastSuccessfulLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTSUCCESSFULLOGIN$22, 0);
        }
    }
    
    /**
     * Gets the "IsAPIUser" element
     */
    public boolean getIsAPIUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISAPIUSER$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsAPIUser" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsAPIUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISAPIUSER$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsAPIUser" element
     */
    public boolean isSetIsAPIUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISAPIUSER$24) != 0;
        }
    }
    
    /**
     * Sets the "IsAPIUser" element
     */
    public void setIsAPIUser(boolean isAPIUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISAPIUSER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISAPIUSER$24);
            }
            target.setBooleanValue(isAPIUser);
        }
    }
    
    /**
     * Sets (as xml) the "IsAPIUser" element
     */
    public void xsetIsAPIUser(org.apache.xmlbeans.XmlBoolean isAPIUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISAPIUSER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISAPIUSER$24);
            }
            target.set(isAPIUser);
        }
    }
    
    /**
     * Unsets the "IsAPIUser" element
     */
    public void unsetIsAPIUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISAPIUSER$24, 0);
        }
    }
    
    /**
     * Gets the "NotificationEmailAddress" element
     */
    public java.lang.String getNotificationEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONEMAILADDRESS$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NotificationEmailAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetNotificationEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONEMAILADDRESS$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "NotificationEmailAddress" element
     */
    public boolean isSetNotificationEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONEMAILADDRESS$26) != 0;
        }
    }
    
    /**
     * Sets the "NotificationEmailAddress" element
     */
    public void setNotificationEmailAddress(java.lang.String notificationEmailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONEMAILADDRESS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTIFICATIONEMAILADDRESS$26);
            }
            target.setStringValue(notificationEmailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "NotificationEmailAddress" element
     */
    public void xsetNotificationEmailAddress(org.apache.xmlbeans.XmlString notificationEmailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTIFICATIONEMAILADDRESS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTIFICATIONEMAILADDRESS$26);
            }
            target.set(notificationEmailAddress);
        }
    }
    
    /**
     * Unsets the "NotificationEmailAddress" element
     */
    public void unsetNotificationEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONEMAILADDRESS$26, 0);
        }
    }
    
    /**
     * Gets the "IsLocked" element
     */
    public boolean getIsLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISLOCKED$28, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsLocked" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOCKED$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsLocked" element
     */
    public boolean isSetIsLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISLOCKED$28) != 0;
        }
    }
    
    /**
     * Sets the "IsLocked" element
     */
    public void setIsLocked(boolean isLocked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISLOCKED$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISLOCKED$28);
            }
            target.setBooleanValue(isLocked);
        }
    }
    
    /**
     * Sets (as xml) the "IsLocked" element
     */
    public void xsetIsLocked(org.apache.xmlbeans.XmlBoolean isLocked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOCKED$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISLOCKED$28);
            }
            target.set(isLocked);
        }
    }
    
    /**
     * Unsets the "IsLocked" element
     */
    public void unsetIsLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISLOCKED$28, 0);
        }
    }
    
    /**
     * Gets the "Unlock" element
     */
    public boolean getUnlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNLOCK$30, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Unlock" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetUnlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UNLOCK$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "Unlock" element
     */
    public boolean isSetUnlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNLOCK$30) != 0;
        }
    }
    
    /**
     * Sets the "Unlock" element
     */
    public void setUnlock(boolean unlock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNLOCK$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNLOCK$30);
            }
            target.setBooleanValue(unlock);
        }
    }
    
    /**
     * Sets (as xml) the "Unlock" element
     */
    public void xsetUnlock(org.apache.xmlbeans.XmlBoolean unlock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UNLOCK$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(UNLOCK$30);
            }
            target.set(unlock);
        }
    }
    
    /**
     * Unsets the "Unlock" element
     */
    public void unsetUnlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNLOCK$30, 0);
        }
    }
    
    /**
     * Gets the "BusinessUnit" element
     */
    public int getBusinessUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNIT$32, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessUnit" element
     */
    public org.apache.xmlbeans.XmlInt xgetBusinessUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BUSINESSUNIT$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "BusinessUnit" element
     */
    public boolean isSetBusinessUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSUNIT$32) != 0;
        }
    }
    
    /**
     * Sets the "BusinessUnit" element
     */
    public void setBusinessUnit(int businessUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNIT$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSUNIT$32);
            }
            target.setIntValue(businessUnit);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessUnit" element
     */
    public void xsetBusinessUnit(org.apache.xmlbeans.XmlInt businessUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BUSINESSUNIT$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BUSINESSUNIT$32);
            }
            target.set(businessUnit);
        }
    }
    
    /**
     * Unsets the "BusinessUnit" element
     */
    public void unsetBusinessUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSUNIT$32, 0);
        }
    }
    
    /**
     * Gets the "DefaultBusinessUnit" element
     */
    public int getDefaultBusinessUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTBUSINESSUNIT$34, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DefaultBusinessUnit" element
     */
    public org.apache.xmlbeans.XmlInt xgetDefaultBusinessUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEFAULTBUSINESSUNIT$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "DefaultBusinessUnit" element
     */
    public boolean isSetDefaultBusinessUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTBUSINESSUNIT$34) != 0;
        }
    }
    
    /**
     * Sets the "DefaultBusinessUnit" element
     */
    public void setDefaultBusinessUnit(int defaultBusinessUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTBUSINESSUNIT$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTBUSINESSUNIT$34);
            }
            target.setIntValue(defaultBusinessUnit);
        }
    }
    
    /**
     * Sets (as xml) the "DefaultBusinessUnit" element
     */
    public void xsetDefaultBusinessUnit(org.apache.xmlbeans.XmlInt defaultBusinessUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEFAULTBUSINESSUNIT$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEFAULTBUSINESSUNIT$34);
            }
            target.set(defaultBusinessUnit);
        }
    }
    
    /**
     * Unsets the "DefaultBusinessUnit" element
     */
    public void unsetDefaultBusinessUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTBUSINESSUNIT$34, 0);
        }
    }
    
    /**
     * Gets the "Locale" element
     */
    public com.exacttarget.wsdl.partnerapi.Locale getLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().find_element_user(LOCALE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Locale" element
     */
    public boolean isSetLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALE$36) != 0;
        }
    }
    
    /**
     * Sets the "Locale" element
     */
    public void setLocale(com.exacttarget.wsdl.partnerapi.Locale locale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().find_element_user(LOCALE$36, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().add_element_user(LOCALE$36);
            }
            target.set(locale);
        }
    }
    
    /**
     * Appends and returns a new empty "Locale" element
     */
    public com.exacttarget.wsdl.partnerapi.Locale addNewLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().add_element_user(LOCALE$36);
            return target;
        }
    }
    
    /**
     * Unsets the "Locale" element
     */
    public void unsetLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALE$36, 0);
        }
    }
    
    /**
     * Gets the "TimeZone" element
     */
    public com.exacttarget.wsdl.partnerapi.TimeZone getTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TimeZone target = null;
            target = (com.exacttarget.wsdl.partnerapi.TimeZone)get_store().find_element_user(TIMEZONE$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TimeZone" element
     */
    public boolean isSetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONE$38) != 0;
        }
    }
    
    /**
     * Sets the "TimeZone" element
     */
    public void setTimeZone(com.exacttarget.wsdl.partnerapi.TimeZone timeZone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TimeZone target = null;
            target = (com.exacttarget.wsdl.partnerapi.TimeZone)get_store().find_element_user(TIMEZONE$38, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TimeZone)get_store().add_element_user(TIMEZONE$38);
            }
            target.set(timeZone);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeZone" element
     */
    public com.exacttarget.wsdl.partnerapi.TimeZone addNewTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TimeZone target = null;
            target = (com.exacttarget.wsdl.partnerapi.TimeZone)get_store().add_element_user(TIMEZONE$38);
            return target;
        }
    }
    
    /**
     * Unsets the "TimeZone" element
     */
    public void unsetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONE$38, 0);
        }
    }
    
    /**
     * Gets the "DefaultBusinessUnitObject" element
     */
    public com.exacttarget.wsdl.partnerapi.BusinessUnit getDefaultBusinessUnitObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BusinessUnit target = null;
            target = (com.exacttarget.wsdl.partnerapi.BusinessUnit)get_store().find_element_user(DEFAULTBUSINESSUNITOBJECT$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DefaultBusinessUnitObject" element
     */
    public boolean isSetDefaultBusinessUnitObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTBUSINESSUNITOBJECT$40) != 0;
        }
    }
    
    /**
     * Sets the "DefaultBusinessUnitObject" element
     */
    public void setDefaultBusinessUnitObject(com.exacttarget.wsdl.partnerapi.BusinessUnit defaultBusinessUnitObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BusinessUnit target = null;
            target = (com.exacttarget.wsdl.partnerapi.BusinessUnit)get_store().find_element_user(DEFAULTBUSINESSUNITOBJECT$40, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.BusinessUnit)get_store().add_element_user(DEFAULTBUSINESSUNITOBJECT$40);
            }
            target.set(defaultBusinessUnitObject);
        }
    }
    
    /**
     * Appends and returns a new empty "DefaultBusinessUnitObject" element
     */
    public com.exacttarget.wsdl.partnerapi.BusinessUnit addNewDefaultBusinessUnitObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BusinessUnit target = null;
            target = (com.exacttarget.wsdl.partnerapi.BusinessUnit)get_store().add_element_user(DEFAULTBUSINESSUNITOBJECT$40);
            return target;
        }
    }
    
    /**
     * Unsets the "DefaultBusinessUnitObject" element
     */
    public void unsetDefaultBusinessUnitObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTBUSINESSUNITOBJECT$40, 0);
        }
    }
    
    /**
     * Gets the "AssociatedBusinessUnits" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits getAssociatedBusinessUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits)get_store().find_element_user(ASSOCIATEDBUSINESSUNITS$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AssociatedBusinessUnits" element
     */
    public boolean isSetAssociatedBusinessUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSOCIATEDBUSINESSUNITS$42) != 0;
        }
    }
    
    /**
     * Sets the "AssociatedBusinessUnits" element
     */
    public void setAssociatedBusinessUnits(com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits associatedBusinessUnits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits)get_store().find_element_user(ASSOCIATEDBUSINESSUNITS$42, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits)get_store().add_element_user(ASSOCIATEDBUSINESSUNITS$42);
            }
            target.set(associatedBusinessUnits);
        }
    }
    
    /**
     * Appends and returns a new empty "AssociatedBusinessUnits" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits addNewAssociatedBusinessUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits)get_store().add_element_user(ASSOCIATEDBUSINESSUNITS$42);
            return target;
        }
    }
    
    /**
     * Unsets the "AssociatedBusinessUnits" element
     */
    public void unsetAssociatedBusinessUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSOCIATEDBUSINESSUNITS$42, 0);
        }
    }
    
    /**
     * Gets the "Roles" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser.Roles getRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser.Roles target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser.Roles)get_store().find_element_user(ROLES$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Roles" element
     */
    public boolean isSetRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLES$44) != 0;
        }
    }
    
    /**
     * Sets the "Roles" element
     */
    public void setRoles(com.exacttarget.wsdl.partnerapi.AccountUser.Roles roles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser.Roles target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser.Roles)get_store().find_element_user(ROLES$44, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.AccountUser.Roles)get_store().add_element_user(ROLES$44);
            }
            target.set(roles);
        }
    }
    
    /**
     * Appends and returns a new empty "Roles" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser.Roles addNewRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser.Roles target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser.Roles)get_store().add_element_user(ROLES$44);
            return target;
        }
    }
    
    /**
     * Unsets the "Roles" element
     */
    public void unsetRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLES$44, 0);
        }
    }
    
    /**
     * Gets the "LanguageLocale" element
     */
    public com.exacttarget.wsdl.partnerapi.Locale getLanguageLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().find_element_user(LANGUAGELOCALE$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LanguageLocale" element
     */
    public boolean isSetLanguageLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGELOCALE$46) != 0;
        }
    }
    
    /**
     * Sets the "LanguageLocale" element
     */
    public void setLanguageLocale(com.exacttarget.wsdl.partnerapi.Locale languageLocale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().find_element_user(LANGUAGELOCALE$46, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().add_element_user(LANGUAGELOCALE$46);
            }
            target.set(languageLocale);
        }
    }
    
    /**
     * Appends and returns a new empty "LanguageLocale" element
     */
    public com.exacttarget.wsdl.partnerapi.Locale addNewLanguageLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().add_element_user(LANGUAGELOCALE$46);
            return target;
        }
    }
    
    /**
     * Unsets the "LanguageLocale" element
     */
    public void unsetLanguageLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGELOCALE$46, 0);
        }
    }
    
    /**
     * Gets the "SsoIdentities" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities getSsoIdentities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities)get_store().find_element_user(SSOIDENTITIES$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SsoIdentities" element
     */
    public boolean isSetSsoIdentities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SSOIDENTITIES$48) != 0;
        }
    }
    
    /**
     * Sets the "SsoIdentities" element
     */
    public void setSsoIdentities(com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities ssoIdentities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities)get_store().find_element_user(SSOIDENTITIES$48, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities)get_store().add_element_user(SSOIDENTITIES$48);
            }
            target.set(ssoIdentities);
        }
    }
    
    /**
     * Appends and returns a new empty "SsoIdentities" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities addNewSsoIdentities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities)get_store().add_element_user(SSOIDENTITIES$48);
            return target;
        }
    }
    
    /**
     * Unsets the "SsoIdentities" element
     */
    public void unsetSsoIdentities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SSOIDENTITIES$48, 0);
        }
    }
    /**
     * An XML AssociatedBusinessUnits(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class AssociatedBusinessUnitsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits
    {
        
        public AssociatedBusinessUnitsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUSINESSUNIT$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BusinessUnit");
        
        
        /**
         * Gets array of all "BusinessUnit" elements
         */
        public com.exacttarget.wsdl.partnerapi.BusinessUnit[] getBusinessUnitArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BUSINESSUNIT$0, targetList);
                com.exacttarget.wsdl.partnerapi.BusinessUnit[] result = new com.exacttarget.wsdl.partnerapi.BusinessUnit[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "BusinessUnit" element
         */
        public com.exacttarget.wsdl.partnerapi.BusinessUnit getBusinessUnitArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.BusinessUnit target = null;
                target = (com.exacttarget.wsdl.partnerapi.BusinessUnit)get_store().find_element_user(BUSINESSUNIT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "BusinessUnit" element
         */
        public int sizeOfBusinessUnitArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUSINESSUNIT$0);
            }
        }
        
        /**
         * Sets array of all "BusinessUnit" element
         */
        public void setBusinessUnitArray(com.exacttarget.wsdl.partnerapi.BusinessUnit[] businessUnitArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(businessUnitArray, BUSINESSUNIT$0);
            }
        }
        
        /**
         * Sets ith "BusinessUnit" element
         */
        public void setBusinessUnitArray(int i, com.exacttarget.wsdl.partnerapi.BusinessUnit businessUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.BusinessUnit target = null;
                target = (com.exacttarget.wsdl.partnerapi.BusinessUnit)get_store().find_element_user(BUSINESSUNIT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(businessUnit);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BusinessUnit" element
         */
        public com.exacttarget.wsdl.partnerapi.BusinessUnit insertNewBusinessUnit(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.BusinessUnit target = null;
                target = (com.exacttarget.wsdl.partnerapi.BusinessUnit)get_store().insert_element_user(BUSINESSUNIT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BusinessUnit" element
         */
        public com.exacttarget.wsdl.partnerapi.BusinessUnit addNewBusinessUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.BusinessUnit target = null;
                target = (com.exacttarget.wsdl.partnerapi.BusinessUnit)get_store().add_element_user(BUSINESSUNIT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "BusinessUnit" element
         */
        public void removeBusinessUnit(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUSINESSUNIT$0, i);
            }
        }
    }
    /**
     * An XML Roles(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class RolesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.AccountUser.Roles
    {
        
        public RolesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROLE$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Role");
        
        
        /**
         * Gets array of all "Role" elements
         */
        public com.exacttarget.wsdl.partnerapi.Role[] getRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROLE$0, targetList);
                com.exacttarget.wsdl.partnerapi.Role[] result = new com.exacttarget.wsdl.partnerapi.Role[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Role" element
         */
        public com.exacttarget.wsdl.partnerapi.Role getRoleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Role target = null;
                target = (com.exacttarget.wsdl.partnerapi.Role)get_store().find_element_user(ROLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Role" element
         */
        public int sizeOfRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROLE$0);
            }
        }
        
        /**
         * Sets array of all "Role" element
         */
        public void setRoleArray(com.exacttarget.wsdl.partnerapi.Role[] roleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(roleArray, ROLE$0);
            }
        }
        
        /**
         * Sets ith "Role" element
         */
        public void setRoleArray(int i, com.exacttarget.wsdl.partnerapi.Role role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Role target = null;
                target = (com.exacttarget.wsdl.partnerapi.Role)get_store().find_element_user(ROLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(role);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Role" element
         */
        public com.exacttarget.wsdl.partnerapi.Role insertNewRole(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Role target = null;
                target = (com.exacttarget.wsdl.partnerapi.Role)get_store().insert_element_user(ROLE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Role" element
         */
        public com.exacttarget.wsdl.partnerapi.Role addNewRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Role target = null;
                target = (com.exacttarget.wsdl.partnerapi.Role)get_store().add_element_user(ROLE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Role" element
         */
        public void removeRole(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROLE$0, i);
            }
        }
    }
    /**
     * An XML SsoIdentities(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class SsoIdentitiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities
    {
        
        public SsoIdentitiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SSOIDENTITY$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SsoIdentity");
        
        
        /**
         * Gets array of all "SsoIdentity" elements
         */
        public com.exacttarget.wsdl.partnerapi.SsoIdentity[] getSsoIdentityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SSOIDENTITY$0, targetList);
                com.exacttarget.wsdl.partnerapi.SsoIdentity[] result = new com.exacttarget.wsdl.partnerapi.SsoIdentity[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SsoIdentity" element
         */
        public com.exacttarget.wsdl.partnerapi.SsoIdentity getSsoIdentityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SsoIdentity target = null;
                target = (com.exacttarget.wsdl.partnerapi.SsoIdentity)get_store().find_element_user(SSOIDENTITY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SsoIdentity" element
         */
        public int sizeOfSsoIdentityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SSOIDENTITY$0);
            }
        }
        
        /**
         * Sets array of all "SsoIdentity" element
         */
        public void setSsoIdentityArray(com.exacttarget.wsdl.partnerapi.SsoIdentity[] ssoIdentityArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ssoIdentityArray, SSOIDENTITY$0);
            }
        }
        
        /**
         * Sets ith "SsoIdentity" element
         */
        public void setSsoIdentityArray(int i, com.exacttarget.wsdl.partnerapi.SsoIdentity ssoIdentity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SsoIdentity target = null;
                target = (com.exacttarget.wsdl.partnerapi.SsoIdentity)get_store().find_element_user(SSOIDENTITY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ssoIdentity);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SsoIdentity" element
         */
        public com.exacttarget.wsdl.partnerapi.SsoIdentity insertNewSsoIdentity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SsoIdentity target = null;
                target = (com.exacttarget.wsdl.partnerapi.SsoIdentity)get_store().insert_element_user(SSOIDENTITY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SsoIdentity" element
         */
        public com.exacttarget.wsdl.partnerapi.SsoIdentity addNewSsoIdentity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SsoIdentity target = null;
                target = (com.exacttarget.wsdl.partnerapi.SsoIdentity)get_store().add_element_user(SSOIDENTITY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "SsoIdentity" element
         */
        public void removeSsoIdentity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SSOIDENTITY$0, i);
            }
        }
    }
}

/*
 * XML Type:  Account
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Account
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML Account(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface Account extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Account.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("account347btype");
    
    /**
     * Gets the "AccountType" element
     */
    com.exacttarget.wsdl.partnerapi.AccountTypeEnum.Enum getAccountType();
    
    /**
     * Gets (as xml) the "AccountType" element
     */
    com.exacttarget.wsdl.partnerapi.AccountTypeEnum xgetAccountType();
    
    /**
     * Sets the "AccountType" element
     */
    void setAccountType(com.exacttarget.wsdl.partnerapi.AccountTypeEnum.Enum accountType);
    
    /**
     * Sets (as xml) the "AccountType" element
     */
    void xsetAccountType(com.exacttarget.wsdl.partnerapi.AccountTypeEnum accountType);
    
    /**
     * Gets the "ParentID" element
     */
    int getParentID();
    
    /**
     * Gets (as xml) the "ParentID" element
     */
    org.apache.xmlbeans.XmlInt xgetParentID();
    
    /**
     * True if has "ParentID" element
     */
    boolean isSetParentID();
    
    /**
     * Sets the "ParentID" element
     */
    void setParentID(int parentID);
    
    /**
     * Sets (as xml) the "ParentID" element
     */
    void xsetParentID(org.apache.xmlbeans.XmlInt parentID);
    
    /**
     * Unsets the "ParentID" element
     */
    void unsetParentID();
    
    /**
     * Gets the "BrandID" element
     */
    int getBrandID();
    
    /**
     * Gets (as xml) the "BrandID" element
     */
    org.apache.xmlbeans.XmlInt xgetBrandID();
    
    /**
     * True if has "BrandID" element
     */
    boolean isSetBrandID();
    
    /**
     * Sets the "BrandID" element
     */
    void setBrandID(int brandID);
    
    /**
     * Sets (as xml) the "BrandID" element
     */
    void xsetBrandID(org.apache.xmlbeans.XmlInt brandID);
    
    /**
     * Unsets the "BrandID" element
     */
    void unsetBrandID();
    
    /**
     * Gets the "PrivateLabelID" element
     */
    int getPrivateLabelID();
    
    /**
     * Gets (as xml) the "PrivateLabelID" element
     */
    org.apache.xmlbeans.XmlInt xgetPrivateLabelID();
    
    /**
     * True if has "PrivateLabelID" element
     */
    boolean isSetPrivateLabelID();
    
    /**
     * Sets the "PrivateLabelID" element
     */
    void setPrivateLabelID(int privateLabelID);
    
    /**
     * Sets (as xml) the "PrivateLabelID" element
     */
    void xsetPrivateLabelID(org.apache.xmlbeans.XmlInt privateLabelID);
    
    /**
     * Unsets the "PrivateLabelID" element
     */
    void unsetPrivateLabelID();
    
    /**
     * Gets the "ReportingParentID" element
     */
    int getReportingParentID();
    
    /**
     * Gets (as xml) the "ReportingParentID" element
     */
    org.apache.xmlbeans.XmlInt xgetReportingParentID();
    
    /**
     * True if has "ReportingParentID" element
     */
    boolean isSetReportingParentID();
    
    /**
     * Sets the "ReportingParentID" element
     */
    void setReportingParentID(int reportingParentID);
    
    /**
     * Sets (as xml) the "ReportingParentID" element
     */
    void xsetReportingParentID(org.apache.xmlbeans.XmlInt reportingParentID);
    
    /**
     * Unsets the "ReportingParentID" element
     */
    void unsetReportingParentID();
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "Email" element
     */
    java.lang.String getEmail();
    
    /**
     * Gets (as xml) the "Email" element
     */
    org.apache.xmlbeans.XmlString xgetEmail();
    
    /**
     * True if has "Email" element
     */
    boolean isSetEmail();
    
    /**
     * Sets the "Email" element
     */
    void setEmail(java.lang.String email);
    
    /**
     * Sets (as xml) the "Email" element
     */
    void xsetEmail(org.apache.xmlbeans.XmlString email);
    
    /**
     * Unsets the "Email" element
     */
    void unsetEmail();
    
    /**
     * Gets the "FromName" element
     */
    java.lang.String getFromName();
    
    /**
     * Gets (as xml) the "FromName" element
     */
    org.apache.xmlbeans.XmlString xgetFromName();
    
    /**
     * True if has "FromName" element
     */
    boolean isSetFromName();
    
    /**
     * Sets the "FromName" element
     */
    void setFromName(java.lang.String fromName);
    
    /**
     * Sets (as xml) the "FromName" element
     */
    void xsetFromName(org.apache.xmlbeans.XmlString fromName);
    
    /**
     * Unsets the "FromName" element
     */
    void unsetFromName();
    
    /**
     * Gets the "BusinessName" element
     */
    java.lang.String getBusinessName();
    
    /**
     * Gets (as xml) the "BusinessName" element
     */
    org.apache.xmlbeans.XmlString xgetBusinessName();
    
    /**
     * True if has "BusinessName" element
     */
    boolean isSetBusinessName();
    
    /**
     * Sets the "BusinessName" element
     */
    void setBusinessName(java.lang.String businessName);
    
    /**
     * Sets (as xml) the "BusinessName" element
     */
    void xsetBusinessName(org.apache.xmlbeans.XmlString businessName);
    
    /**
     * Unsets the "BusinessName" element
     */
    void unsetBusinessName();
    
    /**
     * Gets the "Phone" element
     */
    java.lang.String getPhone();
    
    /**
     * Gets (as xml) the "Phone" element
     */
    org.apache.xmlbeans.XmlString xgetPhone();
    
    /**
     * True if has "Phone" element
     */
    boolean isSetPhone();
    
    /**
     * Sets the "Phone" element
     */
    void setPhone(java.lang.String phone);
    
    /**
     * Sets (as xml) the "Phone" element
     */
    void xsetPhone(org.apache.xmlbeans.XmlString phone);
    
    /**
     * Unsets the "Phone" element
     */
    void unsetPhone();
    
    /**
     * Gets the "Address" element
     */
    java.lang.String getAddress();
    
    /**
     * Gets (as xml) the "Address" element
     */
    org.apache.xmlbeans.XmlString xgetAddress();
    
    /**
     * True if has "Address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "Address" element
     */
    void setAddress(java.lang.String address);
    
    /**
     * Sets (as xml) the "Address" element
     */
    void xsetAddress(org.apache.xmlbeans.XmlString address);
    
    /**
     * Unsets the "Address" element
     */
    void unsetAddress();
    
    /**
     * Gets the "Fax" element
     */
    java.lang.String getFax();
    
    /**
     * Gets (as xml) the "Fax" element
     */
    org.apache.xmlbeans.XmlString xgetFax();
    
    /**
     * True if has "Fax" element
     */
    boolean isSetFax();
    
    /**
     * Sets the "Fax" element
     */
    void setFax(java.lang.String fax);
    
    /**
     * Sets (as xml) the "Fax" element
     */
    void xsetFax(org.apache.xmlbeans.XmlString fax);
    
    /**
     * Unsets the "Fax" element
     */
    void unsetFax();
    
    /**
     * Gets the "City" element
     */
    java.lang.String getCity();
    
    /**
     * Gets (as xml) the "City" element
     */
    org.apache.xmlbeans.XmlString xgetCity();
    
    /**
     * True if has "City" element
     */
    boolean isSetCity();
    
    /**
     * Sets the "City" element
     */
    void setCity(java.lang.String city);
    
    /**
     * Sets (as xml) the "City" element
     */
    void xsetCity(org.apache.xmlbeans.XmlString city);
    
    /**
     * Unsets the "City" element
     */
    void unsetCity();
    
    /**
     * Gets the "State" element
     */
    java.lang.String getState();
    
    /**
     * Gets (as xml) the "State" element
     */
    org.apache.xmlbeans.XmlString xgetState();
    
    /**
     * True if has "State" element
     */
    boolean isSetState();
    
    /**
     * Sets the "State" element
     */
    void setState(java.lang.String state);
    
    /**
     * Sets (as xml) the "State" element
     */
    void xsetState(org.apache.xmlbeans.XmlString state);
    
    /**
     * Unsets the "State" element
     */
    void unsetState();
    
    /**
     * Gets the "Zip" element
     */
    java.lang.String getZip();
    
    /**
     * Gets (as xml) the "Zip" element
     */
    org.apache.xmlbeans.XmlString xgetZip();
    
    /**
     * True if has "Zip" element
     */
    boolean isSetZip();
    
    /**
     * Sets the "Zip" element
     */
    void setZip(java.lang.String zip);
    
    /**
     * Sets (as xml) the "Zip" element
     */
    void xsetZip(org.apache.xmlbeans.XmlString zip);
    
    /**
     * Unsets the "Zip" element
     */
    void unsetZip();
    
    /**
     * Gets the "Country" element
     */
    java.lang.String getCountry();
    
    /**
     * Gets (as xml) the "Country" element
     */
    org.apache.xmlbeans.XmlString xgetCountry();
    
    /**
     * True if has "Country" element
     */
    boolean isSetCountry();
    
    /**
     * Sets the "Country" element
     */
    void setCountry(java.lang.String country);
    
    /**
     * Sets (as xml) the "Country" element
     */
    void xsetCountry(org.apache.xmlbeans.XmlString country);
    
    /**
     * Unsets the "Country" element
     */
    void unsetCountry();
    
    /**
     * Gets the "IsActive" element
     */
    int getIsActive();
    
    /**
     * Gets (as xml) the "IsActive" element
     */
    org.apache.xmlbeans.XmlInt xgetIsActive();
    
    /**
     * True if has "IsActive" element
     */
    boolean isSetIsActive();
    
    /**
     * Sets the "IsActive" element
     */
    void setIsActive(int isActive);
    
    /**
     * Sets (as xml) the "IsActive" element
     */
    void xsetIsActive(org.apache.xmlbeans.XmlInt isActive);
    
    /**
     * Unsets the "IsActive" element
     */
    void unsetIsActive();
    
    /**
     * Gets the "IsTestAccount" element
     */
    boolean getIsTestAccount();
    
    /**
     * Gets (as xml) the "IsTestAccount" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsTestAccount();
    
    /**
     * True if has "IsTestAccount" element
     */
    boolean isSetIsTestAccount();
    
    /**
     * Sets the "IsTestAccount" element
     */
    void setIsTestAccount(boolean isTestAccount);
    
    /**
     * Sets (as xml) the "IsTestAccount" element
     */
    void xsetIsTestAccount(org.apache.xmlbeans.XmlBoolean isTestAccount);
    
    /**
     * Unsets the "IsTestAccount" element
     */
    void unsetIsTestAccount();
    
    /**
     * Gets the "OrgID" element
     */
    int getOrgID();
    
    /**
     * Gets (as xml) the "OrgID" element
     */
    org.apache.xmlbeans.XmlInt xgetOrgID();
    
    /**
     * True if has "OrgID" element
     */
    boolean isSetOrgID();
    
    /**
     * Sets the "OrgID" element
     */
    void setOrgID(int orgID);
    
    /**
     * Sets (as xml) the "OrgID" element
     */
    void xsetOrgID(org.apache.xmlbeans.XmlInt orgID);
    
    /**
     * Unsets the "OrgID" element
     */
    void unsetOrgID();
    
    /**
     * Gets the "DBID" element
     */
    int getDBID();
    
    /**
     * Gets (as xml) the "DBID" element
     */
    org.apache.xmlbeans.XmlInt xgetDBID();
    
    /**
     * True if has "DBID" element
     */
    boolean isSetDBID();
    
    /**
     * Sets the "DBID" element
     */
    void setDBID(int dbid);
    
    /**
     * Sets (as xml) the "DBID" element
     */
    void xsetDBID(org.apache.xmlbeans.XmlInt dbid);
    
    /**
     * Unsets the "DBID" element
     */
    void unsetDBID();
    
    /**
     * Gets the "ParentName" element
     */
    java.lang.String getParentName();
    
    /**
     * Gets (as xml) the "ParentName" element
     */
    org.apache.xmlbeans.XmlString xgetParentName();
    
    /**
     * True if has "ParentName" element
     */
    boolean isSetParentName();
    
    /**
     * Sets the "ParentName" element
     */
    void setParentName(java.lang.String parentName);
    
    /**
     * Sets (as xml) the "ParentName" element
     */
    void xsetParentName(org.apache.xmlbeans.XmlString parentName);
    
    /**
     * Unsets the "ParentName" element
     */
    void unsetParentName();
    
    /**
     * Gets the "CustomerID" element
     */
    long getCustomerID();
    
    /**
     * Gets (as xml) the "CustomerID" element
     */
    org.apache.xmlbeans.XmlLong xgetCustomerID();
    
    /**
     * True if has "CustomerID" element
     */
    boolean isSetCustomerID();
    
    /**
     * Sets the "CustomerID" element
     */
    void setCustomerID(long customerID);
    
    /**
     * Sets (as xml) the "CustomerID" element
     */
    void xsetCustomerID(org.apache.xmlbeans.XmlLong customerID);
    
    /**
     * Unsets the "CustomerID" element
     */
    void unsetCustomerID();
    
    /**
     * Gets the "DeletedDate" element
     */
    java.util.Calendar getDeletedDate();
    
    /**
     * Gets (as xml) the "DeletedDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDeletedDate();
    
    /**
     * True if has "DeletedDate" element
     */
    boolean isSetDeletedDate();
    
    /**
     * Sets the "DeletedDate" element
     */
    void setDeletedDate(java.util.Calendar deletedDate);
    
    /**
     * Sets (as xml) the "DeletedDate" element
     */
    void xsetDeletedDate(org.apache.xmlbeans.XmlDateTime deletedDate);
    
    /**
     * Unsets the "DeletedDate" element
     */
    void unsetDeletedDate();
    
    /**
     * Gets the "EditionID" element
     */
    int getEditionID();
    
    /**
     * Gets (as xml) the "EditionID" element
     */
    org.apache.xmlbeans.XmlInt xgetEditionID();
    
    /**
     * True if has "EditionID" element
     */
    boolean isSetEditionID();
    
    /**
     * Sets the "EditionID" element
     */
    void setEditionID(int editionID);
    
    /**
     * Sets (as xml) the "EditionID" element
     */
    void xsetEditionID(org.apache.xmlbeans.XmlInt editionID);
    
    /**
     * Unsets the "EditionID" element
     */
    void unsetEditionID();
    
    /**
     * Gets array of all "Children" elements
     */
    com.exacttarget.wsdl.partnerapi.AccountDataItem[] getChildrenArray();
    
    /**
     * Gets ith "Children" element
     */
    com.exacttarget.wsdl.partnerapi.AccountDataItem getChildrenArray(int i);
    
    /**
     * Tests for nil ith "Children" element
     */
    boolean isNilChildrenArray(int i);
    
    /**
     * Returns number of "Children" element
     */
    int sizeOfChildrenArray();
    
    /**
     * Sets array of all "Children" element
     */
    void setChildrenArray(com.exacttarget.wsdl.partnerapi.AccountDataItem[] childrenArray);
    
    /**
     * Sets ith "Children" element
     */
    void setChildrenArray(int i, com.exacttarget.wsdl.partnerapi.AccountDataItem children);
    
    /**
     * Nils the ith "Children" element
     */
    void setNilChildrenArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Children" element
     */
    com.exacttarget.wsdl.partnerapi.AccountDataItem insertNewChildren(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Children" element
     */
    com.exacttarget.wsdl.partnerapi.AccountDataItem addNewChildren();
    
    /**
     * Removes the ith "Children" element
     */
    void removeChildren(int i);
    
    /**
     * Gets the "Subscription" element
     */
    com.exacttarget.wsdl.partnerapi.Subscription getSubscription();
    
    /**
     * Tests for nil "Subscription" element
     */
    boolean isNilSubscription();
    
    /**
     * True if has "Subscription" element
     */
    boolean isSetSubscription();
    
    /**
     * Sets the "Subscription" element
     */
    void setSubscription(com.exacttarget.wsdl.partnerapi.Subscription subscription);
    
    /**
     * Appends and returns a new empty "Subscription" element
     */
    com.exacttarget.wsdl.partnerapi.Subscription addNewSubscription();
    
    /**
     * Nils the "Subscription" element
     */
    void setNilSubscription();
    
    /**
     * Unsets the "Subscription" element
     */
    void unsetSubscription();
    
    /**
     * Gets array of all "PrivateLabels" elements
     */
    com.exacttarget.wsdl.partnerapi.PrivateLabel[] getPrivateLabelsArray();
    
    /**
     * Gets ith "PrivateLabels" element
     */
    com.exacttarget.wsdl.partnerapi.PrivateLabel getPrivateLabelsArray(int i);
    
    /**
     * Tests for nil ith "PrivateLabels" element
     */
    boolean isNilPrivateLabelsArray(int i);
    
    /**
     * Returns number of "PrivateLabels" element
     */
    int sizeOfPrivateLabelsArray();
    
    /**
     * Sets array of all "PrivateLabels" element
     */
    void setPrivateLabelsArray(com.exacttarget.wsdl.partnerapi.PrivateLabel[] privateLabelsArray);
    
    /**
     * Sets ith "PrivateLabels" element
     */
    void setPrivateLabelsArray(int i, com.exacttarget.wsdl.partnerapi.PrivateLabel privateLabels);
    
    /**
     * Nils the ith "PrivateLabels" element
     */
    void setNilPrivateLabelsArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrivateLabels" element
     */
    com.exacttarget.wsdl.partnerapi.PrivateLabel insertNewPrivateLabels(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PrivateLabels" element
     */
    com.exacttarget.wsdl.partnerapi.PrivateLabel addNewPrivateLabels();
    
    /**
     * Removes the ith "PrivateLabels" element
     */
    void removePrivateLabels(int i);
    
    /**
     * Gets array of all "BusinessRules" elements
     */
    com.exacttarget.wsdl.partnerapi.BusinessRule[] getBusinessRulesArray();
    
    /**
     * Gets ith "BusinessRules" element
     */
    com.exacttarget.wsdl.partnerapi.BusinessRule getBusinessRulesArray(int i);
    
    /**
     * Tests for nil ith "BusinessRules" element
     */
    boolean isNilBusinessRulesArray(int i);
    
    /**
     * Returns number of "BusinessRules" element
     */
    int sizeOfBusinessRulesArray();
    
    /**
     * Sets array of all "BusinessRules" element
     */
    void setBusinessRulesArray(com.exacttarget.wsdl.partnerapi.BusinessRule[] businessRulesArray);
    
    /**
     * Sets ith "BusinessRules" element
     */
    void setBusinessRulesArray(int i, com.exacttarget.wsdl.partnerapi.BusinessRule businessRules);
    
    /**
     * Nils the ith "BusinessRules" element
     */
    void setNilBusinessRulesArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BusinessRules" element
     */
    com.exacttarget.wsdl.partnerapi.BusinessRule insertNewBusinessRules(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BusinessRules" element
     */
    com.exacttarget.wsdl.partnerapi.BusinessRule addNewBusinessRules();
    
    /**
     * Removes the ith "BusinessRules" element
     */
    void removeBusinessRules(int i);
    
    /**
     * Gets array of all "AccountUsers" elements
     */
    com.exacttarget.wsdl.partnerapi.AccountUser[] getAccountUsersArray();
    
    /**
     * Gets ith "AccountUsers" element
     */
    com.exacttarget.wsdl.partnerapi.AccountUser getAccountUsersArray(int i);
    
    /**
     * Tests for nil ith "AccountUsers" element
     */
    boolean isNilAccountUsersArray(int i);
    
    /**
     * Returns number of "AccountUsers" element
     */
    int sizeOfAccountUsersArray();
    
    /**
     * Sets array of all "AccountUsers" element
     */
    void setAccountUsersArray(com.exacttarget.wsdl.partnerapi.AccountUser[] accountUsersArray);
    
    /**
     * Sets ith "AccountUsers" element
     */
    void setAccountUsersArray(int i, com.exacttarget.wsdl.partnerapi.AccountUser accountUsers);
    
    /**
     * Nils the ith "AccountUsers" element
     */
    void setNilAccountUsersArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AccountUsers" element
     */
    com.exacttarget.wsdl.partnerapi.AccountUser insertNewAccountUsers(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AccountUsers" element
     */
    com.exacttarget.wsdl.partnerapi.AccountUser addNewAccountUsers();
    
    /**
     * Removes the ith "AccountUsers" element
     */
    void removeAccountUsers(int i);
    
    /**
     * Gets the "InheritAddress" element
     */
    boolean getInheritAddress();
    
    /**
     * Gets (as xml) the "InheritAddress" element
     */
    org.apache.xmlbeans.XmlBoolean xgetInheritAddress();
    
    /**
     * True if has "InheritAddress" element
     */
    boolean isSetInheritAddress();
    
    /**
     * Sets the "InheritAddress" element
     */
    void setInheritAddress(boolean inheritAddress);
    
    /**
     * Sets (as xml) the "InheritAddress" element
     */
    void xsetInheritAddress(org.apache.xmlbeans.XmlBoolean inheritAddress);
    
    /**
     * Unsets the "InheritAddress" element
     */
    void unsetInheritAddress();
    
    /**
     * Gets the "IsTrialAccount" element
     */
    boolean getIsTrialAccount();
    
    /**
     * Gets (as xml) the "IsTrialAccount" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsTrialAccount();
    
    /**
     * True if has "IsTrialAccount" element
     */
    boolean isSetIsTrialAccount();
    
    /**
     * Sets the "IsTrialAccount" element
     */
    void setIsTrialAccount(boolean isTrialAccount);
    
    /**
     * Sets (as xml) the "IsTrialAccount" element
     */
    void xsetIsTrialAccount(org.apache.xmlbeans.XmlBoolean isTrialAccount);
    
    /**
     * Unsets the "IsTrialAccount" element
     */
    void unsetIsTrialAccount();
    
    /**
     * Gets the "Locale" element
     */
    com.exacttarget.wsdl.partnerapi.Locale getLocale();
    
    /**
     * True if has "Locale" element
     */
    boolean isSetLocale();
    
    /**
     * Sets the "Locale" element
     */
    void setLocale(com.exacttarget.wsdl.partnerapi.Locale locale);
    
    /**
     * Appends and returns a new empty "Locale" element
     */
    com.exacttarget.wsdl.partnerapi.Locale addNewLocale();
    
    /**
     * Unsets the "Locale" element
     */
    void unsetLocale();
    
    /**
     * Gets the "ParentAccount" element
     */
    com.exacttarget.wsdl.partnerapi.Account getParentAccount();
    
    /**
     * True if has "ParentAccount" element
     */
    boolean isSetParentAccount();
    
    /**
     * Sets the "ParentAccount" element
     */
    void setParentAccount(com.exacttarget.wsdl.partnerapi.Account parentAccount);
    
    /**
     * Appends and returns a new empty "ParentAccount" element
     */
    com.exacttarget.wsdl.partnerapi.Account addNewParentAccount();
    
    /**
     * Unsets the "ParentAccount" element
     */
    void unsetParentAccount();
    
    /**
     * Gets the "TimeZone" element
     */
    com.exacttarget.wsdl.partnerapi.TimeZone getTimeZone();
    
    /**
     * True if has "TimeZone" element
     */
    boolean isSetTimeZone();
    
    /**
     * Sets the "TimeZone" element
     */
    void setTimeZone(com.exacttarget.wsdl.partnerapi.TimeZone timeZone);
    
    /**
     * Appends and returns a new empty "TimeZone" element
     */
    com.exacttarget.wsdl.partnerapi.TimeZone addNewTimeZone();
    
    /**
     * Unsets the "TimeZone" element
     */
    void unsetTimeZone();
    
    /**
     * Gets the "Roles" element
     */
    com.exacttarget.wsdl.partnerapi.Account.Roles getRoles();
    
    /**
     * True if has "Roles" element
     */
    boolean isSetRoles();
    
    /**
     * Sets the "Roles" element
     */
    void setRoles(com.exacttarget.wsdl.partnerapi.Account.Roles roles);
    
    /**
     * Appends and returns a new empty "Roles" element
     */
    com.exacttarget.wsdl.partnerapi.Account.Roles addNewRoles();
    
    /**
     * Unsets the "Roles" element
     */
    void unsetRoles();
    
    /**
     * Gets the "LanguageLocale" element
     */
    com.exacttarget.wsdl.partnerapi.Locale getLanguageLocale();
    
    /**
     * True if has "LanguageLocale" element
     */
    boolean isSetLanguageLocale();
    
    /**
     * Sets the "LanguageLocale" element
     */
    void setLanguageLocale(com.exacttarget.wsdl.partnerapi.Locale languageLocale);
    
    /**
     * Appends and returns a new empty "LanguageLocale" element
     */
    com.exacttarget.wsdl.partnerapi.Locale addNewLanguageLocale();
    
    /**
     * Unsets the "LanguageLocale" element
     */
    void unsetLanguageLocale();
    
    /**
     * An XML Roles(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface Roles extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Roles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("roles7692elemtype");
        
        /**
         * Gets array of all "Role" elements
         */
        com.exacttarget.wsdl.partnerapi.Role[] getRoleArray();
        
        /**
         * Gets ith "Role" element
         */
        com.exacttarget.wsdl.partnerapi.Role getRoleArray(int i);
        
        /**
         * Returns number of "Role" element
         */
        int sizeOfRoleArray();
        
        /**
         * Sets array of all "Role" element
         */
        void setRoleArray(com.exacttarget.wsdl.partnerapi.Role[] roleArray);
        
        /**
         * Sets ith "Role" element
         */
        void setRoleArray(int i, com.exacttarget.wsdl.partnerapi.Role role);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Role" element
         */
        com.exacttarget.wsdl.partnerapi.Role insertNewRole(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Role" element
         */
        com.exacttarget.wsdl.partnerapi.Role addNewRole();
        
        /**
         * Removes the ith "Role" element
         */
        void removeRole(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.Account.Roles newInstance() {
              return (com.exacttarget.wsdl.partnerapi.Account.Roles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.Account.Roles newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.Account.Roles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.Account newInstance() {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.Account parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.Account parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Account parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Account parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Account parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

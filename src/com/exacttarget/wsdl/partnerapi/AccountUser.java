/*
 * XML Type:  AccountUser
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AccountUser
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML AccountUser(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface AccountUser extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccountUser.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("accountuserb430type");
    
    /**
     * Gets the "AccountUserID" element
     */
    int getAccountUserID();
    
    /**
     * Gets (as xml) the "AccountUserID" element
     */
    org.apache.xmlbeans.XmlInt xgetAccountUserID();
    
    /**
     * Tests for nil "AccountUserID" element
     */
    boolean isNilAccountUserID();
    
    /**
     * True if has "AccountUserID" element
     */
    boolean isSetAccountUserID();
    
    /**
     * Sets the "AccountUserID" element
     */
    void setAccountUserID(int accountUserID);
    
    /**
     * Sets (as xml) the "AccountUserID" element
     */
    void xsetAccountUserID(org.apache.xmlbeans.XmlInt accountUserID);
    
    /**
     * Nils the "AccountUserID" element
     */
    void setNilAccountUserID();
    
    /**
     * Unsets the "AccountUserID" element
     */
    void unsetAccountUserID();
    
    /**
     * Gets the "UserID" element
     */
    java.lang.String getUserID();
    
    /**
     * Gets (as xml) the "UserID" element
     */
    org.apache.xmlbeans.XmlString xgetUserID();
    
    /**
     * Sets the "UserID" element
     */
    void setUserID(java.lang.String userID);
    
    /**
     * Sets (as xml) the "UserID" element
     */
    void xsetUserID(org.apache.xmlbeans.XmlString userID);
    
    /**
     * Gets the "Password" element
     */
    java.lang.String getPassword();
    
    /**
     * Gets (as xml) the "Password" element
     */
    org.apache.xmlbeans.XmlString xgetPassword();
    
    /**
     * True if has "Password" element
     */
    boolean isSetPassword();
    
    /**
     * Sets the "Password" element
     */
    void setPassword(java.lang.String password);
    
    /**
     * Sets (as xml) the "Password" element
     */
    void xsetPassword(org.apache.xmlbeans.XmlString password);
    
    /**
     * Unsets the "Password" element
     */
    void unsetPassword();
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "Email" element
     */
    java.lang.String getEmail();
    
    /**
     * Gets (as xml) the "Email" element
     */
    org.apache.xmlbeans.XmlString xgetEmail();
    
    /**
     * Sets the "Email" element
     */
    void setEmail(java.lang.String email);
    
    /**
     * Sets (as xml) the "Email" element
     */
    void xsetEmail(org.apache.xmlbeans.XmlString email);
    
    /**
     * Gets the "MustChangePassword" element
     */
    boolean getMustChangePassword();
    
    /**
     * Gets (as xml) the "MustChangePassword" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMustChangePassword();
    
    /**
     * True if has "MustChangePassword" element
     */
    boolean isSetMustChangePassword();
    
    /**
     * Sets the "MustChangePassword" element
     */
    void setMustChangePassword(boolean mustChangePassword);
    
    /**
     * Sets (as xml) the "MustChangePassword" element
     */
    void xsetMustChangePassword(org.apache.xmlbeans.XmlBoolean mustChangePassword);
    
    /**
     * Unsets the "MustChangePassword" element
     */
    void unsetMustChangePassword();
    
    /**
     * Gets the "ActiveFlag" element
     */
    boolean getActiveFlag();
    
    /**
     * Gets (as xml) the "ActiveFlag" element
     */
    org.apache.xmlbeans.XmlBoolean xgetActiveFlag();
    
    /**
     * True if has "ActiveFlag" element
     */
    boolean isSetActiveFlag();
    
    /**
     * Sets the "ActiveFlag" element
     */
    void setActiveFlag(boolean activeFlag);
    
    /**
     * Sets (as xml) the "ActiveFlag" element
     */
    void xsetActiveFlag(org.apache.xmlbeans.XmlBoolean activeFlag);
    
    /**
     * Unsets the "ActiveFlag" element
     */
    void unsetActiveFlag();
    
    /**
     * Gets the "ChallengePhrase" element
     */
    java.lang.String getChallengePhrase();
    
    /**
     * Gets (as xml) the "ChallengePhrase" element
     */
    org.apache.xmlbeans.XmlString xgetChallengePhrase();
    
    /**
     * True if has "ChallengePhrase" element
     */
    boolean isSetChallengePhrase();
    
    /**
     * Sets the "ChallengePhrase" element
     */
    void setChallengePhrase(java.lang.String challengePhrase);
    
    /**
     * Sets (as xml) the "ChallengePhrase" element
     */
    void xsetChallengePhrase(org.apache.xmlbeans.XmlString challengePhrase);
    
    /**
     * Unsets the "ChallengePhrase" element
     */
    void unsetChallengePhrase();
    
    /**
     * Gets the "ChallengeAnswer" element
     */
    java.lang.String getChallengeAnswer();
    
    /**
     * Gets (as xml) the "ChallengeAnswer" element
     */
    org.apache.xmlbeans.XmlString xgetChallengeAnswer();
    
    /**
     * True if has "ChallengeAnswer" element
     */
    boolean isSetChallengeAnswer();
    
    /**
     * Sets the "ChallengeAnswer" element
     */
    void setChallengeAnswer(java.lang.String challengeAnswer);
    
    /**
     * Sets (as xml) the "ChallengeAnswer" element
     */
    void xsetChallengeAnswer(org.apache.xmlbeans.XmlString challengeAnswer);
    
    /**
     * Unsets the "ChallengeAnswer" element
     */
    void unsetChallengeAnswer();
    
    /**
     * Gets array of all "UserPermissions" elements
     */
    com.exacttarget.wsdl.partnerapi.UserAccess[] getUserPermissionsArray();
    
    /**
     * Gets ith "UserPermissions" element
     */
    com.exacttarget.wsdl.partnerapi.UserAccess getUserPermissionsArray(int i);
    
    /**
     * Tests for nil ith "UserPermissions" element
     */
    boolean isNilUserPermissionsArray(int i);
    
    /**
     * Returns number of "UserPermissions" element
     */
    int sizeOfUserPermissionsArray();
    
    /**
     * Sets array of all "UserPermissions" element
     */
    void setUserPermissionsArray(com.exacttarget.wsdl.partnerapi.UserAccess[] userPermissionsArray);
    
    /**
     * Sets ith "UserPermissions" element
     */
    void setUserPermissionsArray(int i, com.exacttarget.wsdl.partnerapi.UserAccess userPermissions);
    
    /**
     * Nils the ith "UserPermissions" element
     */
    void setNilUserPermissionsArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UserPermissions" element
     */
    com.exacttarget.wsdl.partnerapi.UserAccess insertNewUserPermissions(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UserPermissions" element
     */
    com.exacttarget.wsdl.partnerapi.UserAccess addNewUserPermissions();
    
    /**
     * Removes the ith "UserPermissions" element
     */
    void removeUserPermissions(int i);
    
    /**
     * Gets the "Delete" element
     */
    int getDelete();
    
    /**
     * Gets (as xml) the "Delete" element
     */
    org.apache.xmlbeans.XmlInt xgetDelete();
    
    /**
     * Sets the "Delete" element
     */
    void setDelete(int delete);
    
    /**
     * Sets (as xml) the "Delete" element
     */
    void xsetDelete(org.apache.xmlbeans.XmlInt delete);
    
    /**
     * Gets the "LastSuccessfulLogin" element
     */
    java.util.Calendar getLastSuccessfulLogin();
    
    /**
     * Gets (as xml) the "LastSuccessfulLogin" element
     */
    org.apache.xmlbeans.XmlDateTime xgetLastSuccessfulLogin();
    
    /**
     * True if has "LastSuccessfulLogin" element
     */
    boolean isSetLastSuccessfulLogin();
    
    /**
     * Sets the "LastSuccessfulLogin" element
     */
    void setLastSuccessfulLogin(java.util.Calendar lastSuccessfulLogin);
    
    /**
     * Sets (as xml) the "LastSuccessfulLogin" element
     */
    void xsetLastSuccessfulLogin(org.apache.xmlbeans.XmlDateTime lastSuccessfulLogin);
    
    /**
     * Unsets the "LastSuccessfulLogin" element
     */
    void unsetLastSuccessfulLogin();
    
    /**
     * Gets the "IsAPIUser" element
     */
    boolean getIsAPIUser();
    
    /**
     * Gets (as xml) the "IsAPIUser" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsAPIUser();
    
    /**
     * True if has "IsAPIUser" element
     */
    boolean isSetIsAPIUser();
    
    /**
     * Sets the "IsAPIUser" element
     */
    void setIsAPIUser(boolean isAPIUser);
    
    /**
     * Sets (as xml) the "IsAPIUser" element
     */
    void xsetIsAPIUser(org.apache.xmlbeans.XmlBoolean isAPIUser);
    
    /**
     * Unsets the "IsAPIUser" element
     */
    void unsetIsAPIUser();
    
    /**
     * Gets the "NotificationEmailAddress" element
     */
    java.lang.String getNotificationEmailAddress();
    
    /**
     * Gets (as xml) the "NotificationEmailAddress" element
     */
    org.apache.xmlbeans.XmlString xgetNotificationEmailAddress();
    
    /**
     * True if has "NotificationEmailAddress" element
     */
    boolean isSetNotificationEmailAddress();
    
    /**
     * Sets the "NotificationEmailAddress" element
     */
    void setNotificationEmailAddress(java.lang.String notificationEmailAddress);
    
    /**
     * Sets (as xml) the "NotificationEmailAddress" element
     */
    void xsetNotificationEmailAddress(org.apache.xmlbeans.XmlString notificationEmailAddress);
    
    /**
     * Unsets the "NotificationEmailAddress" element
     */
    void unsetNotificationEmailAddress();
    
    /**
     * Gets the "IsLocked" element
     */
    boolean getIsLocked();
    
    /**
     * Gets (as xml) the "IsLocked" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsLocked();
    
    /**
     * True if has "IsLocked" element
     */
    boolean isSetIsLocked();
    
    /**
     * Sets the "IsLocked" element
     */
    void setIsLocked(boolean isLocked);
    
    /**
     * Sets (as xml) the "IsLocked" element
     */
    void xsetIsLocked(org.apache.xmlbeans.XmlBoolean isLocked);
    
    /**
     * Unsets the "IsLocked" element
     */
    void unsetIsLocked();
    
    /**
     * Gets the "Unlock" element
     */
    boolean getUnlock();
    
    /**
     * Gets (as xml) the "Unlock" element
     */
    org.apache.xmlbeans.XmlBoolean xgetUnlock();
    
    /**
     * True if has "Unlock" element
     */
    boolean isSetUnlock();
    
    /**
     * Sets the "Unlock" element
     */
    void setUnlock(boolean unlock);
    
    /**
     * Sets (as xml) the "Unlock" element
     */
    void xsetUnlock(org.apache.xmlbeans.XmlBoolean unlock);
    
    /**
     * Unsets the "Unlock" element
     */
    void unsetUnlock();
    
    /**
     * Gets the "BusinessUnit" element
     */
    int getBusinessUnit();
    
    /**
     * Gets (as xml) the "BusinessUnit" element
     */
    org.apache.xmlbeans.XmlInt xgetBusinessUnit();
    
    /**
     * True if has "BusinessUnit" element
     */
    boolean isSetBusinessUnit();
    
    /**
     * Sets the "BusinessUnit" element
     */
    void setBusinessUnit(int businessUnit);
    
    /**
     * Sets (as xml) the "BusinessUnit" element
     */
    void xsetBusinessUnit(org.apache.xmlbeans.XmlInt businessUnit);
    
    /**
     * Unsets the "BusinessUnit" element
     */
    void unsetBusinessUnit();
    
    /**
     * Gets the "DefaultBusinessUnit" element
     */
    int getDefaultBusinessUnit();
    
    /**
     * Gets (as xml) the "DefaultBusinessUnit" element
     */
    org.apache.xmlbeans.XmlInt xgetDefaultBusinessUnit();
    
    /**
     * True if has "DefaultBusinessUnit" element
     */
    boolean isSetDefaultBusinessUnit();
    
    /**
     * Sets the "DefaultBusinessUnit" element
     */
    void setDefaultBusinessUnit(int defaultBusinessUnit);
    
    /**
     * Sets (as xml) the "DefaultBusinessUnit" element
     */
    void xsetDefaultBusinessUnit(org.apache.xmlbeans.XmlInt defaultBusinessUnit);
    
    /**
     * Unsets the "DefaultBusinessUnit" element
     */
    void unsetDefaultBusinessUnit();
    
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
     * Gets the "DefaultBusinessUnitObject" element
     */
    com.exacttarget.wsdl.partnerapi.BusinessUnit getDefaultBusinessUnitObject();
    
    /**
     * True if has "DefaultBusinessUnitObject" element
     */
    boolean isSetDefaultBusinessUnitObject();
    
    /**
     * Sets the "DefaultBusinessUnitObject" element
     */
    void setDefaultBusinessUnitObject(com.exacttarget.wsdl.partnerapi.BusinessUnit defaultBusinessUnitObject);
    
    /**
     * Appends and returns a new empty "DefaultBusinessUnitObject" element
     */
    com.exacttarget.wsdl.partnerapi.BusinessUnit addNewDefaultBusinessUnitObject();
    
    /**
     * Unsets the "DefaultBusinessUnitObject" element
     */
    void unsetDefaultBusinessUnitObject();
    
    /**
     * Gets the "AssociatedBusinessUnits" element
     */
    com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits getAssociatedBusinessUnits();
    
    /**
     * True if has "AssociatedBusinessUnits" element
     */
    boolean isSetAssociatedBusinessUnits();
    
    /**
     * Sets the "AssociatedBusinessUnits" element
     */
    void setAssociatedBusinessUnits(com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits associatedBusinessUnits);
    
    /**
     * Appends and returns a new empty "AssociatedBusinessUnits" element
     */
    com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits addNewAssociatedBusinessUnits();
    
    /**
     * Unsets the "AssociatedBusinessUnits" element
     */
    void unsetAssociatedBusinessUnits();
    
    /**
     * Gets the "Roles" element
     */
    com.exacttarget.wsdl.partnerapi.AccountUser.Roles getRoles();
    
    /**
     * True if has "Roles" element
     */
    boolean isSetRoles();
    
    /**
     * Sets the "Roles" element
     */
    void setRoles(com.exacttarget.wsdl.partnerapi.AccountUser.Roles roles);
    
    /**
     * Appends and returns a new empty "Roles" element
     */
    com.exacttarget.wsdl.partnerapi.AccountUser.Roles addNewRoles();
    
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
     * Gets the "SsoIdentities" element
     */
    com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities getSsoIdentities();
    
    /**
     * True if has "SsoIdentities" element
     */
    boolean isSetSsoIdentities();
    
    /**
     * Sets the "SsoIdentities" element
     */
    void setSsoIdentities(com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities ssoIdentities);
    
    /**
     * Appends and returns a new empty "SsoIdentities" element
     */
    com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities addNewSsoIdentities();
    
    /**
     * Unsets the "SsoIdentities" element
     */
    void unsetSsoIdentities();
    
    /**
     * An XML AssociatedBusinessUnits(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface AssociatedBusinessUnits extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssociatedBusinessUnits.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("associatedbusinessunits3adbelemtype");
        
        /**
         * Gets array of all "BusinessUnit" elements
         */
        com.exacttarget.wsdl.partnerapi.BusinessUnit[] getBusinessUnitArray();
        
        /**
         * Gets ith "BusinessUnit" element
         */
        com.exacttarget.wsdl.partnerapi.BusinessUnit getBusinessUnitArray(int i);
        
        /**
         * Returns number of "BusinessUnit" element
         */
        int sizeOfBusinessUnitArray();
        
        /**
         * Sets array of all "BusinessUnit" element
         */
        void setBusinessUnitArray(com.exacttarget.wsdl.partnerapi.BusinessUnit[] businessUnitArray);
        
        /**
         * Sets ith "BusinessUnit" element
         */
        void setBusinessUnitArray(int i, com.exacttarget.wsdl.partnerapi.BusinessUnit businessUnit);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BusinessUnit" element
         */
        com.exacttarget.wsdl.partnerapi.BusinessUnit insertNewBusinessUnit(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BusinessUnit" element
         */
        com.exacttarget.wsdl.partnerapi.BusinessUnit addNewBusinessUnit();
        
        /**
         * Removes the ith "BusinessUnit" element
         */
        void removeBusinessUnit(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits newInstance() {
              return (com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.AccountUser.AssociatedBusinessUnits) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Roles(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface Roles extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Roles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("roles12c7elemtype");
        
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
            public static com.exacttarget.wsdl.partnerapi.AccountUser.Roles newInstance() {
              return (com.exacttarget.wsdl.partnerapi.AccountUser.Roles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.AccountUser.Roles newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.AccountUser.Roles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SsoIdentities(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface SsoIdentities extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SsoIdentities.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("ssoidentitiesc8f9elemtype");
        
        /**
         * Gets array of all "SsoIdentity" elements
         */
        com.exacttarget.wsdl.partnerapi.SsoIdentity[] getSsoIdentityArray();
        
        /**
         * Gets ith "SsoIdentity" element
         */
        com.exacttarget.wsdl.partnerapi.SsoIdentity getSsoIdentityArray(int i);
        
        /**
         * Returns number of "SsoIdentity" element
         */
        int sizeOfSsoIdentityArray();
        
        /**
         * Sets array of all "SsoIdentity" element
         */
        void setSsoIdentityArray(com.exacttarget.wsdl.partnerapi.SsoIdentity[] ssoIdentityArray);
        
        /**
         * Sets ith "SsoIdentity" element
         */
        void setSsoIdentityArray(int i, com.exacttarget.wsdl.partnerapi.SsoIdentity ssoIdentity);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SsoIdentity" element
         */
        com.exacttarget.wsdl.partnerapi.SsoIdentity insertNewSsoIdentity(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SsoIdentity" element
         */
        com.exacttarget.wsdl.partnerapi.SsoIdentity addNewSsoIdentity();
        
        /**
         * Removes the ith "SsoIdentity" element
         */
        void removeSsoIdentity(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities newInstance() {
              return (com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.AccountUser.SsoIdentities) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.AccountUser newInstance() {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.AccountUser parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.AccountUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

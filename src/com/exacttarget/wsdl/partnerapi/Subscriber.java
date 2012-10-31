/*
 * XML Type:  Subscriber
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Subscriber
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML Subscriber(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface Subscriber extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Subscriber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("subscriberc7aetype");
    
    /**
     * Gets the "EmailAddress" element
     */
    java.lang.String getEmailAddress();
    
    /**
     * Gets (as xml) the "EmailAddress" element
     */
    org.apache.xmlbeans.XmlString xgetEmailAddress();
    
    /**
     * True if has "EmailAddress" element
     */
    boolean isSetEmailAddress();
    
    /**
     * Sets the "EmailAddress" element
     */
    void setEmailAddress(java.lang.String emailAddress);
    
    /**
     * Sets (as xml) the "EmailAddress" element
     */
    void xsetEmailAddress(org.apache.xmlbeans.XmlString emailAddress);
    
    /**
     * Unsets the "EmailAddress" element
     */
    void unsetEmailAddress();
    
    /**
     * Gets array of all "Attributes" elements
     */
    com.exacttarget.wsdl.partnerapi.Attribute[] getAttributesArray();
    
    /**
     * Gets ith "Attributes" element
     */
    com.exacttarget.wsdl.partnerapi.Attribute getAttributesArray(int i);
    
    /**
     * Returns number of "Attributes" element
     */
    int sizeOfAttributesArray();
    
    /**
     * Sets array of all "Attributes" element
     */
    void setAttributesArray(com.exacttarget.wsdl.partnerapi.Attribute[] attributesArray);
    
    /**
     * Sets ith "Attributes" element
     */
    void setAttributesArray(int i, com.exacttarget.wsdl.partnerapi.Attribute attributes);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attributes" element
     */
    com.exacttarget.wsdl.partnerapi.Attribute insertNewAttributes(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Attributes" element
     */
    com.exacttarget.wsdl.partnerapi.Attribute addNewAttributes();
    
    /**
     * Removes the ith "Attributes" element
     */
    void removeAttributes(int i);
    
    /**
     * Gets the "SubscriberKey" element
     */
    java.lang.String getSubscriberKey();
    
    /**
     * Gets (as xml) the "SubscriberKey" element
     */
    org.apache.xmlbeans.XmlString xgetSubscriberKey();
    
    /**
     * True if has "SubscriberKey" element
     */
    boolean isSetSubscriberKey();
    
    /**
     * Sets the "SubscriberKey" element
     */
    void setSubscriberKey(java.lang.String subscriberKey);
    
    /**
     * Sets (as xml) the "SubscriberKey" element
     */
    void xsetSubscriberKey(org.apache.xmlbeans.XmlString subscriberKey);
    
    /**
     * Unsets the "SubscriberKey" element
     */
    void unsetSubscriberKey();
    
    /**
     * Gets the "UnsubscribedDate" element
     */
    java.util.Calendar getUnsubscribedDate();
    
    /**
     * Gets (as xml) the "UnsubscribedDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetUnsubscribedDate();
    
    /**
     * True if has "UnsubscribedDate" element
     */
    boolean isSetUnsubscribedDate();
    
    /**
     * Sets the "UnsubscribedDate" element
     */
    void setUnsubscribedDate(java.util.Calendar unsubscribedDate);
    
    /**
     * Sets (as xml) the "UnsubscribedDate" element
     */
    void xsetUnsubscribedDate(org.apache.xmlbeans.XmlDateTime unsubscribedDate);
    
    /**
     * Unsets the "UnsubscribedDate" element
     */
    void unsetUnsubscribedDate();
    
    /**
     * Gets the "Status" element
     */
    com.exacttarget.wsdl.partnerapi.SubscriberStatus.Enum getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    com.exacttarget.wsdl.partnerapi.SubscriberStatus xgetStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(com.exacttarget.wsdl.partnerapi.SubscriberStatus.Enum status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(com.exacttarget.wsdl.partnerapi.SubscriberStatus status);
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "PartnerType" element
     */
    java.lang.String getPartnerType();
    
    /**
     * Gets (as xml) the "PartnerType" element
     */
    org.apache.xmlbeans.XmlString xgetPartnerType();
    
    /**
     * True if has "PartnerType" element
     */
    boolean isSetPartnerType();
    
    /**
     * Sets the "PartnerType" element
     */
    void setPartnerType(java.lang.String partnerType);
    
    /**
     * Sets (as xml) the "PartnerType" element
     */
    void xsetPartnerType(org.apache.xmlbeans.XmlString partnerType);
    
    /**
     * Unsets the "PartnerType" element
     */
    void unsetPartnerType();
    
    /**
     * Gets the "EmailTypePreference" element
     */
    com.exacttarget.wsdl.partnerapi.EmailType.Enum getEmailTypePreference();
    
    /**
     * Gets (as xml) the "EmailTypePreference" element
     */
    com.exacttarget.wsdl.partnerapi.EmailType xgetEmailTypePreference();
    
    /**
     * True if has "EmailTypePreference" element
     */
    boolean isSetEmailTypePreference();
    
    /**
     * Sets the "EmailTypePreference" element
     */
    void setEmailTypePreference(com.exacttarget.wsdl.partnerapi.EmailType.Enum emailTypePreference);
    
    /**
     * Sets (as xml) the "EmailTypePreference" element
     */
    void xsetEmailTypePreference(com.exacttarget.wsdl.partnerapi.EmailType emailTypePreference);
    
    /**
     * Unsets the "EmailTypePreference" element
     */
    void unsetEmailTypePreference();
    
    /**
     * Gets array of all "Lists" elements
     */
    com.exacttarget.wsdl.partnerapi.SubscriberList[] getListsArray();
    
    /**
     * Gets ith "Lists" element
     */
    com.exacttarget.wsdl.partnerapi.SubscriberList getListsArray(int i);
    
    /**
     * Returns number of "Lists" element
     */
    int sizeOfListsArray();
    
    /**
     * Sets array of all "Lists" element
     */
    void setListsArray(com.exacttarget.wsdl.partnerapi.SubscriberList[] listsArray);
    
    /**
     * Sets ith "Lists" element
     */
    void setListsArray(int i, com.exacttarget.wsdl.partnerapi.SubscriberList lists);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Lists" element
     */
    com.exacttarget.wsdl.partnerapi.SubscriberList insertNewLists(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Lists" element
     */
    com.exacttarget.wsdl.partnerapi.SubscriberList addNewLists();
    
    /**
     * Removes the ith "Lists" element
     */
    void removeLists(int i);
    
    /**
     * Gets the "GlobalUnsubscribeCategory" element
     */
    com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory getGlobalUnsubscribeCategory();
    
    /**
     * True if has "GlobalUnsubscribeCategory" element
     */
    boolean isSetGlobalUnsubscribeCategory();
    
    /**
     * Sets the "GlobalUnsubscribeCategory" element
     */
    void setGlobalUnsubscribeCategory(com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory globalUnsubscribeCategory);
    
    /**
     * Appends and returns a new empty "GlobalUnsubscribeCategory" element
     */
    com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory addNewGlobalUnsubscribeCategory();
    
    /**
     * Unsets the "GlobalUnsubscribeCategory" element
     */
    void unsetGlobalUnsubscribeCategory();
    
    /**
     * Gets the "SubscriberTypeDefinition" element
     */
    com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition getSubscriberTypeDefinition();
    
    /**
     * True if has "SubscriberTypeDefinition" element
     */
    boolean isSetSubscriberTypeDefinition();
    
    /**
     * Sets the "SubscriberTypeDefinition" element
     */
    void setSubscriberTypeDefinition(com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition subscriberTypeDefinition);
    
    /**
     * Appends and returns a new empty "SubscriberTypeDefinition" element
     */
    com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition addNewSubscriberTypeDefinition();
    
    /**
     * Unsets the "SubscriberTypeDefinition" element
     */
    void unsetSubscriberTypeDefinition();
    
    /**
     * Gets the "Addresses" element
     */
    com.exacttarget.wsdl.partnerapi.Subscriber.Addresses getAddresses();
    
    /**
     * True if has "Addresses" element
     */
    boolean isSetAddresses();
    
    /**
     * Sets the "Addresses" element
     */
    void setAddresses(com.exacttarget.wsdl.partnerapi.Subscriber.Addresses addresses);
    
    /**
     * Appends and returns a new empty "Addresses" element
     */
    com.exacttarget.wsdl.partnerapi.Subscriber.Addresses addNewAddresses();
    
    /**
     * Unsets the "Addresses" element
     */
    void unsetAddresses();
    
    /**
     * Gets the "PrimarySMSAddress" element
     */
    com.exacttarget.wsdl.partnerapi.SMSAddress getPrimarySMSAddress();
    
    /**
     * True if has "PrimarySMSAddress" element
     */
    boolean isSetPrimarySMSAddress();
    
    /**
     * Sets the "PrimarySMSAddress" element
     */
    void setPrimarySMSAddress(com.exacttarget.wsdl.partnerapi.SMSAddress primarySMSAddress);
    
    /**
     * Appends and returns a new empty "PrimarySMSAddress" element
     */
    com.exacttarget.wsdl.partnerapi.SMSAddress addNewPrimarySMSAddress();
    
    /**
     * Unsets the "PrimarySMSAddress" element
     */
    void unsetPrimarySMSAddress();
    
    /**
     * Gets the "PrimarySMSPublicationStatus" element
     */
    com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus.Enum getPrimarySMSPublicationStatus();
    
    /**
     * Gets (as xml) the "PrimarySMSPublicationStatus" element
     */
    com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus xgetPrimarySMSPublicationStatus();
    
    /**
     * True if has "PrimarySMSPublicationStatus" element
     */
    boolean isSetPrimarySMSPublicationStatus();
    
    /**
     * Sets the "PrimarySMSPublicationStatus" element
     */
    void setPrimarySMSPublicationStatus(com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus.Enum primarySMSPublicationStatus);
    
    /**
     * Sets (as xml) the "PrimarySMSPublicationStatus" element
     */
    void xsetPrimarySMSPublicationStatus(com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus primarySMSPublicationStatus);
    
    /**
     * Unsets the "PrimarySMSPublicationStatus" element
     */
    void unsetPrimarySMSPublicationStatus();
    
    /**
     * Gets the "PrimaryEmailAddress" element
     */
    com.exacttarget.wsdl.partnerapi.EmailAddress getPrimaryEmailAddress();
    
    /**
     * True if has "PrimaryEmailAddress" element
     */
    boolean isSetPrimaryEmailAddress();
    
    /**
     * Sets the "PrimaryEmailAddress" element
     */
    void setPrimaryEmailAddress(com.exacttarget.wsdl.partnerapi.EmailAddress primaryEmailAddress);
    
    /**
     * Appends and returns a new empty "PrimaryEmailAddress" element
     */
    com.exacttarget.wsdl.partnerapi.EmailAddress addNewPrimaryEmailAddress();
    
    /**
     * Unsets the "PrimaryEmailAddress" element
     */
    void unsetPrimaryEmailAddress();
    
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
     * An XML Addresses(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface Addresses extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Addresses.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("addresses0a9celemtype");
        
        /**
         * Gets array of all "Address" elements
         */
        com.exacttarget.wsdl.partnerapi.SubscriberAddress[] getAddressArray();
        
        /**
         * Gets ith "Address" element
         */
        com.exacttarget.wsdl.partnerapi.SubscriberAddress getAddressArray(int i);
        
        /**
         * Returns number of "Address" element
         */
        int sizeOfAddressArray();
        
        /**
         * Sets array of all "Address" element
         */
        void setAddressArray(com.exacttarget.wsdl.partnerapi.SubscriberAddress[] addressArray);
        
        /**
         * Sets ith "Address" element
         */
        void setAddressArray(int i, com.exacttarget.wsdl.partnerapi.SubscriberAddress address);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Address" element
         */
        com.exacttarget.wsdl.partnerapi.SubscriberAddress insertNewAddress(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Address" element
         */
        com.exacttarget.wsdl.partnerapi.SubscriberAddress addNewAddress();
        
        /**
         * Removes the ith "Address" element
         */
        void removeAddress(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.Subscriber.Addresses newInstance() {
              return (com.exacttarget.wsdl.partnerapi.Subscriber.Addresses) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.Subscriber.Addresses newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.Subscriber.Addresses) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.Subscriber newInstance() {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.Subscriber parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.Subscriber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

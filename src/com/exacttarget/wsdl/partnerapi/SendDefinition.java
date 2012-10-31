/*
 * XML Type:  SendDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SendDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface SendDefinition extends com.exacttarget.wsdl.partnerapi.InteractionDefinition
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("senddefinition6a3btype");
    
    /**
     * Gets the "CategoryID" element
     */
    int getCategoryID();
    
    /**
     * Gets (as xml) the "CategoryID" element
     */
    org.apache.xmlbeans.XmlInt xgetCategoryID();
    
    /**
     * True if has "CategoryID" element
     */
    boolean isSetCategoryID();
    
    /**
     * Sets the "CategoryID" element
     */
    void setCategoryID(int categoryID);
    
    /**
     * Sets (as xml) the "CategoryID" element
     */
    void xsetCategoryID(org.apache.xmlbeans.XmlInt categoryID);
    
    /**
     * Unsets the "CategoryID" element
     */
    void unsetCategoryID();
    
    /**
     * Gets the "SendClassification" element
     */
    com.exacttarget.wsdl.partnerapi.SendClassification getSendClassification();
    
    /**
     * True if has "SendClassification" element
     */
    boolean isSetSendClassification();
    
    /**
     * Sets the "SendClassification" element
     */
    void setSendClassification(com.exacttarget.wsdl.partnerapi.SendClassification sendClassification);
    
    /**
     * Appends and returns a new empty "SendClassification" element
     */
    com.exacttarget.wsdl.partnerapi.SendClassification addNewSendClassification();
    
    /**
     * Unsets the "SendClassification" element
     */
    void unsetSendClassification();
    
    /**
     * Gets the "SenderProfile" element
     */
    com.exacttarget.wsdl.partnerapi.SenderProfile getSenderProfile();
    
    /**
     * True if has "SenderProfile" element
     */
    boolean isSetSenderProfile();
    
    /**
     * Sets the "SenderProfile" element
     */
    void setSenderProfile(com.exacttarget.wsdl.partnerapi.SenderProfile senderProfile);
    
    /**
     * Appends and returns a new empty "SenderProfile" element
     */
    com.exacttarget.wsdl.partnerapi.SenderProfile addNewSenderProfile();
    
    /**
     * Unsets the "SenderProfile" element
     */
    void unsetSenderProfile();
    
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
     * Gets the "FromAddress" element
     */
    java.lang.String getFromAddress();
    
    /**
     * Gets (as xml) the "FromAddress" element
     */
    org.apache.xmlbeans.XmlString xgetFromAddress();
    
    /**
     * True if has "FromAddress" element
     */
    boolean isSetFromAddress();
    
    /**
     * Sets the "FromAddress" element
     */
    void setFromAddress(java.lang.String fromAddress);
    
    /**
     * Sets (as xml) the "FromAddress" element
     */
    void xsetFromAddress(org.apache.xmlbeans.XmlString fromAddress);
    
    /**
     * Unsets the "FromAddress" element
     */
    void unsetFromAddress();
    
    /**
     * Gets the "DeliveryProfile" element
     */
    com.exacttarget.wsdl.partnerapi.DeliveryProfile getDeliveryProfile();
    
    /**
     * True if has "DeliveryProfile" element
     */
    boolean isSetDeliveryProfile();
    
    /**
     * Sets the "DeliveryProfile" element
     */
    void setDeliveryProfile(com.exacttarget.wsdl.partnerapi.DeliveryProfile deliveryProfile);
    
    /**
     * Appends and returns a new empty "DeliveryProfile" element
     */
    com.exacttarget.wsdl.partnerapi.DeliveryProfile addNewDeliveryProfile();
    
    /**
     * Unsets the "DeliveryProfile" element
     */
    void unsetDeliveryProfile();
    
    /**
     * Gets the "SourceAddressType" element
     */
    com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum.Enum getSourceAddressType();
    
    /**
     * Gets (as xml) the "SourceAddressType" element
     */
    com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum xgetSourceAddressType();
    
    /**
     * True if has "SourceAddressType" element
     */
    boolean isSetSourceAddressType();
    
    /**
     * Sets the "SourceAddressType" element
     */
    void setSourceAddressType(com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum.Enum sourceAddressType);
    
    /**
     * Sets (as xml) the "SourceAddressType" element
     */
    void xsetSourceAddressType(com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum sourceAddressType);
    
    /**
     * Unsets the "SourceAddressType" element
     */
    void unsetSourceAddressType();
    
    /**
     * Gets the "PrivateIP" element
     */
    com.exacttarget.wsdl.partnerapi.PrivateIP getPrivateIP();
    
    /**
     * True if has "PrivateIP" element
     */
    boolean isSetPrivateIP();
    
    /**
     * Sets the "PrivateIP" element
     */
    void setPrivateIP(com.exacttarget.wsdl.partnerapi.PrivateIP privateIP);
    
    /**
     * Appends and returns a new empty "PrivateIP" element
     */
    com.exacttarget.wsdl.partnerapi.PrivateIP addNewPrivateIP();
    
    /**
     * Unsets the "PrivateIP" element
     */
    void unsetPrivateIP();
    
    /**
     * Gets the "DomainType" element
     */
    com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum.Enum getDomainType();
    
    /**
     * Gets (as xml) the "DomainType" element
     */
    com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum xgetDomainType();
    
    /**
     * True if has "DomainType" element
     */
    boolean isSetDomainType();
    
    /**
     * Sets the "DomainType" element
     */
    void setDomainType(com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum.Enum domainType);
    
    /**
     * Sets (as xml) the "DomainType" element
     */
    void xsetDomainType(com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum domainType);
    
    /**
     * Unsets the "DomainType" element
     */
    void unsetDomainType();
    
    /**
     * Gets the "PrivateDomain" element
     */
    com.exacttarget.wsdl.partnerapi.PrivateDomain getPrivateDomain();
    
    /**
     * True if has "PrivateDomain" element
     */
    boolean isSetPrivateDomain();
    
    /**
     * Sets the "PrivateDomain" element
     */
    void setPrivateDomain(com.exacttarget.wsdl.partnerapi.PrivateDomain privateDomain);
    
    /**
     * Appends and returns a new empty "PrivateDomain" element
     */
    com.exacttarget.wsdl.partnerapi.PrivateDomain addNewPrivateDomain();
    
    /**
     * Unsets the "PrivateDomain" element
     */
    void unsetPrivateDomain();
    
    /**
     * Gets the "HeaderSalutationSource" element
     */
    com.exacttarget.wsdl.partnerapi.SalutationSourceEnum.Enum getHeaderSalutationSource();
    
    /**
     * Gets (as xml) the "HeaderSalutationSource" element
     */
    com.exacttarget.wsdl.partnerapi.SalutationSourceEnum xgetHeaderSalutationSource();
    
    /**
     * True if has "HeaderSalutationSource" element
     */
    boolean isSetHeaderSalutationSource();
    
    /**
     * Sets the "HeaderSalutationSource" element
     */
    void setHeaderSalutationSource(com.exacttarget.wsdl.partnerapi.SalutationSourceEnum.Enum headerSalutationSource);
    
    /**
     * Sets (as xml) the "HeaderSalutationSource" element
     */
    void xsetHeaderSalutationSource(com.exacttarget.wsdl.partnerapi.SalutationSourceEnum headerSalutationSource);
    
    /**
     * Unsets the "HeaderSalutationSource" element
     */
    void unsetHeaderSalutationSource();
    
    /**
     * Gets the "HeaderContentArea" element
     */
    com.exacttarget.wsdl.partnerapi.ContentArea getHeaderContentArea();
    
    /**
     * True if has "HeaderContentArea" element
     */
    boolean isSetHeaderContentArea();
    
    /**
     * Sets the "HeaderContentArea" element
     */
    void setHeaderContentArea(com.exacttarget.wsdl.partnerapi.ContentArea headerContentArea);
    
    /**
     * Appends and returns a new empty "HeaderContentArea" element
     */
    com.exacttarget.wsdl.partnerapi.ContentArea addNewHeaderContentArea();
    
    /**
     * Unsets the "HeaderContentArea" element
     */
    void unsetHeaderContentArea();
    
    /**
     * Gets the "FooterSalutationSource" element
     */
    com.exacttarget.wsdl.partnerapi.SalutationSourceEnum.Enum getFooterSalutationSource();
    
    /**
     * Gets (as xml) the "FooterSalutationSource" element
     */
    com.exacttarget.wsdl.partnerapi.SalutationSourceEnum xgetFooterSalutationSource();
    
    /**
     * True if has "FooterSalutationSource" element
     */
    boolean isSetFooterSalutationSource();
    
    /**
     * Sets the "FooterSalutationSource" element
     */
    void setFooterSalutationSource(com.exacttarget.wsdl.partnerapi.SalutationSourceEnum.Enum footerSalutationSource);
    
    /**
     * Sets (as xml) the "FooterSalutationSource" element
     */
    void xsetFooterSalutationSource(com.exacttarget.wsdl.partnerapi.SalutationSourceEnum footerSalutationSource);
    
    /**
     * Unsets the "FooterSalutationSource" element
     */
    void unsetFooterSalutationSource();
    
    /**
     * Gets the "FooterContentArea" element
     */
    com.exacttarget.wsdl.partnerapi.ContentArea getFooterContentArea();
    
    /**
     * True if has "FooterContentArea" element
     */
    boolean isSetFooterContentArea();
    
    /**
     * Sets the "FooterContentArea" element
     */
    void setFooterContentArea(com.exacttarget.wsdl.partnerapi.ContentArea footerContentArea);
    
    /**
     * Appends and returns a new empty "FooterContentArea" element
     */
    com.exacttarget.wsdl.partnerapi.ContentArea addNewFooterContentArea();
    
    /**
     * Unsets the "FooterContentArea" element
     */
    void unsetFooterContentArea();
    
    /**
     * Gets the "SuppressTracking" element
     */
    boolean getSuppressTracking();
    
    /**
     * Gets (as xml) the "SuppressTracking" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSuppressTracking();
    
    /**
     * True if has "SuppressTracking" element
     */
    boolean isSetSuppressTracking();
    
    /**
     * Sets the "SuppressTracking" element
     */
    void setSuppressTracking(boolean suppressTracking);
    
    /**
     * Sets (as xml) the "SuppressTracking" element
     */
    void xsetSuppressTracking(org.apache.xmlbeans.XmlBoolean suppressTracking);
    
    /**
     * Unsets the "SuppressTracking" element
     */
    void unsetSuppressTracking();
    
    /**
     * Gets the "IsSendLogging" element
     */
    boolean getIsSendLogging();
    
    /**
     * Gets (as xml) the "IsSendLogging" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsSendLogging();
    
    /**
     * True if has "IsSendLogging" element
     */
    boolean isSetIsSendLogging();
    
    /**
     * Sets the "IsSendLogging" element
     */
    void setIsSendLogging(boolean isSendLogging);
    
    /**
     * Sets (as xml) the "IsSendLogging" element
     */
    void xsetIsSendLogging(org.apache.xmlbeans.XmlBoolean isSendLogging);
    
    /**
     * Unsets the "IsSendLogging" element
     */
    void unsetIsSendLogging();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SendDefinition newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SendDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

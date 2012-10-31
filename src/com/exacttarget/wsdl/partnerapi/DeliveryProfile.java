/*
 * XML Type:  DeliveryProfile
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DeliveryProfile
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML DeliveryProfile(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface DeliveryProfile extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeliveryProfile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("deliveryprofilec593type");
    
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
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
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
     * Gets the "SubscriberLevelPrivateDomain" element
     */
    boolean getSubscriberLevelPrivateDomain();
    
    /**
     * Gets (as xml) the "SubscriberLevelPrivateDomain" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSubscriberLevelPrivateDomain();
    
    /**
     * True if has "SubscriberLevelPrivateDomain" element
     */
    boolean isSetSubscriberLevelPrivateDomain();
    
    /**
     * Sets the "SubscriberLevelPrivateDomain" element
     */
    void setSubscriberLevelPrivateDomain(boolean subscriberLevelPrivateDomain);
    
    /**
     * Sets (as xml) the "SubscriberLevelPrivateDomain" element
     */
    void xsetSubscriberLevelPrivateDomain(org.apache.xmlbeans.XmlBoolean subscriberLevelPrivateDomain);
    
    /**
     * Unsets the "SubscriberLevelPrivateDomain" element
     */
    void unsetSubscriberLevelPrivateDomain();
    
    /**
     * Gets the "SMIMESignatureCertificate" element
     */
    com.exacttarget.wsdl.partnerapi.Certificate getSMIMESignatureCertificate();
    
    /**
     * True if has "SMIMESignatureCertificate" element
     */
    boolean isSetSMIMESignatureCertificate();
    
    /**
     * Sets the "SMIMESignatureCertificate" element
     */
    void setSMIMESignatureCertificate(com.exacttarget.wsdl.partnerapi.Certificate smimeSignatureCertificate);
    
    /**
     * Appends and returns a new empty "SMIMESignatureCertificate" element
     */
    com.exacttarget.wsdl.partnerapi.Certificate addNewSMIMESignatureCertificate();
    
    /**
     * Unsets the "SMIMESignatureCertificate" element
     */
    void unsetSMIMESignatureCertificate();
    
    /**
     * Gets the "PrivateDomainSet" element
     */
    com.exacttarget.wsdl.partnerapi.PrivateDomainSet getPrivateDomainSet();
    
    /**
     * True if has "PrivateDomainSet" element
     */
    boolean isSetPrivateDomainSet();
    
    /**
     * Sets the "PrivateDomainSet" element
     */
    void setPrivateDomainSet(com.exacttarget.wsdl.partnerapi.PrivateDomainSet privateDomainSet);
    
    /**
     * Appends and returns a new empty "PrivateDomainSet" element
     */
    com.exacttarget.wsdl.partnerapi.PrivateDomainSet addNewPrivateDomainSet();
    
    /**
     * Unsets the "PrivateDomainSet" element
     */
    void unsetPrivateDomainSet();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile newInstance() {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.DeliveryProfile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.DeliveryProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

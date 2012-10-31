/*
 * XML Type:  BusinessUnit
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.BusinessUnit
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML BusinessUnit(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface BusinessUnit extends com.exacttarget.wsdl.partnerapi.Account
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BusinessUnit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("businessunitb972type");
    
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
     * Gets the "DefaultSendClassification" element
     */
    com.exacttarget.wsdl.partnerapi.SendClassification getDefaultSendClassification();
    
    /**
     * True if has "DefaultSendClassification" element
     */
    boolean isSetDefaultSendClassification();
    
    /**
     * Sets the "DefaultSendClassification" element
     */
    void setDefaultSendClassification(com.exacttarget.wsdl.partnerapi.SendClassification defaultSendClassification);
    
    /**
     * Appends and returns a new empty "DefaultSendClassification" element
     */
    com.exacttarget.wsdl.partnerapi.SendClassification addNewDefaultSendClassification();
    
    /**
     * Unsets the "DefaultSendClassification" element
     */
    void unsetDefaultSendClassification();
    
    /**
     * Gets the "DefaultHomePage" element
     */
    com.exacttarget.wsdl.partnerapi.LandingPage getDefaultHomePage();
    
    /**
     * True if has "DefaultHomePage" element
     */
    boolean isSetDefaultHomePage();
    
    /**
     * Sets the "DefaultHomePage" element
     */
    void setDefaultHomePage(com.exacttarget.wsdl.partnerapi.LandingPage defaultHomePage);
    
    /**
     * Appends and returns a new empty "DefaultHomePage" element
     */
    com.exacttarget.wsdl.partnerapi.LandingPage addNewDefaultHomePage();
    
    /**
     * Unsets the "DefaultHomePage" element
     */
    void unsetDefaultHomePage();
    
    /**
     * Gets the "SubscriberFilter" element
     */
    com.exacttarget.wsdl.partnerapi.FilterPart getSubscriberFilter();
    
    /**
     * True if has "SubscriberFilter" element
     */
    boolean isSetSubscriberFilter();
    
    /**
     * Sets the "SubscriberFilter" element
     */
    void setSubscriberFilter(com.exacttarget.wsdl.partnerapi.FilterPart subscriberFilter);
    
    /**
     * Appends and returns a new empty "SubscriberFilter" element
     */
    com.exacttarget.wsdl.partnerapi.FilterPart addNewSubscriberFilter();
    
    /**
     * Unsets the "SubscriberFilter" element
     */
    void unsetSubscriberFilter();
    
    /**
     * Gets the "MasterUnsubscribeBehavior" element
     */
    com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum.Enum getMasterUnsubscribeBehavior();
    
    /**
     * Gets (as xml) the "MasterUnsubscribeBehavior" element
     */
    com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum xgetMasterUnsubscribeBehavior();
    
    /**
     * True if has "MasterUnsubscribeBehavior" element
     */
    boolean isSetMasterUnsubscribeBehavior();
    
    /**
     * Sets the "MasterUnsubscribeBehavior" element
     */
    void setMasterUnsubscribeBehavior(com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum.Enum masterUnsubscribeBehavior);
    
    /**
     * Sets (as xml) the "MasterUnsubscribeBehavior" element
     */
    void xsetMasterUnsubscribeBehavior(com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum masterUnsubscribeBehavior);
    
    /**
     * Unsets the "MasterUnsubscribeBehavior" element
     */
    void unsetMasterUnsubscribeBehavior();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit newInstance() {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.BusinessUnit parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.BusinessUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

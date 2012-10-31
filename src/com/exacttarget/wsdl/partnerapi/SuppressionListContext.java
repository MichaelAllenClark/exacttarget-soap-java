/*
 * XML Type:  SuppressionListContext
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SuppressionListContext
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SuppressionListContext(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface SuppressionListContext extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SuppressionListContext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("suppressionlistcontextdcd8type");
    
    /**
     * Gets the "Context" element
     */
    com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum.Enum getContext();
    
    /**
     * Gets (as xml) the "Context" element
     */
    com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum xgetContext();
    
    /**
     * True if has "Context" element
     */
    boolean isSetContext();
    
    /**
     * Sets the "Context" element
     */
    void setContext(com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum.Enum context);
    
    /**
     * Sets (as xml) the "Context" element
     */
    void xsetContext(com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum context);
    
    /**
     * Unsets the "Context" element
     */
    void unsetContext();
    
    /**
     * Gets the "SendClassificationType" element
     */
    com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum.Enum getSendClassificationType();
    
    /**
     * Gets (as xml) the "SendClassificationType" element
     */
    com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum xgetSendClassificationType();
    
    /**
     * True if has "SendClassificationType" element
     */
    boolean isSetSendClassificationType();
    
    /**
     * Sets the "SendClassificationType" element
     */
    void setSendClassificationType(com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum.Enum sendClassificationType);
    
    /**
     * Sets (as xml) the "SendClassificationType" element
     */
    void xsetSendClassificationType(com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum sendClassificationType);
    
    /**
     * Unsets the "SendClassificationType" element
     */
    void unsetSendClassificationType();
    
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
     * Gets the "Send" element
     */
    com.exacttarget.wsdl.partnerapi.Send getSend();
    
    /**
     * True if has "Send" element
     */
    boolean isSetSend();
    
    /**
     * Sets the "Send" element
     */
    void setSend(com.exacttarget.wsdl.partnerapi.Send send);
    
    /**
     * Appends and returns a new empty "Send" element
     */
    com.exacttarget.wsdl.partnerapi.Send addNewSend();
    
    /**
     * Unsets the "Send" element
     */
    void unsetSend();
    
    /**
     * Gets the "Definition" element
     */
    com.exacttarget.wsdl.partnerapi.SuppressionListDefinition getDefinition();
    
    /**
     * True if has "Definition" element
     */
    boolean isSetDefinition();
    
    /**
     * Sets the "Definition" element
     */
    void setDefinition(com.exacttarget.wsdl.partnerapi.SuppressionListDefinition definition);
    
    /**
     * Appends and returns a new empty "Definition" element
     */
    com.exacttarget.wsdl.partnerapi.SuppressionListDefinition addNewDefinition();
    
    /**
     * Unsets the "Definition" element
     */
    void unsetDefinition();
    
    /**
     * Gets the "AppliesToAllSends" element
     */
    boolean getAppliesToAllSends();
    
    /**
     * Gets (as xml) the "AppliesToAllSends" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAppliesToAllSends();
    
    /**
     * True if has "AppliesToAllSends" element
     */
    boolean isSetAppliesToAllSends();
    
    /**
     * Sets the "AppliesToAllSends" element
     */
    void setAppliesToAllSends(boolean appliesToAllSends);
    
    /**
     * Sets (as xml) the "AppliesToAllSends" element
     */
    void xsetAppliesToAllSends(org.apache.xmlbeans.XmlBoolean appliesToAllSends);
    
    /**
     * Unsets the "AppliesToAllSends" element
     */
    void unsetAppliesToAllSends();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SuppressionListContext parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

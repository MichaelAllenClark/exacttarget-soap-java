/*
 * XML Type:  ContentArea
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ContentArea
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML ContentArea(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface ContentArea extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContentArea.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("contentarea3762type");
    
    /**
     * Gets the "Key" element
     */
    java.lang.String getKey();
    
    /**
     * Gets (as xml) the "Key" element
     */
    org.apache.xmlbeans.XmlString xgetKey();
    
    /**
     * True if has "Key" element
     */
    boolean isSetKey();
    
    /**
     * Sets the "Key" element
     */
    void setKey(java.lang.String key);
    
    /**
     * Sets (as xml) the "Key" element
     */
    void xsetKey(org.apache.xmlbeans.XmlString key);
    
    /**
     * Unsets the "Key" element
     */
    void unsetKey();
    
    /**
     * Gets the "Content" element
     */
    java.lang.String getContent();
    
    /**
     * Gets (as xml) the "Content" element
     */
    org.apache.xmlbeans.XmlString xgetContent();
    
    /**
     * True if has "Content" element
     */
    boolean isSetContent();
    
    /**
     * Sets the "Content" element
     */
    void setContent(java.lang.String content);
    
    /**
     * Sets (as xml) the "Content" element
     */
    void xsetContent(org.apache.xmlbeans.XmlString content);
    
    /**
     * Unsets the "Content" element
     */
    void unsetContent();
    
    /**
     * Gets the "IsBlank" element
     */
    boolean getIsBlank();
    
    /**
     * Gets (as xml) the "IsBlank" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsBlank();
    
    /**
     * True if has "IsBlank" element
     */
    boolean isSetIsBlank();
    
    /**
     * Sets the "IsBlank" element
     */
    void setIsBlank(boolean isBlank);
    
    /**
     * Sets (as xml) the "IsBlank" element
     */
    void xsetIsBlank(org.apache.xmlbeans.XmlBoolean isBlank);
    
    /**
     * Unsets the "IsBlank" element
     */
    void unsetIsBlank();
    
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
     * Gets the "Layout" element
     */
    com.exacttarget.wsdl.partnerapi.LayoutType.Enum getLayout();
    
    /**
     * Gets (as xml) the "Layout" element
     */
    com.exacttarget.wsdl.partnerapi.LayoutType xgetLayout();
    
    /**
     * True if has "Layout" element
     */
    boolean isSetLayout();
    
    /**
     * Sets the "Layout" element
     */
    void setLayout(com.exacttarget.wsdl.partnerapi.LayoutType.Enum layout);
    
    /**
     * Sets (as xml) the "Layout" element
     */
    void xsetLayout(com.exacttarget.wsdl.partnerapi.LayoutType layout);
    
    /**
     * Unsets the "Layout" element
     */
    void unsetLayout();
    
    /**
     * Gets the "IsDynamicContent" element
     */
    boolean getIsDynamicContent();
    
    /**
     * Gets (as xml) the "IsDynamicContent" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsDynamicContent();
    
    /**
     * True if has "IsDynamicContent" element
     */
    boolean isSetIsDynamicContent();
    
    /**
     * Sets the "IsDynamicContent" element
     */
    void setIsDynamicContent(boolean isDynamicContent);
    
    /**
     * Sets (as xml) the "IsDynamicContent" element
     */
    void xsetIsDynamicContent(org.apache.xmlbeans.XmlBoolean isDynamicContent);
    
    /**
     * Unsets the "IsDynamicContent" element
     */
    void unsetIsDynamicContent();
    
    /**
     * Gets the "IsSurvey" element
     */
    boolean getIsSurvey();
    
    /**
     * Gets (as xml) the "IsSurvey" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsSurvey();
    
    /**
     * True if has "IsSurvey" element
     */
    boolean isSetIsSurvey();
    
    /**
     * Sets the "IsSurvey" element
     */
    void setIsSurvey(boolean isSurvey);
    
    /**
     * Sets (as xml) the "IsSurvey" element
     */
    void xsetIsSurvey(org.apache.xmlbeans.XmlBoolean isSurvey);
    
    /**
     * Unsets the "IsSurvey" element
     */
    void unsetIsSurvey();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ContentArea newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ContentArea parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ContentArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

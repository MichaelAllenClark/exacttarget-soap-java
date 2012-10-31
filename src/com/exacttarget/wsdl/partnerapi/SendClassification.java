/*
 * XML Type:  SendClassification
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendClassification
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SendClassification(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface SendClassification extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendClassification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("sendclassification2cc8type");
    
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
     * Gets the "HonorPublicationListOptOutsForTransactionalSends" element
     */
    boolean getHonorPublicationListOptOutsForTransactionalSends();
    
    /**
     * Gets (as xml) the "HonorPublicationListOptOutsForTransactionalSends" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHonorPublicationListOptOutsForTransactionalSends();
    
    /**
     * True if has "HonorPublicationListOptOutsForTransactionalSends" element
     */
    boolean isSetHonorPublicationListOptOutsForTransactionalSends();
    
    /**
     * Sets the "HonorPublicationListOptOutsForTransactionalSends" element
     */
    void setHonorPublicationListOptOutsForTransactionalSends(boolean honorPublicationListOptOutsForTransactionalSends);
    
    /**
     * Sets (as xml) the "HonorPublicationListOptOutsForTransactionalSends" element
     */
    void xsetHonorPublicationListOptOutsForTransactionalSends(org.apache.xmlbeans.XmlBoolean honorPublicationListOptOutsForTransactionalSends);
    
    /**
     * Unsets the "HonorPublicationListOptOutsForTransactionalSends" element
     */
    void unsetHonorPublicationListOptOutsForTransactionalSends();
    
    /**
     * Gets the "SendPriority" element
     */
    com.exacttarget.wsdl.partnerapi.SendPriorityEnum.Enum getSendPriority();
    
    /**
     * Gets (as xml) the "SendPriority" element
     */
    com.exacttarget.wsdl.partnerapi.SendPriorityEnum xgetSendPriority();
    
    /**
     * True if has "SendPriority" element
     */
    boolean isSetSendPriority();
    
    /**
     * Sets the "SendPriority" element
     */
    void setSendPriority(com.exacttarget.wsdl.partnerapi.SendPriorityEnum.Enum sendPriority);
    
    /**
     * Sets (as xml) the "SendPriority" element
     */
    void xsetSendPriority(com.exacttarget.wsdl.partnerapi.SendPriorityEnum sendPriority);
    
    /**
     * Unsets the "SendPriority" element
     */
    void unsetSendPriority();
    
    /**
     * Gets the "ArchiveEmail" element
     */
    boolean getArchiveEmail();
    
    /**
     * Gets (as xml) the "ArchiveEmail" element
     */
    org.apache.xmlbeans.XmlBoolean xgetArchiveEmail();
    
    /**
     * True if has "ArchiveEmail" element
     */
    boolean isSetArchiveEmail();
    
    /**
     * Sets the "ArchiveEmail" element
     */
    void setArchiveEmail(boolean archiveEmail);
    
    /**
     * Sets (as xml) the "ArchiveEmail" element
     */
    void xsetArchiveEmail(org.apache.xmlbeans.XmlBoolean archiveEmail);
    
    /**
     * Unsets the "ArchiveEmail" element
     */
    void unsetArchiveEmail();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SendClassification newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SendClassification parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SendClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

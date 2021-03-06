//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.07 at 11:14:55 AM PKT 
//


package com.example.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.coversion.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Orders_QNAME = new QName("http://www.deichmann.com/xml/hybris/4.1/impex", "orders");
    private final static QName _Order_QNAME = new QName("http://www.deichmann.com/xml/hybris/4.1/impex", "order");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.coversion.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.example.entity.ImportOrdersData }
     * 
     */
    public com.example.entity.ImportOrdersData createImportOrdersData() {
        return new com.example.entity.ImportOrdersData();
    }

    /**
     * Create an instance of {@link com.example.entity.ImportOrderData }
     * 
     */
    public com.example.entity.ImportOrderData createImportOrderData() {
        return new com.example.entity.ImportOrderData();
    }

    /**
     * Create an instance of {@link ImportOrderEntriesData }
     * 
     */
    public ImportOrderEntriesData createImportOrderEntriesData() {
        return new ImportOrderEntriesData();
    }

    /**
     * Create an instance of {@link ImportOrderEntryData }
     * 
     */
    public ImportOrderEntryData createImportOrderEntryData() {
        return new ImportOrderEntryData();
    }

    /**
     * Create an instance of {@link PositionReturnStatusData }
     * 
     */
    public PositionReturnStatusData createPositionReturnStatusData() {
        return new PositionReturnStatusData();
    }

    /**
     * Create an instance of {@link OrderPaymentStatusData }
     * 
     */
    public OrderPaymentStatusData createOrderPaymentStatusData() {
        return new OrderPaymentStatusData();
    }

    /**
     * Create an instance of {@link ConsignmentsData }
     * 
     */
    public ConsignmentsData createConsignmentsData() {
        return new ConsignmentsData();
    }

    /**
     * Create an instance of {@link com.example.entity.OrderMetaStatusData }
     * 
     */
    public com.example.entity.OrderMetaStatusData createOrderMetaStatusData() {
        return new com.example.entity.OrderMetaStatusData();
    }

    /**
     * Create an instance of {@link com.example.entity.ConsignmentData }
     * 
     */
    public com.example.entity.ConsignmentData createConsignmentData() {
        return new com.example.entity.ConsignmentData();
    }

    /**
     * Create an instance of {@link OrderDeliveryStatusData }
     * 
     */
    public OrderDeliveryStatusData createOrderDeliveryStatusData() {
        return new OrderDeliveryStatusData();
    }

    /**
     * Create an instance of {@link PositionMetaStatusData }
     * 
     */
    public PositionMetaStatusData createPositionMetaStatusData() {
        return new PositionMetaStatusData();
    }

    /**
     * Create an instance of {@link OrderShippingStatusData }
     * 
     */
    public OrderShippingStatusData createOrderShippingStatusData() {
        return new OrderShippingStatusData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.example.entity.ImportOrdersData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.deichmann.com/xml/hybris/4.1/impex", name = "orders")
    public JAXBElement<com.example.entity.ImportOrdersData> createOrders(com.example.entity.ImportOrdersData value) {
        return new JAXBElement<com.example.entity.ImportOrdersData>(_Orders_QNAME, com.example.entity.ImportOrdersData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.example.entity.ImportOrderData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.deichmann.com/xml/hybris/4.1/impex", name = "order")
    public JAXBElement<com.example.entity.ImportOrderData> createOrder(com.example.entity.ImportOrderData value) {
        return new JAXBElement<com.example.entity.ImportOrderData>(_Order_QNAME, com.example.entity.ImportOrderData.class, null, value);
    }

}

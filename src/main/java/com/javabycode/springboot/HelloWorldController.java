package com.javabycode.springboot;

import java.io.FileOutputStream;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.ConsignmentData;
import com.example.entity.ConsignmentsData;
import com.example.entity.ImportOrderData;
import com.example.entity.ImportOrderEntriesData;
import com.example.entity.ImportOrderEntryData;
import com.example.entity.ImportOrdersData;
import com.example.entity.ObjectFactory;
import com.example.entity.OrderDeliveryStatusData;
import com.example.entity.OrderMetaStatusData;
import com.example.entity.OrderPaymentStatusData;
import com.example.entity.OrderShippingStatusData;
import com.example.entity.PositionMetaStatusData;
import com.example.entity.PositionReturnStatusData;
import java.io.FileWriter;
@Controller
public class HelloWorldController {
    //@RequestMapping("/hello")
	@CrossOrigin(origins = {"*"})
	@RequestMapping(value = "/updateDeliveryStatus",params = { "infoCode", "deliveryStatus" }, method = RequestMethod.POST, headers = "Accept=application/json")
   // public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
	public ResponseEntity<String> validateUser(@RequestParam( value="infoCode",  required=true ) int infoCode, 
			@RequestParam( value="deliveryStatus",   required = true ) String deliveryStatus){
        
        String message="You just create Spring Boot Example successfully";
      
        try {


            ObjectFactory objectFactory = new ObjectFactory();

            PositionMetaStatusData positionMetaStatusData = objectFactory.createPositionMetaStatusData();
            // set values
            positionMetaStatusData.setDate(null);
            positionMetaStatusData.setValue("Position Meta Status");


            PositionReturnStatusData positionReturnStatusData = objectFactory.createPositionReturnStatusData();
            // set values
            positionReturnStatusData.setDate(null);
            positionMetaStatusData.setValue("Position Return Status");


            OrderShippingStatusData orderShippingStatusData = objectFactory.createOrderShippingStatusData();
            //set values
            orderShippingStatusData.setDate(null);
            orderShippingStatusData.setValue("Order Shipping Status");


            OrderPaymentStatusData orderPaymentStatusData = objectFactory.createOrderPaymentStatusData();
            // set values
            orderPaymentStatusData.setDate(null);
            orderPaymentStatusData.setValue("Order Payment Status");


            OrderMetaStatusData orderMetaStatusData = objectFactory.createOrderMetaStatusData();
            // set values
            orderMetaStatusData.setDate(null);
            orderMetaStatusData.setValue("Order Meta Status");


            OrderDeliveryStatusData orderDeliveryStatusData = objectFactory.createOrderDeliveryStatusData();
            // set values
            orderDeliveryStatusData.setDeliveryNo("1");
            orderDeliveryStatusData.setDate(null);
            orderDeliveryStatusData.setExpectedDeliveryDate(null);
            orderDeliveryStatusData.setValue(deliveryStatus);

            //infocode
            orderDeliveryStatusData.setInfoCode(infoCode);


            // Create Consignment Data Object
            ConsignmentData consignmentData1 = objectFactory.createConsignmentData();
            // Set Values Here
            consignmentData1.setDeliveryStatus(orderDeliveryStatusData);
            consignmentData1.setRefId("Ref: 1");
            consignmentData1.setTrackingNumber("Track:01");

            // Create Consignment Data Object
            ConsignmentData consignmentData2 = objectFactory.createConsignmentData();;
            //Set Values
            consignmentData2.setDeliveryStatus(orderDeliveryStatusData);
            consignmentData2.setRefId("Ref: 2");
            consignmentData2.setTrackingNumber("Track:02");

            // Create Consignment Data Object
            ConsignmentData consignmentData3 = objectFactory.createConsignmentData();;
            //Set Values
            consignmentData3.setDeliveryStatus(orderDeliveryStatusData);
            consignmentData3.setRefId("Ref:3");
            consignmentData3.setTrackingNumber("Track:03");

            List<ConsignmentData> consignmentDataList = new ArrayList<>();
            consignmentDataList.add(consignmentData1);
            consignmentDataList.add(consignmentData2);
            consignmentDataList.add(consignmentData3);

            JAXBContext consignmentsDataObject = JAXBContext.newInstance(ConsignmentsData.class);
            Marshaller consignmentsDataObjectMarshaller = consignmentsDataObject.createMarshaller();
            consignmentsDataObjectMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            // Create Consignments Data Object
            ConsignmentsData consignmentsData = objectFactory.createConsignmentsData();
            // Set Values Here
            consignmentsData.setConsignment(consignmentDataList);
            //write
            consignmentsDataObjectMarshaller.marshal(consignmentsData, new FileOutputStream("consignments-data.xml"));


            ImportOrderEntryData importOrderEntryData1 = objectFactory.createImportOrderEntryData();
            // set values
            importOrderEntryData1.setEntrynumber(1);
            importOrderEntryData1.setMetaStatus(positionMetaStatusData);
            importOrderEntryData1.setReturnStatus(positionReturnStatusData);

            ImportOrderEntryData importOrderEntryData2 = objectFactory.createImportOrderEntryData();
            // set values
            importOrderEntryData2.setEntrynumber(2);
            importOrderEntryData2.setMetaStatus(positionMetaStatusData);
            importOrderEntryData2.setReturnStatus(positionReturnStatusData);

            List<ImportOrderEntryData> importOrderEntryDataList = new ArrayList<>();
            importOrderEntryDataList.add(importOrderEntryData1);
            importOrderEntryDataList.add(importOrderEntryData2);

            JAXBContext importOrderEntriesDataObject = JAXBContext.newInstance(ImportOrderEntriesData.class);
            Marshaller importOrderEntriesDataObjectMarshaller = importOrderEntriesDataObject.createMarshaller();
            importOrderEntriesDataObjectMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            ImportOrderEntriesData importOrderEntriesData = objectFactory.createImportOrderEntriesData();
            // set values
            importOrderEntriesData.setOrderEntry(importOrderEntryDataList);
            // write to file
            importOrderEntriesDataObjectMarshaller.marshal(importOrderEntriesData, new FileOutputStream("import-order-entries-data.xml"));



            JAXBContext importOrdersDataObject = JAXBContext.newInstance(ImportOrdersData.class);
            Marshaller importOrdersDataObjectMarshaller = importOrdersDataObject.createMarshaller();
            importOrdersDataObjectMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Create Object
            ImportOrderData importOrderData1 = objectFactory.createImportOrderData();
            // Set Values here
            importOrderData1.setMetaStatus(orderMetaStatusData);
            importOrderData1.setDeliveryStatus(orderDeliveryStatusData);
            importOrderData1.setOrderEntries(importOrderEntriesData);
            importOrderData1.setCode("101");
            importOrderData1.setConsignments(consignmentsData);
            importOrderData1.setPaymentStatus(orderPaymentStatusData);
            importOrderData1.setShippingStatus(orderShippingStatusData);

            // Create Object
            ImportOrderData importOrderData2 = objectFactory.createImportOrderData();
            // Set Values here

            importOrderData2.setMetaStatus(orderMetaStatusData);
            importOrderData2.setDeliveryStatus(orderDeliveryStatusData);
            importOrderData2.setOrderEntries(importOrderEntriesData);
            importOrderData2.setCode("102");
            importOrderData2.setConsignments(consignmentsData);
            importOrderData2.setPaymentStatus(orderPaymentStatusData);
            importOrderData2.setShippingStatus(orderShippingStatusData);


            List<ImportOrderData> importOrderDataList = new ArrayList<>();
            importOrderDataList.add(importOrderData1);
            importOrderDataList.add(importOrderData2);

            // Create Object
            ImportOrdersData importOrdersData = objectFactory.createImportOrdersData();
            //set values
            importOrdersData.setOrder(importOrderDataList);
            // write to file
            importOrdersDataObjectMarshaller.marshal(importOrdersData,new FileWriter("D:\\logs\\import-orders-data.xml"));

        } catch(Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.OK).body("Success");
      //  return "hello";
    }
}

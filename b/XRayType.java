package demo.spring.service;
import javax.activation.DataHandler;
@javax.xml.bind.annotation.XmlType
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class XRayType {
	protected String patientName;
	protected int patientNumber;
	@javax.xml.bind.annotation.XmlMimeType("application/octet-stream")
	protected DataHandler imageData;
	public String getPatientName() {return patientName;}
	public void setPatientName(String patientName) {this.patientName = patientName;}
	public int getPatientNumber() {return patientNumber;}
	public void setPatientNumber(int patientNumber) {this.patientNumber = patientNumber;}
	public DataHandler getImageData() {return imageData;}
	public void setImageData(DataHandler imageData) {this.imageData = imageData;}
}
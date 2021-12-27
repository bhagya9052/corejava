package com.xworkz.dec26;



import com.xworkz.dec26.dao.TraineeOperation;
import com.xworkz.dec26.dto.AdressDTO;
import com.xworkz.dec26.dto.AreaDTO;
import com.xworkz.dec26.dto.DistrictDTO;
import com.xworkz.dec26.dto.StateDTO;
import com.xworkz.dec26.dto.TalukDTO;
import com.xworkz.dec26.dto.TraineeDetails;

public class TestTraineeDetails {
	public static void main(String[] args) {
		
		TraineeDetails traineedetail = new TraineeDetails();
		TraineeDetails traineedetail1 = new TraineeDetails();
		TraineeDetails traineedetail2 = new TraineeDetails();
		traineedetail.setName("Bhagya");
		traineedetail.setContactno(914856790);
		traineedetail.setEmail("bhagyaryalagi@gmail.com");
		
		traineedetail1.setName("Bitsy");
		traineedetail1.setContactno(914845691);
		traineedetail1.setEmail("bitsyxworkz@gmail.com");
		
		traineedetail2.setName("kavya");
		traineedetail2.setContactno(8547555555l);
		traineedetail2.setEmail("kavyaxworkz@gmail.com");
		
		AdressDTO adress = new AdressDTO();
		AdressDTO adress1 = new AdressDTO();
		AdressDTO adress2 = new AdressDTO();
		adress.setBuildingName("Bagalkot");
		adress1.setBuildingName("bijapur");
		adress2.setBuildingName("Banglore");
		
		traineedetail.setAdress(adress);
		traineedetail1.setAdress(adress1);
		traineedetail2.setAdress(adress2);
		
		AreaDTO area = new AreaDTO();
		AreaDTO area1 = new AreaDTO();
		AreaDTO area2 = new AreaDTO();
		area.setAreaName("Vijaynagar");
		area1.setAreaName("Rajajinagar");
		area2.setAreaName("BDA");
		
		adress.setArea(area);
		adress1.setArea(area1);
		adress2.setArea(area2);
		
		DistrictDTO district = new DistrictDTO();
		DistrictDTO district1 = new DistrictDTO();
		DistrictDTO district2 = new DistrictDTO();
		district.setName("Hubbali");
		district1.setName("Tumkur");
		district2.setName("Gulbaraga");
		
		area.setDistrict(district);
		area1.setDistrict(district1);
		area2.setDistrict(district2);

		
		TalukDTO taluk =new TalukDTO();
		TalukDTO taluk1 =new TalukDTO();
		TalukDTO taluk2 =new TalukDTO();
		taluk.setName("Vijayanagar");
		taluk1.setName("Mdhol");
		taluk2.setName("Gubbi");

		
		district.setTaluk(taluk);
		district1.setTaluk(taluk1);
		district2.setTaluk(taluk2);

		
		StateDTO state =new StateDTO();
		StateDTO state1 =new StateDTO();
		StateDTO state2 =new StateDTO();
		state.setName("Karnataka");
		state.setCountry("INDIA");
		
		state1.setName("Karnataka");
		state1.setCountry("INDIA");
		
		state2.setName("Karnataka");
		state2.setCountry("Maharashtra");
		
		taluk.setState(state);
		taluk1.setState(state1);
		taluk2.setState(state2);


		TraineeOperation operation = new TraineeOperation();
		operation.save(traineedetail);
		operation.save(traineedetail1);
		operation.save(traineedetail2);
		operation.printAll();
		System.out.println();
		TraineeDetails res=operation.updateCountryByName("Bhagya","Pooja");
		System.out.println(res.toString());
		System.out.println();
		operation.printAll();
	   System.out.println();
	   TraineeDetails response =operation.getByCountry("Maharashta");
	   System.out.println(res.toString());
	   System.out.println();
	   TraineeDetails response1 =operation.getByDistrict("Tumkur");
	   System.out.println(response1.toString());
	   System.out.println();
	  
	}

}

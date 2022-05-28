//                                     java C2TC Program (TNS & CG)  (Batch M13 & Batch B11)

/*                                    PROJECT NAME :-WEB BASED PLACEMENT MANAGEMENT SYSTEM
                                                        GROUP NO:- 1  
                                                            
                                                   Name of the members:-

                                               1) Roshan Ramesh Pawar(GL) (Batch M13)
                                               2) Naseer Ahmed            (Batch B11)
                                               3) Payal Santosh Jadhav    (Batch M13)
                                               4) Kumendra Maroti Chakole (Batch M13)
*/




package client;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import crudoperation.entities.Admin;
import crudoperation.entities.Certificate;
import crudoperation.entities.College;
import crudoperation.entities.Placement;
import crudoperation.entities.Student;
import crudoperation.entities.User;
import crudoperation.service.AdminService;
import crudoperation.service.AdminServiceImpl;
import crudoperation.service.CertificateService;
import crudoperation.service.CertificateServiceImpl;
import crudoperation.service.CollegeService;
import crudoperation.service.CollegeServiceImpl;
import crudoperation.service.PlacementService;
import crudoperation.service.PlacementServiceImpl;
import crudoperation.service.StudentService;
import crudoperation.service.StudentServiceImpl;
import crudoperation.service.UserService;
import crudoperation.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		
		
		StudentService ss = new StudentServiceImpl();
		AdminService as = new AdminServiceImpl();
		CollegeService cs =new CollegeServiceImpl();
		UserService us = new UserServiceImpl();
		CertificateService Cs= new CertificateServiceImpl();
		PlacementService ps = new PlacementServiceImpl();
		
		
		
		
		
//---------------------------------------------- X FOR STUDENT X----------------------------------------------------------------------------
		//Row1
		Student student = new Student();
		student.setName("aniket");
		student.setRoll(12);
		student.setQualification("MCA");
		student.setYear(2021);
		student.setHallTicketNo(1323);
		student.setCourse("CS");
	
		System.out.println("Row Inserted");
		
		
		//Row2
		Student student1 = new Student();
		student1.setName("Roshan");
		student1.setRoll(34);
		student1.setQualification("BE");
		student1.setYear(2022);
		student1.setHallTicketNo(1324);
		student1.setCourse("MECH");
		
		System.out.println("Row Inserted");
		
		
		
		/*//retrive operation
				student = ss.findStudentById(1);
				System.out.println("ID"+student.getId());
				System.out.println(student);
				
		//Update Operation
				student = ss.findStudentById(2);
				student.setName("Neha");
				student.setQualification("B.com");
				ss.updateStudent(student);
				System.out.println("Row updated");
				System.out.println(student);
				
		//Delete Operation 
				student = ss.findStudentById(1);
				System.out.println(student);
				ss.removeStudent(student);
				System.out.println("Row deleted");*/
		
		
//----------------------------------------------- X FOR ADMIN X---------------------------------------------------------------------------
				
				
		//Row1
		Admin admin = new Admin();
		admin.setAdminId(1234);
		admin.setAdminName("Aniket");
		admin.setAdminPassword("Ani@123");
		//as.addAdmin(admin);
		
		//Row2
	    Admin admin1 = new Admin();
	    admin1.setAdminId(1453);
	    admin1.setAdminName("payal");
	    admin1.setAdminPassword("payal@563");
	    //as.addAdmin(admin1);
		
	    
	   /*  //Update Operation 
	    admin = as.findByAdminId(1234);
	     as.updateAdmin(admin);
	 	System.out.println("Row updated");
	     
	    //Delete Operation 
	    admin = as.findByAdminId(1234);
		System.out.println(admin);
		as.removeAdmin(admin);
		System.out.println("Row deleted");*/
		
		
		
		
	    
//-------------------------------------------------X	FOR COLLEGE  X---------------------------------------------------------------------
		//Row1
	    College college =new College();	
		college.setCollegeId(343);
		college.setCollegeName("BCOE");
		college.setLocation("Thane");
		//cs.addCollege(college);
		
		
		//Row2
		College college1 =new College();	
		college1.setCollegeId(344);
		college1.setCollegeName("ACPCOI");
		college1.setLocation("Navi Mumbai");
		//cs.addCollege(college1);
		
		/*
		// Update Operation
		 college = cs.findByCollegeId(343);
		college.setCollegeId(325);
		college.setCollegeName("dryhdr");
		cs.updateCollege(college);
		System.out.println("Row updated");
		System.out.println(college);
		
		
		//Delete Operation
		college = cs.findByCollegeId(343);
		System.out.println(college);
		cs.removeCollege(college);
		System.out.println("Row deleted");*/
		
	
		
//---------------------------------------------------------X FOR USER  X-------------------------------------------------------------------
		
		
		//Row1
		User user = new User();
		user.setUserId(7898); 
		user.setUserName("Mohtasim"); 
		user.setUserPassword("moh#123"); 
		user.setUserType("student"); 
		//us.addUser(user);
		
		
		//Row1
		User user1 = new User();
		user1.setUserId(7834); 
		user1.setUserName("diya"); 
		user1.setUserPassword("diy&134"); 
		user1.setUserType("Teacher"); 
		//us.addUser(user1);
		
			
	     
//-----------------------------------------------------X  FOR CERTIFICATE  X---------------------------------------------------------------
		//Row1
		Certificate certificate= new Certificate();
		certificate.setCollege("BCOE");
		certificate.setPassingyear(2021);
		certificate.setStudentid(1);
		//Cs.addCertificate(certificate);
		
		//Row2
		Certificate certificate1= new Certificate();
		certificate1.setCollege("ACPCOI");
		certificate1.setPassingyear(2020);
		certificate1.setStudentid(2);
		//Cs.addCertificate(certificate1);
		
		
		
//----------------------------------------------------X	FOR PLACEMENTS  X-------------------------------------------------------------------
		//Row 1
		LocalDate date =LocalDate.of(2022, 5, 25);
		Placement  placement = new Placement() ;
		placement.setDate(date);
		placement.setName("capgemini");
		placement.setPlacementId(243);
		placement.setQualification("B.E");
		placement.setYear(2021);
		//ps.addPlacement(placement);
				
		
		//Row 2
		LocalDate date1 =LocalDate.of(2022, 6, 4);
		Placement  placement1 = new Placement() ;
		placement1.setDate(date1);
		placement1.setName("TCS");
		placement1.setPlacementId(223);
		placement1.setQualification("MCA");
		placement1.setYear(2020);
		//ps.addPlacement(placement1);
		
	
		
		
	 // -------------------------------------------------X  MAPPING ONE TO ONE X-------------------------------------------------------
		
		
		
		//1 to 1 student and certificate
       student.setStudentCertificate(certificate);
		em.persist(student);
		
		student1.setStudentCertificate(certificate1);
		em.persist(student1);
		
		
		//1 to 1 admin and user
		user.setStudentAdmin(admin);
		em.persist(user);
		
		user1.setStudentAdmin(admin1);
		em.persist(user1);
		
		
		//1 to 1 college and user
		user.setStudentCollege(college);
		em.persist(user);
		
		user1.setStudentCollege(college1);
		em.persist(user1);
		
		System.out.println("one to one mapping succesfull");
		
		
		
// -------------------------------------------------X  MAPPING ONE TO MANY X-------------------------------------------------------   
		
		
		
		student.setCollege(college);
		em.persist(student);
		
		student1.setCollege(college1);
		em.persist(student1);
		
		placement.setCollege(college);
		em.persist(placement);
		
		placement1.setCollege(college1);
		em.persist(placement1);
		
		certificate.setCollege(college);
		em.persist(certificate);
		
		certificate1.setCollege(college1);
		em.persist(certificate1);
		
		System.out.println("one to many mapping succesfull");
	
		
		
		
         System.out.println("Tables Created Successfully");
		
		em.getTransaction().commit();		
		em.close();
		factory.close();
		
		

	}

	

}

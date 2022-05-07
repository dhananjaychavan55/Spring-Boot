import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Test {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setAge(23);
		s.setName("bhushan");
		s.setAddres("Pune");
		s.setRollno(11);
		try {
			JAXBContext context=JAXBContext.newInstance(Student.class);
			Marshaller marshaller=context.createMarshaller();
			marshaller.marshal(s, new File("Student.xml"));
			System.out.println("File Created");
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		

	}

}

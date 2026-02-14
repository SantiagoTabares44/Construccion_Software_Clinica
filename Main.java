package clinica;

import java.time.LocalDate;
public class Main {
    
    public static void main(String[] args) {
        
        LocalDate PatientBirth = LocalDate.of(2002,10, 26);
        LocalDate DoctorBirth = LocalDate.of(1980, 5, 15);

        // Crear specialist
        Specialist specialist = new Specialist("CARDIO001", "Cardiologo");

        // Crear company y policy
        Company company = new Company("CardioVid");
        Policy policy = new Policy(company, 1001, true, java.time.LocalDate.of(2026,12,31));

        // Crear contact
        Contact contact = new Contact("Astrid","Acosta","43557795","AstridAcosta@gmail.com","3124566380",LocalDate.of(1972, 06, 26),"calle 01","Madre");

        // Crear patient (usando constructor extendido)
        Patient paciente_santiago = new Patient("Santiago","Tabares","1001015423","santiago.tabares44@correo.tdea.edu.co","3126456670",PatientBirth,"calle 41 Bsur #67",Gender.MASCULINO,contact,policy);

        // Crear user (CarlosDoctor)
        User CarlosDoctor = new User("Carlos","Pardo","123456","carlos.pardp@cdoctorverdadero.com","23456789",DoctorBirth,"calle 123","Doc001","Doc****",Role.DOCTOR);
        
        // Crear clinical record y añadir a historial
        ClinicalRecords cr = new ClinicalRecords(LocalDate.now(), CarlosDoctor, "Dolor de pecho", "Sin conocimiento", "Observación");
        //ClinicalRecords cr2 = new ClinicalRecords(LocalDate.now(), CarlosDoctor, "Dolor de rodilla", "Punzon en rodilla derecha", "Ligamento cruzado");


        ClinicalHistory patientHistory = new ClinicalHistory(paciente_santiago.getDocument());
        //ClinicalHistory newPClinicalHistory = new ClinicalHistory(paciente_santiago.getDocument());
        patientHistory.addClinicalRecord(cr);
        //newPClinicalHistory.addClinicalRecord(cr2);

        // Crear item y order
        Item item = new Item(1, "ACETAMENOFEM", 200, ItemType.PROCEDURE);
        Item item2 = new Item(2, "ASPIRINA", 50, ItemType.MEDICINE);
        OrderItem oi = new OrderItem(1, item, 1);
        OrderItem oi2 = new OrderItem(2, item2, 2);
        Order order = new Order(10, new OrderItem[]{oi, oi2}, LocalDate.now(), paciente_santiago, CarlosDoctor);


        // Crear invoice
        Invoice invoice = new Invoice(paciente_santiago, CarlosDoctor, order, 20.000, LocalDate.now(), 200.0);

        // Imprimir comprobaciones
        System.out.println("-----INFORMACION DEL PACIENTE-----");

        System.out.println("NOMBRE: " + paciente_santiago.getfirstName() + " APELLIDOS: " + paciente_santiago.getlastName());
        System.out.println("DOCUMENTO: "+paciente_santiago.getDocument());

        System.out.println("-----INFORMACION DEL MEDICO TRATANTE Y ORDEN MEDICA-----");
        System.out.println(CarlosDoctor.getRole()+" "+ CarlosDoctor.getFirstName() + " " + CarlosDoctor.getLastName());
        System.out.println("Especialista: " + specialist.getType());
        System.out.println("Historial total registros: " + patientHistory.getTotalRecords());
        System.out.println("Primer diagnóstico: " + patientHistory.getClinicalRecord(0).getDiagnosis());
        //System.out.println("Segundo diagnóstico: "+newPClinicalHistory.getClinicalRecord(0).getDiagnosis());
        System.out.println("Order ID: " + order.getId() + ", Total items: " + order.getTotalOrderItems());
        System.out.println("Invoice total: " + invoice.getTotal() + ", copay: " + invoice.getCopay());
    
        System.out.println("-----INFORMACION CONTACTO DE EMERGENCIA-----");
        System.out.println("Nombre contacto: "+contact.getfirstName());
        System.out.println("Documento: "+contact.getDocument());
        System.out.println("Relacion: "+contact.getRelation());
        
    }
}
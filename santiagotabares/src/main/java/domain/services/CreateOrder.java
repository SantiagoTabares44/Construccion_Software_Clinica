package clinica.santiagotabares.src.main.java.domain.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import clinica.santiagotabares.src.main.java.domain.models.MedicalOrder;
import clinica.santiagotabares.src.main.java.domain.models.Order;
import clinica.santiagotabares.src.main.java.domain.models.OrderItem;
import clinica.santiagotabares.src.main.java.domain.models.Patient;
import clinica.santiagotabares.src.main.java.domain.models.ProcedureOrder;
import clinica.santiagotabares.src.main.java.domain.models.Role;
import clinica.santiagotabares.src.main.java.domain.models.SupportOrder;
import clinica.santiagotabares.src.main.java.domain.models.User;

public class CreateOrder {

    // Método para crear una orden médica
    public Order createMedicalOrder(int orderId, Patient patient, User doctor, LocalDate date, List<MedicalOrder> medicalItems) {
        if (patient == null || doctor == null || medicalItems == null || medicalItems.isEmpty()) {
            throw new IllegalArgumentException("Paciente, doctor y al menos un item médico son requeridos.");
        }
        if (!doctor.getRole().equals(Role.DOCTOR)) {
            throw new IllegalArgumentException("El usuario debe ser un doctor para crear órdenes médicas.");
        }

        OrderItem[] orderItems = new OrderItem[medicalItems.size()];
        for (int i = 0; i < medicalItems.size(); i++) {
            orderItems[i] = medicalItems.get(i);
        }

        return new Order(orderId, orderItems, date, patient, doctor);
    }

    // Método para crear una orden de procedimiento
    public Order createProcedureOrder(int orderId, Patient patient, User doctor, LocalDate date, List<ProcedureOrder> procedureItems) {
        if (patient == null || doctor == null || procedureItems == null || procedureItems.isEmpty()) {
            throw new IllegalArgumentException("Paciente, doctor y al menos un item de procedimiento son requeridos.");
        }
        if (!doctor.getRole().equals(Role.DOCTOR)) {
            throw new IllegalArgumentException("El usuario debe ser un doctor para crear órdenes de procedimiento.");
        }

        OrderItem[] orderItems = new OrderItem[procedureItems.size()];
        for (int i = 0; i < procedureItems.size(); i++) {
            orderItems[i] = procedureItems.get(i);
        }

        return new Order(orderId, orderItems, date, patient, doctor);
    }

    // Método para crear una orden de soporte
    public Order createSupportOrder(int orderId, Patient patient, User doctor, LocalDate date, List<SupportOrder> supportItems) {
        if (patient == null || doctor == null || supportItems == null || supportItems.isEmpty()) {
            throw new IllegalArgumentException("Paciente, doctor y al menos un item de soporte son requeridos.");
        }
        if (!doctor.getRole().equals(Role.DOCTOR)) {
            throw new IllegalArgumentException("El usuario debe ser un doctor para crear órdenes de soporte.");
        }

        OrderItem[] orderItems = new OrderItem[supportItems.size()];
        for (int i = 0; i < supportItems.size(); i++) {
            orderItems[i] = supportItems.get(i);
        }

        return new Order(orderId, orderItems, date, patient, doctor);
    }

    // Método general para crear una orden mixta (con diferentes tipos de items)
    public Order createMixedOrder(int orderId, Patient patient, User doctor, LocalDate date, List<OrderItem> items) {
        if (patient == null || doctor == null || items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Paciente, doctor y al menos un item son requeridos.");
        }
        if (!doctor.getRole().equals(Role.DOCTOR)) {
            throw new IllegalArgumentException("El usuario debe ser un doctor para crear órdenes.");
        }

        OrderItem[] orderItems = new OrderItem[items.size()];
        for (int i = 0; i < items.size(); i++) {
            orderItems[i] = items.get(i);
        }

        return new Order(orderId, orderItems, date, patient, doctor);
    }
}
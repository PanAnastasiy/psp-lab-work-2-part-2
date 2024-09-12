package lab.hospital;

import lab.medical.Doctor;
import lab.medical.MedicalWorker;
import lab.medical.Nurse;
import lab.office.Accountant;
import lab.office.CharityFundManager;
import lab.office.OfficeWorker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private final List<MedicalWorker> medicalWorkers;
    private final List<OfficeWorker> officeWorkers;
    public Hospital() {
        this.medicalWorkers = new ArrayList<>();
        this.officeWorkers = new ArrayList<>();
    }
    public void addMedicalWorker(MedicalWorker mw) {
        this.medicalWorkers.add(mw);
    }

    public void addOfficeWorker(OfficeWorker ow) {
        this.officeWorkers.add(ow);
    }

    public List<MedicalWorker> getMedicalWorkers() {
        return this.medicalWorkers;
    }

    public List<OfficeWorker> getOfficeWorkers() {
        return this.officeWorkers;
    }

    public void loadMedicalWorkersFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                String gender = parts[3];
                int hourPayment = Integer.parseInt(parts[4]);
                int hoursWorked = Integer.parseInt(parts[5]);
                int people = Integer.parseInt(parts[6]);
                if (parts[0].equals("N")) {
                    addMedicalWorker(new Nurse(name, age, gender, hourPayment, hoursWorked, people));
                }
                else
                {
                    addMedicalWorker(new Doctor(name, age, gender, hourPayment, hoursWorked, people));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void loadOfficeWorkersFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                String gender = parts[3];
                int hourPayment = Integer.parseInt(parts[4]);
                int hoursWorked = Integer.parseInt(parts[5]);
                String vacation = parts[6];
                if (parts[0].equals("A")) {
                    addOfficeWorker(new Accountant(name, age, gender, hourPayment, hoursWorked, vacation));
                } else {
                    addOfficeWorker(new CharityFundManager(name, age, gender, hourPayment, hoursWorked, vacation));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

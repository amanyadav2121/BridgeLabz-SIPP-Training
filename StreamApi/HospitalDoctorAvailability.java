package com.pranav.streams;

import java.util.*;
import java.util.stream.Collectors;

public class HospitalDoctorAvailability {
    // Doctors available on weekends (SAT or SUN), sorted by specialty then name
    public static List<Doctor> weekendDoctorsSorted(List<Doctor> doctors) {
        return doctors.stream()
                .filter(d -> d.getDaysAvailable().contains("SAT") || d.getDaysAvailable().contains("SUN"))
                .sorted(Comparator.comparing(Doctor::getSpecialty).thenComparing(Doctor::getName))
                .collect(Collectors.toList());
    }
}

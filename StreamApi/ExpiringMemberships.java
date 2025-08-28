package com.pranav.streams;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ExpiringMemberships {
    // Members whose membership expires within the next `daysWindow` days
    public static List<Member> expiringWithin(List<Member> members, int daysWindow) {
        LocalDate today = LocalDate.now();
        LocalDate cutoff = today.plusDays(daysWindow);
        return members.stream()
                .filter(m -> !m.getExpiryDate().isBefore(today) && !m.getExpiryDate().isAfter(cutoff))
                .sorted((a,b) -> a.getExpiryDate().compareTo(b.getExpiryDate()))
                .collect(Collectors.toList());
    }
}

package com.pranav.streams;

import java.util.*;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {
    // Average claim amount per claim type
    public static Map<String, Double> averageAmountByType(List<InsuranceClaim> claims) {
        return claims.stream()
                .collect(Collectors.groupingBy(
                        InsuranceClaim::getClaimType,
                        Collectors.averagingDouble(InsuranceClaim::getAmount)
                ));
    }
}

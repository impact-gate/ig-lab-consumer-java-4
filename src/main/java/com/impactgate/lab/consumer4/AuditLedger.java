package com.impactgate.lab.consumer4;

import java.util.Map;

public class AuditLedger {
    // Dynamic map access matching L2 consumer requirements
    public long verifyCollateralMargin(Map<String, Object> productMap, Map<String, Object> loanMap) {
        long productValue = ((Number) productMap.get("priceCents")).longValue();
        long loanPrincipal = ((Number) loanMap.get("principalCents")).longValue();
        return productValue - loanPrincipal;
    }
}

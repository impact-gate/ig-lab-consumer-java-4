package com.impactgate.lab.consumer4;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class AuditLedgerTest {
    @Test
    public void testCollateralMargin() {
        AuditLedger ledger = new AuditLedger();
        Map<String, Object> product = Map.of("priceCents", 150000L);
        Map<String, Object> loan = Map.of("principalCents", 100000L);
        long margin = ledger.verifyCollateralMargin(product, loan);
        assertEquals(50000L, margin);
    }
}

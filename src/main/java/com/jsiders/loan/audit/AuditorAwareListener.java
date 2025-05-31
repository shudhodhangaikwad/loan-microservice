package com.jsiders.loan.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by Sid Gaikwad on 29-05-2025.
 */
@Component("auditAwareImpl")
public class AuditorAwareListener implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("LOAN_MS");
    }
}

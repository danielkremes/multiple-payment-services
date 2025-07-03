package br.com.multiple.payment.services.repository;

import br.com.multiple.payment.services.model.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SchedulingRepository extends JpaRepository<Scheduling, UUID> {
}

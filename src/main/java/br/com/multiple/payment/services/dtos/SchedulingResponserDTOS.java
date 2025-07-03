package br.com.multiple.payment.services.dtos;

import br.com.multiple.payment.services.enums.StatusScheduling;
import br.com.multiple.payment.services.enums.TypeCommunication;

import java.time.Instant;
import java.util.UUID;

public record SchedulingResponserDTOS(
        UUID id,
        String destinationScheduling,
        String messageScheduling,
        TypeCommunication typeCommunication,
        Instant dateTimeSent,
        StatusScheduling statusScheduling,
        Instant createAt
) {
}

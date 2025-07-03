package br.com.multiple.payment.services.dtos;

import br.com.multiple.payment.services.enums.TypeCommunication;
import jakarta.validation.constraints.NotBlank;

public record SchedulingRequesterDTOS(@NotBlank(message = "the addressee is mandatory !") String destination,
                                      @NotBlank(message = "the message is mandatory") String message,
                                      @NotBlank(message = "the type of communication is mandatory") TypeCommunication typeCommunication) {
}

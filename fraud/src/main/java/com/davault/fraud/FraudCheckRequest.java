package com.davault.fraud;

import java.time.LocalDateTime;

public record FraudCheckRequest (

     Integer customerId,
     Boolean isFraudster,
     LocalDateTime createdAt){

}

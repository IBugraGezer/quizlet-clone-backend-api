package com.burra.quizletclone.business.requests.cards;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CardUpdateRequest {

  @NotBlank
  private String definition;

  @NotBlank
  private String term;
}

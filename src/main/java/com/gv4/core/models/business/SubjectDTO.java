package com.gv4.core.models.business;

import lombok.Builder;
import lombok.Data;
import org.springframework.lang.Nullable;
import javax.validation.constraints.NotBlank;

@Data
@Builder
public class SubjectDTO {

    @Nullable
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String alias;

}

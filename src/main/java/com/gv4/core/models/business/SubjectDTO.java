package com.gv4.core.models.business;

import lombok.Builder;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
@Builder
public class SubjectDTO {

    @Nullable
    private Long id;

    @Nullable
    private String name;

    @Nullable
    private String alias;

}

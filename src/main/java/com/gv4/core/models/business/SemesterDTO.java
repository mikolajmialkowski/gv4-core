package com.gv4.core.models.business;

import lombok.Builder;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
@Builder
public class SemesterDTO {

    @Nullable
    private Long id;

    @Nullable
    private Long semesterNumber;

}

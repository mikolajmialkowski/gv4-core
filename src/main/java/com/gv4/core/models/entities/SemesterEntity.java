package com.gv4.core.models.entities;


import lombok.*;
import org.hibernate.Hibernate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class SemesterEntity {

    @Id
    private Long id;

    @NotNull
    private Long semesterNumber;

    //TODO add department (in case of expanding project to entire University)


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SemesterEntity that = (SemesterEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

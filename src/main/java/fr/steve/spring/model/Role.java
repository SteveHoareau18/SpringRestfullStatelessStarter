package fr.steve.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Getter
@Setter
public class Role implements GrantedAuthority {

    @Id
    private String id;

    @Override
    public String getAuthority() {
        return id;
    }
}

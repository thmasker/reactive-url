package org.thmasker.reactive.url.persistence;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Repository implements PanacheRepository<MyEntity> {
}

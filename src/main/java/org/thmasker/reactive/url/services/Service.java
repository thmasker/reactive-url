package org.thmasker.reactive.url.services;

import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import org.thmasker.reactive.url.persistence.MyEntity;
import org.thmasker.reactive.url.persistence.Repository;

@ApplicationScoped
public class Service {

  private final Repository repository;

  public Service(Repository repository) {
    this.repository = repository;
  }

  @WithSession
  public Uni<List<MyEntity>> getEntities() {
    return repository.findAll().list();
  }

}

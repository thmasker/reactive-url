package org.thmasker.reactive.url.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "my_entity")
public class MyEntity {

  @Id
  @GeneratedValue
  private int id;

}

package model;

import java.io.Serializable;

public interface ClientId extends Serializable {
  String getId();

  City getCity();
}

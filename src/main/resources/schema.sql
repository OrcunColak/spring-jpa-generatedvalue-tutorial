CREATE TABLE id_gen (
  gen_key VARCHAR(255) NOT NULL,
  gen_value BIGINT NOT NULL,
  PRIMARY KEY (gen_key)
);

CREATE TABLE student (
  id BIGINT NOT NULL,
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  PRIMARY KEY (id)
);
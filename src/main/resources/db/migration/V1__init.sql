DROP SCHEMA IF EXISTS project CASCADE;
CREATE SCHEMA project;

CREATE TABLE project.igrachi
(
  id       SERIAL PRIMARY KEY,
  akronim  TEXT,
  drzava   TEXT,
  ime      TEXT,
  pozicija TEXT
);

CREATE TABLE project.liga
(
  id                  SERIAL PRIMARY KEY,
  kontinent           TEXT,
  ime                 TEXT,
  mesto_na_odrzuvanje TEXT
);

CREATE TABLE project.sezona
(
  year          INTEGER PRIMARY KEY,
  kraen_datum   DATE,
  poceten_datum DATE
);

CREATE TABLE project.statistika_na_igrach
(
  id                     SERIAL PRIMARY KEY,
  kda                    INTEGER,
  nadigruvanja           INTEGER,
  napravena_steta        INTEGER,
  poeni_vo_10_min        INTEGER,
  primena_steta          INTEGER,
  prinudeni_greski       INTEGER,
  prisustvo_na_soigrachi INTEGER,
  prisustvo_na_vardovi   INTEGER,
  sezona_id              INTEGER REFERENCES project.sezona (year),
  igrach_id              INTEGER REFERENCES project.igrachi (id)
);

CREATE TABLE project.tim
(
  id      SERIAL PRIMARY KEY,
  ime     TEXT,
  logo    TEXT,
  liga_id INTEGER REFERENCES project.liga (id)
);

CREATE TABLE project.statistika_na_tim
(
  id              SERIAL PRIMARY KEY,
  br_pobedi       BIGINT,
  poeni_vo_10_min INTEGER,
  sezona_id       INTEGER REFERENCES project.sezona (year),
  tim_id          INTEGER REFERENCES project.tim (id),
  CONSTRAINT "UNIQUE_STATISTIKA_VO_SEZONA" UNIQUE (sezona_id, tim_id)
);

CREATE TABLE project.formiraat
(
  id        SERIAL PRIMARY KEY,
  tim_id    INTEGER REFERENCES project.tim (id),
  igrach_id INTEGER REFERENCES project.igrachi (id),
  sezona_id INTEGER REFERENCES project.sezona (year)
);

CREATE TABLE project.menuvaat_tim
(
  id             SERIAL PRIMARY KEY,
  igrach_id      INTEGER REFERENCES project.igrachi,
  tim_id         INTEGER REFERENCES project.tim,
  cena           INTEGER,
  datum_na_smena DATE
);

CREATE TABLE project.liga_sezona
(
  id      SERIAL PRIMARY KEY,
  liga_id INTEGER REFERENCES project.liga (id),
  year    INTEGER REFERENCES project.sezona (year),
  CONSTRAINT "UNIQUE_LIGA_SEZONA" UNIQUE (liga_id, year)
);

CREATE TABLE project.utakmica
(
  id          SERIAL PRIMARY KEY,
  finale      BOOLEAN,
  pobednik    INTEGER REFERENCES project.tim (id),
  gubitnik    INTEGER REFERENCES project.tim (id),
  liga_sezona INTEGER REFERENCES project.liga_sezona (id),
  CHECK ( pobednik != gubitnik )
);

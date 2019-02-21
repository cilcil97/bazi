INSERT INTO project.igrachi(akronim, drzava, ime, pozicija)
VALUES ('Caps', 'Denmark', 'Rasmus', 'MID'),
       ('Broxah', 'Denmark', 'Mads', 'JNG'),
       ('Rekkles', 'Sweeden', 'Martin', 'ADC'),
       ('Soaz', 'France', 'Paul', 'TOP'),
       ('Perkz', 'Croatia', 'Luka', 'ADC'),
       ('Mikix', 'Slovenia', 'Milan', 'SUPP'),
       ('Hylisang', 'Bulgaria', 'Zdravetz', 'SUPP'),
       ('Jankos', 'Poland', 'Marcin', 'JNG'),
       ('Bjergsen', 'Denmark', 'Soren', 'MID'),
       ('Svenskeren', 'Denmark', 'Denis', 'JNG'),
       ('CoreJJ', 'South Korea', 'Bae', 'SUPP'),
       ('Doublelift', 'USA', 'Peter', 'ADC'),
       ('Jensen', 'Denmark', 'Nicolaj', 'MID'),
       ('Xmitie', 'USA', 'Jake', 'JNG'),
       ('Impact', 'South Korea', 'Jeong', 'TOP'),
       ('BrokenBlade', 'Turkey/Germany', 'Sergen', 'TOP'),
       ('Akkadian', 'USA', 'Matthew', 'JNG'),
       ('Zven', 'Denmark', 'Jesper', 'ADC'),
       ('Smoothie', 'USA', 'Andy', 'Support'),
       ('Ssumday', 'South Korea', 'Kim-Chan', 'TOP'),
       ('Huhi', 'USA/South Korea', 'Choi-bae', 'MID'),
       ('Anda', 'USA', 'Andy', 'JNG'),
       ('Bang', 'South Korea', 'Bae-Jung', 'ADC'),
       ('Aphromoo', 'USA', 'Zaquery', 'SUPP'),
       ('Alphari', 'England', 'Barney', 'TOP'),
       ('KOld', 'Denmark', 'Jonas', 'JNG'),
       ('Nukeduck', 'Norway', 'Ereland', 'MID'),
       ('Patrik', 'Czech Republic', 'Patrik', 'ADC'),
       ('Mithy', 'Spain', 'Alfonso', 'SUPP');



INSERT INTO project.liga(kontinent, ime, mesto_na_odrzuvanje)
VALUES ('Europe', 'LEC', 'Berlin'),
       ('North America', 'LCS', 'California'),
       ('Asia', 'LCK', 'Seoul');


INSERT INTO project.sezona(year, poceten_datum, kraen_datum)
VALUES (2019, 'Jan-14-2019', 'Apr-30-2019'),
       (2018, 'June-20-2018', 'Sept-4-2018'),
       (2017, 'March-5-2017', 'July-5-2017');



INSERT INTO project.liga_sezona(liga_id, year)
VALUES (1, 2019),
       (2, 2019),
       (3, 2019),
       (1, 2018),
       (2, 2018),
       (3, 2018),
       (1, 2017),
       (2, 2017),
       (3, 2017);


INSERT INTO project.tim(ime, logo, liga_id)
VALUES ('Fnatic', 'FNC', 1),
       ('Gamers-2', 'G2', 1),
       ('Origen', 'OG', 1),
       ('Liquid', 'TL', '2'),
       ('Team solo mid', 'TSM', 2),
       ('CLOUD9', 'C9', 2);



INSERT INTO project.formiraat(tim_id, igrach_id, sezona_id)
VALUES (1, 1, 2019),
       (1, 2, 2019),
       (1, 3, 2019),
       (1, 4, 2019),
       (2, 5, 2019),
       (2, 6, 2019),
       (2, 7, 2019),
       (1, 8, 2019),
       (3, 9, 2018),
       (3, 10, 2018),
       (3, 11, 2019),
       (4, 12, 2017),
       (5, 13, 2019),
       (6, 14, 2019),
       (6, 15, 2019),
       (6, 16, 2018),
       (4, 17, 2019),
       (4, 18, 2019),
       (1, 19, 2017),
       (2, 20, 2017),
       (3, 21, 2017),
       (4, 22, 2017),
       (5, 23, 2018),
       (5, 24, 2019),
       (5, 25, 2019),
       (5, 26, 2018),
       (5, 27, 2017),
       (4, 28, 2017);


INSERT INTO project.menuvaat_tim(igrach_id, tim_id, cena, datum_na_smena)
VALUES (1, 2, 50000, 'Feb-05-2019'),
       (2, 3, 24000, 'Feb-05-2019'),
       (3, 3, 12000, 'Sept-04-2015');



INSERT INTO project.statistika_na_igrach(kda, nadigruvanja, napravena_steta, poeni_vo_10_min, primena_steta,
                                         prinudeni_greski, prisustvo_na_soigrachi, prisustvo_na_vardovi, sezona_id,
                                         igrach_id)
VALUES (5, 5, 10000, 4200, 50000, 4, 2, 10, 2019, 1)
     , (4, 4, 11100, 4300, 5000, 5, 3, 11, 2019, 2)
     , (2, 1, 200, 5200, 5, 1, 2, 9, 2019, 3)
     , (1, 1, 200, 5000, 5, 1, 3, 5, 2019, 4)
     , (5, 5, 500, 12000, 4, 4, 5, 3, 2019, 5)
     , (5, 5, 10000, 4200, 50000, 4, 2, 10, 2019, 6)
     , (4, 4, 11100, 4300, 5000, 5, 3, 11, 2019, 7)
     , (2, 1, 200, 5200, 5, 1, 2, 3, 2019, 8)
     , (1, 1, 200, 5000, 5, 1, 3, 4, 2019, 9)
     , ( 5, 5, 500, 12000, 4, 4, 5, 3, 2019, 10)
     , ( 5, 5, 10000, 4200, 50000, 4, 2, 10, 2019, 11)
     , ( 4, 4, 11100, 4300, 5000, 5, 3, 11, 2019, 12)
     , ( 2, 1, 200, 5200, 5, 1, 2, 2, 2019, 13)
     , ( 1, 1, 200, 5000, 5, 1, 3, 1, 2019, 14)
     , ( 5, 5, 500, 12000, 4, 4, 5, 3, 2019, 15)
     , ( 5, 5, 10000, 4200, 50000, 4, 2, 10, 2019, 16)
     , ( 4, 4, 11100, 4300, 5000, 5, 3, 11, 2019, 17)
     , ( 2, 1, 200, 5200, 5, 1, 2, 11, 2019, 18)
     , ( 1, 1, 200, 5000, 5, 1, 3, 5, 2019, 19)
     , ( 5, 5, 500, 12000, 4, 4, 5, 3, 2019, 20)
     , ( 5, 5, 10000, 4200, 50000, 4, 2, 10, 2019, 21)
     , ( 4, 4, 11100, 4300, 5000, 5, 3, 11, 2019, 22)
     , ( 2, 1, 200, 5200, 5, 1, 2, 2019, 2019, 23)
     , ( 1, 1, 200, 5000, 5, 1, 3, 2019, 2019, 24)
     , ( 5, 5, 500, 12000, 4, 4, 5, 3, 2019, 25)
     , ( 5, 5, 10000, 4200, 50000, 4, 2, 10, 2019, 26)
     , ( 4, 4, 11100, 4300, 5000, 5, 3, 11, 2019, 27)
     , ( 2, 1, 200, 5200, 5, 1, 2, 3, 2019, 28);



INSERT INTO project.utakmica(finale, pobednik, gubitnik, liga_sezona)
VALUES (FALSE, 1, 2, 1),
       (TRUE, 1, 2, 1),
       (FALSE, 3, 4, 2),
       (TRUE, 4, 6, 3);



INSERT INTO project.statistika_na_tim(br_pobedi, poeni_vo_10_min, sezona_id, tim_id)
VALUES (1, 10000, 2019, 1),
       (10, 120000, 2018, 1),
       (11, 3440, 2017, 1);

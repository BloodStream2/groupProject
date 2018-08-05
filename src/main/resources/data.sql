INSERT INTO Continent (name) VALUES ('Europe');
INSERT INTO Country (name, continentId) VALUES ('Spain', 1);
INSERT INTO Country (name, continentId) VALUES ('Poland', 1);
INSERT INTO City (name, countryId) VALUES ('Barcelona', 1);
INSERT INTO City (name, countryId) VALUES ('Warsaw', 2);
INSERT INTO Airport (name, cityId) VALUES ('Barcelona-El Prat', 1);
INSERT INTO Airport (name, cityId) VALUES ('Warsaw Chopin Airport', 2);
INSERT INTO Hotel (name, standard, description, cityId) VALUES ('Vincci Maritimo', 4.0,
                                                                'This property is 8 minutes walk from the beach. ' ||
                                                                'Vincci Marítimo is located 10 minutes’ walk from Barcelona’s Diagonal Mar Shopping Centre and the CCIB Convention Centre. ' ||
                                                                'It offers bright, stylish rooms with flat-screen satellite TV and free Wi-Fi throughout.',
                                                                1);
INSERT INTO TypesOfMeals (name, description) VALUES ('AI', 'All Inclusive');
-- dokończyć insert tripa i purchased tripa INSERT INTO Trip (airportFrom, airportTo, hotelTo, cityTo, de) VALUES ('AI', 'All Inclusive');





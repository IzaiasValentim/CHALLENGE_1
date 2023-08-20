	CREATE TABLE Address(
		addressId SERIAL PRIMARY KEY,
		zip VARCHAR(255) NOT NULL,
		street VARCHAR(255) NOT NULL,
		complement VARCHAR(300),
		neighborhood varchar(255),
		city VARCHAR(255) NOT NULL,
		state VARCHAR(255) NOT NULL,
		country VARCHAR(255) NOT NULL
		)
	
	CREATE TABLE Person(
		person_id SERIAL PRIMARY KEY,
		name VARCHAR(255) NOT NULL,
		age INTEGER NOT NULL,
		phone VARCHAR(30) NOT NULL,
		height REAL NOT NULL,
		email VARCHAR(50) NOT NULL,
		cpf VARCHAR(100) NOT NULL,
		birthday DATE NOT NULL,
		adress_id INTEGER NOT NULL,
		FOREIGN KEY(adress_id) REFERENCES Address(addressId)
		)	
	
	INSERT INTO address (zip,street,complement, neighborhood, city, state, country) 
				VALUES(
					'10101-000',
					'Rua dos testes',
					'Me encontre',
					'Cleiton',
					'Natal',
					'Rio grande do Norte',
					'Brazil'
				)
				
	INSERT INTO person (name, age, phone, height, email, cpf, birthday, adress_id)
				VALUES(
					'Eu euzinho',
					23,
					'(11)40028922',
					1.80,
					'zinho.pb@compasso.com.br',
					'123.456.789.10',
					'2023-08-17',
					1
				)
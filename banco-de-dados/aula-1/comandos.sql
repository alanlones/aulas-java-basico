CREATE DATABASE loja;

USE loja;

CREATE TABLE tipodecliente (
	id INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(20) NOT NULL
);

SELECT * 
FROM tipodecliente;

INSERT INTO tipodecliente (tipo)
VALUES ('NORMAL'), ('VIP');

DELETE
FROM tipodecliente
WHERE tipo = 'NORMAL';

CREATE TABLE cliente (
	id INT AUTO_INCREMENT,
    cpf VARCHAR(11),
    nome VARCHAR(40) NOT NULL,
    dataNascimento DATE,
    id_tipo INT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_tipo) REFERENCES tipodecliente(id)
);

SELECT *
FROM cliente;

SELECT tipo.tipo, COUNT(*) as quantidade
FROM cliente cli JOIN tipodecliente tipo on cli.id_tipo = tipo.id
GROUP BY tipo.tipo;

ALTER TABLE cliente
CHANGE dataNascimento datanascimento DATE;

ALTER TABLE cliente
ADD CONSTRAINT CPF_UNICO
UNIQUE(cpf);

INSERT INTO cliente (cpf, nome, datanascimento, id_tipo)
VALUES ('11133322244', 'João da Silva', '1970-04-03', 
	(SELECT id FROM tipodecliente WHERE tipo = 'NORMAL')
);

INSERT INTO cliente (cpf, nome, datanascimento, id_tipo)
VALUES ('11133322255', 'José dos Santos', '1980-04-03', 
	(SELECT id FROM tipodecliente WHERE tipo = 'NORMAL')
);

INSERT INTO cliente (cpf, nome, datanascimento, id_tipo)
VALUES ('88877766655', 'Guilherme Fonseca', '1990-11-11', 
	(SELECT id FROM tipodecliente WHERE tipo = 'VIP')
);

UPDATE cliente
SET datanascimento = STR_TO_DATE('03/10/1970', '%d/%m/%Y');

SELECT DATE_FORMAT(datanascimento, '%d/%m/%Y') AS 'Data de Nascimento'
FROM cliente;

CREATE TABLE contato (
	id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(20) NOT NULL,
    valor VARCHAR(60) NOT NULL
);

ALTER TABLE contato
ADD COLUMN id_cliente INT;

ALTER TABLE contato
ADD CONSTRAINT FK_CONTATO_CLIENTE
FOREIGN KEY (id_cliente) REFERENCES cliente(id);

ALTER TABLE contato
MODIFY id_cliente INT NOT NULL;

SELECT * FROM contato;

INSERT INTO contato (titulo, valor, id_cliente)
VALUES ('E-Mail', 'joao.silva@gmail.com', 
	(SELECT id FROM cliente WHERE cpf = '11133322244')
);

INSERT INTO contato (titulo, valor, id_cliente)
VALUES ('Telefone', '+55 21 98769-5564', 
	(SELECT id FROM cliente WHERE cpf = '11133322244')
);


INSERT INTO contato (titulo, valor, id_cliente)
VALUES ('Twitter', 'twitter.com/guifon', 
	(SELECT id FROM cliente WHERE cpf = '88877766655')
);

SELECT con.titulo, con.valor
FROM cliente cli JOIN contato con ON cli.id = con.id_cliente
WHERE cli.cpf = 11133322244;

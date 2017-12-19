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

CREATE TABLE produto (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(60) NOT NULL,
    preco FLOAT NOT NULL
);

SELECT * FROM produto
WHERE preco <= 100;

SELECT * FROM produto
WHERE nome LIKE '%Pen Drive%';

INSERT INTO produto (nome, preco) VALUES 
('Iphone X', 8000.00), 
('Pen Drive 64GB', 40.00),
('Roteador', 90.00);

INSERT INTO produto (nome, preco) VALUES 
('Pen Drive 32GB', 25.00);

CREATE TABLE compra (
	id INT AUTO_INCREMENT PRIMARY KEY,
    dataCompra DATE,
    idCliente INT NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES cliente(id)
);

CREATE TABLE itemDaCompra (
	id INT AUTO_INCREMENT PRIMARY KEY,
    quantidade INT NOT NULL,
    idProduto INT NOT NULL,
    FOREIGN KEY (idProduto) REFERENCES produto(id)
);

ALTER TABLE itemDaCompra
ADD COLUMN idCompra INT;

ALTER TABLE itemDaCompra
MODIFY COLUMN idCompra INT NOT NULL;

INSERT INTO compra (dataCompra, idCliente)
VALUES ('2017-12-18', (SELECT id FROM cliente
WHERE nome = 'João da Silva'));

SELECT * FROM compra;

SELECT * FROM itemDaCompra;

INSERT INTO itemDaCompra (quantidade, idProduto, idCompra) VALUES
(2, (SELECT id FROM produto WHERE nome = 'Iphone X'), 1),
(1, (SELECT id FROM produto WHERE nome = 'Roteador'), 1);

SELECT SUM(i.quantidade * p.preco) AS 'Valor Total'
FROM compra c 
INNER JOIN itemDaCompra i ON c.id = i.idCompra
INNER JOIN produto p ON i.idProduto = p.id
WHERE c.id = 1;


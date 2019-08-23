//Por Lucas

//CLIENTE
CREATE TABLE Cliente(
	ID_Cliente    INT NOT NULL AUTO_INCREMENT,
	CPF			  CHAR(11),
	Telefone_Resi CHAR(08),
	Telefone_Celu CHAR(11),
	Nome		  VARCHAR(45),
	Email		  VARCHAR(45),
	Numero		  VARCHAR(04),
	Rua			  VARCHAR(45),
	Bairro		  VARCHAR(45),
	Cidade		  VARCHAR(45),
	Estado		  VARCHAR(45),
	PRIMARY KEY (ID_Cliente)
);

//PRODUTOS
CREATE TABLE Produto(
	COD_Produto INT NOT NULL AUTO_INCREMENT,
	Unidade		VARCHAR(10),
	Unidade_Tp	CHAR(2),
	Preco		FLOAT,
	Descricao	TINYTEXT,
	PRIMARY KEY (COD_Produto)
);

//VENDA
CREATE TABLE   Venda(
	COD_Venda  INT NOT NULL AUTO_INCREMENT, 
	ID_Cliente INT NOT NULL,
	PRIMARY KEY (ID_Cliente)
);

//ITENS_VENDA
CREATE TABLE Iten_Venda(
	ID_Item_Venda INT NOT NULL AUTO_INCREMENT,
	COD_Venda     INT NOT NULL,
	COD_Produto   INT NOT NULL,
	PRIMARY KEY (ID_Item_Venda),
	CONSTRAINT FK_COD_Venda   FOREIGN KEY (COD_Venda)   REFERENCES Venda(COD_Venda),
	CONSTRAINT FK_COD_Produto FOREIGN KEY (COD_Produto) REFERENCES Produto(COD_Produto)
);
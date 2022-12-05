CREATE DATABASE LP2A4;

USE LP2A4;

CREATE TABLE Disciplina (
    idDisciplina INTEGER AUTO_INCREMENT,
    sigla VARCHAR(200) NOT NULL UNIQUE,
    nome VARCHAR(200) NOT NULL UNIQUE,
    semestre INTEGER NOT NULL,
    PRIMARY KEY (idDisciplina)
);

CREATE TABLE Aluno (
    matricula INTEGER,
    nome VARCHAR(200) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    telefone VARCHAR(11) NOT NULL UNIQUE,
    responsavel VARCHAR(200) NOT NULL,
    semestre INTEGER NOT NULL,
    PRIMARY KEY (matricula)
);

CREATE TABLE Disciplina_Aluno (
    idDisciplinaAluno INTEGER AUTO_INCREMENT,
    matricula INTEGER NOT NULL,
    idDisciplina INTEGER NOT NULL,
    PRIMARY KEY (idDisciplinaAluno),
    FOREIGN KEY (matricula) REFERENCES Aluno(matricula),
    FOREIGN KEY (idDisciplina) REFERENCES Disciplina(idDisciplina)
);

INSERT INTO Disciplina(sigla, nome, semestre) VALUES
	("ES4A4", "Engenharia de Software IV", 4),
	("LP2A4", "Linguagem de Programação II", 2),
	("SESA4", "Serviços e Servidores de Rede", 1),
	("SEGA4", "Segurança da Informação", 3),
	("DW2A4", "Desenvolvimento Web II", 2),
	("GPRA4", "Gestão de Projetos", 1);

INSERT INTO Aluno(matricula, nome, cpf, telefone, responsavel, semestre) VALUES 
    (1, "Isabella Vilhaba", "54682498463", "17992546328", "João Antônio", 1),
    (2, "Mario Castro", "58746325986", "1569842360", "Maria Marcia", 2),
    (3, "Ana Oliveira", "87456325098", "5489623057", "Marcos Melo", 3),
    (4, "Carlos Mota", "62547820168", "8120356987", "Joana Silva", 4),

SELECT * FROM ALUNO;

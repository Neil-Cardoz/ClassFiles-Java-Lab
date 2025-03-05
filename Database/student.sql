CREATE DATABASE student_db;
USE student_db;

CREATE TABLE students (
    PRN INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Branch VARCHAR(50) NOT NULL,
    Batch VARCHAR(20) NOT NULL,
    CGPA FLOAT NOT NULL
);

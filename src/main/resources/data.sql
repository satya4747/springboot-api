DROP TABLE IF EXISTS Employee;
 
CREATE TABLE Employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  age VARCHAR(250) NOT NULL,
  mobileNumber VARCHAR(250) NOT NULL,
  datetime datetime NOT NULL
  
);

INSERT INTO Employee (id, name, age, mobileNumber, datetime) VALUES ('1', 'Satya1', '37', '9212009313', '2022-05-18 18:00:00');

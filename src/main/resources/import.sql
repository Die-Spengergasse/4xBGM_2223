-- todo add your insert into statements here
-- you can test your statements by entering http://localhost:8080/h2-console

-- codings
INSERT INTO CODING VALUES (0, 'BP', 'Billing contact person', 'https://terminology.hl7.org/5.0.0/CodeSystem-v2-0131.html', null, null);
INSERT INTO CODING VALUES (1, 'CP', 'Contact person', 'https://terminology.hl7.org/5.0.0/CodeSystem-v2-0131.html', null, null);
INSERT INTO CODING VALUES (2, 'EP', 'Emergency contact person', 'https://terminology.hl7.org/5.0.0/CodeSystem-v2-0131.html', null, null);
INSERT INTO CODING VALUES (3, 'PR', 'Person preparing referral', 'https://terminology.hl7.org/5.0.0/CodeSystem-v2-0131.html', null, null);
INSERT INTO CODING VALUES (4, 'E', 'Employer', 'https://terminology.hl7.org/5.0.0/CodeSystem-v2-0131.html', null, null);


-- codeable concepts
INSERT INTO PATIENT_CONTACT_RELATIONSHIP VALUES (0, 'Contact person 0');

-- associations
INSERT INTO CODEABLE_CONCEPT_CODING VALUES (0, 1);
INSERT INTO CODEABLE_CONCEPT_CODING VALUES (0, 2);
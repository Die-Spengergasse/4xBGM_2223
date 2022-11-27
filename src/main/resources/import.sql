-- todo add your insert into statements here
-- you can test your statements by entering http://localhost:8080/h2-console

-- codes for codeable concepts
INSERT INTO CODING(ID, CODE, SYSTEM, DISPLAY,USER_SELECTED, VERSION) VALUES (0,'BP','http://terminology.hl7.org/CodeSystem/v2-0131','Billing contact person',null,null);
INSERT INTO CODING(ID, CODE, SYSTEM, DISPLAY,USER_SELECTED, VERSION) VALUES (1,'CP','http://terminology.hl7.org/CodeSystem/v2-0131','Contact person',null,null);
INSERT INTO CODING(ID, CODE, SYSTEM, DISPLAY,USER_SELECTED, VERSION) VALUES (2,'EP','http://terminology.hl7.org/CodeSystem/v2-0131','Emergency contact person',null,null);
INSERT INTO CODING(ID, CODE, SYSTEM, DISPLAY,USER_SELECTED, VERSION) VALUES (3,'PR','http://terminology.hl7.org/CodeSystem/v2-0131','Person preparing referral',null,null);
INSERT INTO CODING(ID, CODE, SYSTEM, DISPLAY,USER_SELECTED, VERSION) VALUES (4,'E','http://terminology.hl7.org/CodeSystem/v2-0131','Employer',null,null);
INSERT INTO CODING(ID, CODE, SYSTEM, DISPLAY,USER_SELECTED, VERSION) VALUES (5,'C','http://terminology.hl7.org/CodeSystem/v2-0131','Emergency Contact',null,null);
INSERT INTO CODING(ID, CODE, SYSTEM, DISPLAY,USER_SELECTED, VERSION) VALUES (6,'F','http://terminology.hl7.org/CodeSystem/v2-0131','Federal Agency',null,null);
INSERT INTO CODING(ID, CODE, SYSTEM, DISPLAY,USER_SELECTED, VERSION) VALUES (7,'I','http://terminology.hl7.org/CodeSystem/v2-0131','Insurance Company',null,null);
INSERT INTO CODING(ID, CODE, SYSTEM, DISPLAY,USER_SELECTED, VERSION) VALUES (8,'N','http://terminology.hl7.org/CodeSystem/v2-0131','Next-of-Kin',null,null);
INSERT INTO CODING(ID, CODE, SYSTEM, DISPLAY,USER_SELECTED, VERSION) VALUES (9,'S','http://terminology.hl7.org/CodeSystem/v2-0131','State Agency',null,null);
INSERT INTO CODING(ID, CODE, SYSTEM, DISPLAY,USER_SELECTED, VERSION) VALUES (10,'U','http://terminology.hl7.org/CodeSystem/v2-0131','Unknown',null,null);

-- sql erstellt von kraft
-- relationship example contact
INSERT INTO PATIENT_CONTACT_RELATIONSHIP VALUES(0, 'Example contact');
INSERT INTO CODEABLE_CONCEPT_CODING VALUES(0, 1);
--INSERT INTO CODEABLE_CONCEPT_CODING VALUES(1, 0);



-- ende sql kraft


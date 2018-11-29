--ȸ�� ���̺�(�θ� ���̺�)
CREATE TABLE USERINFO(
ID VARCHAR2(20) PRIMARY KEY, --ȸ�� ID
NAME VARCHAR2(20) NOT NULL,
GENDER CHAR(1) DEFAULT 'M'  --���� M: ����, F: ����
);

--ȸ�� ���� ���̺�(�ڽ� ���̺�)
CREATE TABLE USERADDR(
ID VARCHAR2(20) UNIQUE,  --ȸ�� ID FK
PHONE VARCHAR2(50) NOT NULL,  --��ȭ��ȣ
ADDRESS VARCHAR2(100) NOT NULL,  --�ּ�
CONSTRAINT USERADDR_FK FOREIGN KEY(ID)
REFERENCES USERINFO(ID) ON DELETE CASCADE);

--����
INSERT INTO USERINFO VALUES('AAA', '�����', 'M');
INSERT INTO USERINFO VALUES('BBB', '�����', 'F');
INSERT INTO USERINFO VALUES('CCC', '�����', 'F');
INSERT INTO USERADDR VALUES('AAA', '010-0000-1111', '����� ��õ�� �ſ���');
INSERT INTO USERADDR VALUES('BBB', '010-8312-1234', '������ ��õ�� �ɻ�');
COMMIT;

SELECT * FROM USERINFO;
SELECT * FROM USERADDR;
SELECT * FROM USERINFO LEFT OUTER JOIN USERADDR USING(ID);

SELECT 
i.id
 , i.name
 , decode(i.gender,'M','����','F','����',' ') gender
 , nvl(a.phone, ' ') phone
 , nvl(a.address, ' ') address

FROM USERINFO i, USERADDR a 

where i.id = a.id(+);
commit;




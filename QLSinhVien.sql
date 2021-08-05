create database QLSinhVien;

use QLSinhVien;

Create table SinhVien (
	MSSV char(8) primary key,
	HoTenSV nvarchar(50) not null,
	NgaySinh date not null,
	GioiTinh bit not null,----1 là nam,0 là nữ
	Lop char(8) not null,
	NganhHoc nvarchar(50) not null,
	KhoaHoc nvarchar(10) not null, ---khóa học
	Khoa nvarchar(100) not null, ---khoa
	MatKhau nvarchar(30) not null,
);

Create table GiangVien (
	MaGV char(6) primary key,
	HoTenGV nvarchar(50) not null,
	MatKhau nvarchar(30) not null,
);

Create table MonHoc (
	MaMon char(5) primary key,
	TenMon nvarchar(50) not null,
	TinChi int not null,
);

Create table GiangDay (
	Nhom char(7) not null primary key,---mamon + ki + sonhom
	MaGV char(6) references GiangVien(MaGV),
	MaMon char(5) references MonHoc(MaMon),
	NamHoc nvarchar(10) not null,
	HocKy nvarchar(6) not null,
);

Create table DiemMH (
	MSSV char(8) references SinhVien(MSSV),
	MaMon char(5) references MonHoc(MaMon),
	DiemSo float(1),
	DiemChu varchar(2),
	Nhom char(7) references GiangDay(Nhom),
);

drop table SinhVien;
drop table GiangVien;
drop table MonHoc;
drop table GiangDay;
drop table DiemMH;


-----Them du lieu vao bang SinhVien------
Insert into SinhVien values ('B1805737', N'Đỗ Thị Hồng An', '2000-02-29', '0', 'DI1896A1', N'Kỹ thuật phần mềm', '44 (2018)', N'Công nghệ thông tin và truyền thông', 'dthan123');
Insert into SinhVien values ('B1805784', N'Vũ Ngọc Long', '2000-03-30', '1', 'DI1896A1', N'Kỹ thuật phần mềm', '44 (2018)', N'Công nghệ thông tin và truyền thông', 'vnlong123');
Insert into SinhVien values ('B1805758', N'Trần Đăng Giang Hòa', '2000-09-09', '1', 'DI1896A1', N'Kỹ thuật phần mềm', '44 (2018)', N'Công nghệ thông tin và truyền thông', 'tdgh123');
Insert into SinhVien values ('B1805766', N'Vũ Quang Hưng', '2000-10-21', '1', 'DI1896A1', N'Kỹ thuật phần mềm', '44 (2018)', N'Công nghệ thông tin và truyền thông', 'vqh123');
Insert into SinhVien values ('B1805808', N'Võ Khánh Quí', '2000-04-17', '1', 'DI1896A1', N'Kỹ thuật phần mềm', '44 (2018)', N'Công nghệ thông tin và truyền thông', 'vkq123');
Insert into SinhVien values ('B1805799', N'Nguyễn Thị Nhiên', '2000-06-04', '0', 'DI1896A1', N'Kỹ thuật phần mềm', '44 (2018)', N'Công nghệ thông tin và truyền thông', 'ntn123');

select * from SinhVien;


------Them du lieu vao bang GiangVien---------
Insert into GiangVien values ('TTTT01',N'Trương Thị Thanh Tuyền','TTTT01');
Insert into GiangVien values ('TMT002',N'Trương Minh Thái','TMT002');
Insert into GiangVien values ('HQN003',N'Huỳnh Quang Nghi','HQN003');
Insert into GiangVien values ('HXH004',N'Huỳnh Xuân Hiệp','HXH004');
Insert into GiangVien values ('LNK005',N'Lâm Nhựt Khang','LNK005');

select * from GiangVien;

------Them du lieu vao bang MonHoc--------

insert into MonHoc values ('CT176', N'Lập trình hướng đối tượng', '3');
insert into MonHoc values ('TC025', N'Cờ vua 1', '1');
insert into MonHoc values ('TN012', N'Đại số tuyến tính và hình học', '4');
insert into MonHoc values ('CT103', N'Cấu trúc dữ liệu', '4');
insert into MonHoc values ('KL001', N'Pháp luật đại cương', '2');
insert into MonHoc values ('CT112', N'Mạng máy tính', '3');
insert into MonHoc values ('CT241', N'Phân tích yêu cầu phần mềm', '3');
insert into MonHoc values ('CT240', N'Nguyên lý xây dựng phần mềm', '3');
insert into MonHoc values ('CT276', N'Lập trình Java', '3');
insert into MonHoc values ('CT205', N'Hệ quản trị cơ sở dữ liệu', '3');

select * from MonHoc;


----Them du lieu vao bang GiangDay-----

insert into GiangDay values('CT10311','TTTT01','CT103','2019-2020','HK 1');
insert into GiangDay values('CT10314','TTTT01','CT103','2019-2020','HK 1');

insert into GiangDay values('TC02511','TTTT01','TC025','2019-2020','HK 1');
insert into GiangDay values('TC02512','TTTT01','TC025','2019-2020','HK 1');

insert into GiangDay values('TN01211','LNK005','TN012','2019-2020','HK 1');
insert into GiangDay values('TN01212','LNK005','TN012','2019-2020','HK 1');

insert into GiangDay values('CT17611','HQN003','CT176','2019-2020','HK 1');
insert into GiangDay values('CT17612','HQN003','CT176','2019-2020','HK 1');

insert into GiangDay values('KL00111','HXH004','KL001','2019-2020','HK 1');
insert into GiangDay values('KL00112','HXH004','KL001','2019-2020','HK 1');

insert into GiangDay values('CT11211','LNK005','CT112','2019-2020','HK 1');
insert into GiangDay values('CT11212','LNK005','CT112','2019-2020','HK 1');

insert into GiangDay values('CT24111','TMT002','CT241','2019-2020','HK 1');
insert into GiangDay values('CT24112','TMT002','CT241','2019-2020','HK 1');

insert into GiangDay values('CT24011','HXH004','CT240','2019-2020','HK 1');
insert into GiangDay values('CT24012','HXH004','CT240','2019-2020','HK 1');

insert into GiangDay values('CT20511','TMT002','CT205','2019-2020','HK 1');
insert into GiangDay values('CT20512','TMT002','CT205','2019-2020','HK 1');

insert into GiangDay values('CT27611','HQN003','CT276','2019-2020','HK 1');
insert into GiangDay values('CT27612','HQN003','CT276','2019-2020','HK 1');

insert into GiangDay values('CT10321','TTTT01','CT103','2019-2020','HK 2');
insert into GiangDay values('CT10322','TTTT01','CT103','2019-2020','HK 2');

insert into GiangDay values('TC02521','TTTT01','TC025','2019-2020','HK 2');
insert into GiangDay values('TC02522','TTTT01','TC025','2019-2020','HK 2');

insert into GiangDay values('TN01221','LNK005','TN012','2019-2020','HK 2');
insert into GiangDay values('TN01222','LNK005','TN012','2019-2020','HK 2');

insert into GiangDay values('CT17621','HQN003','CT176','2019-2020','HK 2');
insert into GiangDay values('CT17622','HQN003','CT176','2019-2020','HK 2');

insert into GiangDay values('KL00121','HXH004','KL001','2019-2020','HK 2');
insert into GiangDay values('KL00122','HXH004','KL001','2019-2020','HK 2');

insert into GiangDay values('CT11221','LNK005','CT112','2019-2020','HK 2');
insert into GiangDay values('CT11222','LNK005','CT112','2019-2020','HK 2');

insert into GiangDay values('CT24121','TMT002','CT241','2019-2020','HK 2');
insert into GiangDay values('CT24122','TMT002','CT241','2019-2020','HK 2');

insert into GiangDay values('CT24021','HXH004','CT240','2019-2020','HK 2');
insert into GiangDay values('CT24022','HXH004','CT240','2019-2020','HK 2');

insert into GiangDay values('CT20521','TMT002','CT205','2019-2020','HK 2');
insert into GiangDay values('CT20522','TMT002','CT205','2019-2020','HK 2');

insert into GiangDay values('CT27621','HQN003','CT276','2019-2020','HK 2');
insert into GiangDay values('CT27622','HQN003','CT276','2019-2020','HK 2');


select * from GiangDay


-----Them du lieu vao bang DiemMH-----
---AN---
insert into DiemMH values('B1805737','CT176','7.8','B','CT17611');
insert into DiemMH values('B1805737','CT103','8.0','B+','CT10311');
insert into DiemMH values('B1805737','TC025','7.0','B','TC02511');
insert into DiemMH values('B1805737','TN012','7.0','B','TN01211');
insert into DiemMH values('B1805737','KL001','5.8','C','KL00111');

insert into DiemMH values('B1805737','CT112','','','CT11222');
insert into DiemMH values('B1805737','CT241','','','CT24122');
insert into DiemMH values('B1805737','CT240','','','CT24022');
insert into DiemMH values('B1805737','CT205','','','CT20522');
insert into DiemMH values('B1805737','CT276','','','CT27622');


---LONG---
insert into DiemMH values('B1805784','CT176','7.8','B','CT17611');
insert into DiemMH values('B1805784','CT103','8.5','B+','CT10311');
insert into DiemMH values('B1805784','TC025','7.0','B','TC02511');
insert into DiemMH values('B1805784','TN012','7.2','B','TN01211');
insert into DiemMH values('B1805784','KL001','6.0','C+','KL00111');

insert into DiemMH values('B1805784','CT112','','','CT11222');
insert into DiemMH values('B1805784','CT241','','','CT24122');
insert into DiemMH values('B1805784','CT240','','','CT24022');
insert into DiemMH values('B1805784','CT205','','','CT20522');
insert into DiemMH values('B1805784','CT276','','','CT27622');


----HÒA----
insert into DiemMH values('B1805758','CT176','7.8','B','CT17611');
insert into DiemMH values('B1805758','CT103','8.0','B+','CT10311');
insert into DiemMH values('B1805758','TC025','7.0','B','TC02511');
insert into DiemMH values('B1805758','TN012','7.0','B','TN01211');
insert into DiemMH values('B1805758','KL001','5.8','C','KL00111');

insert into DiemMH values('B1805758','CT112','','','CT11222');
insert into DiemMH values('B1805758','CT241','','','CT24122');
insert into DiemMH values('B1805758','CT240','','','CT24022');
insert into DiemMH values('B1805758','CT205','','','CT20522');
insert into DiemMH values('B1805758','CT276','','','CT27622');

----HƯNG----
insert into DiemMH values('B1805766','CT176','7.8','B','CT17612');
insert into DiemMH values('B1805766','CT103','8.0','B+','CT10314');
insert into DiemMH values('B1805766','TC025','7.0','B','TC02512');
insert into DiemMH values('B1805766','TN012','7.0','B','TN01212');
insert into DiemMH values('B1805766','KL001','5.8','C','KL00112');

insert into DiemMH values('B1805766','CT112','','','CT11221');
insert into DiemMH values('B1805766','CT241','','','CT24121');
insert into DiemMH values('B1805766','CT240','','','CT24021');
insert into DiemMH values('B1805766','CT205','','','CT20521');
insert into DiemMH values('B1805766','CT276','','','CT27621');

-----QUÝ----
insert into DiemMH values('B1805808','CT176','7.8','B','CT17612');
insert into DiemMH values('B1805808','CT103','8.0','B+','CT10314');
insert into DiemMH values('B1805808','TC025','7.0','B','TC02512');
insert into DiemMH values('B1805808','TN012','7.0','B','TN01212');
insert into DiemMH values('B1805808','KL001','5.8','C','KL00112');

insert into DiemMH values('B1805808','CT112','','','CT11221');
insert into DiemMH values('B1805808','CT241','','','CT24121');
insert into DiemMH values('B1805808','CT240','','','CT24021');
insert into DiemMH values('B1805808','CT205','','','CT20521');
insert into DiemMH values('B1805808','CT276','','','CT27621');

----NHIÊN----
insert into DiemMH values('B1805799','CT176','7.8','B','CT17612');
insert into DiemMH values('B1805799','CT103','8.0','B+','CT10314');
insert into DiemMH values('B1805799','TC025','7.0','B','TC02512');
insert into DiemMH values('B1805799','TN012','7.0','B','TN01212');
insert into DiemMH values('B1805799','KL001','5.8','C','KL00112');

insert into DiemMH values('B1805799','CT112','','','CT11221');
insert into DiemMH values('B1805799','CT241','','','CT24121');
insert into DiemMH values('B1805799','CT240','','','CT24021');
insert into DiemMH values('B1805799','CT205','','','CT20521');
insert into DiemMH values('B1805799','CT276','','','CT27621');

select * from DiemMH
DROP TABLE DIEMMH
--------

Select distinct NamHoc, HocKy 
from GiangDay G join DiemMH D on G.Nhom=D.Nhom
where D.MSSV='B1805737';

select M.MaMon, M.TenMon, G.Nhom, M.TinChi, D.DiemChu, D.DiemSo
from GiangDay G join MonHoc M on G.MaMon=M.MaMon 
				join DiemMH D on G.Nhom=D.Nhom
where G.NamHoc='2019-2020' and D.MSSV='B1805737' and G.HocKy='HK 2';

select G.MaMon, M.TenMon, G.Nhom
from GiangDay G join MonHoc M on G.MaMon = M.MaMon
where G.MaGV='TTTT01';

select S.MSSV, S.HoTenSV, D.DiemSo
from GiangDay G join GiangVien V on G.MaGV=V.MaGV
				join DiemMH D on G.Nhom = D.Nhom
				join SinhVien S on D.MSSV=S.MSSV
where G.Nhom='CT10301' and G.MaGV = 'TTTT01';

Select * from DiemMH where Nhom='CT10301';

update DiemMH set DiemSo='9.0' where MSSV='B1805737' and Nhom='CT10301';

update SinhVien set HoTenSV='Hihiiiii', NgaySinh='2000-05-25', GioiTinh='0', Lop='DI1896A1',
					NganhHoc='KHMT', KhoaHoc='44 (2018)', Khoa='CNTT&TT' 
where MSSV='B1805555';

select * from SinhVien;

Select * from DiemMH where MSSV='B1805737' and Nhom='CT10304';

Select distinct HocKy from GiangDay where MaGV='TTTT01';
Select distinct NamHoc from GiangDay where MaGV='TTTT01';
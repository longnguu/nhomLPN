create database QuanLyTiemNet
go
use QuanLyTiemNet
go
create table KhachHang(
Id int identity(1,1) primary key,
ten nvarchar(100),
heSoTien float,
napTien money,
tienNo money,
TaiKhoan varchar(100) unique,
MatKhau varchar(100),
CMND varchar(100) unique,
DiaChi varchar(100),
quyen varchar(50)
)
go
create table thucPham(
Id int identity(1,1) primary key,
Ten nvarchar(100) unique,
Gia money,
soLuong int
)
go
create table Doanhthu(
id int identity(1,1) primary key,
ngay datetime,
doanhThu money,
ghichu nvarchar(1000),
)
go
create table May(
id varchar(100) primary key,
idKhach int,
donGia money,
nbd datetime,
)
insert into KhachHang(ten,heSoTien,napTien,tienNo,TaiKhoan,MatKhau,CMND,Diachi,	quyen)
values	('Admin',null,null,null,'admin','passwordadmin@@1','123456',null,'admin'),
		('Le Van Long',1,100000,100000,'long','123456','1234567','Quang Tri','user'),
		('Phan Quang Nha',1,100000,100000,'nha','123456','1234568','Quang Binh','user'),
		('Vo Minh Loi',1,100000,100000,'loi','123456','1234569','Gia Lai','user'),
		('Doan Thai Phien',1,100000,100000,'phien','123456','1234570','Da Nang','user'),
		('Dao Viet Giao',1,100000,100000,'giao','123456','1234571','Quang Nam','user')
go
insert into thucPham(Ten,Gia,soLuong)
values	('CoCa',10000,100),
		('Pepsi',10000,100),
		('Redbull',13000,80)
go
insert into DoanhThu(ngay,doanhThu,ghiChu)
values	('2022/04/25',-1000000,'Nhap thuc pham'),
		('2022/04/26',-1000000,'Nhap thuc pham'),
		('2022/05/01',-1040000,'Nhap thuc pham')
go
create or alter trigger cntn
on May
after delete
as
begin
	declare @tt as money
	select @tt= DATEDIFF(mi,d.nbd,getdate())*donGia/60
	from deleted as d

	print @tt

	update KhachHang
	set tienNo=tienNo-@tt
	from deleted as d,KhachHang as k
	where k.id=d.idKhach

	insert into Doanhthu(ngay,doanhThu,ghichu)
	values (GETDATE(),@tt,'Tien may')
end
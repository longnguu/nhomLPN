create database QuanLyTiemNet
go
use QuanLyTiemNet
go
create table KhachHang(
Id int identity(1,1) primary key,
ten nvarchar(100),
heSoTien int,
napTien money,
tienNo money,
TaiKhoan varchar(100) unique,
MatKhau varchar(100),
quyen varchar(50)
)
go
create table thucPham(
Id int identity(1,1) primary key,
Ten nvarchar(100),
Gia money,
soLuong int
)
go
create table Doanhthu(
id int identity(1,1) primary key,
ngay datetime,
doanhThu money,
)
go
create table May(
id varchar(100) primary key,
idKhach int,
donGia money,
)
insert into KhachHang(ten,heSoTien,napTien,tienNo,TaiKhoan,MatKhau,	quyen)
values	('Admin',null,null,null,'admin','passwordadmin@@1','admin'),
		('Le Van Long',10,10000,0,'long','123456','user'),
		('Phan Quang Nha',10,10000,0,'nha','123456','user'),
		('Vo Minh Loi',10,10000,0,'loi','123456','user'),
		('Doan Thai Phien',10,10000,0,'phien','123456','user'),
		('Dao Viet Giao',10,10000,0,'giao','123456','user')
use DPStore

create table Employees(
	employeeID int primary key identity(1, 1),
	firstName varchar(20) not null
	lastName varchar(20) not null
)

create table Cities(
	zipcode varchar(10) primary key,
	cityName varchar(60) not null
)

create table Addresses(
	addressID int primary key identity(1, 1),
	streetName varchar(60) not null,
	houseNumber int not null,
	floorNumber int,
	doorNumber int,
	fk_zipcode varchar(10) foreign key references Cities(zipcode) not null
)

create table Customers(
	customerID int primary key identity(1, 1),
	firstName varchar(20) not null
	lastName varchar(20) not null
	phone varchar(20) not null,
	fk_addressID int foreign key references Addresses(addressID) not null
)

create table Invoices(
	invoiceNumber int primary key identity(1, 1),
	paymentDate date not null,
	paymentAmount decimal not null,
	isPaid bit not null
)

create table SaleOrders(
	orderNumber int primary key identity(1, 1),
	date date not null,
	totalPrice decimal not null,
	deliveryStatus varchar(60) not null,
	deliveryDate date not null,
	fk_invoiceNumber int foreign key references Invoices(invoiceNumber) not null,
	fk_customerID int foreign key references Customers(customerID),
	fk_employeeID int foreign key references Employees(employeeID) not null
)

create table Countries(
	countryID int primary key identity(1, 1),
	country varchar(30) not null
)

create table Suppliers(
	supplierID int primary key identity(1, 1),
	name varchar(40) not null,
	phone varchar(20) not null,
	email varchar(60) not null,
	fk_addressID int foreign key references Addresses(addressID) not null,
	fk_countryID int foreign key references Countries(countryID) not null
)

create table Products(
	productID int primary key identity(1, 1),
	name varchar(60) not null,
	barcode varchar(60) not null,
	countryOfOrigin varchar(30) not null,
	minStock int not null,
	fk_supplierID int foreign key references Suppliers(supplierID) not null
)

create table OrderLines(
	fk_orderNumber int foreign key references SaleOrders(orderNumber),
	quantity int not null,
	fk_productID int foreign key references Products(productID),
	primary key (fk_orderNumber, fk_productID)
)

create table Prices(
	fk_productID int foreign key references Products(productID),
	date date,
	price decimal not null,
	primary key (fk_productID, date)
)

create table Clothes(
	fk_productID int foreign key references Products(productID) primary key,
	size int not null,
	color varchar(20) not null
)

create table Equipment(
	fk_productID int foreign key references Products(productID) primary key,
	type varchar(60),
	description varchar(100)
)

create table GunReplicas(
	fk_productID int foreign key references Products(productID) primary key,
	calibre decimal not null,
	material varchar(60) not null
)

create table Warehouses(
	warehouseID int primary key identity(1, 1),
	fk_addressID int foreign key references Addresses(addressID)
)

create table Stocks(
	fk_warehouseID int foreign key references Warehouses(warehouseID),
	fk_productID int foreign key references Products(productID),
	quantity int not null,
	primary key (fk_warehouseID, fk_productID)
)
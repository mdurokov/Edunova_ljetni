drop database if exists wca_db;
create database wca_db;
use wca_db;

create table countries(
	id int unsigned not null primary key auto_increment,
	continent_id int unsigned not null,
	name varchar(50) not null,
	iso2 char(2) not null
);


create table continents(
	id int unsigned not null primary key auto_increment,
	name varchar(50) not null,
	recordName char(3) not null,
	latitude int(11) not null,
	longitude int(11) not null,
	zoom tinyint(4) not null
);

create table persons(
	id int unsigned not null primary key  auto_increment,
	country_id int unsigned not null,
	tag varchar(10) not null,
	name varchar(80) not null,
	gender char(1) not null
);

create table competitions(
	id int unsigned not null primary key auto_increment,
	country_id int unsigned not null,
	name varchar(255) not null,
	city varchar(50) not null,
	information text,
	startDay smallint(2) unsigned not null,
	startMonth smallint(2) unsigned not null,
	Year smallint(4) unsigned not null,
	endDay smallint(2) unsigned not null,
	endMonth smallint(2) unsigned not null,
	eventSpecs varchar(255),
	wcaDelegate varchar(255),
	organisier varchar(50),
	venue varchar(255),
	venueAddress varchar(120),
	venueDetails varchar(255),
	website varchar(255),
	cellName varchar(50) not null,
	latitude int(11),
	longitude int(11)
);

create table events(
	id int unsigned not null primary key auto_increment,
	name varchar(50) not null,
	rank int unsigned not null,
	format varchar(10) not null,
	cellName varchar(50) not null
);

create table roundTypes(
	id int unsigned not null primary key auto_increment,
	rank int unsigned not null,
	name varchar(50) not null,
	cellName varchar(50) not null,
	final boolean not null default false
);

create table formats(
	id int unsigned not null primary key auto_increment,
	name varchar(50) not null
);

create table ranksSingle(
	person_id int unsigned not null,
	event_id int unsigned not null,
	best int(11) unsigned not null,
	worldRank int(11) unsigned not null,
	continentRank int(11) unsigned not null,
	countryRank int(11) unsigned not null
);

create table ranksAverage(
	person_id int unsigned not null,
	event_id int unsigned not null,
	best int(11) unsigned not null,
	worldRank int(11) unsigned not null,
	continentRank int(11) unsigned not null,
	countryRank int(11) unsigned not null
);

create table scrambles(
	id int unsigned not null primary key auto_increment,
	competition_id int unsigned not null,
	event_id int unsigned not null,
	roundType_id int unsigned not null,
	`group` varchar(3) not null,
	isExtra boolean not null default false,
	scrambleNum int(11) not null,
	scramble text not null
);

create table results(
	id int unsigned not null,
	competition_id int unsigned not null,
	event_id int unsigned not null,
	roundType_id int unsigned not null,
	person_id int unsigned not null,
	format_id int unsigned not null,
	pos smallint(6) not null,
	best int (11) not null,
	average int (11) not null,
	value1 int(11) not null,
	value2 int(11) not null,
	value3 int(11) not null,
	value4 int(11) not null,
	value5 int(11) not null,
	regionalSingleRecord char(3),
	regionalAverageRecord char(3)
);

alter table countries add foreign key (continent_id) references continents(id);
alter table competitions add foreign key (country_id) references countries(id);
alter table results add foreign key (competition_id) references competitions(id);
alter table results add foreign key (event_id) references events(id);
alter table results add foreign key (roundType_id) references roundTypes(id);
alter table results add foreign key (person_id) references persons(id);
alter table results add foreign key (format_id) references formats(id);
alter table persons add foreign key (country_id) references countries(id);
alter table ranksSingle add foreign key (person_id) references persons(id);
alter table ranksSingle add foreign key (event_id) references events(id);
alter table ranksAverage add foreign key (person_id) references persons(id);
alter table ranksAverage add foreign key (event_id) references events(id);
alter table scrambles add foreign key (competition_id) references competitions(id);
alter table scrambles add foreign key (event_id) references events(id);
alter table scrambles add foreign key (roundType_id) references roundTypes(id);
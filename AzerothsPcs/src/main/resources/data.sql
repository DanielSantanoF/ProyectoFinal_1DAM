insert into Datos_De_Compra (id, tarjeta_De_Credito, codigo_Postal, direccion, hora_Entrega, comentarios_Extra, telefono_Contacto, email_Contacto) values (NEXTVAL('hibernate_sequence'), '6767929598305126', '75290', 'Loeprich', '6:30 PM', 'L', '711-843-2550', 'vsebastian0@craigslist.org');
insert into usuario (id, nombre, apellidos, dni, password, email, admin, Datos_De_Compra_Id) values (NEXTVAL('hibernate_sequence'), 'Franny', 'Goodlife', '40953877A', '1234', 'fgoodlife0@wikispaces.com', true, 1);
insert into Datos_De_Compra (id, tarjeta_De_Credito, codigo_Postal, direccion, hora_Entrega, comentarios_Extra, telefono_Contacto, email_Contacto) values (NEXTVAL('hibernate_sequence'), '6761626824610641373', '6', '1st', '4:07 PM', 'F', '620-111-7569', 'arigden1@ox.ac.uk');
insert into usuario (id, nombre, apellidos, dni, password, email, admin, Datos_De_Compra_Id) values (NEXTVAL('hibernate_sequence'), 'Lu', 'Helbeck', '91628755R', '1234', 'lhelbeck1@webeden.co.uk', false, 3);
insert into Datos_De_Compra (id, tarjeta_De_Credito, codigo_Postal, direccion, hora_Entrega, comentarios_Extra, telefono_Contacto, email_Contacto) values (NEXTVAL('hibernate_sequence'), '0604769022337410140', '92', 'Buhler', '8:29 PM', 'S', '651-762-9150', 'mswindles2@soundcloud.com');
insert into usuario (id, nombre, apellidos, dni, password, email, admin, Datos_De_Compra_Id) values (NEXTVAL('hibernate_sequence'), 'Edwina', 'Kemmet', '03649018D', '1234', 'ekemmet2@zdnet.com', false, 5);
insert into Datos_De_Compra (id, tarjeta_De_Credito, codigo_Postal, direccion, hora_Entrega, comentarios_Extra, telefono_Contacto, email_Contacto) values (NEXTVAL('hibernate_sequence'), '3574574796303984', '5', 'Meadow Valley', '8:22 AM', 'Z', '485-241-4402', 'tknobell3@prnewswire.com');
insert into usuario (id, nombre, apellidos, dni, password, email, admin, Datos_De_Compra_Id) values (NEXTVAL('hibernate_sequence'), 'Eduard', 'Denney', '03986580W', '1234', 'edenney3@angelfire.com', false, 7);
insert into Datos_De_Compra (id, tarjeta_De_Credito, codigo_Postal, direccion, hora_Entrega, comentarios_Extra, telefono_Contacto, email_Contacto) values (NEXTVAL('hibernate_sequence'), '30102141794535', '75560', 'Pierstorff', '11:51 PM', 'F', '585-165-8435', 'cweathey4@altervista.org');
insert into usuario (id, nombre, apellidos, dni, password, email, admin, Datos_De_Compra_Id) values (NEXTVAL('hibernate_sequence'), 'Ludovika', 'Bachelor', '46585307J', '1234', 'lbachelor4@pen.io', false, 9);
insert into Datos_De_Compra (id, tarjeta_De_Credito, codigo_Postal, direccion, hora_Entrega, comentarios_Extra, telefono_Contacto, email_Contacto) values (NEXTVAL('hibernate_sequence'), '30497860510199', '602', 'Arapahoe', '6:13 PM', 'K', '985-311-6616', 'amaccallam5@privacy.gov.au');
insert into usuario (id, nombre, apellidos, dni, password, email, admin, Datos_De_Compra_Id) values (NEXTVAL('hibernate_sequence'), 'Suellen', 'Schapiro', '62923098G', '49hB2VuW', 'sschapiro5@blogtalkradio.com', false, 11);
insert into Datos_De_Compra (id, tarjeta_De_Credito, codigo_Postal, direccion, hora_Entrega, comentarios_Extra, telefono_Contacto, email_Contacto) values (NEXTVAL('hibernate_sequence'), '3547074621755064', '812', 'Birchwood', '1:11 AM', 'S', '587-468-3592', 'mcorstan6@dailymail.co.uk');
insert into usuario (id, nombre, apellidos, dni, password, email, admin, Datos_De_Compra_Id) values (NEXTVAL('hibernate_sequence'), 'Ode', 'Crichmer', '28254864F', '1234', 'ocrichmer6@mit.edu', true, 13);
insert into Datos_De_Compra (id, tarjeta_De_Credito, codigo_Postal, direccion, hora_Entrega, comentarios_Extra, telefono_Contacto, email_Contacto) values (NEXTVAL('hibernate_sequence'), '337941834482274', '53', 'School', '8:03 PM', 'G', '259-850-4387', 'zcornier7@geocities.jp');
insert into usuario (id, nombre, apellidos, dni, password, email, admin, Datos_De_Compra_Id) values (NEXTVAL('hibernate_sequence'), 'Lowe', 'Splain', '94542031A', '1234', 'lsplain7@studiopress.com', false, 15);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Kingston DataTraveler 32GB', 'USB 3.0 de próxima generación', '6.5', false, '6.5', '618', true, '/images/kingstonDatatraveler.jpg', 'Kingston');
insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'ASUS DUAL-GTX1060-O6G', 'La potente targeta 1060 de ASUS', '305.70', true, '270', '30', true, '/images/AsusGtx1060.jpg', 'ASUS');
insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Alfombrilla MARS', 'Alfombrilla gaming de tamaño pequeño', '15', false, '15', '412', true, '/images/AlfombrillaMars.jpg', 'Mars');
insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'AzerothPC Gold', 'Nuestro producto esrella', '1299.99', true, '1116', '100', true, '/images/AzerothPCGold.jpg', 'AzerothPcs');

insert into componentes (memoria, velocidad, socket, tipo_Memoria, id) values ('6GB', '1708 MHz', 'ninguno', 'GDDR5', 18);
insert into accesorios (tipo, capacidad, id) values ('Alfombrilla', '0.0', 19);
insert into ordenador (procesador, ram, disco_Duro, sistema_Operativo, tipo, dimensiones, id) values ('Intel Core i5-9600K 3.7Ghz', '16', 'HDD 2TB SATA3 SSD 240GB SATA3', 'Windows 10', 'SobreMesa', '405x455x210mm (An x Al x Pr)', 20);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Logitech G430 Gaming', 'Auriculares gaming Logitech', '69.99', false, '69.99', '45', true, '/images/logitechg430.jpg', 'Logitech');
insert into accesorios (tipo, capacidad, id) values ('Auriculares', '0.0', 21);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Tacens Mars MM218', 'Raton óptico con 10000dpi', '69.99', false, '18', '780', true, '/images/tacensMars.jpg', 'Mars');
insert into accesorios (tipo, capacidad, id) values ('Raton', '0.0', 22);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Tempest Gaming M8', 'Compacto sistema de altavoces USB', '15.99', true, '12.99', '123', true, '/images/TempestGamingAltavoces.jpg', 'Tempest Gaming');
insert into accesorios (tipo, capacidad, id) values ('Altavoces', '0.0', 23);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Hanshi Spectrum', 'Teclado mecánico RGB de Newskill', '79.99', false, '79.99', '248', true, '/images/HanshiSpectrumNewskill.jpg', 'Newskill');
insert into accesorios (tipo, capacidad, id) values ('Teclado', '0.0', 24);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'BenQ GL2580H', 'Monitor de 24,5 pulgadas', '128.99', true, '99.99', '937', true, '/images/BenQGL2580H.jpg', 'BenQ');
insert into accesorios (tipo, capacidad, id) values ('Monitor', '0.0', 25);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'HP Pavilion 15-BC450NS', 'Portatil HP Pavilion', '649.99', false, '649.99', '887', true, '/images/HPPavilion.jpg', 'HP');
insert into ordenador (procesador, ram, disco_Duro, sistema_Operativo, tipo, dimensiones, id) values ('Intel® Core™ i5-8300H', '8', 'SATA de 1 TB 5400 rpm + SSD M.2 de 128 GB', 'Windows 10', 'Portatil', '38,24 x 25,25 x 2,45 cm', 26);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Bronze PRO MC', 'Sobremesa enfocado al gaming', '664.99', false, '664.99', '513', true, '/images/BronzePROMC.jpg', 'AzerothPcs');
insert into ordenador (procesador, ram, disco_Duro, sistema_Operativo, tipo, dimensiones, id) values ('Intel Core i5-8400 2.8GHz', '8', 'HDD 1TB SATA3', 'Windows 10', 'Sobremesa', '206 x 470 x 460 mm', 27);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'MSI GL63', 'Portatil MSI para gaming', '899', true, '799.99', '235', true, '/images/MsiGL63.jpg', 'MSI');
insert into ordenador (procesador, ram, disco_Duro, sistema_Operativo, tipo, dimensiones, id) values ('Coffeelake i7-8750H', '16', '512 GB NVMe PCIe SSD', 'Windows 10', 'Portatil', '383 x 260 x 29 mm', 28);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Custom PUBG', 'Sobremesa de PUBG', '4214.99', false, '4214.99', '20', true, '/images/PUBGCustom.jpg', 'AzerothPcs');
insert into ordenador (procesador, ram, disco_Duro, sistema_Operativo, tipo, dimensiones, id) values ('Intel Core i9-9900K 3.6Ghz', '32', 'Samsung 970 EVO Plus 1TB SSD NVMe M.2', 'Windows 10', 'Sobremesa', 'W: 230mm H: 500mm D: 494mm (without feet) / W: 230mm H: 522mm D: 494mm (with feet)', 29);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Lenovo Ideapad 330', 'Perfecto para el trabajo', '344.99', true, '200', '100', true, '/images/LenovoIdeapad.jpg', 'Lenovo');
insert into ordenador (procesador, ram, disco_Duro, sistema_Operativo, tipo, dimensiones, id) values ('AMD A4-9125 (2C, 2.3 / 2.6GHz, 1MB)', '8', '1TB 5400rpm', 'Windows 10', 'Portatil', '378 x 260 x 22.9 mm', 30);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Gigabyte GA-B360M', 'Placa base de Gigabyte', '71.99', true, '60', '1212', true, '/images/GigabyteGAB360M.jpg', 'Gigabyte');
insert into componentes (memoria, velocidad, socket, tipo_Memoria, id) values ('Intel® Optane ™', 'DDR4 2666/2400/2133 MHz', '8th Generation Intel® Core™ i7/i5 processor', 'ninguna', 31);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Intel Core i7-8700', 'Intel Core i7-8700 3.2Ghz BOX', '309.99', false, '309.99', '1678', true, '/images/IntelCoreI7.jpg', 'Intel');
insert into componentes (memoria, velocidad, socket, tipo_Memoria, id) values ('ninguna', '3200 MHz', 'Family Intel Core i7', 'ninguna', 32);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Kingston A400 SSD', 'SDD de Kingston', '31.99', true, '19.99', '78', true, '/images/KingstonSDD.jpg', 'Kingston');
insert into componentes (memoria, velocidad, socket, tipo_Memoria, id) values ('ninguna', '500 MB/s', 'ninguna', 'ninguna', 33);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Kingston HyperX DDR4', 'Rapida y fiable memoria RAM', '49', false, '49', '712', true, '/images/HyperXDDR4.jpg', 'Kingston');
insert into componentes (memoria, velocidad, socket, tipo_Memoria, id) values ('8GB', 'DDR4', 'ninguna', 'DDR4', 34);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Cooler Master Hyper TX3', 'Potente ventilador de cpu', '22.99', true, '19.99', '412', true, '/images/CoolerMasterHyperTX3.jpg', 'Cooler Master');
insert into componentes (memoria, velocidad, socket, tipo_Memoria, id) values ('ninguna', 'ninguna', 'AMD Socket FM1/FM2/AM3+/AM3/AM2+/AM2/AM4', 'ninguna', 35);

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Newskill Kitsune', 'Silla gaming', '139.99', true, '99.99', '318', true, '/images/NewskillKitsune.jpg', 'Newskill');

insert into producto (id, nombre, descripcion, precio, en_Oferta, precio_Con_Descuento, cantidad, disponible, imagen, marca) values (NEXTVAL('hibernate_sequence'), 'Logitech Webcam C920', 'Webcam de Logitech', '67.99', false, '67.99', '631', true, '/images/LogitechWebcamC920.jpg', 'Logitech');

insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Mollee', 'Whaymand', '79903773X', '1234', 'mwhaymand0@huffingtonpost.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Richie', 'Thickin', '93533700W', '1234', 'rthickin1@gravatar.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Vale', 'Shimon', '28654717Y', '1234', 'vshimon2@cafepress.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Camella', 'July', '32547335Q', '1234', 'cjuly3@mtv.com', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Vinita', 'Bubbins', '86188879M', '1234', 'vbubbins4@japanpost.jp', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Emmey', 'Dawe', '77186680Z', '1234', 'edawe5@booking.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Rubin', 'Romagosa', '00327580A', '1234', 'rromagosa6@livejournal.com', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Lyndy', 'Scotchmoor', '26661737N', '1234', 'lscotchmoor7@hostgator.com', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Foss', 'Sprigging', '23586258R', '1234', 'fsprigging8@behance.net', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Fran', 'Hutable', '26497938E', '1234', 'fhutable9@squarespace.com', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Tymon', 'Paradis', '77587081E', '1234', 'tparadisa@wiley.com', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Chrisse', 'Dockwray', '89540233Y', '1234', 'cdockwrayb@edublogs.org', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Herb', 'Bortoloni', '79670320Z', '1234', 'hbortolonic@purevolume.com', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Angeline', 'Danilovich', '79094862G', '1234', 'adanilovichd@go.com', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Wendye', 'Brunet', '73029502X', '1234', 'wbrunete@usa.gov', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Mary', 'Brereton', '95476696R', '1234', 'mbreretonf@webnode.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Sophronia', 'Seviour', '03152192K', '1234', 'sseviourg@linkedin.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Leonore', 'Liddington', '99190867D', '1234', 'lliddingtonh@1688.com', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Maia', 'Asp', '31748413X', '1234', 'maspi@reuters.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Slade', 'Barnett', '83979799F', '1234', 'sbarnettj@mail.ru', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Ralph', 'Kener', '14909024U', '1234', 'rkenerk@economist.com', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Ortensia', 'Borgnol', '42128967S', '1234', 'oborgnoll@xing.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Kevon', 'Kleszinski', '52179824K', '1234', 'kkleszinskim@blinklist.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Thedric', 'Blockey', '96603030K', '1234', 'tblockeyn@trellian.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Fidelio', 'Otson', '38995454U', '1234', 'fotsono@nyu.edu', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Barn', 'MacLaren', '06162119V', '1234', 'bmaclarenp@51.la', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Tabina', 'Dalgarno', '58731025N', '1234', 'tdalgarnoq@unicef.org', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Micheil', 'Knowller', '10839033Y', '1234', 'mknowllerr@unicef.org', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Reuben', 'Sharman', '56223301X', '1234', 'rsharmans@zdnet.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Mikey', 'Strathearn', '81436532D', '1234', 'mstrathearnt@ocn.ne.jp', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Sissie', 'Ranshaw', '14513215N', '1234', 'sranshawu@360.cn', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Lorie', 'Argabrite', '20177486W', '1234', 'largabritev@ifeng.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Katheryn', 'O''Cridigan', '56436258N', '1234', 'kocridiganw@soup.io', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Jarred', 'Breckell', '70176138W', '1234', 'jbreckellx@sfgate.com', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Sarette', 'Kighly', '27742804J', '1234', 'skighlyy@nationalgeographic.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Yardley', 'Skelding', '73905910F', '1234', 'yskeldingz@t-online.de', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Ingaberg', 'Heningham', '96829757K', '1234', 'iheningham10@reference.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Aloin', 'Geare', '83869266I', '1234', 'ageare11@infoseek.co.jp', true);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Harli', 'Whooley', '70839322R', '1234', 'hwhooley12@phpbb.com', false);
insert into usuario (id, nombre, apellidos, dni, password, email, admin) values (NEXTVAL('hibernate_sequence'), 'Meris', 'Skitt', '65410069C', '1234', 'mskitt13@geocities.jp', true);
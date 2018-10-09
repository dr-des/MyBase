/////////////////////////
///// Учет заправок /////
/////////////////////////
Цели:
Создать базу данных для учета количества заправок

Структура БД:
  таблицы:
    Customer
    Zip
    Cartridge
    Check

  состав таблиц:
    Customer:
      id, name, phone, info
    Zip:
      id, type, name, info
    Cartridge:
      id, check_id, zip_id, zip_count
    Chack:
      id, customer_id, date1, date2
//////////////////////
      

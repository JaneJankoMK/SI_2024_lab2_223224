Јане Јанкоски 223224 
2.CFG
![Pick](https://github.com/JaneJankoMK/SI_2024_lab2_223224/blob/master/3.CFG.png?raw=true)

3.Цикломатската комплексност до дадениот код е 10 со броењето на регионите сите,
а тоа изнесува 9, и на крај се надвор од скицата е 1 регион и така имаме 10

5. if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0)
== '0').

Можни услови

F && X && X -> item.getPrice() <= 300, item.getDiscount() = anything, item.getBarcode().charAt(0)=anything
T && F && X -> item.getPrice() >= 300, item.detDiscount()<=0, item.getBarcode().charAt(0)=anything
T && T && T -> item.getPrice() >= 300, item.detDiscount()> 0, item.getBarCode() == '0'
T && T && F ->item.getPrice() >= 300, item.detDiscount()> 0, item.getBarCode() != '0'
 

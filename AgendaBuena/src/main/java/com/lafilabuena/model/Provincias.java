package com.lafilabuena.model;
/**
 * 
 * Provincias enum
 * 
 * @author Mario Alcañiz
 * fecha: 05/12/18
 * version 1.0
 *
 */
public enum Provincias {

			A_Coruña(15), Álava (01), Albacete (02), Alicante (03), Almería(04), Asturias(33), Avila(05),
            Badajoz(06), Baleares(07), Barcelona(8), Burgos(9),
            Cáceres(10), Cadiz(11), Cantabria(39), Castellon(12), Ceuta(51), Ciudad_Real(13), Córdoba(14), Cuenca(16),
            Girona(17), Granada(18), Guadalajara(19), Guipúzcoa(20),
            Huelva(21), Huesca(22),
            Jaén(23),
            La_Rioja(26), Las_Palmas(35), León(24), Lleida(25), Lugo(27),
            Madrid(28), Málaga(29), Melilla(52), Murcia(30),
            Navarra(31),
            Orense(32),
            Palencia(34), Pontevedra(36),
            Salamanca(37), Segovia(40), Sevilla(41), Soria(42),
            Tarragona(43), Tenerife(38), Teruel(44), Toledo(45),
            Valencia(46), Valladolid(47), Vizcaya(48),
            Zamora(49), Zaragoza(50);
            
           
            private final int provincia;
            
            Provincias (int provincia) {
                this.provincia = provincia;
            }
            
            public int getLevelCode() {
                return this.provincia;
            }
            
	

}
